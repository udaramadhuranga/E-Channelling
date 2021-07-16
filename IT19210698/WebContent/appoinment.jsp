<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment</title>





</head>

<body>


<jsp:include page="header.jsp"></jsp:include>

           
<%

        String dname = request.getParameter("dname");
        String spec = request.getParameter("spec");
     
%>


         <div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form" method = "post" action = "book">
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Appointment
					</span>
                     Patient's name
					<div class="wrap-input100 validate-input" data-validate = "Patient's name">
						<input class="input100" type="text" name="pname" placeholder="Name" required>
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
                     Patient's age
					<div class="wrap-input100 validate-input" data-validate="Patient's age">
						<input class="input100" type="text" name="page" placeholder="Age" required>
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
					Phone No
                    <div class="wrap-input100 validate-input" data-validate="Phone No">
						<input class="input100" type="text" name="pphone" placeholder="Phone">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div> 
					Address
					<div class="wrap-input100 validate-input" data-validate="Address">
						<input class="input100" type="text" name="paddress" placeholder="Address">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
					Date
                    <div class="wrap-input100 validate-input" data-validate="Date">
						<input class="input100" type="date" name="date" placeholder="Date">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
					<h6>Doctor Name</h6>
					<input type = "hidden" name="dname" value="<%= dname%>">
					<%= dname%>
					</br></br>
					<h6>Speciality</h6>
					<%= spec %></br></br>
					<input type = "hidden" name="spec" value="<%= spec%>">
					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn" name="submit">
							Book
						</button>
					</div>

					<div class="text-center p-t-90">
						<a class="txt1" href="#">
							
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>

              
              
              
              
 
              
              
              
              
   <jsp:include page="footer.jsp"></jsp:include>
              
</body>
</html>