package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.SinhVien;
import dao.SinhVienDAO;
import dao.SinhVienDAOImpl;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class dsvs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        ");
 SinhVienDAO svd=new SinhVienDAOImpl();
      out.write("\n");
      out.write("        <h1>Danh sách sinh viên</h1>\n");
      out.write("        <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Tên Sinh Viên:</th>\n");
      out.write("                <th><input type=\"textbox\" name=\"txtSearch\"></input></th>\n");
      out.write("                <th><input type=\"submit\" name=\"btnSearch\" /></th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>MaSV</th>\n");
      out.write("                <th>Họ SV</th>\n");
      out.write("                <th>Tên SV</th>\n");
      out.write("                <th>Quê Quán</th>\n");
      out.write("                <th>Nơi Sinh</th>\n");
      out.write("                <th>Sửa</th>\n");
      out.write("                <th>Xóa</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                if(request.getParameter("btnSearch")!=null)
                {
                    String tenSearch=request.getParameter("txtSearch");
                    for(SinhVien a:svd.GetSVbyTen(tenSearch)){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print(a.getMasv());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getHo());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getTen());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getNoisinh());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getQuequan());
      out.write("</th>\n");
      out.write("                            <th><input type=\"submit\" value=\"Sửa\" name=\"sua\"></input></th>\n");
      out.write("                            <th><input type=\"submit\" value=\"Xóa\" name=\"xoa\"></input></th>\n");
      out.write("                        </tr>\n");
      out.write("                    ");

                    }
                }
                else{
                    for(SinhVien a:svd.getListSV()){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print(a.getMasv());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getHo());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getTen());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getNoisinh());
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(a.getQuequan());
      out.write("</th>\n");
      out.write("                            <th><input type=\"submit\" value=\"Sửa\" name=\"sua\"></input></th>\n");
      out.write("                            <th><input type=\"submit\" value=\"Xóa\" name=\"xoa\"></input></th>\n");
      out.write("                        </tr>\n");
      out.write("                    ");

                    }
                }
                
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
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
