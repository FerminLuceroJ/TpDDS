package Entitiy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="combo")
public class Combo extends Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name="producto_combo",
               joinColumns = {@JoinColumn(name="id")},
               inverseJoinColumns = {@JoinColumn(name = "id")})
    private List<Producto> productos;

}
