package foodForRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import foodForRescue.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query
	("SELECT u FROM Usuario u WHERE u.email= :email and password= :password ")
	Usuario findByEmailAndPassword(@Param("email")String email, @Param("password")String password);
}
