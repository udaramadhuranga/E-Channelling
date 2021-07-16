<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Charges</title>
</head>
<body>
<jsp:include page="/adminheader.jsp"></jsp:include>


<div class = "container" id ="bg" >

<h1>Charges table........</h1><br>

<table border = "1" class = "table">

<thead >
<tr class = "trhead">
<th>No</th>
<th>Hospital charge </th>
<th>Docter Charge </th>
<th>Edit </th>


</tr>
</thead>



<c:forEach var="chg" items = "${chdetails}" >

		<c:set var="id" value="${chg.id}"/>
	
	<tr>	
	
	<td> <c:out  value="${chg.id}"/>  </td>
	<td> <c:out  value="${chg.hcharge}"/>LKR </td>
	<td><c:out value="${chg.dcharge}"/>LKR</td>
	
	<td> 
	
	<form method = "post" action = "editcharge">
	<input type="hidden" name="id" value= "<c:out value='${chg.id}'/>">
	<input type = "submit" name = "submit" value = "Edit" class="btn btn-primary"><br><br>
	</form>
		
	</td>

	</tr>

</c:forEach>
	


</table>

</div>
<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>