package domain;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Request extends DomainEntity{
	// Constructors -----------------------------------------------------------
	
	public Request() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private String code;
	private String description;
	private Date creationMoment;
	private Date endMoment;
	
	@Pattern(regexp="\\w+(-\\w+)?")
	@Column(unique = true)
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreationMoment() {
		return creationMoment;
	}
	
	public void setCreationMoment(Date creationMoment) {
		this.creationMoment = creationMoment;
	}
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndMoment() {
		return endMoment;
	}
	
	public void setEndMoment(Date endMoment) {
		this.endMoment = endMoment;
	}	
	
	// Relationships ----------------------------------------------------------
	
	private Consumer consumer;
	private Contract contract;
	private Administrator administrator;
		
	@Valid
	@ManyToOne(optional = false)
	public Consumer getConsumer() {
		return consumer;
	}
	
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	
	@Valid
	@OneToOne(optional = true)
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	// TODO A RESTRICCIONES MODIFICADAS para permitir Request sin Administrator
	@Valid
	@ManyToOne(optional = true)
	public Administrator getAdministrator() {
		return administrator;
	}
	
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

}