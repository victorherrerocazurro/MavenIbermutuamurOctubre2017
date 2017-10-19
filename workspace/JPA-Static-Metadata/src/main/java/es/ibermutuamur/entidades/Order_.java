package es.ibermutuamur.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Integer> id;
	public static volatile SetAttribute<Order, Item> items;
	public static volatile SingularAttribute<Order, BigDecimal> totalCost;
	public static volatile SingularAttribute<Order, Customer> customer;

}

