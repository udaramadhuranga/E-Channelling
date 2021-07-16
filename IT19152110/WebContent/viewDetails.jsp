<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view</title>
</head>
<body class="body0">
	
	<c:forEach var="cus" items="${details}">
	
	<c:set var="nic" value="${cus.nic}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="message" value="${cus.message}"/>
		
		<table>
			<tr>
				<td>NIC</td>
				<td>${cus.nic}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${cus.name}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${cus.email}</td>
			</tr>
			<tr>
				<td>Message</td>
				<td>${cus.message}</td>
			</tr>	
		</table>
		
	</c:forEach>
	
	<c:url value="updateMessage.jsp" var="updateMes">
		<c:param name="nic" value="${nic}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="message" value="${message}"/>
	</c:url>
	
	<a href="${updateMes}">
	<input type="button" name="update" value="UPDATE" class="submit">
	</a>
	
	<c:url value="deleteMessage.jsp" var="deleteMes">
		<c:param name="nic" value="${nic}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="message" value="${message}"/>
	</c:url>
	
	<a href="${deleteMes}">
	<input type="button" name="delete" value="DELETE" class="updateDelete">
	</a>
	
</body>
</html>