package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Contract;

import repositories.AuditRecordRepository;


@Service
@Transactional
public class AuditRecordService {
	
	@Autowired
	private AuditRecordRepository auditRecordRepository;
	
	
	
	public Collection<Contract> allAuditedContracts(){
		return auditRecordRepository.allAuditedContracts();
	}
}
