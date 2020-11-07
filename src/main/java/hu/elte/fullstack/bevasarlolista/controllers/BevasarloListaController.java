package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.BevasarloLista;
import hu.elte.fullstack.bevasarlolista.repositories.BevasarloListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bevasarlolistak")
public class BevasarloListaController {

    @Autowired
    private BevasarloListaRepository bevasarloListaRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<BevasarloLista>> getAll() {
        return ResponseEntity.ok(bevasarloListaRepository.findAll());
    }

    @GetMapping("/{sorszam}")
    public ResponseEntity<BevasarloLista> get(@PathVariable Integer sorszam) {
        Optional<BevasarloLista> bevasarloLista = bevasarloListaRepository.findById(sorszam);
        if (bevasarloLista.isPresent()) {
            return ResponseEntity.ok(bevasarloLista.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<BevasarloLista> post(@PathVariable BevasarloLista bevasarloLista) {
        BevasarloLista mentettBevasarloLista = bevasarloListaRepository.save(bevasarloLista);
        return ResponseEntity.ok(mentettBevasarloLista);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<BevasarloLista> put(@RequestBody BevasarloLista bevasarloLista, @PathVariable Integer sorszam)
    {
        Optional<BevasarloLista> optionalBevasarloLista = bevasarloListaRepository.findById(sorszam);
        if(optionalBevasarloLista.isPresent())
        {
            bevasarloLista.setId(sorszam);
            return ResponseEntity.ok(bevasarloListaRepository.save(bevasarloLista));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer sorszam) {
        Optional<BevasarloLista> optionalBevasarloLista = bevasarloListaRepository.findById(sorszam);
        if (optionalBevasarloLista.isPresent()) {
            bevasarloListaRepository.deleteById(sorszam);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}