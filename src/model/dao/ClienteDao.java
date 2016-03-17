package model.dao;

import java.util.List;

import javax.ws.rs.client.Client;

import model.domain.Cliente;

public interface ClienteDao {

	List<Cliente> getClientes(Cliente cliente);
	public void excluir(Cliente cliente);
	public Cliente salvar(Cliente cliente);
	void atualizar(Cliente cliente);

}