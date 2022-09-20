package pe.edu.upeu.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.biblioteca.dao.Operaciones;
import pe.edu.upeu.biblioteca.entity.Detalle;
@Repository
public class DetalleDaoImpl implements Operaciones<Detalle>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO detalle (iddetalle, idprestamo, idlibro)"
				+ " values(0, ?, ?)";
		return jdbcTemplate.update(SQL, t.getIdprestamo(), t.getIdlibro());
	}

	@Override
	public List<Map<String, Object>> lista() {
		// TODO Auto-generated method stub
		return null;
	}

}
