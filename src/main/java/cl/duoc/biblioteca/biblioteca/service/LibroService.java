package cl.duoc.biblioteca.biblioteca.service;

import cl.duoc.biblioteca.biblioteca.model.Libro;
import cl.duoc.biblioteca.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    // MÉTODO QUE USA EL REPOSITORIO
    public List<Libro> getLibrosPorAutor(String autor) {
        return libroRepository.buscarPorAutor(autor);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }
}