package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Futarszolgalat;
import org.springframework.stereotype.Repository;

@Repository
public interface FutarszolgalatRepository extends CrudRepository<Futarszolgalat, Integer>{

}
