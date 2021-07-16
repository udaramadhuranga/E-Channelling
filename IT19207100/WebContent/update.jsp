<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/header.jsp"></jsp:include>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dname = request.getParameter("dname");

		String date = request.getParameter("date");
		String nic = request.getParameter("nic");
		String gender = request.getParameter("gender");
		String refNo = request.getParameter("refNo");
		
		
		
	%>


<div class = "container" id ="bg" border : 2px>	
<h4>Edit your Details...</h4><br>
<form method = "POST" action = "updateservlet">
 <div class="form-group">
Name  : <br>
<input type = "text" name = "name" value=<%=name %> required class="form-control"> <br><br>
  </div>

 <div class="form-group">
NIC  : <br>
 <input type = "text" name = "nic" value=<%=nic %> required class="form-control"> <br><br>
   </div>
 
 
Gender  : <br>

		<input type = "radio" name = "gender" value= "Male" checked> Male <br>
		<input type = "radio" name = "gender" value = "Female" >Female <br><br>

 <div class="form-group">		 
Phone  : <br>
<input type = "text" name = "phone" value=<%=phone %> required class="form-control"> <br><br>

  </div>
  
  
 <div class="form-group">
Email  :<br>
 <input type = "email" name = "email" value=<%=email %> required class="form-control"> <br><br>
   </div>
 
<input type = "checkbox"  required > I agreed to the terms and Conditions<br><br>  
<input type = "hidden" name="dname" value = "<%= dname %>" >
<input type = "hidden" name="refno" value = "<%= refNo %>">
<input type = "hidden" name="date" value = "<%= date %>">
<input type = "hidden" name="id" value = "<%= id %>">


<input type = "submit" name = "submit" value = "Submit" class="btn btn-primary">


</form>
</div>

<jsp:include page="/footer.jsp"></jsp:include>	
</body>
</html>