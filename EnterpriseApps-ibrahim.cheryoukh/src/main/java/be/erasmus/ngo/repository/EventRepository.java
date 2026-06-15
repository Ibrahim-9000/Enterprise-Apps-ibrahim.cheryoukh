package be.erasmus.ngo.repository;

import be.erasmus.ngo.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findTop10ByOrderByTijdstipDesc();
}
