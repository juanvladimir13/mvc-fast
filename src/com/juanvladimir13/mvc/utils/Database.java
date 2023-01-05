package com.juanvladimir13.mvc.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Database {

  private int rowCount;
  private Map<String, Object[]> rows;

  public Database() {
    this.rows = new HashMap<>();
    this.rowCount = 1;
  }

  public Object[] insert(Object[] row) {
    row[0] = rowCount;
    this.rows.put(row[0].toString(), row);
    rowCount++;
    return row;
  }

  public Object[] update(Object[] row) {
    this.rows.put(row[0].toString(), row);
    return row;
  }

  public boolean delete(String id) {
    return this.rows.remove(id) != null;
  }

  public Map<String, Object[]> select() {
    return this.rows;
  }

  public List<String> rowsToString() {
    List<String> combobox = new LinkedList<>();

    for (Map.Entry<String, Object[]> entry : rows.entrySet()) {
      Object[] row = entry.getValue();
      // id=855 nombre=juanvladimir
      // 855 | juanvladimir
      String item = entry.getKey() + " | " + row[1].toString();
      combobox.add(item);
    }
    return combobox;
  }
}
