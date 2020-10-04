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


@WebServlet(name = "MatrizCaracol", urlPatterns = {"/MatrizCaracol"})
public class MatrizCaracol extends HttpServlet {

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
            out.println("<title>Servlet MatrizCaracol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MatrizCaracol at " + request.getContextPath() + "</h1>");
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
            out.println("<title>Matriz Caracol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generador de Matriz Caracol</h1>");
            out.println("<br><br>");
            out.print("<form action='' method='post'>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td><input name='valor' type='text'></td>"
                    + "<td><input type='submit' value = 'Generar Matriz'></td>"
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
        String valor = request.getParameter("valor");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        int n = Integer.parseInt(valor);        
        
        String[][] matriz = new String[n][n];
        int a =0;
        int b = n-1;
        int valor1 =0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = a; i <= b; i++) {
            matriz[a][i]= valor1++ + " ";
            }
            for (int i = a+1; i <= b; i++) {
            matriz[i][b]= valor1++ + " ";
            }
            for (int i = b-1; i >=a ; i--) {
            matriz[b][i]= valor1++ + " ";            
            }
            for (int i = b-1; i >= a+1; i--) {
            matriz[i][a] = valor1++ + " ";
            }
            a++;
            b--;
        }

        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Matriz Caracol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generador de Matriz Caracol</h1>");
            out.println("<br><br>");
            out.print("<form action='' method=''>");
        for (int f = 0; f <matriz.length; f++) {
            for (int i = 0; i < matriz[f].length; i++) {
                out.println(matriz[f][i]);
            }
            out.println("<br>");
        }
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td><input name='' type='text'></td>"
                    + "<td><input type='submit' value = 'Limpiar'></td>"
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
