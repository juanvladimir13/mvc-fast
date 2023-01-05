package com.juanvladimir13.mvc;

import com.juanvladimir13.mvc.controllers.CCategoria;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class FApp extends javax.swing.JFrame {
  private CCategoria categoriaController;
  
  public FApp() {
    initComponents();
    categoriaController = new CCategoria();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuBar1 = new javax.swing.JMenuBar();
    menMVC = new javax.swing.JMenu();
    menBasicoMVC = new javax.swing.JMenuItem();
    menAsociacionMVC = new javax.swing.JMenuItem();
    menCapa = new javax.swing.JMenu();
    menBasicoCapa = new javax.swing.JMenuItem();
    menAsociacionCapa = new javax.swing.JMenuItem();

    jMenuItem3.setText("jMenuItem3");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    menMVC.setText("MVC");

    menBasicoMVC.setText("CU Basico");
    menBasicoMVC.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menBasicoMVCActionPerformed(evt);
      }
    });
    menMVC.add(menBasicoMVC);

    menAsociacionMVC.setText("CU Asociacion");
    menMVC.add(menAsociacionMVC);

    jMenuBar1.add(menMVC);

    menCapa.setText("3 Capas");

    menBasicoCapa.setText("CU Basico");
    menCapa.add(menBasicoCapa);

    menAsociacionCapa.setText("CU Asociacion");
    menCapa.add(menAsociacionCapa);

    jMenuBar1.add(menCapa);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 279, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menBasicoMVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menBasicoMVCActionPerformed
    categoriaController.showForm();
  }//GEN-LAST:event_menBasicoMVCActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FApp().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem menAsociacionCapa;
  private javax.swing.JMenuItem menAsociacionMVC;
  private javax.swing.JMenuItem menBasicoCapa;
  private javax.swing.JMenuItem menBasicoMVC;
  private javax.swing.JMenu menCapa;
  private javax.swing.JMenu menMVC;
  // End of variables declaration//GEN-END:variables

}
