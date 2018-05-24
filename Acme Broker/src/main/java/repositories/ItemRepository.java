package repositories;

import java.util.Collection;
import domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>{
	

	// DEPRECATED
	@Query("select i from Item i order by price.amount asc")
	Collection<Item> itemsByAscendingPrice();
	
	@Query("select a from Item i join i.tags a where i.code=?1")
	Collection<String> tagsFromCodItem(String itemCode);
	
	@Query("select i from Item i where i.description=?1 or i.name=?1 or ?1 member of i.tags")
	Collection<Item> itemsByKeyword(String keyword);
	
	@Query("select count(i) from Item i where i.tags.size=0")
	Integer numItemWithoutTags();
}