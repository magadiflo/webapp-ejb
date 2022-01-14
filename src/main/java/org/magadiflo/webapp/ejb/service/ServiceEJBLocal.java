package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Local;

@Local
public interface ServiceEJBLocal {
    String saludar(String nombre);
}
