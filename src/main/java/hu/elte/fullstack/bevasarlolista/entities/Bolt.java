package hu.elte.fullstack.bevasarlolista.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
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
    @ManyToMany(mappedBy = "aru")
    private List<Aru> aruk;

}
