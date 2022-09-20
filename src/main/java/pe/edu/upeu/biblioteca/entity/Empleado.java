package pe.edu.upeu.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
private int idempleado;
private String username;
private String password;
}
