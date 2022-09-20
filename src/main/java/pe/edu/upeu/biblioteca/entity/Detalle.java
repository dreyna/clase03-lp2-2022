package pe.edu.upeu.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Detalle {
private int iddetalle;
private int idprestamo;
private int idlibro;
}
