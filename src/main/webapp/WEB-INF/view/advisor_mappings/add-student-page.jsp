<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
