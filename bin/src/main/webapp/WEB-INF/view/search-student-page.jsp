<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 3/2/2020
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<a href="${pageContext.request.contextPath}/advisor/login"> Back </a>
<form action="${pageContext.request.contextPath}/api/students" method="get">

    <label>
        <input type="text" placeholder="Enter part of the name" name="searchValue">
    </label>

    <input type="submit">

</form>

</body>
</html>
