/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Operaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Operaciones at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPeraciones</h1>");
            out.println("<br><br>");
            out.print("<form action='' method='post'>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td>valor 1:</td>"
                    + "<td><input type='text' name='cantidad1'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>valor 2:</td>"
                    + "<td><input type='text' name='cantidad2'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td><td>"
                    + "<select name='opcion'>"
                    + "<option>Selecciones un operador</option>"
                    + "<option value = 'suma'>Suma</option>"
                    + "<option value='resta'>Resta</option>"
                    + "<option value='producto'>Producto</option>"
                    + "<option value='division'>Division</option>"
                    + "</select>"
                    + "</td>"
                    + "<td>"
                    + "<input type='submit' name='procesas' value='Procesas'>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td>"
                    + "<td>"
                    + "<input type='text' value='Resultado'>"
                    + "</td>"
                    + "</tr>"
                    + "</table>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cantidad1 = request.getParameter("cantidad1");
        String cantidad2 = request.getParameter("cantidad2");
        String opcion = request.getParameter("opcion");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();       
        double cant1= Double.parseDouble(cantidad1);
        double cant2= Double.parseDouble(cantidad2);
        double resultado=0;
        //out.println(cantidad1+"-"+cantidad2+"<br>pcion"+opcion);
        if (cant1 > 0 && cant2 > 0) {
            //out.println("ENTRO");
            if ("suma".equals(opcion)) {         
                //out.println("ENTRO SUMA");
                resultado = cant1 + cant2;
            }          
            if ("resta".equals(opcion)) {         
                resultado = cant1 - cant2;
            }          
            if ("producto".equals(opcion)) {         
                resultado = cant1 * cant2;
            }          
            if ("division".equals(opcion)) {         
                resultado = cant1 / cant2;
            }          
        }   
        
        try {
            out.println(resultado);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPeraciones</h1>");
            out.println("<br><br>");
            out.print("<form action='' method=''>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td>valor 1:</td>"
                    + "<td><input type='text' name='' value='"+cantidad1+"'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>valor 2:</td>"
                    + "<td><input type='text' name='' value='"+cantidad2+"'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td><td>"

                    + "<select name=''>"
                    + "<option>Selecciones un operador</option>"                            
                    + "<option>Suma</option>"
                    + "<option>Resta</option>"
                    + "<option>Producto</option>"
                    + "<option>Division</option>"
                    + "</select>"
                    + "</td>"
                    + "<td>"
                    + "<input type='submit' name='' value='Limpiar'>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td>"
                    + "<td>"
                    + "<input type='text' value='"+Double.toString(resultado)+"'>"
                    + "</td>"
                    + "</tr>"
                    + "</table>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
                            
        } catch (Exception e) {
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
