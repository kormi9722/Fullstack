package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Aru;

@Repository
public interface AruRepository extends CrudRepository<Aru, Integer>{

}
