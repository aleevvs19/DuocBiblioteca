package cl.duoc.biblioteca.biblioteca.repository;

import org.springframework.stereotype.Repository;
import cl.duoc.biblioteca.biblioteca.model.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public LibroRepository() {
        listaLibros.add(new Libro(1, "9789569646638", "Fuego y Sangre", "Penguin Random House", 2018, "George R. R. Martin"));
        listaLibros.add(new Libro(2, "9789563494150", "Quique Hache", "Sm Ediciones", 2014, "Sergio Gomez"));
        listaLibros.add(new Libro(3, "9781484256251", "Spring Boot", "Apress", 2020, "Anghel Leonard"));
        listaLibros.add(new Libro(4, "9789566075752", "Harry Potter", "Salamandra", 2024, "J. K. Rowling"));
        // ... (resto de tus libros)
    }

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    // MÉTODO PARA FILTRAR POR AUTOR
    public List<Libro> buscarPorAutor(String autor) {
        return listaLibros.stream()
                .filter(l -> l.getAutor().toLowerCase().contains(autor.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) return libro;
        }
        return null;
    }
}