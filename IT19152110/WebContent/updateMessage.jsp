<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body class="body0">

	<% 
	
		String nic = request.getParameter("nic");
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String message = request.getParameter("message");
	
	%>

	<form action="update" method="POST">
		<table>
			<tr>
				<td>NIC</td>
				<td><input type="text" name="nic" value="<%= nic%>" readonly/></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="name" value="<%= name%>" pattern = ".*[a-zA-Z]" required/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%= email%>" pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._]+\.[a-z]{2,3}" required/></td>
			</tr>
			<tr>
				<td>Message</td>
				<td><input type="text" name="message" value="<%= message%>" ></td>
			</tr>
			<tr>
				<td><input type="submit" name="update" value="Update Data" class="submit"/></td>
			</tr>
		</table>
	</form>

</body>
</html>