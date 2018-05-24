package repositories;

import java.util.Collection;
import java.util.Date;
import org.hibernate.metamodel.relational.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Auditor;
import domain.Consumer;
import domain.Customer;

//ESTO NO SE USA PA NAAAA!
@Repository
public interface DatabaseRepository  extends JpaRepository<Database,Integer>{

//C

//TODO QUERIES QUE FALTAN	
	@Query("select min(s.items.size),max(s.items.size),avg(s.items.size) from Supplier s")
	Tripla<Integer, Integer, Double> minMaxAveItemsBySupplier();

	@Query("select s1.name,s2.name from Supplier s1, Supplier s2 where s1.items.size=(select max(sM.items.size) from Supplier sM) and s2.items.size=(select min(sm.items.size) from Supplier sm)")
	Tupla<String, String> nameSuppliersMoreAndLessItems();
	
	@Query("select i from Item i order by price.amount ascselect c, c.requests.size from Consumer c order by c.requests.size desc")
	Collection<Tupla<Consumer,Integer>> allConsumersAndRequestsOrdDescNumReq();
	
//B

//Todos terminados
	
//A
	@Query("select min(a.records.size),max(a.records.size),avg(a.records.size) from Auditor a")
	Tripla<Integer, Integer, Double> minMaxAveContractsAuditedByAuditor();
	
	@Query("select min(a.incidents.size), max(a.incidents.size), avg(a.incidents.size) from AuditRecord a")
	Tripla<Integer, Integer, Double> minMaxAveIncidentsByAuditRecord();
}