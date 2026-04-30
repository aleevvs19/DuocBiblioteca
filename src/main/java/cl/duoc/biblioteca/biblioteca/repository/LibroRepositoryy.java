package cl.duoc.biblioteca.biblioteca.repository;

import cl.duoc.biblioteca.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositoryy extends JpaRepository<Libro, Integer> {

    List<Libro> findByAutorContainingIgnoreCase(String autor);

    List<Libro> findByEditorialContainingIgnoreCase(String editorial);

    Libro findByIsbn(String isbn);
}