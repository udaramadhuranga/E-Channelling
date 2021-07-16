<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add FAQ</title>

</head>

<body>
<jsp:include page="/adminheader.jsp"></jsp:include>

<div class = "as" id ="bg" >
<h3 >Add FAQ for the list !!!!!</h3><br>
<form action="faqservlet" method ="post">

 <div class="form-group">
<label class = "label" >Enter Question   : </label> <br>  
<textarea rows="10" cols="50"   type = "text" name = "ques"    ></textarea>

</div>



 <div class="form-group">
<label class = "label">Enter answer   : </label> <br> 
<textarea rows="10" cols="50"   type = "text" name = "ans"  ></textarea>

</div>



<input type="submit" value = "Add FAQ" class="btn btn-danger">




</form>
</div>

<jsp:include page="/footer.jsp"></jsp:include>	
</body>
</html>