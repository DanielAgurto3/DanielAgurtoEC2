package pe.agurto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.agurto.model.Productos;
import pe.agurto.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository repositorio;
	
	@Override
	public void guardar(Productos p) {
		// TODO Auto-generated method stub
		repositorio.save(p);

	}

	@Override
	public void actualizar(Productos p) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(p);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Productos obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
