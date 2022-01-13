package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Stateless;

/******* Esta clase es un EJB *********
 * @Stateless, este tipo de anotación (que es un tipo de EJB) convierte a la clase precisamente en un EJB
 */
@Stateless
public class ServiceEJB {

    public String saludar(String nombre) {
        System.out.println("Imprimiendo dentro del ejb con instancia: " + this);
        return "Hola que tal " + nombre;
    }

}
