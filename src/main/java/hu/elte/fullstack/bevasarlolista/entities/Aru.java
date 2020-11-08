package hu.elte.fullstack.bevasarlolista.entities;

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
@Table(name = "Aru")
public class Aru {

    @Id
    @Column
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cikkszam;

    @Column
    @NotNull
    private String nev;

    @Column
    @NotNull
    private Integer ar;

    @ManyToMany
    @JoinTable
    private List<Bolt> boltok;

    @ManyToMany
    @JoinTable
    private List<BevasarloLista> bevasarloListak;

}
