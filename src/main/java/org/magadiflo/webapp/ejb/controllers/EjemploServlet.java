package org.magadiflo.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.magadiflo.webapp.ejb.service.ServiceEJB;

import java.io.IOException;

@WebServlet({"/index"})
public class EjemploServlet extends HttpServlet {

    @EJB
    private ServiceEJB serviceEJB;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("saludo", this.serviceEJB.saludar("Martín"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
