<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 3/30/2020
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function addProfessor() {

    }
</script>

<html>
<head>
  <title>Add Section</title>
  <script crossorigin src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.production.min.js"></script>
<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
  <div id="nav"></div>

  <div class="container">
    <br />
<h2 class="text-center">Add Section</h2>


<form:form action= "${pageContext.request.contextPath}/advisor/addedSection" modelAttribute= "section" method="post">


      <p>Enter the Class Name</p> <form:input path="className"/> <br>
    <label>
    <p>Enter the Professor's name (optional) </p>   <input type="text" name="professorName">
    </label> <br>
    <p>Select Section's major<p>
    <form:select path="major">
        <form:option value="1" label="Computer Science"   />
        <form:option value="2" label="Psychology"   />
        <form:option value="3" label="Industrial Design"   />
        <form:option value="4" label="Business"   />
        <form:option value="5" label="Economics"   />
        <form:option value="6" label="Undeclared"   />
      </form:select>
  	<br/><br/>
      <input type="submit" value="Submit" class="btn btn-primary">
  </form:form>
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
<%--

<form:form action="${pageContext.request.contextPath}/advisor/studentById" method="get">
    <label>
    <form:option value="Computer Science" label="Computer Science"   />



        <input type="text" placeholder="Search by student id" name="studentId">
        <input type="submit" value="Submit">
    </label>
</form:form>

--%>
