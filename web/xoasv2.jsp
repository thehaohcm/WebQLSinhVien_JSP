<%-- 
    Document   : xoasv
    Created on : Mar 20, 2016, 5:48:30 PM
    Author     : thehaohcm
--%>

<%@page import="dao.SinhVienDAOImpl"%>
<%@page import="dao.SinhVienDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%String username=request.getParameter("username");%>
        <meta http-equiv="refresh" content="1; url=dssv.jsp?username=<%=username%>">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           
           String masv=request.getParameter("masv");
           SinhVienDAOImpl svd=new SinhVienDAOImpl();
           
           if(svd.RemoveSV(masv)==true){
               out.println("<b>Đã xóa sinh viên thành công</b>");
           }
           else{
               out.println("<b>Không thể xóa sinh viên</b>");
           }
           
           
            %>
            <br><br>
            Website sẽ tự động quay về trang danh sách sinh viên.<br>
                Nếu không load được, xin vui lòng click vào nút phía dưới
            <form action="dssv.jsp">
                <input type="hidden" name="username" value="<%=username%>" />
                <input type="submit" value="quay về danh sách sinh viên" />
            </form>
    </body>
</html>
