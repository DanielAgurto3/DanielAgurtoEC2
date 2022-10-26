package pe.agurto.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	private String producto;
	private String dscripcion;
	private Double precio;
	private Integer stock;
	
	@ManyToMany(mappedBy = "productos", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Cliente> clientes = new ArrayList<>();
	
	@OneToMany(mappedBy = "productos")
	private List<Bodega> bodegas = new ArrayList<>();
	
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDscripcion() {
		return dscripcion;
	}
	public void setDscripcion(String dscripcion) {
		this.dscripcion = dscripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
