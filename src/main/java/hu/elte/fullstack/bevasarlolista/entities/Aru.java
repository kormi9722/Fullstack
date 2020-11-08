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
public class Aru {

    @Id
    @Column
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cikkaszam;

    @Column
    @NotNull
    private String nev;

    @Column
    @NotNull
    private Integer ar;

    @JsonIgnore
    @ManyToMany(mappedBy = "bolt")
    private List<Bolt> boltok;

}
