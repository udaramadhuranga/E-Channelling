<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact insert</title>
</head>
<body class="body0">
	
	<h1 class="cs">Contact Us</h1>
	
	<form action="contact" method="POST">
		<table>
			<tr>  
				<td>NIC</td>
				<td><input type="text" name="nic" pattern = "[0-9]{9}v" required /></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="name" pattern = ".*[a-zA-Z]" required /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._]+\.[a-z]{2,3}" required /></td>
			</tr>
			<tr>
				<td>Message</td>
				<td><textarea name = "message"  rows = "8" cols ="30"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="submit" class="submit"/></td>
			</tr>
		</table>
	</form>
	<a href = "updateInfo.jsp"><input type="submit" name="update" value="update or delete" class="updateDelete"/></a><br><br><br>
	
	<form action="adminView" method="POST">
		<input type="submit" name="submit" value="Admin" class="submit"/>
	</form>

	
</body>
</html>