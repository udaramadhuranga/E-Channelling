<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




</head>
<body>


<jsp:include page="header.jsp"></jsp:include>
   
     <%
           String uname = request.getParameter("uname");
           String password = request.getParameter("password");
     %>       
   
   
   
   
   
   <div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form" method = "post" action = "update">
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Change password
					</span>
   
                    <h6>User name</h6>
				<input class="input100" type="text" name="uname" value="<%= uname %>"></br>
                    
                    <h6>Password</h6>
					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="text" name="password" value="<%= password%>">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" name="update">
							Save
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