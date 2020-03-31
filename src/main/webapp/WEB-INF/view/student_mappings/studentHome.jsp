<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 3/19/2020
  Time: 7:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Welcome, ${student.firstName}
<br>
<a href="${pageContext.request.contextPath}/student/courselist"> See courses needed </a> <br>
<a href="${pageContext.request.contextPath}/student/addSection"> See courses needed </a> <br>
</body>
</html>
