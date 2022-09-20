package pe.edu.upeu.biblioteca.dao;

import java.util.List;
import java.util.Map;

public interface Operaciones<T> {
 int create(T t);
 List<Map<String, Object>> lista();
}
