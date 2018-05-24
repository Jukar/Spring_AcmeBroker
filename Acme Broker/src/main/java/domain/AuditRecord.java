package domain;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class AuditRecord extends DomainEntity{
	
	// Constructors -----------------------------------------------------------
	
	public AuditRecord() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private Date creationMoment;
	private String statement;
	private Collection<String> incidents;
	
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreationMoment() {
		return creationMoment;
	}
	
	public void setCreationMoment(Date creationMoment) {
		this.creationMoment = creationMoment;
	}
	
	@NotBlank
	public String getStatement() {
		return statement;
	}
	
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	@ElementCollection
	public Collection<String> getIncidents() {
		return incidents;
	}
	
	public void setIncidents(Collection<String> incidents) {
		this.incidents = incidents;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Auditor auditor;
	private Contract contract;

	@Valid
	@ManyToOne(optional = false)
	public Auditor getAuditor() {
		return auditor;
	}
	
	public void setAuditor(Auditor auditor) {
		this.auditor = auditor;
	}
	
	@Valid
	@OneToOne(optional = true)
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
}