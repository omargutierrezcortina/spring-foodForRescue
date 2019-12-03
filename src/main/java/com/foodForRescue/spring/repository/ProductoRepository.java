package com.foodForRescue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodForRescue.spring.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
 

}
