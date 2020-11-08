package hu.elte.fullstack.bevasarlolista.entities;

import lombok.Data;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name="Felhasznalo")
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
        TILTOTT, VENDEG, FELHASZNALO, ADMIN
    }

    @JsonIgnore
    @OneToMany(mappedBy = "felhasznalo")
    private List<BevasarloLista> bevasarloLista;

}
