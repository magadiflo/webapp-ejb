package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Local;
import org.magadiflo.webapp.ejb.models.Producto;

import java.util.List;

@Local
public interface ServiceEJBLocal {
    String saludar(String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}
