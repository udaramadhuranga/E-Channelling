<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enter nic</title>
</head>
<body class="body0">
	
	<form action="view" method="POST">
		<table>
		<tr>
			<td>Enter NIC</td>
			<td><input type="text" name="nic" pattern = "[0-9]{9}v" required /><br></td>
		</tr>
		<tr>
			<td><input type="submit" name="load" value="Load" class="load"/></td>
		</tr>
		</table>
	</form>

</body>
</html>