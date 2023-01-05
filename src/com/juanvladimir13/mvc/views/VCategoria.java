package com.juanvladimir13.mvc.views;

import com.juanvladimir13.mvc.utils.IView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class VCategoria extends javax.swing.JFrame implements IView {

  public VCategoria() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnCrear = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    txtId = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    txtDescripcion = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabCategoria = new javax.swing.JTable();
    btnEliminar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    btnCrear.setText("crear");

    btnGuardar.setText("guardar");

    tabCategoria.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Id", "Nombre", "Descripcion"
      }
    ));
    jScrollPane1.setViewportView(tabCategoria);

    btnEliminar.setText("Eliminar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar))
              .addGroup(layout.createSequentialGroup()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCrear)
          .addComponent(btnGuardar)
          .addComponent(btnEliminar))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnCrear;
  public javax.swing.JButton btnEliminar;
  public javax.swing.JButton btnGuardar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tabCategoria;
  private javax.swing.JTextField txtDescripcion;
  private javax.swing.JTextField txtId;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables

  @Override
  public Map<String, String> getFormData() {
    Map<String, String> data = new HashMap<>();
    data.put("id", txtId.getText());
    data.put("nombre", txtNombre.getText());
    data.put("descripcion", txtDescripcion.getText());

    return data;
  }

  @Override
  public void setFormData(Object[] data) {
    txtId.setText(data[0].toString());
    txtNombre.setText(data[1].toString());
    txtDescripcion.setText(data[2].toString());
  }

  @Override
  public void clearFormData() {
    txtId.setText("");
    txtNombre.setText("");
    txtDescripcion.setText("");
  }

  @Override
  public void setTable(Map<String, Object[]> data) {
    DefaultTableModel dt = (DefaultTableModel) tabCategoria.getModel();
    dt.getDataVector().clear();
    
    for (Map.Entry<String, Object[]> entry : data.entrySet()) {
      dt.addRow(entry.getValue());
    }
  }

  @Override
  public void setComboBox(List<String> data) {

  }

}
