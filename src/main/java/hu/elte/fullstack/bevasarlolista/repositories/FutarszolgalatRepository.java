package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Futarszolgalat;

@Repository
public interface FutarszolgalatRepository extends CrudRepository<Futarszolgalat, Integer>{

}
