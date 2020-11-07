package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.Felhasznalo;
import hu.elte.fullstack.bevasarlolista.repositories.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/felhasznalok")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloRepository userRepository;

}
