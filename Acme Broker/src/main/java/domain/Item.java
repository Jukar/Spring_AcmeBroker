package domain;

import java.util.Collection;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Item extends DomainEntity{
	// Constructors -----------------------------------------------------------
	
	public Item() {
		super();
	}
	
	// Attributes -------------------------------------------------------------

	private String name;
	private String code;
	private String description;
	private Money price;
	private Collection<String> tags;
	
	@NotBlank
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Pattern(regexp="\\w+(-\\w+)?")
	@Column(unique = true)
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@NotNull
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Valid
	@NotNull
	public Money getPrice() {
		return price;
	}
	
	public void setPrice(Money price) {
		this.price = price;
	}
	
	@ElementCollection
	public Collection<String> getTags() {
		return tags;
	}
	
	public void setTags(Collection<String> tags) {
		this.tags = tags;
	}
	
	// Relationships ----------------------------------------------------------
	
	private Supplier supplier;
	
	@Valid
	@ManyToOne(optional = false)
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}