package es.ibermutuamur.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {
	@Id
	@GeneratedValue
	Integer id;
	
	String nombre;
}
