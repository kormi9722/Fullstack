package hu.elte.fullstack.bevasarlolista.entities;

import javax.persistence.*;

@Entity
@Data
@EquealsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Aru {

    @Id
    @Colum
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cikkaszam;

    @Colum
    @NotNull
    private String nev;

    @Colum
    @NotNull
    private Integer ar;

    @JsonIgnore
    @ManyToMany(mappedBy = "bolt")
    private List<Bolt> boltok;

}
