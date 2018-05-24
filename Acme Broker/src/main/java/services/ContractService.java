package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Contract;
import repositories.AuditRecordRepository;
import repositories.ContractRepository;

@Service
@Transactional
public class ContractService {
	//	Managed repository -----------------------------------------
	@Autowired
	private ContractRepository contractRepository;
	
	@Autowired
	private AuditRecordRepository auditRecordRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------

	public Contract create(){
		return new Contract();
	}
	
	public Collection<Contract> findAll(){
		return contractRepository.findAll();
	}
	
	public Contract findOne(int contractId){
		return null;
	}
	
	public void save(Contract contract){
		//Para que se borre de la cache el spring
		contractRepository.saveAndFlush(contract);
	}
	
	public void delete(Contract contract){
		
	}
	
	//	Other business methods -------------------------------------
	
	public Collection<Contract> contractsAuditedByAuditorId(int auditorId){
		return contractRepository.contractsAuditedByAuditorId(auditorId);
	}
	
	public Collection<Contract> contractsCanBeAudited(){
		
		Collection<Contract> all = contractRepository.findAll();
		
		Collection<Contract> allAudited = auditRecordRepository.allAuditedContracts();
		
		all.removeAll(allAudited);
		
		return all;
	}
	
}
