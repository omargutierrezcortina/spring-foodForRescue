package foodForRescue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import foodForRescue.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	@Query
	("SELECT p FROM Producto p WHERE p.idCategoria= :categoria ")
	List<Producto> findByCategoria(@Param("categoria")int categoria);

	
   

}
