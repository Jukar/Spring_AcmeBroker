package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Consumer;

import repositories.ConsumerRepository;

@Service
@Transactional
public class ConsumerService {
	//	Managed repository -----------------------------------------
	
	@Autowired
	private ConsumerRepository consumerRepository;
	
	//	Supporting services ----------------------------------------

	private RequestService requestService;
	
	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Consumer create(){
		
	}
	
	public Collection<Consumer> findAll(){
		
	}
	
	public Consumer findOne(int consumerId){
		
	}
	
	public void save(Consumer consumer){
		
	}
	
	public void delete(Consumer consumer){
		Assert.isTrue(!requestService.existRequestForConsumer(consumer));
		
	}
	
	//	Other business methods -------------------------------------
}
