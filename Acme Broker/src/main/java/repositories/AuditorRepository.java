package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import domain.Auditor;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor,Integer>{

	//	TODO	COMPROBAR QUERY
	@Query("select a from Auditor a join a.records r where (select count(i) from AuditRecord i where i.contract is not null and i.auditor.id=a.id)>=all(select count(i) from AuditRecord i where i.contract is not null group by i.auditor)")
	Collection<Auditor> auditorsMoreAuditedContracts();
	
	//	TODO	COMPROBAR QUERY
	@Query("select a from Auditor a join a.records r where (select count(r) from AuditRecord r where r.contract is not null and r.auditor.id=a.id) <=(select count(r) from AuditRecord r where r.contract is not null and r.auditor.id=a.id)")
	Collection<Auditor> auditorsLessAuditedContracts();
}
