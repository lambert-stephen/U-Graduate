<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

<%--
<form action="${pageContext.request.contextPath}/api/students" method="get">

    <label>
        <input type="text" placeholder="Enter student id" name="studentId">
    </label>

    <input type="submit">

</form>

${pageContext.request.contextPath}/api/students/{studentId}
--%>

<form:form name="studentAdd" action="${pageContext.request.contextPath}/api/student" method="get">

    <label>
        <input type="text" placeholder="Search by student id" name="studentId">
        <input type="submit" value="Submit">
    </label>

</form:form>

</body>
</html>
