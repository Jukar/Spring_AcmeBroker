package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import domain.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Integer>{
	
//TODO Eliminada la query de aquí, puesto que CreditCard es un Datatype
}
