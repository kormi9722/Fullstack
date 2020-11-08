package hu.elte.fullstack.bevasarlolista.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FUTARSZOLGALAT")
public class Futarszolgalat {

    @Id
    @Column
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "NEV")
    @NotNull
    private String nev;

    @Column(nullable = false, name = "KISZALLITASIDO")
    private Integer kiszallitasido;


}
