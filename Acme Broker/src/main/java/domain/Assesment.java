package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Assesment extends DomainEntity{

	// Constructors -----------------------------------------------------------
	
	public Assesment() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private int rating;
	private String comment;
	
	@Range(min = 0,max = 100)
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Contract contract;
	private Customer customer;

	@Valid
	@ManyToOne(optional = false)
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
