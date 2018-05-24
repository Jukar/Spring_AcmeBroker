package services;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.CreditCard;
import repositories.CreditCardRepository;

@Service
@Transactional
public class CreditCardService {
	//	Managed repository -----------------------------------------
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public CreditCard create(){
		
	}
	
	public Collection<CreditCard> findAll(){
		
	}
	
	public CreditCard findOne(int creditCardId){
		
	}
	
	public void save(CreditCard creditCard){
		
	}
	
	public void delete(CreditCard creditCard){
		
	}
	
	//	Other business methods -------------------------------------
}
