package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Auditor;
import repositories.AuditorRepository;

@Service
@Transactional
public class AuditorService {

	//	Managed repository -----------------------------------------
	
	@Autowired
	private AuditorRepository auditorRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Auditor create(){
		return new Auditor();
	}
	
	public Collection<Auditor> findAll(){
		return null;
	}
	
	public Auditor findOne(int auditorId){
		return null;
	}
	
	public void save(Auditor auditor){
		
	}
	
	public void delete(Auditor auditor){
		
	}
	
	//	Other business methods -------------------------------------
	
	public Collection<Auditor> auditorsMoreAuditedContracts(){
		return auditorRepository.auditorsMoreAuditedContracts();
	}
	
	public Collection<Auditor> auditorsLessAuditedContracts(){
		return auditorRepository.auditorsLessAuditedContracts();
	}
	
}
