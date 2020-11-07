package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.Bolt;
import hu.elte.fullstack.bevasarlolista.repositories.BoltRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boltok")
public class BoltController {

    @Autowired
    private BoltRepository boltRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Bolt>> getAll() {
        return ResponseEntity.ok(BoltRepository.findAll());
    }

    @GetMapping("/{sorszam}")
    public ResponseEntity<Bolt> get(@PathVariable Integer sorszam) {
        Optional<Bolt> bolt = boltRepository.findById(sorszam);
        if (bolt.isPresent()) {
            return ResponseEntity.ok(bolt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}