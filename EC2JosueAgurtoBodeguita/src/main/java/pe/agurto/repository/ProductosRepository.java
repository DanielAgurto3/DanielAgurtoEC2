package pe.agurto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.agurto.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}
