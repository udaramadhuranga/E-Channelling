<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Information</title>

</head>
<body>

<jsp:include page="Adminheader.jsp"></jsp:include>


     
       
       <c:forEach var="admin" items="${admininfo}">
       
       <c:set var = "uname" value="${admin.username}"/>
       <c:set var = "password" value = "${admin.password}"/>
       
       
     <div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100">
				
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Admin 
					</span>
                      <h6>User Name</h6>
       
                    ${admin.username}</br></br>
        
        
                  <h6>Password</h6>
                     ${admin.password}
                    

					<div class="text-center p-t-90">
						<a class="txt1" href="#">
							
						</a>
					</div>
				
       
      
     
       
       </c:forEach>
       
     <c:url value="Adminupdate.jsp" var="Adminupdate">
     <c:param name = "uname" value="${uname}"/>
     <c:param name = "password" value="${password}"/>
     </c:url>
     <a href ="${Adminupdate}">
     <div class="container-login100-form-btn">
						
		<input type = "submit" name = "change" value = "Change password" class ="login100-form-btn" >
		</div>
   
     </a>
     
     </div>
     
    
			</div>
		</div>
	</div>
       
     
     
     <jsp:include page="footer.jsp"></jsp:include>
     
     
      
     
</body>
</html>