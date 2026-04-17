package cl.duoc.biblioteca.biblioteca.controller;

import cl.duoc.biblioteca.biblioteca.model.Libro;
import cl.duoc.biblioteca.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // URL: /api/v1/libros?autor=rowling
    @GetMapping
    public List<Libro> listarLibros(@RequestParam(required = false) String autor) {
        if (autor != null && !autor.isEmpty()) {
            return libroService.getLibrosPorAutor(autor);
        }
        return libroService.getLibros();
    }

    @GetMapping("/{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }
}