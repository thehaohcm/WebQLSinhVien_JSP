<%-- 
    Document   : dangnhap
    Created on : Mar 22, 2016, 12:18:45 AM
    Author     : thehaohcm
--%>

<%@page import="dao.TaiKhoanDAOImpl"%>
<%@page import="dao.TaiKhoanDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang đăng nhập | Login Page</title>
    </head>
    <body>
        <h1>Trang Đăng Nhập</h1>
        <form method="POST" action="NewServlet">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" /><td>            
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" /><td>
                </tr>
                <tr>
                    <td><input type="submit" value="Đăng nhập" /></td>
                </tr>
            </table>
        </form>
        <br>
        <form action="dssv.jsp">
            <input type="hidden" name="username" value="client" />
            <input type="submit" value="Truy cập với tư cách là KHÁCH (Chỉ xem thông tin)" />
        </form>
        
    </body>
</html>
