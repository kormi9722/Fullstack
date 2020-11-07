package hu.elte.fullstack.bevasarlolista.entities;

import javax.persistence.*;

@Entity
@Data
@EquealsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Futarszolgalat {

    @Id
    @Colum
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Colum
    @NotNull
    private String nev;

    @Colum
    private Integer kiszallitasido;


}
