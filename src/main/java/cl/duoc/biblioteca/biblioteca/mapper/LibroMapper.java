package cl.duoc.biblioteca.biblioteca.mapper;

import cl.duoc.biblioteca.biblioteca.dto.LibroDTO;
import cl.duoc.biblioteca.biblioteca.model.Libro;

public class LibroMapper {

    public static LibroDTO toDTO(Libro libro) {
        LibroDTO dto = new LibroDTO();
        dto.setId(libro.getId());
        dto.setTitulo(libro.getTitulo());
        dto.setAutor(libro.getAutor());
        dto.setIsbn(libro.getIsbn());
        dto.setEditorial(libro.getEditorial());
        dto.setFechaPublicacion(libro.getFechaPublicacion());
        return dto;
    }

    public static Libro toEntity(LibroDTO dto) {
        return new Libro(
                dto.getId(),
                dto.getIsbn(),
                dto.getTitulo(),
                dto.getEditorial(),
                dto.getFechaPublicacion(),
                dto.getAutor()
        );
    }
}