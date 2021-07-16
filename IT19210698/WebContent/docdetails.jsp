<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Details</title>
</head>
<body>

   
    <table>
       <c:forEach var="doc" items="${docdetails}">
       
       <c:set var = "dname" value="${doc.name}"/>
       <c:set var = "spec" value = "${doc.spec}"/>
       
       <tr>
       <td>
        ${doc.name}
        </td>
        <td>
        ${doc.spec}
        </td>
        <td>
     
     
       
        </td>
       </tr>
     
       </c:forEach>
       
     </table>
    
     <c:url value="appoinment.jsp" var="pappoinment">
     <c:param name = "dname" value="${dname}"/>
     <c:param name = "spec" value="${spec}"/>
    
     </c:url>
     <a href ="${pappoinment}">
     <input type = "submit" name = "book" value = "Book">
     </a>
     
    
</body>
</html>