package hu.elte.fullstack.bevasarlolista.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class BevasarloLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sorszam;

    @JsonIgnore
    @OneToMany(mappedBy = "aru")
    private List<Aru> aruk;

}