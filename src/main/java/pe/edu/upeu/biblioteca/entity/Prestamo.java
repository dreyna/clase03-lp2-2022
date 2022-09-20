package pe.edu.upeu.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
private int idprestamo;
private String fecha_prestamo;
private String fecha_devolucion;
private int idalumno;
private int idempleado;
private boolean estado;
}
