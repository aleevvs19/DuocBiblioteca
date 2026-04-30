package cl.duoc.biblioteca.biblioteca.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> manejarError(RuntimeException e) {
        return ResponseEntity.status(404).body(e.getMessage());
    }
}