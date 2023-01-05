package com.juanvladimir13.mvc.models;

import com.juanvladimir13.mvc.utils.Database;
import com.juanvladimir13.mvc.utils.IModel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class MCategoria implements IModel {

  private Database database;

  private String id;
  private String nombre;
  private String descripcion;

  public MCategoria() {
    this.id = "0";
    this.nombre = "";
    this.descripcion = "";
    this.database = new Database();
  }

  @Override
  public void setData(Map<String, String> data) {
    this.id = data.getOrDefault("id", "0");
    this.nombre = data.getOrDefault("nombre", "");
    this.descripcion = data.getOrDefault("descripcion", "");
  }

  @Override
  public Object[] save() {
    Object row[] = {id, nombre, descripcion};
    if (id.isEmpty()) {
      return database.insert(row);
    }
    return database.update(row);
  }

  @Override
  public boolean delete() {    
    return database.delete(id);
  }

  @Override
  public Map<String, Object[]> list() {
    return database.select();
  }

  @Override
  public List<String> rowsToString() {
    return database.rowsToString();
  }

}
