package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.Futarszolgalat;
import hu.elte.fullstack.bevasarlolista.repositories.FutarszolgalatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/futarszolgalatok")
public class FutarszolgalatController {

    @Autowired
    private FutarszolgalatRepository futarszolgalatRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Futarszolgalat>> getAll() {
        return ResponseEntity.ok(futarszolgalatRepository.findAll());
    }

    @GetMapping("/{sorszam}")
    public ResponseEntity<Futarszolgalat> get(@PathVariable Integer sorszam) {
        Optional<Futarszolgalat> futarszolgalat = futarszolgalatRepository.findById(sorszam);
        if (futarszolgalat.isPresent()) {
            return ResponseEntity.ok(futarszolgalat.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
