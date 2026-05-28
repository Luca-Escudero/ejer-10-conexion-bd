package com.ejer_10.conexion_bd.Repository;

import com.ejer_10.conexion_bd.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
