package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Bolt;
import org.springframework.stereotype.Repository;

@Repository
public interface BoltRepository extends CrudRepository<Bolt, Integer>{

}
