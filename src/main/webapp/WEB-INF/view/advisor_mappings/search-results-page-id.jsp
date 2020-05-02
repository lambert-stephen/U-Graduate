
<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 3/11/2020
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Results | ID</title>
        <script crossorigin src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
		<script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.production.min.js"></script>
		<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
		
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
</head>
<body>
<div id="nav"></div>
<br/>



<div class="container">
  <h2 class="text-center">Results</h2>
  <br/>
  
  
  <table class="table">
    <thead>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Major</th>
        <th>ID</th>
      </tr>
    </thead>
    <tbody>
    <tr>
    	<td>${student.firstName}</td>
    	<td>${student.lastName}</td>
    	<td>${student.major}</td>
    	<td>${student.id}</td>
	</tr>
    </tbody>
  </table>  
</div>


<!-- jQuery first, then Popper.js, then Bootstrap JS -->
    	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		
		<script type="text/javascript">
			var contextMapping = "${pageContext.request.contextPath}";
		</script>
	<!-- React Components -->
		<script src="../components/nav.js"></script> <!-- Navbar -->
	

</body>
</html>
