<%-- 
    Document   : result
    Created on : Sep 11, 2013, 2:09:48 PM
    Author     : Nirushan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nic.NIC"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOB calculation</title>
        <h2>
        <%
	String num = request.getParameter("num");
        NIC nic_cal = new NIC();
        
        out.println("<br>Year  :-"+nic_cal.getYear(num));
        out.println("<br>Month :-"+nic_cal.getMonth(num));
        out.println("<br>Days  :-"+nic_cal.getDate(num));
        out.println("<br>Gender:-"+nic_cal.gender(num));
        out.println("<br>Voter :-"+nic_cal.isVoter(num));
        %>
        </h2>
    </head>
    <body>
    </body>
</html>
