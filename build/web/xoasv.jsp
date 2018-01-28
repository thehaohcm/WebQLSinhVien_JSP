<%-- 
    Document   : sua1
    Created on : Mar 21, 2016, 2:56:34 PM
    Author     : thehaohcm
--%>

<%@page import="model.SinhVien"%>
<%@page import="dao.SinhVienDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String masv=request.getParameter("masv");
            String username=request.getParameter("username");
            SinhVienDAOImpl svd= new SinhVienDAOImpl();
            SinhVien sv=svd._getSVbyMasv(masv);
            if(sv!=null){
                %>
                <table border=1>
                    <tr>
                        <th>Mã SV</th>
                        <th>Họ</th>
                        <th>Tên</th>
                        <th>Quê Quán</th>
                        <th>Nơi Sinh</th>
                    </tr>
                    <tr>
                        <form id="sua" action="xoasv2.jsp">
                            <input type="hidden" name="masv" value="<%=masv%>" />
                            <input type="hidden" name="username" value="<%=username%>" />
                            <th><%=sv.getMasv()%></th>
                            <th><%=sv.getHo()%></th>
                            <th><%=sv.getTen()%></th>
                            <th><%=sv.getQuequan()%></th>
                            <th><%=sv.getNoisinh()%></th>
                            
                    </tr>
                </table>
                            <br>
                            Bạn có thật sự muốn xóa?<br>
                            <input type="submit" name="suasv" value="Có" />
                            
                        </form> 
                            
                            
                <br>
                <br>
            <%
            }
            else{
                out.println("Không có thông tin về sinh viên này trong csdl");
            }
            %>
            <br>
            <form action="dssv.jsp?username=admin">
                <input type="submit" value="Quay trở về danh sách sinh viên" />
            </form>
    </body>
</html>
