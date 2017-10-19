package es.ibermutuamur.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
    @Id
    @GeneratedValue
    Integer id;

    int quantity;

    @ManyToOne
    Order order;
}
