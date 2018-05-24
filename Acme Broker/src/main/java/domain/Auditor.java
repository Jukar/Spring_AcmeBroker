package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Auditor extends Actor{

	// Constructors -----------------------------------------------------------
	
	public Auditor() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	// Relationships ----------------------------------------------------------	
	private Collection<AuditRecord> records;

	@Valid
	@OneToMany(mappedBy = "auditor")
	public Collection<AuditRecord> getRecords() {
		return records;
	}
	
	public void setRecords(Collection<AuditRecord> records) {
		this.records = records;
	}
}