package com.example.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Servicios.LibroServicio;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Excepciones.LibroException;
import com.example.demo.Modelos.Libro;





@RestController

public class LibroController {

    @Autowired
    private LibroServicio libroServicio;

    @GetMapping("/Libro")
    public String Libro() {
        return"Libros";
    }   
    
    @PostMapping("/libros")
    public ResponseEntity<Libro> nuevaLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroServicio.nuevLibro(libro);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }

    @GetMapping("/libros/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable int id) {
        Libro libro = libroServicio.getLibro(id);
        if (libro == null) {
            throw new LibroException("El libro con ID " + id + " no se encuentra.");
        }
        return new ResponseEntity<>(libro, HttpStatus.OK);
    }
    
    @GetMapping("/libros")
    public List<Libro> getLibro () {
        return libroServicio.getLibros();
    }

    @ExceptionHandler(LibroException.class)
    public ResponseEntity<String> handleLibroException(LibroException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    

}
