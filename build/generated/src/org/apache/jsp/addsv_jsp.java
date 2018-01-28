package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import connect.DBConnect;
import dao.SinhVienDAO;
import dao.SinhVienDAOImpl;

public final class addsv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản lý Sinh Viên | Thêm Sinh Viên</title>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            SinhVienDAOImpl SV=new SinhVienDAOImpl();
            
      out.write("\n");
      out.write("        <h1>Thêm Sinh Viên</h1>\n");
      out.write("        <br>\n");
      out.write("        <form id=\"frmthemsv\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                   Mã Sinh Viên:\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"text\" name=\"masv\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Họ Sinh Viên:\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"text\" name=\"ho\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Tên Sinh Viên:\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"text\" name=\"ten\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Quê Quán:\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"text\" name=\"quequan\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Nơi Sinh:\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"text\" name=\"noisinh\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <input type=\"submit\" value=\"Thêm SV\" name=\"btn Them\"></input>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");
           
            request.setCharacterEncoding("UTF-8");
            if(request.getParameter("btn Them") != null){
                String masv = request.getParameter("masv");
                String ho = request.getParameter("ho");
                String ten = request.getParameter("ten");
                String quequan = request.getParameter("quequan");
                String noisinh = request.getParameter("noisinh");            

                if(SV.AddSV(masv, ho, ten, quequan, noisinh)==true)
                    out.println("Đã thêm sinh viên vào csdl");
                else
                    out.println("Không thể thêm sinh viên vào csdl");
            }
            
               
      out.write("\n");
      out.write("               <br>\n");
      out.write("               <h3>Menu</h3>\n");
      out.write("        <a href=\"dssv.jsp?username=admin\">Danh sách sinh viên</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
