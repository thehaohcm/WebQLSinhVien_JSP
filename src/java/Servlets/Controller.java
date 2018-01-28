package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.TaiKhoanDAOImpl;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NINH XUAN HAI
 */
@WebServlet(urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

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
//        try (
//                PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            String yc = request.getParameter("yc");
//            String url = "baitap/MVC/";
//            String loi;
//            if (yc.equals("tinh")) {
//                String a = request.getParameter("a");
//                String b = request.getParameter("b");
//
//                if (a.equals("") || b.equals("")) {
//                    loi = "Ban chua nhap a hoac b !!";
//                    response.sendRedirect(url + "loi.jsp?loi=" + loi);
//                    return;
//                }
//
//                try {
//                    Integer.parseInt(a);
//                    Integer.parseInt(b);
//                } catch (Exception e) {
//                    loi = "Ban phai nhap a, b kieu so !!";
//                    response.sendRedirect(url + "loi.jsp?loi=" + loi);
//                    return;
//                }
//                Cong cong = new Cong();
//                int c = cong.tinh(Integer.parseInt(a), Integer.parseInt(b));
//                response.sendRedirect(url + "kq.jsp?c=" + c);
//            }
//        }

        try(PrintWriter out=response.getWriter()){
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String loi;
            TaiKhoanDAOImpl tk=new TaiKhoanDAOImpl();
            if(username.equals("")||password.equals(""))
            {
                loi="Ban chua nhap du thong tin";
                return;
            }
            else{
                if(tk.checkAccount(username, password)){
                    response.sendRedirect("dssv.jsp");
                    return;
                }
                else{
                    loi="Thong tin dang nhap sai";
                    return;
                }
            }
        }
        catch(Exception ex){
            
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
