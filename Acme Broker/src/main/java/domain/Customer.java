package domain;

import java.util.Collection;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Customer extends Actor{
	
	// Constructors -----------------------------------------------------------
	
	public Customer() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private String companyName;
	private String ticker;
	private CreditCard creditCard;
	
	@NotBlank
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Pattern(regexp="\\w+(-\\w+)?")
	@NotNull
	@Column(unique = true)
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	@NotNull
	@Valid
	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Collection<Assesment> assesments;
	private Curriculum curriculum;
	
	@Valid
	@OneToMany(mappedBy = "customer")
	public Collection<Assesment> getAssesments() {
		return assesments;
	}

	public void setAssesments(Collection<Assesment> assesments) {
		this.assesments = assesments;
	}
	
	@Valid
	@OneToOne(optional = true)
	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
}