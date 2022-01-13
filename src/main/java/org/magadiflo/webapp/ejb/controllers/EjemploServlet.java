package org.magadiflo.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.magadiflo.webapp.ejb.service.ServiceEJB;

import java.io.IOException;

@WebServlet({"/index"})
public class EjemploServlet extends HttpServlet {

    @Inject
    private ServiceEJB serviceEJB;

    @Inject
    private ServiceEJB serviceEJB2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("serviceEJB si es igual a serviceEJB2 = " + serviceEJB.equals(serviceEJB2));
        req.setAttribute("saludo", this.serviceEJB.saludar("Martín"));
        req.setAttribute("saludo2", this.serviceEJB2.saludar("Gaspar"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
