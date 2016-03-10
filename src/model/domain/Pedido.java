package model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="tb_pedido")
@XmlRootElement
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_PEDIDO")
	private Integer numero;
	
	//Vários pedidos para um Cliente
	@ManyToOne
	@JoinColumn(name="pedidos")
	@Column(name="CD_CLIENTE")
	private Cliente cliente;
	
	@Column(name="DT_PEDIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	public Pedido(){
		super();
	}
	
	public Integer getCodPedido() {
		return numero;
	}
	public void setCodPedido(Integer numero) {
		this.numero = numero;
	}
	public Date getDtPedido() {
		return data;
	}
	public void setDtPedido(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Pedido other = (Pedido) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + numero + ", cliente=" + cliente + ", dtPedido=" + data + "]";
	}
	
	
	
}


