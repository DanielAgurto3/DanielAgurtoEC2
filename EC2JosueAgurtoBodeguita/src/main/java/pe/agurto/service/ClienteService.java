package pe.agurto.service;

import java.util.List;

import pe.agurto.model.Cliente;

public interface ClienteService {
	
	void guardar(Cliente c);
	void actualizar(Cliente c);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}
