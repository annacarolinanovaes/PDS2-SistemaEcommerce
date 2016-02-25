package model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import model.domain.Cliente;
import model.service.ClienteService;

@WebService(serviceName="ws/cliente")
public class ClienteFacade {
	
	@Inject
	private ClienteService clienteService;
	
	@WebMethod
	public List<Cliente> getClientes(){
		return clienteService.getClientes();
	}
	
	@WebMethod(operationName="getClientesParametro")
	public List<Cliente> getClientes(Cliente cliente){
		return clienteService.getClientes(cliente);
	}
	
	/*@WebMethod
	public List<Cliente> getClientes(){
		return Arrays.asList(new Cliente(1, "Anna", "anna@gmail.com"),
				new Cliente(2, "Carlos", "carlos@gmail.com"));
	}
	
	@WebMethod(operationName="getClientesParametro")
	public List<Cliente> getClientes(Cliente cliente){
		if(cliente.getCodigo() == 1){
			return Arrays.asList(new Cliente(1, "Roberto", "r@gmail.com"));
		}else{
			return Arrays.asList(new Cliente(1, "Outro Roberto", "or@gmail.com"));
		}
	}*/
	
}
