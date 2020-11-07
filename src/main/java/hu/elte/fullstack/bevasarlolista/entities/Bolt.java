package hu.elte.fullstack.bevasarlolista.entities;

import javax.persistence.*;

@Entity
@Data
@EquealsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Bolt {

    @Id
    private Integer sorszam;

    @Colum
    @NotNull
    private String nev;

    @Colum
    @NotNull
    private String cim;

    @Colum
    private String honlap

    @JsonIgnore
    @ManyToMany(mappedBy = "aru")
    private List<Aru> aruk;

}
