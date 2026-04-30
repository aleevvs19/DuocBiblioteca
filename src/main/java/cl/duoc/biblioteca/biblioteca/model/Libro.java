package cl.duoc.biblioteca.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}