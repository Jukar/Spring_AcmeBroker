package domain;

import java.util.Collection;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Folder extends DomainEntity{
	
	// Constructors -----------------------------------------------------------
	
	public Folder() {
		super();
	}
	
	// Attributes -------------------------------------------------------------
	
	private String name;
	
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Collection<Message> messages;
	private Folder folderParent;
	private Collection<Folder> folderChilds;
	
	@Valid
	@OneToMany(cascade = CascadeType.ALL,mappedBy="folder")
	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

	@Valid
	@ManyToOne(optional = true)
	public Folder getFolderParent() {
		return folderParent;
	}

	public void setFolderParent(Folder folderParent) {
		this.folderParent = folderParent;
	}
	
	@Valid
	@OneToMany(mappedBy = "folderParent")
	public Collection<Folder> getFolderChilds() {
		return folderChilds;
	}

	public void setFolderChilds(Collection<Folder> folderChilds) {
		this.folderChilds = folderChilds;
	}
}