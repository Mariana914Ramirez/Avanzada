/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonav
 */
public class obtener extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String base = request.getParameter("base");
            String altura = request.getParameter("altura");
            String operacion = request.getParameter("operacion");
            
            double baseInt = Double.parseDouble(base);
            double alturaInt = Double.parseDouble(altura);
            double resultado;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet obtener</title>");            
            out.println("</head>");
            out.println("<body>");
                
                switch(operacion)
                {
                    case "triangulo":
                        resultado = (baseInt * alturaInt)/2;
                        out.println("<h1> El area del triangulo es: " + resultado + "</h1>");
                    break;
                    
                    case "cuadrado":
                        resultado = (baseInt * alturaInt);
                        out.println("<h1> El area del cuadrado es: " + resultado + "</h1>");
                    break;
                    
                    case "rectangulo":
                        resultado = (baseInt * alturaInt);
                        out.println("<h1> El area del rectangulo es: " + resultado + "</h1>");
                    break;
                }
            out.println("<a href='index.html'> <button> Digo reiniciar o algo así </button> </a>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
