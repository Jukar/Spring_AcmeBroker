package repositories;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import domain.Invoice;
import domain.Supplier;

public interface InvoicesRepository extends JpaRepository<Invoice,Integer>{

	@Query("select c.invoices from Contract c where c.contractHolder.id=?1")
	Collection<Invoice> invoicesByContractHolderId(int consumerId);
	
	@Query("select invs from Contract c join c.invoices invs where c.contractHolder.id=?1 and invs.paymentMoment is null")
	Collection<Invoice> invoicesNotPaidByContractHolderId(int consumerId);
	
	@Query("select c.invoices from Contract c where c.contractor.id=?1")
	Collection<Invoice> invoicesByContractorId(int supplierId);
	
	@Query("select invs from Contract c join c.invoices invs where c.contractor.id=?1 and invs.paymentMoment is null")
	Collection<Invoice> invoicesNotPaidByContractorId(int contractorId);
}
