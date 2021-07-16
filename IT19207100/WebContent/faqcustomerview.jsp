<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your FAQ</title>
</head>
<body>

<jsp:include page="/header.jsp"></jsp:include>



<div class = "container" id ="bg" border : 2px>

<br><br><br>
<table border = "1" class = "table">

<thead>
<tr class = "trhead">
<th>No</th>
<th>Question </th>
<th>Answer </th>
</tr>
</thead>



<c:forEach var="faq" items = "${faqdetails}" >

		<c:set var="id" value="${faq.qno}"/>
	
	<tr>	
	<td> <c:out  value="${faq.qno}"/> </td>
	<td> <c:out  value="${faq.question}"/> </td>
	<td><c:out value="${faq.answer}"/></td>
	</tr>

</c:forEach>
	


</table>

<p class="float-right"><a href="#">Back to top</a></p>
<br>

</div>
<jsp:include page="/footer.jsp"></jsp:include>	
</body>
</html>