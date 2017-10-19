package es.ibermutuamur.entidades;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order {
	@Id
	@GeneratedValue
	Integer id;

	@ManyToOne
	Customer customer;

	@OneToMany
	Set<Item> items;
	BigDecimal totalCost;

}
