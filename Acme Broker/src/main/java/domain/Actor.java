package domain;

import java.util.Collection;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity{

	// Constructors -----------------------------------------------------------
	
	public Actor() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private String name;
	private String surname;
	private String emailAdress;
	
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@NotBlank
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Email
	@NotNull
	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
	// Relationships ----------------------------------------------------------
	
	//No estoy seguro de si obtiene el atributo userAccount de la relacion entre las clases
	private UserAccount userAcccount;
	private Collection<Folder> folders;
	private Folder inbox;
	private Folder outbox;

	@Valid
	@OneToOne(optional = false)
	public Folder getInbox() {
		return inbox;
	}

	public void setInbox(Folder inbox) {
		this.inbox = inbox;
	}
	@NotNull
	@OneToOne(optional = false)
	public Folder getOutbox() {
		return outbox;
	}

	public void setOutbox(Folder outbox) {
		this.outbox = outbox;
	}
	@Valid
	@OneToOne(optional = false)
	public UserAccount getUserAcccount() {
		return userAcccount;
	}

	public void setUserAcccount(UserAccount userAcccount) {
		this.userAcccount = userAcccount;
	}
	@Valid
	@OneToMany
	public Collection<Folder> getFolders() {
		return folders;
	}
	
	public void setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}
}