package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Consumer;
import domain.Contract;

@Repository 
public interface ContractRepository extends JpaRepository<Contract,Integer>{
	
	@Query("select c from Contract c where c.dateSignedContractHolder is null or c.dateSignedContractor is null order by c.creationMoment asc")
	Collection<Contract> contractsNotSignedOrdAscCreation();
	
	@Query("select r.contract from Request r where r.consumer.id=?1")
	Collection<Contract> contractsByContractHolderRequest(int contractHolderId);
	
	@Query("select c from Contract c where c.contractor.id=?1")
	Collection<Contract> contractsByContractor(int contractorId);
	
	@Query("select c from Contract c where c.cancelled is true")
	Collection<Contract> contractsCancelled();
	
	@Query("select a.contract from AuditRecord a where a.auditor.id=?1")
	Collection<Contract> contractsAuditedByAuditorId(int auditorId);
	
	
	
}
