package hu.elte.fullstack.bevasarlolista.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BOLT")
public class Bolt {

    @Id
    private Integer sorszam;

    @Column(nullable = false, name = "NEV")
    private String nev;

    @Column(name = "CIM")
    @NotNull
    private String cim;

    @Column(nullable = false, name = "HONLAP")
    private String honlap;

    @JsonIgnore
    @ManyToMany(mappedBy = "boltok")
    private List<Aru> aruk;

}
