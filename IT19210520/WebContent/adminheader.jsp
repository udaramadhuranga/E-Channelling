<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>


</head>
<body>
<nav class="navbar navbar-expand-md navbar-white fixed-top bg-light" >
  <a class="navbar-brand" href="test.jsp">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="viewcustomerservlet">FAQ</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="#">Contact Us</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
        <div class="dropdown-menu" aria-labelledby="dropdown01">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      
      
      
    </ul>
        <form class="form-inline my-2 my-lg-0" method  = "POST" action = "adminsearchServlet">
      <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name = "search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>


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