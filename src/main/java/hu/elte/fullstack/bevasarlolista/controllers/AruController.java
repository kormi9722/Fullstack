package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.Aru;
import hu.elte.fullstack.bevasarlolista.repositories.AruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aruk")
public class AruController {

    @Autowired
    private AruRepository aruRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Aru>> getAll() {
        return ResponseEntity.ok(AruRepository.findAll());
    }

    @GetMapping("/{sorszam}")
    public ResponseEntity<Aru> get(@PathVariable Integer sorszam) {
        Optional<Aru> aru = aruRepository.findById(sorszam);
        if (aru.isPresent()) {
            return ResponseEntity.ok(aru.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}