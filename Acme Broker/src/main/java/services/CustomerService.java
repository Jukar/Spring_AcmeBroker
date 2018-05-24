package services;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import domain.Customer;
import repositories.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	//	Managed repository -----------------------------------------
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Customer create(){
		
	}
	
	public Collection<Customer> findAll(){
		
	}
	
	public Customer findOne(int customerId){
		
	}
	
	public void save(Customer customer){
		
	}
	
	public void delete(Customer customer){
		
	}
	
	//	Other business methods -------------------------------------
}
