package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Invoice extends DomainEntity{
	// Constructors -----------------------------------------------------------
	
	public Invoice() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private Date creationMoment;
	private Date paymentMoment;
	private String description;
	private Money cost;
	
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreationMoment() {
		return creationMoment;
	}
	
	public void setCreationMoment(Date creationMoment) {
		this.creationMoment = creationMoment;
	}
	
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getPaymentMoment() {
		return paymentMoment;
	}
	
	public void setPaymentMoment(Date paymentMoment) {
		this.paymentMoment = paymentMoment;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@NotNull
	@Valid
	public Money getCost() {
		return cost;
	}
	
	public void setCost(Money cost) {
		this.cost = cost;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Contract contract;
	
	@Valid
	@ManyToOne(optional = false)
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
}