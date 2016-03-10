package model.facade.ws;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.domain.Cliente;

@WebService(serviceName="ws/cliente")
public class ClienteFacade {
	
	public List<Cliente> getClientes() {
		return Arrays.asList(new Cliente(1,"carlos","carlos@gmail.com"),
							 new Cliente(2,"fulano","fulano@gmail.com"));
	}
	
	@WebMethod(operationName="getClientesParametro")
	public List<Cliente> getClientes(Cliente cliente) {
		if (cliente.getCodigo() == null) {
			return Arrays.asList(new Cliente(0,"cliente não existe",""));
		}
		if (cliente.getCodigo() == 1) {
			return Arrays.asList(new Cliente(1,"carlos","carlos@gmail.com"));
		} else {
			return Arrays.asList(new Cliente(3,"novo cliente","novo@gmail.com"));
		}
	}

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
	

