package hu.elte.fullstack.bevasarlolista.controllers;

import hu.elte.fullstack.bevasarlolista.entities.Felhasznalo;
import hu.elte.fullstack.bevasarlolista.repositories.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/felhasznalok")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Felhasznalo>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

}
