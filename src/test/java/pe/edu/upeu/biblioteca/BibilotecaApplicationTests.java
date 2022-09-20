package pe.edu.upeu.biblioteca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.biblioteca.daoImpl.DetalleDaoImpl;
import pe.edu.upeu.biblioteca.daoImpl.PrestamoDaoImpl;
import pe.edu.upeu.biblioteca.entity.Detalle;
import pe.edu.upeu.biblioteca.entity.Prestamo;

@SpringBootTest
class BibilotecaApplicationTests {
	@Autowired
	PrestamoDaoImpl dao;
	@Autowired
	DetalleDaoImpl dao2;
	@Test
	void contextLoads() {
		
		System.out.println(dao.create(new Prestamo(0,"2022/09/20","2022/09/23",1,1,true)));
		System.out.println(dao2.create(new Detalle(0,5,1)));
		System.out.println(dao2.create(new Detalle(0,5,2)));

	}
	
	
}
