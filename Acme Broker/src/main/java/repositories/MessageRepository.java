package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer>{
	@Query("select m from Message m join m.folder f where f.id=(select a.inbox.id from Actor a where a.id=?1) or f.id=(select a.outbox.id from Actor a where a.id=?1) or f.id=(select f2.id from Actor a join a.folders f2 where a.id=?1)")
	Collection<Message> messagesByActorId(int actorId);
	
	
}