package hu.elte.fullstack.bevasarlolista.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
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

    @ManyToMany
    @JoinTable
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<BevasarloLista> bevasarloListak;

}
