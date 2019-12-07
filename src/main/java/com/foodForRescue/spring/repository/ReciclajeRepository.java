package com.foodForRescue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foodForRescue.spring.model.Reciclaje;

@Repository
public interface ReciclajeRepository extends JpaRepository<Reciclaje, Long>{ 

	@Query("SELECT r FROM Reciclaje r WHERE r.id_usuario= :idUsuario ")
	List<Reciclaje> findByUsuario(@Param("idUsuario")Long idUsuario);
}
