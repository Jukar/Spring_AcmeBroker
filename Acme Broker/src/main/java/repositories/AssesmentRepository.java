package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import domain.Assesment;

public interface AssesmentRepository extends JpaRepository<Assesment,Integer>{

	
	@Query("select avg(a.rating) from Consumer c join c.assesments a where c.id=?1")
	Double ratingAverageByConsumerId(int consumerId);
	
	@Query("select avg(a.rating) from Supplier c join c.assesments a where c.id=?1")
	Double ratingAverageBySupplierId(int supplierId);
	
}
