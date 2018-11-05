package pl.art.amadepl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.art.amadepl.entity.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
