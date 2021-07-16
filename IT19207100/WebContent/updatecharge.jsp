<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Charges</title>

</head>
<body>

<jsp:include page="/adminheader.jsp"></jsp:include>
<c:forEach var="chg" items = "${chdet}" >

<c:set var="id" value="${chg.id}"/>
<c:set var="hcharge" value="${chg.hcharge}"/>
<c:set var="dcharge" value="${chg.dcharge}"/>


</c:forEach>

<div class = "container" id ="bg" border : 2px>
<h3 >Edit charges  !!!!!</h3><br>


<form action="updatecharges" method ="post">



<input type = "hidden" name = "id"  value="<c:out value='${id}'/>" class="form-control"  required><br>

 
 Hospital Charge :
 
  <div class="form-group">
 <input type = "text" name = "hcharge"  value="<c:out value='${hcharge}'/>"  class="form-control" required><br>
 </div>
 
 
 Docter Charge :
 
   <div class="form-group">
 <input type = "text" name = "dcharge"  value="<c:out value='${dcharge}'/>" class="form-control"><br>
 </div>
 

<input type="submit" value = "Update" btn btn-danger">




</form>

</div>

<jsp:include page="/footer.jsp"></jsp:include>	
</body>
</html>