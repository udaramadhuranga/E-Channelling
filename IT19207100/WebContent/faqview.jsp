<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Handle FAQ</title>
</head>
<body>

<jsp:include page="/adminheader.jsp"></jsp:include>



<div class = "container" id ="bg" border : 3px>

<h1>Handle FAQ.........</h1><br>
<form method  = "post" action = "addfaq.jsp">
<input type = "submit" name = "submit" value = "Add FAQ" class="btn btn-info" ><br>
</form>

<br><br><br>

<table border = "1" class = "table">

<thead >
<tr class = "trhead">
<th>No</th>
<th>Question </th>
<th>Answer </th>
<th>Edit </th>
<th>Delete </th>

</tr>
</thead>



<c:forEach var="faq" items = "${faqdetails}" >

		<c:set var="id" value="${faq.qno}"/>
	
	<tr>	
	
	<td> <c:out  value="${faq.qno}"/> </td>
	<td> <c:out  value="${faq.question}"/> </td>
	<td><c:out value="${faq.answer}"/></td>
	
	<td> 
	<form method = "post" action = "editfaq">
		
	<input type="hidden" name="id" value= "<c:out value='${faq.qno}'/>">
	<input type = "submit" name = "submit" value = "Edit" class="btn btn-primary"><br><br>
	
	</form>
		
	</td>
	<td>
	
	<form method = "post" action = "deletefaq">
		
	<input type="hidden" name="id" value= "<c:out value='${faq.qno}'/>">
	<input type = "submit" name = "submit" value = "Delete" class="btn btn-danger"><br><br>
	
	</form>
	
	</td>

	
	</tr>

</c:forEach>
	


</table>
<p class="float-right"><a href="#">Back to top</a></p>
<br>

</div>
<jsp:include page="/footer.jsp"></jsp:include>	
</body>
</html>