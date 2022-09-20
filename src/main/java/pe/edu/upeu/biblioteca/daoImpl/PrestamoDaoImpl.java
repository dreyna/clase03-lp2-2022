package pe.edu.upeu.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.biblioteca.dao.Operaciones;
import pe.edu.upeu.biblioteca.entity.Prestamo;
@Repository
public class PrestamoDaoImpl implements Operaciones<Prestamo> {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		
		String SQL = "INSERT INTO prestamo (idprestamo, fecha_prestamo, fecha_devolucion, idalumno,idempleado, estado) "
				+ "values(0,now(),?,?,?,true)";
		return jdbcTemplate.update(SQL, t.getFecha_devolucion(), t.getIdalumno(), t.getIdempleado());
	}

	@Override
	public List<Map<String, Object>> lista() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select *from prestamo");
	}

}
