package com.example.semana04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana04.entity.Libro;
import com.example.semana04.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listAllLibros() {
        return libroRepository.findAll();
    }

    public List<Libro> listLibrosByPageCount(int pageCount) {
        return libroRepository.findByPageCount(pageCount);
    }

    public List<Libro> listLibrosByIsbn(String isbn) {
        return libroRepository.findByPageIsbn(isbn);
    }

    public List<Libro> listLibrosByTitle(String title) {
        return libroRepository.findByTitle(title);
    }

}
