package es.ibermutuamur.servicios;

import es.ibermutuamur.dto.ClienteDto;
import es.ibermutuamur.entidades.Cliente;
import es.ibermutuamur.persistencia.ClienteDao;

public class GestionClientesService {

	private ClienteDao clienteDao;
	
	public void procesarAltaCliente(ClienteDto clienteDto){
		//transforma ClienteDto a Cliente
		Cliente cliente = UtilDto.toCliente(clienteDto);
		clienteDao.alta(cliente);
	}
	
}
