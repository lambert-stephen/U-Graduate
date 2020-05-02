<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 4/18/2020
  Time: 5:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Changing Password for ${student.firstName}</title>
	<script crossorigin src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
    <script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.production.min.js"></script>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet"
    href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
        <div class="container-fluid">
        <div class="navbar-header">
        <a class="navbar-brand" href="#">Welcome, ${student.firstName}</a>
        </div>

        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

		<script type="text/javascript">
			var contextMapping = "${pageContext.request.contextPath}";
		</script>
<br>
<a href="${pageContext.request.contextPath}/student/courselist"> See All Courses For Your Major </a> <br>
<a href="${pageContext.request.contextPath}/student/viewRegistered"> See All Registered Courses </a> <br>
<a href="${pageContext.request.contextPath}/student/register"> Register for Course </a> <br>
<a href="${pageContext.request.contextPath}/student/changePassword"> Change Password </a> <br><a href="#"> Logout </a> <br>

</div>
</nav>

<div class="container">
  <h2>Changing Password</h2>
  <p>Try to refrain from using your birthday or any significant dates</p>


<form:form action= "${pageContext.request.contextPath}/student/changedPassword" method="post">

    <label>
        Enter your current password: <input type="text" name="currentPass"> <br><br>

        Enter your new password: <input type="text" name="newPassword"> <br>

    </label>
            <%--
    <form:form action="${pageContext.request.contextPath}/advisor/studentByName" method="get">
        <label>
            <input type="text" placeholder="Search by student name" name="studentName">
            <input type="submit" value="Submit">
        </label>
    </form:form>
    --%>
</form:form>


</div>


</body>
</html>
