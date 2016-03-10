package model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tb_cliente")
@XmlRootElement
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CD_CLIENTE")
	private Integer codigo;
	
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;
	
	@Column(name="NM_CLIENTE")
	private String nome;
	
	@Column(name="DS_CARGO")
	private String cargo;
	
	@Column(name="DS_ENDERECO")
	private String endereco;
	
	@Column(name="DS_CIDADE")
	private String cidade;
	
	@Column(name="DS_ENDERECO")
	private String cep;
	
	@Column(name="DS_PAIS")
	private String pais;
	
	@Column(name="DS_TELEFONE")
	private String telefone;
	
	@Column(name="DS_FAX")
	private String fax;
	
	public Cliente(){
		super();
		this.pedidos = new ArrayList<>();
	}
	
	public Cliente(Integer codigo, String nome, String cargo, String endereco, String cidade, String cep, String pais,
			String telefone, String fax) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.pais = pais;
		this.telefone = telefone;
		this.fax = fax;
		this.pedidos = new ArrayList<>();
	}



	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome +  "]";
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
