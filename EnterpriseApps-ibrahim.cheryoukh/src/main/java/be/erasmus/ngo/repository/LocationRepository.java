package be.erasmus.ngo.repository;

import be.erasmus.ngo.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
