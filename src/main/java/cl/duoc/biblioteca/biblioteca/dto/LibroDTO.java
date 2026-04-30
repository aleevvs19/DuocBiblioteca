package cl.duoc.biblioteca.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LibroDTO {

    private Integer id;

    @NotBlank(message = "El título es obligatorio")
    private String titulo;

    @NotBlank(message = "El autor es obligatorio")
    private String autor;

    @NotBlank(message = "El ISBN es obligatorio")
    private String isbn;

    private String editorial;

    @NotNull(message = "La fecha es obligatoria")
    private Integer fechaPublicacion;
}