package com.example.semana04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.semana04.entity.Libro;
import com.example.semana04.service.LibroService;

@RestController
@RequestMapping("/url/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;
    
    // Implementar los métodos de la API REST
    @GetMapping("/listAllLibros")
    public List<Libro> listAllLibros() {
        return libroService.listAllLibros();
    }

    @GetMapping("/listLibrosByPageCount/{pageCount}")
    public List<Libro> listLibrosByPageCount(@PathVariable int pageCount) {
        return libroService.listLibrosByPageCount(pageCount);
    }

    @GetMapping("/listLibrosByIsbn")
    public List<Libro> listLibrosByIsbn(@RequestParam String isbn) {
        return libroService.listLibrosByIsbn(isbn);
    }

    @GetMapping("/listLibrosByTitle/{title}")
    public List<Libro> listLibrosByTitle(@PathVariable String title) {
        return libroService.listLibrosByTitle(title);
    }


}
