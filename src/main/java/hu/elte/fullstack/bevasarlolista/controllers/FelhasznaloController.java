package hu.elte.fullstack.bevasarlolista.controllers;

import com.sun.xml.bind.v2.model.core.ID;
import hu.elte.fullstack.bevasarlolista.entities.Aru;
import hu.elte.fullstack.bevasarlolista.entities.BevasarloLista;
import hu.elte.fullstack.bevasarlolista.entities.Felhasznalo;
import hu.elte.fullstack.bevasarlolista.repositories.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/felhasznalok")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Felhasznalo>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("")
    public ResponseEntity<Felhasznalo> post(@RequestBody Felhasznalo felhasznalo) {

        Optional<Felhasznalo> user = userRepository.findByFelhasznaloNev(felhasznalo.getFelhasznaloNev());
        if (user.isPresent()) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(userRepository.save(felhasznalo));
        }
    }

    @DeleteMapping("/{sorszam}/deletefelhasznalo")
    public ResponseEntity delete(@PathVariable Integer sorszam) {
        Optional<Felhasznalo> optionalFelhasznalo = userRepository.findById(sorszam);
        if (optionalFelhasznalo.isPresent()) {
            userRepository.deleteById(sorszam);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
