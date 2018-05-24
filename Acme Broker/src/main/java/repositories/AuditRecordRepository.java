package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import domain.AuditRecord;
import domain.Contract;

public interface AuditRecordRepository extends JpaRepository<AuditRecord,Integer>{

	@Query("select a.contract from AuditRecord a")
	Collection<Contract> allAuditedContracts();
	
	
}
