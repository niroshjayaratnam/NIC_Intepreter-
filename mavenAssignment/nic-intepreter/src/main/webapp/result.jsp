<%-- 
    Document   : result
    Created on : 11-Sep-2013, 14:44:18
    Author     : Nirosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="NIC.NIC"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<h1>NIC interpretation resutls</h1>

<h3>Result of NIC interpretation is</h3>
<%
	String nic_no = request.getParameter("NICNumber");
	
	
	NIC nic = new NIC();
        String[] num= nic.calculate(nic_no);
               out.println("Nic [birthDay=BirthDay[year="+num[0]+",month="+num[1]+",date="+num[2]+"], gender="+num[3]+",isVoter="+num[4]); 
	
	
%>
</head>
<body>

</body>
</html>