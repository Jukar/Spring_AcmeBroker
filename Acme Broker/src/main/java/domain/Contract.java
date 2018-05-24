package domain;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Contract extends DomainEntity{
	
	// Constructors -----------------------------------------------------------
	
	public Contract() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private Date creationMoment;
	private String text;
	private Date endMoment;
	private Date dateSignedContractor;
	private Date dateSignedContractHolder;
	
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
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndMoment() {
		return endMoment;
	}
	
	public void setEndMoment(Date endMoment) {
		this.endMoment = endMoment;
	}
	
	// TODO Comprobar si es necesario
	//@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateSignedContractor() {
		return dateSignedContractor;
	}
	
	public void setDateSignedContractor(Date dateSignedContractor) {
		this.dateSignedContractor = dateSignedContractor;
	}
	
	// TODO Comprobar si es necesario
	//@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateSignedContractHolder() {
		return dateSignedContractHolder;
	}
	
	public void setDateSignedContractHolder(Date dateSignedContractHolder) {
		this.dateSignedContractHolder = dateSignedContractHolder;
	}
	
	@NotNull
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Collection<Assesment> assesments;
	private Supplier contractor;
	private Consumer contractHolder;
	//private Request request;
	private Collection<Invoice> invoices;
	private Boolean cancelled;
	
	@Valid
	@OneToMany(mappedBy = "contract")
	public Collection<Assesment> getAssesments() {
		return assesments;
	}
	
	public void setAssesments(Collection<Assesment> assesments) {
		this.assesments = assesments;
	}
	
	@Valid
	@ManyToOne(optional = true)
	public Supplier getContractor() {
		return contractor;
	}
	
	public void setContractor(Supplier contractor) {
		this.contractor = contractor;
	}
	
	@Valid
	@ManyToOne(optional = true)
	public Consumer getContractHolder() {
		return contractHolder;
	}
	
	public void setContractHolder(Consumer contractHolder) {
		this.contractHolder = contractHolder;
	}
	
//	@Valid
//	@OneToOne(optional = false)
//	public Request getRequest() {
//		return request;
//	}
//	
//	public void setRequest(Request request) {
//		this.request = request;
//	}

	@Valid
	@OneToMany(mappedBy = "contract")
	public Collection<Invoice> getInvoices() {
		return invoices;
	}
	
	public void setInvoices(Collection<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
}