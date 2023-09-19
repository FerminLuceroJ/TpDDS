package Entitiy;

import javax.persistence.*;

@Entity
@Table(name="descuento_fijo")
public class DescuentoFijo extends Decorado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double valor;
}
