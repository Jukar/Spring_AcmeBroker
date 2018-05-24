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

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity{

	// TODO AA Como verga sabemos de quien es el mensaje, si hay 2 copias y son iguales, por la base de datos a pelo?
	
	// Constructors -----------------------------------------------------------
	
	public Message() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private Date moment;
	private String subject;
	private String body;
	
	@Past
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	@NotNull
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@NotNull
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Actor sender;
	private Actor recipent;
	private Folder folder;
	
	@Valid
	@ManyToOne(optional = false)
	public Actor getSender() {
		return sender;
	}
	
	public void setSender(Actor sender) {
		this.sender = sender;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Actor getRecipent() {
		return recipent;
	}
	
	public void setRecipent(Actor recipent) {
		this.recipent = recipent;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Folder getFolder() {
		return folder;
	}
	
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
}