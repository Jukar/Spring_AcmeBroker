package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import domain.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer>{

	@Query("select c from Supplier c where (select count(i) from Contract i where i.dateSignedContractor is not null and i.contractor.id=c.id)>= all (select count(i) from Contract i where i.dateSignedContractor is not null group by i.contractHolder)")
	Collection<Supplier> suppliersMoreSignedContracts();
	
	@Query("select c from Supplier c where (select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null and i.contract.contractor.id=c.id)>= all (select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null group by i.contract.contractor)")
	Collection<Supplier> suppliersMoreUnpaidInvoices();
	
	@Query("select c from Supplier c where (select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null and i.contract.contractor.id=c.id)>=all(select sum(i.cost.amount) from Invoice i where i.paymentMoment is not null group by i.contract.contractor)")
	Collection<Supplier> suppliersMoreMoneyEarned();
	
}
