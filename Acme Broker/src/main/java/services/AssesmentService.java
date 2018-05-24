package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Assesment;

import repositories.AssesmentRepository;

public class AssesmentService {

	//	Managed repository -----------------------------------------
	@Autowired
	private AssesmentRepository assesmentRepository; 
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Assesment create(){
		return new Assesment();
	}
	
	public Collection<Assesment> findAll(){
		return null;
	}
	
	public Assesment findOne(int assesmentId){
		return null;
	}
	
	public void save(Assesment assesment){
		
	}
	
	public void delete(Assesment assesment){
		
	}
	
	//	Other business methods -------------------------------------
	public Double ratingAverageByConsumerId(int consumerId){
		return assesmentRepository.ratingAverageByConsumerId(consumerId);
	}
	
	public Double ratingAverageBySupplierId(int supplierId){
		return assesmentRepository.ratingAverageBySupplierId(supplierId);
	}
	
}
