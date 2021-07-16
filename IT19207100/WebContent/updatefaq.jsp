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

<c:forEach var="faq" items = "${faqde}" >

<c:set var="qno" value="${faq.qno}"/>
<c:set var="question" value="${faq.question}"/>
<c:set var="answer" value="${faq.answer}"/>


</c:forEach>

<div class = "as" id ="bg" border : 2px>
<h3 >Add FAQ for the list !!!!!</h3><br>


<form action="updatefaqservlet" method ="post">


<input type = "hidden" name = "qno"  value="<c:out value='${qno}'/>" ><br>
 <div class="form-group">
 
<label class = "label" >Enter Question   : </label> <br>  
<textarea rows="10" cols="50"   type = "text" name = "ques"   <%= "${question}" %> > <c:out value="${question}"/>    </textarea>

</div>



 <div class="form-group">
<label class = "label">Enter answer   : </label> <br> 
<textarea rows="10" cols="50"  type = "text" name = "ans"  <%= "${answer}" %> > <c:out value="${answer}"/> </textarea>

</div>



<input type="submit" value = "Update"  class=" btn btn-danger">




</form>


    <jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>