package pe.agurto.service;

import java.util.List;

import pe.agurto.model.Productos;


public interface ProductosService {
	
	void guardar(Productos p);
	void actualizar(Productos p);
	void eliminar(Integer id);
	List<Productos> listar();
	Productos obtener(Integer id);

}
