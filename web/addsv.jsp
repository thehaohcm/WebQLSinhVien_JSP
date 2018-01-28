<%-- 
    Document   : index
    Created on : Mar 19, 2016, 1:22:20 PM
    Author     : thehaohcm
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="connect.DBConnect"%>
<%@page import="dao.SinhVienDAO"%>
<%@page import="dao.SinhVienDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý Sinh Viên | Thêm Sinh Viên</title>
        <script>

        </script>
    </head>
    <body>
        <%
            SinhVienDAOImpl SV=new SinhVienDAOImpl();
            %>
        <h1>Thêm Sinh Viên</h1>
        <br>
        <form id="frmthemsv">
        <table border="0">
            <tr>
                <th>
                   Mã Sinh Viên:
                </th>
                <th>
                    <input type="text" name="masv"></input>
                </th>
            </tr>
            <tr>
                <th>
                    Họ Sinh Viên:
                </th>
                <th>
                    <input type="text" name="ho"></input>
                </th>
            </tr>
            <tr>
                <th>
                    Tên Sinh Viên:
                </th>
                <th>
                    <input type="text" name="ten"></input>
                </th>
            </tr>
            <tr>
                <th>
                    Quê Quán:
                </th>
                <th>
                    <input type="text" name="quequan"></input>
                </th>
            </tr>
            <tr>
                <th>
                    Nơi Sinh:
                </th>
                <th>
                    <input type="text" name="noisinh"></input>
                </th>
            </tr>
            <tr>
                <th>
                </th>
                <th>
                    <input type="submit" value="Thêm SV" name="btn Them"></input>
                </th>
            </tr>
        </table>
        </form>
        
        <%           
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
            
               %>
               <br>
               <h3>Menu</h3>
        <a href="dssv.jsp?username=admin">Danh sách sinh viên</a>
    </body>
</html>
