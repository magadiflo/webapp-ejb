package org.magadiflo.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.magadiflo.webapp.ejb.service.ServiceEJB;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet({"/index"})
public class EjemploServlet extends HttpServlet {

//    @Inject
//    private ServiceEJB serviceEJB;
//
//    @Inject
//    private ServiceEJB serviceEJB2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceEJB serviceEJB = null;
        ServiceEJB serviceEJB2 = null;

        try {
            InitialContext ctx = new InitialContext();
            serviceEJB = (ServiceEJB) ctx.lookup("java:global/60.webapp-ejb/ServiceEJB!org.magadiflo.webapp.ejb.service.ServiceEJB");
            serviceEJB2 = (ServiceEJB) ctx.lookup("java:global/60.webapp-ejb/ServiceEJB!org.magadiflo.webapp.ejb.service.ServiceEJB");
        } catch (NamingException e) {
            e.printStackTrace();
        }

        System.out.println("serviceEJB si es igual a serviceEJB2 = " + serviceEJB.equals(serviceEJB2));
        req.setAttribute("saludo", serviceEJB.saludar("Martín"));
        req.setAttribute("saludo2", serviceEJB2.saludar("Gaspar"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
