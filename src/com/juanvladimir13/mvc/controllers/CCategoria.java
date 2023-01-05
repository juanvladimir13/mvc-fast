package com.juanvladimir13.mvc.controllers;

import com.juanvladimir13.mvc.models.MCategoria;
import com.juanvladimir13.mvc.utils.IController;
import com.juanvladimir13.mvc.views.VCategoria;
import java.awt.event.ActionEvent;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class CCategoria implements IController {

  private MCategoria model;
  private VCategoria view;

  public CCategoria() {
    this.model = new MCategoria();
    this.view = new VCategoria();
    initListener();
  }

  @Override
  public void create() {
    view.clearFormData();
  }

  @Override
  public void save() {
    model.setData(view.getFormData());
    view.setFormData(model.save());
    list();
  }

  @Override
  public void delete() {
    model.setData(view.getFormData());
    model.delete();
    
    view.clearFormData();
    list();
  }

  @Override
  public void list() {
    /*Map<String, Object[]> data = model.list();
    view.setTable(data);*/

    view.setTable(model.list());
  }

  @Override
  public void initListener() {
    view.btnCrear.addActionListener((ActionEvent e) -> {
      create();
    });

    view.btnGuardar.addActionListener((ActionEvent e) -> {
      save();
    });

    view.btnEliminar.addActionListener((ActionEvent e) -> {
      delete();
    });
  }

  @Override
  public void showForm() {
    view.setVisible(true);
  }

}
