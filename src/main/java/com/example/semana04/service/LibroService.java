package com.example.semana04.service;

import java.util.List;

import com.example.semana04.entity.Libro;

public interface LibroService {

    public List<Libro> listAllLibros();
    public List<Libro> listLibrosByPageCount(int pageCount);
    public List<Libro> listLibrosByIsbn(String isbn);
    public List<Libro> listLibrosByTitle(String title);
    
}
