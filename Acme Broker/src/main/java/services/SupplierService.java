package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Supplier;
import repositories.SupplierRepository;

@Service
@Transactional
public class SupplierService {
	//	Managed repository -----------------------------------------
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Supplier create(){
		
	}
	
	public Collection<Supplier> findAll(){
		
	}
	
	public Supplier findOne(int supplierId){
		
	}
	
	public void save(Supplier supplier){
		
	}
	
	public void delete(Supplier supplier){
		
	}
	
	//	Other business methods -------------------------------------
}
