package hu.elte.fullstack.bevasarlolista.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import hu.elte.fullstack.bevasarlolista.entities.Felhasznalo;

public interface FelhasznaloRepository extends CrudRepository<Felhasznalo, Long>{

    Optional<Felhasznalo> findByUsername(String felhasznaloNev);

}