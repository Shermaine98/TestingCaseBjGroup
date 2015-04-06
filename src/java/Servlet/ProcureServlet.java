/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.ItemBean;
import Beans.ProcureBean;
import DAO.ItemDAO;
import DAO.ProcureDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JManacmol
 */
@WebServlet(name = "ProcureServlet", urlPatterns = {"/ProcureServlet"})
public class ProcureServlet extends HttpServlet {

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
           String cartArray = request.getParameter("cartArray");
           String[] itemsProcured = cartArray.split(",");
           String quantityArray = request.getParameter("quantityArray");
           String[] quantityProcured = quantityArray.split(",");
           String supplierID = request.getParameter("suppliervalue");
           String userID = request.getParameter("userID");
           ArrayList<ItemBean> itemList = new ArrayList<ItemBean>();
           ItemDAO itemDAO = new ItemDAO();
           ArrayList<ProcureBean> procureList = new ArrayList<ProcureBean>();
              
                   for(int i = 0 ; i < itemsProcured.length;i++){
                   ProcureBean procureBean = new ProcureBean(Integer.parseInt(supplierID),
                           Integer.parseInt(quantityProcured[i]),
                           Integer.parseInt(itemsProcured[i]),
                           Integer.parseInt(userID));
                   procureList.add(procureBean);
                   }
                   
                   ProcureDAO procureDAO = new ProcureDAO();
            try {
                procureDAO.procureOrder(procureList);
            } catch (SQLException ex) {
                Logger.getLogger(ProcureServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            out.print("Successful!");
            
              
           
               
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
