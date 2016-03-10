package model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_detalhe_pedido")
public class DetalhePedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DetalhePedidoPK detalhePedidoPK;

	@ManyToOne
	@JoinColumn(name="NR_PEDIDO", referencedColumnName="NR_PEDIDO", insertable=false, updatable=false)
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="NR_PRODUTO", referencedColumnName="NR_PRODUTO", insertable=false, updatable=false)
	private Produto produto;
	
	@Column(name="VL_PRECO")
	private Double preco;
	
	@Column(name="QT_SOLICITADO")
	private Integer quantidade;
	
	@Column(name="VL_DESCONTO")
	private Double desconto;
		
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
