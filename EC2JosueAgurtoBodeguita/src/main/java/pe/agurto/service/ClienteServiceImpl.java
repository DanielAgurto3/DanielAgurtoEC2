package pe.agurto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.agurto.model.Cliente;
import pe.agurto.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repositorio;
	
	@Override
	public void guardar(Cliente c) {
		// TODO Auto-generated method stub
		repositorio.save(c);

	}

	@Override
	public void actualizar(Cliente c) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(c);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Cliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
