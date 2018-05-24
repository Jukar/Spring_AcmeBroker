package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request,Integer>{
	@Query("select r from Request r where r.consumer.id=?1")
	Collection<Request> requestByConsumerId(int consumerId);
}
