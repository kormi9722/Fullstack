package hu.elte.fullstack.bevasarlolista.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "BevasarloLista")
public class BevasarloLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sorszam;

    @ManyToOne
    @JoinColumn
    private Felhasznalo felhasznalo;

    @JsonIgnore
    @ManyToMany(mappedBy = "bevasarloListak")
    private List<Aru> aruk;

}
