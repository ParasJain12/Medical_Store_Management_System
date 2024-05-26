<%@page import="daoimpl.AdminDAOImpl"%>
<%@page import="dao.AdminDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	
	<%
		String uid = request.getParameter("txtAid");
		String pass = request.getParameter("txtPassword");
	%>
	
	<jsp:useBean id="admin" class="model.Admin"
	 scope="page">
	</jsp:useBean>
	
	<jsp:setProperty property="userid" name="admin"
	value="<%=uid%>"/>
	<jsp:setProperty property="password" name="admin"
	value="<%=pass%>"/>
	
	
	<%
		AdminDAO daoImpl = new AdminDAOImpl();
		if(daoImpl.register(admin)) {
			
			response.sendRedirect("AdminRegistration_Success.jsp");
		}
		else {
			
			response.sendRedirect("AdminRegistration_Failure.jsp");
		}
	%>
</div>
</body>
</html>
