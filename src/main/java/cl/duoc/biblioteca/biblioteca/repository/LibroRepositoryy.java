package cl.duoc.biblioteca.biblioteca.repository;

import cl.duoc.biblioteca.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositoryy extends JpaRepository<Libro, Integer> {

    @Query(value = "SELECT * FROM libro WHERE autor = ?1", nativeQuery = true)
    List<Libro> buscarPorAutor(String autor);

    @Query(value = "SELECT * FROM libro WHERE editorial = ?1", nativeQuery = true)
    List<Libro> buscarPorEditorial(String editorial);

    @Query(value = "SELECT * FROM libro WHERE isbn = ?1", nativeQuery = true)
    Libro buscarPorIsbn(String isbn);
}