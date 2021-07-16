<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/div.css">
<style type="text/css">
.nav{
margin-top:50%;

}

.new2{

letter-spacing:3px;

font-size:30px;
font-weight:bold;
margin-top:12%;

}


.display-3{
font-weight:bold;
color:dark;
margin-left:-10%;
}

</style>
</head>
<body>

<div >
<nav class="navbar navbar-expand-md navbar-white fixed-top bg-light" >
  <a class="navbar-brand" href="adminhomepage.jsp">Home</a>


  <div class="collapse navbar-collapse" id="navbarsExampleDefault" class  = "nav">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="viewfaqservlet">FAQ Handle</a>
      </li>
      <li class="nav-item">
        <a class="nav-link"  href="viewchargeservlet">Set Chargers</a>
      </li>

    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
</div>


<div class="jumbotron"  >

    <div class="container">
    	<br>
      <h1 class="display-3" >Entrust Your Health Our  Docters!!</h1>
      
    </div>
    <div class="new2">
   		 WE CARE FOR YOUR HEALTH....
    
    </div>
    
  </div>



</body>
</html>