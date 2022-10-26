package pe.agurto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.agurto.model.Bodega;
import pe.agurto.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	private BodegaRepository repositorio;
	
	@Override
	public void guardar(Bodega bodega) {
		repositorio.save(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(bodega);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
