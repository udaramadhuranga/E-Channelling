<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<jsp:include page="/adminheader.jsp"></jsp:include>
<h3 align = "center" class = addhead>ADD NEW Doctor </h3>

<div class = "addD">

	<form name = "myform" method="POST"  action ="adddoctorServlet">
		
		
		
			<label> Doctor  name </label> <br>
			<input type ="text" name = "mname" id = "mname"	  class = "info"><br><br>
			
				<label> Doctor  ID </label> <br>
			<input type ="text" name = "id" id = "did"	  class = "info"  required pattern = "[d][0-9][0-9][0-9]"><br><br>

			<label> Speciality </label> <br/>
			<input type ="text" name = "speciality"	 id = "specility"   class = "info"  required pattern = ".*[a-zA-Z]"><br/><br/>	
			
			<label> Email </label> <br/>
			<input type = "text" name = "Email" id = "email"  class = "info" required pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._]+\.[a-z]{2,3}">	<br><br>
			
				<label>phone number  </label> <br/>
			<input type = "text" name = "phone" id = "phone"  class = "info"  required pattern = "[0-9]{10}" >	<br/><br/>
			
				<label> room number  </label> <br/>
			<input type = "text" name = "room" id = "room"   class = "info"  required pattern = "[A-Z][0-9]">	<br/><br/>
			
				<label> charge  </label> <br/>
			<input type = "text" name = "charge" id = "charge"   class = "info">	<br/><br/>
			
				<label> time period  </label> <br/>
			<input type = "text" name = "time" id = "time"   class = "info">	<br/><br/>
			
			
				<label> Day  </label> <br/>
			<input type = "text" name = "day" id = "day"   class = "info">	<br/><br/>
			
			
			
			
			
			
		    <input type="submit" value="Save details" name="btnsubmit" >
			
			
	
		 
		 </form>
		 
</div>		  

<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>