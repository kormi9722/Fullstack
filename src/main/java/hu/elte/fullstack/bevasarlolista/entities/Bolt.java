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
@Table(name = "Bolt")
public class Bolt {

    @Id
    private Integer sorszam;

    @Column
    private String nev;

    @Column
    @NotNull
    private String cim;

    @Column
    private String honlap;

    @JsonIgnore
    @ManyToMany(mappedBy = "boltok")
    private List<Aru> aruk;

}
