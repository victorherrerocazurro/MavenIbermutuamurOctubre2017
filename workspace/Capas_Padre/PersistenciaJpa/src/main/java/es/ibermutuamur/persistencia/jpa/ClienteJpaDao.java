package es.ibermutuamur.persistencia.jpa;

import javax.persistence.EntityManager;

import es.ibermutuamur.entidades.Cliente;
import es.ibermutuamur.persistencia.ClienteDao;

public class ClienteJpaDao implements ClienteDao{
	private EntityManager em;

	@Override
	public void alta(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
}
