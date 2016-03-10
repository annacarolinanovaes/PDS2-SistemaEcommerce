package model.facade.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import model.dao.ClienteDao;
import model.domain.Cliente;

@WebService(serviceName="ws/cliente")
public class ClienteFacade {
	
	private ClienteDao clienteDao;
	
	/*public List<Cliente> getClientes() {
		return Arrays.asList(new Cliente(1,"carlos","carlos@gmail.com"),
							 new Cliente(2,"fulano","fulano@gmail.com"));
	}*/
	
	@WebMethod(operationName="getClientesParametro")
	/*public List<Cliente> getClientes(Cliente cliente) {
		if (cliente.getCodigo() == null) {
			return Arrays.asList(new Cliente(0,"cliente não existe",""));
		}
		if (cliente.getCodigo() == 1) {
			return Arrays.asList(new Cliente(1,"carlos","carlos@gmail.com"));
		} else {
			return Arrays.asList(new Cliente(3,"novo cliente","novo@gmail.com"));
		}
	}*/
	
	@GET
	public List<Cliente> getClientes() {
		return clienteDao.getClientes(new Cliente());
	}
	
	@GET
	@Path("/{codigo}")
	public List<Cliente> getClientes(@PathParam("codigo") Integer codigo) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		return clienteDao.getClientes(cliente);
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
	

