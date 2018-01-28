<%-- 
    Document   : dsvs
    Created on : Mar 19, 2016, 2:04:23 PM
    Author     : thehaohcm
--%>
<%@page import="model.SinhVien"%>
<%@page import="dao.SinhVienDAO"%>
<%@page import="dao.SinhVienDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>      
        <title>JSP Page</title>
    </head>
    
    <body>
    <% SinhVienDAO svd=new SinhVienDAOImpl();
        SinhVienDAO t=new SinhVienDAOImpl();
        String username=request.getParameter("username");
        
        if(username==null){
            response.sendRedirect("dssv.jsp?username=client");
        }
        %>
        <h1>Danh sách sinh viên</h1>
        <br>
        <table>
            <tr>
                <th>Tìm kiếm theo mã Sinh Viên:</th>
                <form action="dssv.jsp">
                    <input type="hidden" name="username" value="<%=username%>" />
                    <th><input type="textbox" name="txtSearch"></input></th>
                    <th><input type="submit" name="btnSearch" value="Tìm kiếm" /></th>
                </form>
            </tr>
        </table>
        <br>
        
        <table border="1">
            <tr>
                <th>MaSV</th>
                <th>Họ SV</th>
                <th>Tên SV</th>
                <th>Quê Quán</th>
                <th>Nơi Sinh</th>
                <%if(username.equals("admin")){%>
                    <th>Sửa</th>
                    <th>Xóa</th>
                <%}%>
                
                
            </tr>
            
            <%
                String strSearch=request.getParameter("txtSearch");
                
                if(strSearch!=null&&!strSearch.equals("*"))
                {
                    for(SinhVien a:svd.getSVbyMasv(strSearch))
                    {
                    %>
                        <tr>
                            <td><%=a.getMasv()%></td>
                            <td><%=a.getHo()%></td>
                            <td><%=a.getTen()%></td>
                            <td><%=a.getQuequan()%></td>
                            <td><%=a.getNoisinh()%></td>
                            <%if(username.equals("admin")){%>
                                <td><a href="suasv.jsp?masv=<%=a.getMasv()%>&username=<%=username%>">Sửa thông tin</a></td>
                                <td><a href="xoasv.jsp?masv=<%=a.getMasv()%>&username=<%=username%>">Xóa sinh viên</a></td>
                            <%}%>
                        </tr>
                    <%
                    }
                }
                else{
                    for(SinhVien a:svd.getListSV()){%>
                        <tr>
                            <td><%=a.getMasv()%></td>
                            <td><%=a.getHo()%></td>
                            <td><%=a.getTen()%></td>
                            <td><%=a.getQuequan()%></td>
                            <td><%=a.getNoisinh()%></td>
                           <%if(username.equals("admin")){%>
                                <td><a href="suasv.jsp?masv=<%=a.getMasv()%>&username=<%=username%>">Sửa thông tin</a></td>
                                <td><a href="xoasv.jsp?masv=<%=a.getMasv()%>&username=<%=username%>">Xóa sinh viên</a></td>
                            <%}%>
                        
                        </tr>
                    <%
                    }
                }
                %>
            
        </table>
        
                <h3>MENU</h3>
                <%if(username.equals("admin")){%>
                    <a href="addsv.jsp?username=<%=username%>">Thêm Sinh Viên</a><br>
                    
                <%}
                else{%>
                    <a href="dangnhap.jsp">Đăng xuất</a>
                    <%}%>
                </table>
    </body>
</html>
