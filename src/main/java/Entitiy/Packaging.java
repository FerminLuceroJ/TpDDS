package Entitiy;

import javax.persistence.*;

@Entity
@Table(name="packaging")
public class Packaging extends Decorado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double precio;
}
