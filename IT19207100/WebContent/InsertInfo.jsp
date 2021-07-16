<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Details</title>
</head>
<body>

<jsp:include page="/header.jsp"></jsp:include>



<%

		String dname = request.getParameter("dname");
		String refno = request.getParameter("refno");
		String date = request.getParameter("date");
		
		
		
%>

<div class = "hed" >Make Your Payment Easily !!!!!</div> <br>


<div class = "container" id ="bg" border : 2px>

<form method = "POST" action = "PatientInsert" class = "img">

 <div class="form-group">
<label >Name</label>  : <br>
<input type = "text" name = "name"   class="form-control" required placeholder="Enter name"  > <br>
  </div>

 <div class="form-group">
<label>NIC</label>  : <br>
 <input type = "text" name = "nic" required  class="form-control" placeholder="Enter NIC"   > <br>
 </div>
 
  <div class="radio">
<label>Gender</label>  : <br>

		<input type = "radio" name = "gender" value = "Male"  checked required> Male <br>
		<input type = "radio" name = "gender" value = "Female" required> Female <br>
		
 </div>	 <br>
 
  <div class="form-group">
<label>Phone</label>  : <br>
<input type = "text" name = "phone" required class="form-control"  placeholder="Enter Phone Number"  > <br>
 </div>	
 
   <div class="form-group">
<label>Email</label>  :<br>
 <input type = "email" name = "email" required class="form-control"  placeholder="Enter Email"  > <br>
  </div>	
 
  <div class="checkbox">
<input type = "checkbox" required > I agreed to the terms and Conditions<br><br>
  </div>	
 

<input type = "hidden" name="dname" value = "<%= dname %>" >
<input type = "hidden" name="refno" value = "<%= refno %>">
<input type = "hidden" name="date" value = "<%= date %>">
	

<input type = "submit" name = "submit" value = "Submit"  class="btn btn-primary">


</form>
</div>


<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>