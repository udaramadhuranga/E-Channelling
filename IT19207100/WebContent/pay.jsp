<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dname = request.getParameter("dname");
		double dcharge = Double.parseDouble(request.getParameter("dcharge"));
		double hcharge = Double.parseDouble(request.getParameter("hcharge"));
		double total = dcharge+hcharge;
		String date = request.getParameter("date");
		 
	%>
	<hr>
	<div class = "bk">
	<div class = "pf" >
	<div class = "hed" >Enter your Credit Card Details ...</div> <br>

<hr class= "hrn">		
	
	<div class = "det1">
	Patient Name <br> 
	</div>
	<div class = "det2">
	 <%= name%><br>
	</div>

<hr class= "hrn">	
	
	<div class = "det1">
	Docter charge<br>   
	</div> 
	<div class = "det2">
	<%= dcharge%>LKR<br>
	</div>
<hr class= "hrn">	
	
	<div class = "det1">
	Hospital charge<br>   
	</div>
	<div class = "det2">
	 <%= hcharge%>LKR<br>
	</div>

<hr class= "hrn">		
	<div class = "det1">
	Total  charge<br>    
	</div>
	<div class = "det2">
	<%= total%>LKR<br>
	</div>
<hr class= "hrn">		
<div class = "pf">	

</div>


<div class = "container" id ="bg" border : 2px  >	
<form method = "POST"  action = "PayServlet">

 <div class="form-group">
	Enter Credit Card Number : <input type="text" name="cnum" required class="form-control"  placeholder="Enter Credit card number"><br>
	  </div>	
 <div class="form-group">	
 
	Enter CVV Code : <input type="text" name="code" size="8" required class="form-control"  placeholder="Enter CVV Code"><br>
	  </div>	
	<input type = "hidden" name="total" value = "<%= total %>">
	<input type = "hidden" name="id" value = "<%= id %>">
	<input type = "hidden" name="date" value = "<%= date %>">
	
	<input type="submit" value = "Pay" class="btn btn-danger"><br>
	</form>
	</div>
	</div>
	

</div>

</div>

<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>