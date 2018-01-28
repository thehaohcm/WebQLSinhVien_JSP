<%-- 
    Document   : suasv
    Created on : Mar 20, 2016, 5:48:23 PM
    Author     : thehaohcm
--%>

<%@page import="model.SinhVien"%>
<%@page import="dao.SinhVienDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="4,url=dssv.jsp">-->
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String username=request.getParameter("username");
            String masv=request.getParameter("masv");
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
                        <form id="sua" action="suasv2.jsp">
                            <input type="hidden" name="username" value="<%=username%>" />
                            <input type="hidden" name="masv_cu" value="<%=masv%>" />
                            <th><input type="text" name="masv" value="<%=sv.getMasv()%>" /></th>
                            <th><input type="text" name="hosv" value="<%=sv.getHo()%>" /></th>
                            <th><input type="text" name="tensv" value="<%=sv.getTen()%>" /></th>
                            <th><input type="text" name="quequan" value="<%=sv.getQuequan()%>" /></th>
                            <th><input type="text" name="noisinh" value="<%=sv.getNoisinh()%>" /></th>
                            
                    </tr>
                </table>
                            <br>
                            <input type="submit" name="suasv" value="Sửa thông tin"/>
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
            <form action="dssv.jsp">
                <input type="hidden" name="username" value="<%=username%>" />
                <input type="submit" value="quay về danh sách sinh viên" />
            </form>
    </body>
</html>
