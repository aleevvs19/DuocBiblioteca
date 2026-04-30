package cl.duoc.biblioteca.biblioteca.service;

import cl.duoc.biblioteca.biblioteca.exception.LibroNotFoundException;
import cl.duoc.biblioteca.biblioteca.model.Libro;
import cl.duoc.biblioteca.biblioteca.repository.LibroRepositoryy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepositoryy libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }

    public List<Libro> getLibrosPorAutor(String autor) {
        return libroRepository.findByAutorContainingIgnoreCase(autor);
    }

    public Libro getLibroId(int id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new LibroNotFoundException("Libro no encontrado"));
    }

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro actualizarLibro(int id, Libro nuevo) {
        Libro libro = getLibroId(id);

        libro.setTitulo(nuevo.getTitulo());
        libro.setAutor(nuevo.getAutor());
        libro.setIsbn(nuevo.getIsbn());
        libro.setEditorial(nuevo.getEditorial());
        libro.setFechaPublicacion(nuevo.getFechaPublicacion());

        return libroRepository.save(libro);
    }

    public void eliminarLibro(int id) {
        if (!libroRepository.existsById(id)) {
            throw new LibroNotFoundException("Libro no existe");
        }
        libroRepository.deleteById(id);
    }
}