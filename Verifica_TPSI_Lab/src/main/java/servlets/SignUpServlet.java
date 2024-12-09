package com.example.verifica_tpsi_lab;

import beans.Utente;
import database.DAO;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "usersServlet", value = "/users-servlet")
public class SignUpServlet extends HttpServlet {
    private String message;
    private ResultSet rs;
    private DAO dao;

    public void init() {
        dao = new DAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet servlets.UsersServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border=\"1\">");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Nome</th>");
        out.println("<th>Cognome</th>");
        out.println("</tr>");
        out.println("</thead>");
        try
        {
            rs = dao.getUtenti();
            out.println("<tbody>");
            while(rs.next())
            {
                out.println("<tr>");
                out.println("<td>"+rs.getString(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Utente utente = new Utente(nome, cognome, email, password);
        if(dao.isUserRegistered(email)) {
            // Redirect to log in
            response.sendRedirect("signin.jsp");
        }else {
            int userId = dao.insertUtente(utente);
            if(userId > 0) {
                // signUp ok redirect to signIn
                response.sendRedirect("signin.jsp");
            }else{
                message = "User not added";
            }
            out.println(message);
        }
    }

}
public void destroy() {
}
}
