package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "JuegoDados", urlPatterns = {"/JuegoDados"})
public class JuegoDados extends HttpServlet {

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
            out.println("<title>Servlet JuegoDados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JuegoDados at " + request.getContextPath() + "</h1>");
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
            out.println("<title>Juegos Dados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Juego de Dados</h1>");
            out.println("<br><br>");
            out.println("Lanza los dados gana si el resultado de la suma de los dos dados son 7 o 11");
            out.print("<form action='' method='post'>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td><input type='submit' value = 'Lanzar Dados'></td>"
                    + "<tr>"
                    + "<td>valor 1:</td>"
                    + "<td><input type='text' name='cantidad1'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>valor 2:</td>"
                    + "<td><input type='text' name='cantidad2'></td>"
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
        int dado1 = (int)(Math.random()*6+1);
        int dado2 = (int)(Math.random()*6+1);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();       
        int suma = dado1+dado2;
        String resultado = "";
        if (suma == 7 || suma == 11) {
            resultado = "GANASTE";
        }else{
            resultado = "PERDISTE :'C";
        }
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juegos Dados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Juego de Dados</h1>");
            out.println("<br><br>");
            out.print("<form action='' method=''>");
            out.println(""
                    + "<table>"
                    + "<tr>"
                    + "<td><input type='submit' value = 'Jugar de Nuevo'></td>"
                    + "<tr>"
                    + "<td>valor 1:</td>"
                    + "<td><input type='text' name='cantidad1' value = '"+dado1+"'></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>valor 2:</td>"
                    + "<td><input type='text' name='cantidad2' value='"+dado2+"'></td>"
                    + "</tr>"
                    + "<tr><td></td><td>"+resultado+"</td></tr>"
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
