package model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CD_PRODUTO")
	private Integer codigo;
	
	@Column(name="NM_PRODUTO")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="CD_CATEGORIA", referencedColumnName="CD_CATEGORIA")
	private Categoria categoria;
	
	@Column(name="CD_PRODUTO")
	private String descricao;
	
	@Column(name="VL_PRECO")
	private Double preco;
	
	public Produto(){
		super();
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
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
