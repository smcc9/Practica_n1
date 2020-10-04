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


@WebServlet(name = "CambioMoneda", urlPatterns = {"/CambioMoneda"})
public class CambioMoneda extends HttpServlet {

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
            out.println("<title>Servlet CambioMoneda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CambioMoneda at " + request.getContextPath() + "</h1>");
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
            out.println("<title>Cambio de Moneda!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tipo de Cambio</h1>");
            out.println("<br><br>");
            out.print("<form action='' method='post'>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td>Cantidad:</td>"
                    + "<td><input type='text' name='cantidad'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>"
                    + "</td>"
                    + "<td><input type='submit' name='btndol' value='Dolar a Boliviano' >&nbsp&nbsp&nbsp"
                    + "<input type='submit' name='btnbol' value='Boliviano a Dolar' ></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td>"
                    + "<td>"
                    + "<input type='text' value=''>"
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
        String cantidad = request.getParameter("cantidad");
        String btndol = request.getParameter("btndol");
        String btnbol = request.getParameter("btnbol");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();       

        //out.println("Valor 1 ="+cantidad+"<br>"); 

        double resultado=0;
        String aux="";
        String aux2="";
        if (cantidad != null) {
            if (btndol !=null) {
                resultado = Double.parseDouble(cantidad)*6.96;
                aux = "Bolivianos";
                aux2 = "Dolares";
                
            }
            if (btnbol != null) {
                resultado = Double.parseDouble(cantidad)/6.96;
                aux = "Dolares";
                aux2 = "Bolivianos";
            }
        }        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cambio de Moneda!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tipo de Cambio</h1>");
            out.println("<br><br>");
            out.print("<form action = '' method=''>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td>Cantidad:</td>"
                    + "<td><input type='text' name='' value='"+cantidad+"'></td><td>"+aux2+"</td>"
                    + "</tr>"
                    + "<tr>"
                   // + "<td><input type='submit' value='Dolar' >&nbsp&nbsp&nbsp"
                   // + "<input type='submit' value='Boliviano' >&nbsp&nbsp&nbsp"
                    + "<td></td>"
                    + "</td><input type='submit' value='Limpiar'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td>"
                    + "<td>"
                    + "<input type='text' value='"+ Double.toString(resultado) +"'>"
                    + "</td><td>"+aux+"<td/>"
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
