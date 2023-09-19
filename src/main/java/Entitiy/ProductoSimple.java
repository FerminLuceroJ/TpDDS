package Entitiy;

import javax.persistence.*;

@Entity
public class ProductoSimple extends Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double precio;

    @Column
    private Long stock;

}
