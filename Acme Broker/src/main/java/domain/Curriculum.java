package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Curriculum extends DomainEntity{
	// Constructors -----------------------------------------------------------
	
	public Curriculum() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private String webAddress;
	private String mission;
	private String vision;
	private String valor;
	private String statement;
	private Date updateMoment;
		
	@URL
	public String getWebAddress() {
		return webAddress;
	}
	
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
	@NotBlank
	public String getMission() {
		return mission;
	}
	
	public void setMission(String mission) {
		this.mission = mission;
	}
	
	@NotBlank
	public String getVision() {
		return vision;
	}
	
	public void setVision(String vision) {
		this.vision = vision;
	}
	
	@NotBlank
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@NotBlank
	public String getStatement() {
		return statement;
	}
	
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUpdateMoment() {
		return updateMoment;
	}

	public void setUpdateMoment(Date updateMoment) {
		this.updateMoment = updateMoment;
	}
	
	
	// Relationships ----------------------------------------------------------
	
	
}