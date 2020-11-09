package hu.elte.fullstack.bevasarlolista.controllers;

import java.util.ArrayList;
import java.util.Optional;

import hu.elte.fullstack.bevasarlolista.entities.Aru;
import hu.elte.fullstack.bevasarlolista.entities.BevasarloLista;
import hu.elte.fullstack.bevasarlolista.entities.Felhasznalo;
import hu.elte.fullstack.bevasarlolista.repositories.AruRepository;
import hu.elte.fullstack.bevasarlolista.repositories.BevasarloListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bevasarlolistak")
public class BevasarloListaController {

    BevasarloListaRepository bevasarloListaRepository;
    AruRepository aruRepository;

    public BevasarloListaController(@Autowired BevasarloListaRepository bevasarloListaRepository, @Autowired AruRepository aruRepository)
    {
        this.bevasarloListaRepository=bevasarloListaRepository;
        this.aruRepository=aruRepository;
    }

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
    public ResponseEntity<BevasarloLista> post(@RequestBody Felhasznalo felhasznalo) {
        BevasarloLista bevasarloLista=new BevasarloLista();
        bevasarloLista.setFelhasznalo(felhasznalo);
        bevasarloListaRepository.save(bevasarloLista);
        return ResponseEntity.ok(bevasarloLista);
    }

    @PutMapping("/{sorszam}/additems")
    public ResponseEntity<BevasarloLista> addAru(@RequestBody Aru aru, @PathVariable Integer sorszam)
    {
        Optional<BevasarloLista> optionalBevasarloLista = bevasarloListaRepository.findById(sorszam);
        Optional<Aru> optionalaru = aruRepository.findById(aru.getCikkszam());
        if(!optionalBevasarloLista.isPresent()||!optionalaru.isPresent())
        {
            return ResponseEntity.notFound().build();
        }
        BevasarloLista bevasarloLista = optionalBevasarloLista.get();
        Aru aru1=optionalaru.get();
        if(bevasarloLista.getAruk().isEmpty())
        {
            bevasarloLista.setAruk(new ArrayList<Aru>());
        }
        if (aru1.getBevasarloListak().isEmpty())
        {
            aru1.setBevasarloListak(new ArrayList<BevasarloLista>());
        }

        bevasarloLista.getAruk().add(aru);
        aru1.getBevasarloListak().add(bevasarloLista);
        bevasarloListaRepository.save(bevasarloLista);
        aruRepository.save((aru1));
        return ResponseEntity.ok(bevasarloLista);

    }


    /*@PutMapping("/{sorszam}/edititems")
    public ResponseEntity<BevasarloLista> modifyAru(@RequestPart Aru aru1,@RequestPart Aru aru2, @PathVariable Integer sorszam)
    {
        Optional<BevasarloLista> optionalBevasarloLista = bevasarloListaRepository.findById(sorszam);
        if(!optionalBevasarloLista.isPresent())
        {
            return ResponseEntity.notFound().build();
        }
        BevasarloLista bevasarloLista = optionalBevasarloLista.get();
        if(bevasarloLista.getAruk().isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        if (!bevasarloLista.getAruk().contains(aru1))
        {
            return ResponseEntity.notFound().build();
        }
        bevasarloLista.getAruk().set(bevasarloLista.getAruk().indexOf(aru1),aru2);
        return ResponseEntity.ok(bevasarloListaRepository.save(bevasarloLista));

    }*/

    @PutMapping("/{sorszam}/deleteitems")
    public ResponseEntity<BevasarloLista> deleteAru(@RequestBody Aru aru, @PathVariable Integer sorszam)
    {
        Optional<BevasarloLista> optionalBevasarloLista = bevasarloListaRepository.findById(sorszam);
        Optional<Aru> optionalaru = aruRepository.findById(aru.getCikkszam());

        if(!optionalBevasarloLista.isPresent()||!optionalaru.isPresent())
        {
            return ResponseEntity.notFound().build();
        }
        Aru aru1=optionalaru.get();

        BevasarloLista bevasarloLista = optionalBevasarloLista.get();
        if(bevasarloLista.getAruk().isEmpty())
        {
            System.out.println("a");
            return ResponseEntity.notFound().build();
        }
        if (!bevasarloLista.getAruk().contains(aru1))
        {
            System.out.println("c");
            return ResponseEntity.notFound().build();
        }
        bevasarloLista.getAruk().remove(aru1);
        aru1.getBevasarloListak().remove(bevasarloLista);
        return ResponseEntity.ok(bevasarloListaRepository.save(bevasarloLista));

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

    @DeleteMapping("/{sorszam}/deletelist")
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