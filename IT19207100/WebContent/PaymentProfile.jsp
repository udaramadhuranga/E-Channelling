<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Profile</title>

</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>

<div class = "pf">

<hr>
<div class = "hed" >Check your Details to proceed.....</div> <br>

	<c:forEach var="cus" items = "${custdetails}" >
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="nic" value="${cus.nic}"/>
	<c:set var="gender" value="${cus.gender}"/>
	
		<c:forEach var="apt" items = "${apdetails}" >
	
	<c:set var="dname" value="${apt.dname}"/>
	<c:set var="dcharge" value="${apt.dcharge}"/>
	<c:set var="hcharge" value="${apt.hcharge}"/>
	<c:set var="date" value="${apt.date}"/>
	<c:set var="refNo" value="${apt.refNo}"/>
	
	<div class = "pic">

</div>

	<div class = "det1">
	Appointment ID<br>
	</div>
		<div class = "det2">
		${apt.apoid}
		</div>
<hr class= "hrn">

	<div class = "det1">
	ReferenceNo<br>
	</div>
		<div class = "det2">
		${apt.refNo}
		</div>
<hr class= "hrn">	
	<div class = "det1">
	Docter Name<br>
	</div>
		<div class = "det2">
		${apt.dname}
		</div>
<hr class= "hrn">	
	<div class = "det1">
	Appointment Date<br>
	</div>
		<div class = "det2">
		${apt.date}
		</div>		
			
<hr class= "hrn">	
	<div class = "det1">
	Docter Charge<br>
	</div>
		<div class = "det2">
		${apt.dcharge}LKR
		</div>
<hr class= "hrn">
	<div class = "det1">
	Hospital Charge<br>
	</div>
		<div class = "det2">
		${apt.hcharge}LKR
		</div>
<hr class= "hrn">	
	<div class = "det1">
	Total Charge<br>
	</div>
		<div class = "det2">
		${apt.dcharge + apt.hcharge}LKR
		</div>
<hr class= "hrn">	
	<hr class= "hrn">
	</c:forEach>
	
	<table>

	<tr>
	<td class = "tt">Patient Name</td>
		<td  class = "tt2">${cus.name}</td><br>
		
	</tr>

	<tr>
	<td class = "tt" >Patient NIC</td>
		<td  class = "tt2">${cus.nic}</td>
	</tr>

	<tr>
	<td class = "tt" >Phone number</td>
		<td  class = "tt2">${cus.phone}</td>
	</tr>

	<tr>
	<td class = "tt" >Gender</td>
	<td  class = "tt2">${cus.gender}</td>
	</tr>

	<tr>
	<td class = "tt" >Email</td>
	<td  class = "tt2">${cus.email}</td>
	</tr>
	

</table>
	
	</c:forEach>
	
	<br>
	

<form method = "post" action ="update.jsp" >
<input type="hidden" name="id" value = "<c:out value='${id}'/>">
<input type="hidden" name="name" value = "<c:out value='${name}'/>">
<input type="hidden" name="email" value = "<c:out value='${email}'/>">
<input type="hidden" name="phone" value = "<c:out value='${phone}'/>">
<input type="hidden" name="dname" value = "<c:out value='${dname}'/>">
<input type="hidden" name="dcharge" value = "<c:out value='${dcharge}'/>">
<input type="hidden" name="hcharge" value = "<c:out value='${hcharge}'/>">
<input type="hidden" name="date" value = "<c:out value='${date}'/>">
<input type="hidden" name="nic" value = "<c:out value='${nic}'/>">
<input type="hidden" name="gender" value = "<c:out value='${gender}'/>">
<input type="hidden" name="total" value = "<c:out value='${apt.dcharge + apt.hcharge}'/>">
<input type="hidden" name="refNo" value = "<c:out value='${refNo}'/>">


<input type = "submit" name = "submit" value = "Update your details" class="btn btn-primary"><br><br>

</form>

<form method = "post" action = "pay.jsp" >
<input type="hidden" name="id" value = "<c:out value='${id}'/>">
<input type="hidden" name="name" value = "<c:out value='${name}'/>">
<input type="hidden" name="email" value = "<c:out value='${email}'/>">
<input type="hidden" name="phone" value = "<c:out value='${phone}'/>">
<input type="hidden" name="dname" value = "<c:out value='${dname}'/>">
<input type="hidden" name="dcharge" value = "<c:out value='${dcharge}'/>">
<input type="hidden" name="hcharge" value = "<c:out value='${hcharge}'/>">
<input type="hidden" name="date" value = "<c:out value='${date}'/>">
<input type = "submit" name = "submit" value = "Continue to Pay" class="btn btn-danger"><br><br>

</form>
</div>

<jsp:include page="/footer.jsp"></jsp:include>	


</body>
</html>