package com.ejer_10.conexion_bd.ProductoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejer_10.conexion_bd.Repository.ProductoRepository;
import com.ejer_10.conexion_bd.model.Producto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public ResponseEntity<Producto> agregarProducto (@RequestBody Producto producto) {
        Producto nuevoProducto = productoRepository.save(producto);
        return ResponseEntity.ok().body(nuevoProducto);
    }

    @GetMapping
    public ResponseEntity<Iterable<Producto>> obtenerProductos() {
        Iterable<Producto> productos = productoRepository.findAll();
        return ResponseEntity.ok().body(productos);
    }
    
    

}
