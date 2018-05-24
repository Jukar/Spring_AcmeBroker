package repositories;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.CreditCard;
import domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	@Query("select i from Item i order by price.amount asc")
	Collection<Customer> customersWithoutCurriculum();
	
	@Query("select c from Customer c where (c.curriculum.updateMoment)<adddate(current_date,-365)")
	Collection<Customer> customerWithUpdatedCurriculumOneYear();
	
	@Query("select distinct c1.creditCard from Customer c1, Customer c2 where (c1!=c2) and (c1.creditCard=c2.creditCard)")
	Collection<CreditCard> credCardByMoreThanOneCustomer();
}
