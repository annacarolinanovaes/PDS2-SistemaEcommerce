package model.service;

import java.util.List;

import model.domain.Cliente;

public interface ClienteService {
	public List<Cliente> getClientes();
	public List<Cliente> getClientes(Cliente cliente);
}
