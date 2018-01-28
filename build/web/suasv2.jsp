<%-- 
    Document   : suasv2
    Created on : Mar 20, 2016, 8:23:05 PM
    Author     : thehaohcm
--%>

<%@page import="dao.SinhVienDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <%request.setCharacterEncoding("UTF-8");
            String username=request.getParameter("username");%>
        <meta http-equiv="refresh" content="1, url=dssv.jsp?username=<%=username%>">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String masv_cu=request.getParameter("masv_cu");
            String _masv=request.getParameter("masv");
            String _hosv=request.getParameter("hosv");
            String _tensv=request.getParameter("tensv");
            String _quequan=request.getParameter("quequan");
            String _noisinh=request.getParameter("noisinh");
            
            out.println(_hosv+" "+_tensv);
            
            SinhVienDAOImpl svd=new SinhVienDAOImpl();
            if(svd.UpdateSV(masv_cu,_masv,_hosv,_tensv,_quequan,_noisinh)==true){
                out.println("Đã cập nhật thành công thông tin sinh viên " + masv_cu);
            }
            else
            {
                out.println("Không thể cập nhật thông tin sinh viên "+masv_cu);
            }
            %>
            <br>
            <br>
            Website sẽ tự động quay về trang danh sách sinh viên.<br>
                Nếu không load được, xin vui lòng click vào nút phía dưới
            <form action="dssv.jsp">
                <input type="hidden" name="username" value="<%=username%>" />
                <input type="submit" value="quay về danh sách sinh viên" />
            </form>
            
    </body>
</html>
