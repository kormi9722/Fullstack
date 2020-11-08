package hu.elte.fullstack.bevasarlolista.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ARU")
public class Aru {

    @Id
    @Column
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cikkszam;

    @Column(name = "NEV")
    @NotNull
    private String nev;

    @Column(name = "AR")
    @NotNull
    private Integer ar;

    @ManyToMany
    @JoinTable
    private List<Bolt> boltok;

    @JsonIgnore
    @ManyToMany
    @JoinTable
    private List<BevasarloLista> bevasarloListak;

}
