<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 4/9/2020
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%--

<script>
    var select = document.getElementById("dynamicProfessors");
    var professors = {
        "name": "${professor}"
    };

    for(var i = 0; i< professors.length; i++){

        console.log(professors);

    }
</script>
--%>


<html>
<head>
    <title>Admin | Attaching Professor</title>
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


<form:form action= "${pageContext.request.contextPath}/advisor/attachedProfessor" method="post">

    <select name="section">
        <c:forEach items="${section}" var="obj">
            <option value="${obj.className}">${obj.className}</option>
        </c:forEach>
    </select>

    <select name="prof">
        <c:forEach items="${professor}" var="obj">
            <option value="${obj.name}">${obj.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="Submit">

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

<label>
        <input type="text" placeholder="Search by student name" name="studentName">
        <input type="submit" value="Submit">
    </label>

--%>