package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Consumer;
import domain.Contract;

@Repository
public interface ConsumerRepository extends JpaRepository<Contract,Integer>{
	
	@Query("select c from Consumer c where(select count(i) from Contract i where i.dateSignedContractHolder is not null and i.contractHolder.id=c.id)>= all (select count(i) from Contract i where i.dateSignedContractHolder is not null group by i.contractHolder)")
	Collection<Consumer> consumersMoreSignedContracts();

	@Query("select c from Consumer c where (select count(i) from Invoice i where i.paymentMoment is null and i.contract.contractHolder.id=c.id)>= all (select count(i) from Invoice i where i.paymentMoment is null group by i.contract.contractHolder)")
	Collection<Consumer> consumersMoreUnpaidInvoices();
	
	@Query("select c from Consumer c where (select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null and i.contract.contractHolder.id=c.id)>=all(select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null group by i.contract.contractHolder)")
	Collection<Consumer> consumersMoreMoneyPaid();
	
	@Query("select c.name from Consumer c where c.requests.size=(select max(r.requests.size) from Consumer r)")
	String nameConsumerMoreRequests();
	
	@Query("select count(c1) from Customer c1 where c1.curriculum is not null")
	Integer numCustomerWithCurriculum();
	
	@Query("select count(c2) from Consumer c2 where c2.curriculum is null")
	Integer numConsumerWithoutCurriculum();
}
