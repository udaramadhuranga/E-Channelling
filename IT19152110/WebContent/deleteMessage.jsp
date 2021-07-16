<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="body0">
	
	<% 
	
		String nic = request.getParameter("nic");
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String message = request.getParameter("message");
	
	%>
	
	
	<form action="delete" method="POST">
		<table>
			<tr>
				<td>NIC</td>
				<td><input type="text" name="nic" value="<%= nic%>" readonly/></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="name" value="<%= name%>" readonly /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%= email%>" readonly /></td>
			</tr>
			<tr>
				<td>Message</td>
				<td><input type="text" name="message" value="<%= message%>" readonly ></td>
			</tr>
			<tr>
				<td><input type="submit" name="delete" value="Delete Data" class="updateDelete"/></td>
			</tr>
		</table>
	</form>
	
</body>
</html>