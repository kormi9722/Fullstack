package hu.elte.fullstack.bevasarlolista.repositories;

import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.BevasarloLista;
import org.springframework.stereotype.Repository;

@Repository
public interface BevasarloListaRepository extends CrudRepository<BevasarloLista, Integer>{

}
