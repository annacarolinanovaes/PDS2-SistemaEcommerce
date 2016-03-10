package model.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CD_CATEGORIA")
	private Integer codCategoria;
	
	@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;
	
	@Column(name="NM_CATEGORIA")
	private String nomeCategoria;
	
	@Column(name="DS_CATEGORIA")
	private String descricaoCategoria;
	
	public Categoria(){
		super();
	}
	
	public Categoria(Integer codCategoria, String nomeCategoria, String descricaoCategoria) {
		super();
		this.codCategoria = codCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	public Integer getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCategoria == null) ? 0 : codCategoria.hashCode());
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
		Categoria other = (Categoria) obj;
		if (codCategoria == null) {
			if (other.codCategoria != null)
				return false;
		} else if (!codCategoria.equals(other.codCategoria))
			return false;
		return true;
	}
	
	

}
