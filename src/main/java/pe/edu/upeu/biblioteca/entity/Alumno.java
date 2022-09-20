package pe.edu.upeu.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
 private int idalumno;
 private String nombres;
 private String Apellidos;

}
