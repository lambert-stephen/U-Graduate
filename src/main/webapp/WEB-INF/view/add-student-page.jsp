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

add student page

<form:form action= "${pageContext.request.contextPath}/advisor/addedStudent" modelAttribute= "student" method="post">

    Enter Student's first name <form:input path="firstName"/>
    Enter Student's last name  <form:input path="lastName"/>
    Enter Student's major      <form:input path="major"/>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
