package pe.edu.upeu.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
private int idlibro;
private String titulo;
private String autor;
private String editorial;
}
