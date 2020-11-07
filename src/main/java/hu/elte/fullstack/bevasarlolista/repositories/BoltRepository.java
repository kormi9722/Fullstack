package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Bolt;

@Repository
public interface BoltRepository extends CrudRepository<Bolt, Integer>{

}
