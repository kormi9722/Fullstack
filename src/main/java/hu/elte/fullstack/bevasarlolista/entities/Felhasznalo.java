package hu.elte.fullstack.bevasarlolista.entities;

import lombok.Data;
import javax.persistence.Id;
import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.EnumType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Felhasznalo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String nev;

    @Column(nullable = false)
    private String felhasznaloNev;

    @Column(nullable = false)
    private String jelszo;

    @Column(nullable = false)
    private int atNemVettCsomagok;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Szerepkor szerepkor;

    public enum Szerepkor {
        VENDEG, FELHASZNALO, ADMIN
    }

    @JsonIgnore
    @OneToMany(mappedBy = "felhasznalo")
    private List<BevasarloLista> tickets;



}
