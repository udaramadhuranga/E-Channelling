<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body class="body0">
		
	<table border = "1">
	
		<thead >
			<tr>
			<th>NIC</th>
			<th>Name</th>
			<th>Email</th>
			<th>Message</th>
			<th>Delete</th>
			</tr>
		</thead>
	
		<c:forEach var="cus" items = "${details}" >
		
			<c:set var="id" value="${cus.nic}"/>
		
			<tr>	
			<td><c:out value="${cus.nic}"/></td>
			<td><c:out value="${cus.name}"/></td>
			<td><c:out value="${cus.email}"/></td>
			<td><c:out value="${cus.message}"/></td>
			<td> <form method = "post" action = "adminDelete">	
					<input type="hidden" name="id" value= "<c:out value='${cus.nic}'/>">
					<input type = "submit" name = "submit" value = "delete" class="updateDelete"><br><br>
			</form></td>
			</tr>
		
		</c:forEach>
			
	</table>
	
	
</body>
</html>