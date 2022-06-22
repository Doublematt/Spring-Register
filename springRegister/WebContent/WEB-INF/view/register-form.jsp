<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>

<head>

<title>Registration Form</title>

</head>

<body>

<form:form action="processForm" modelAttribute="user">

First name: <form:input path="firstName" />

<br><br>

Last name: <form:input path="lastName" />

</form:form>


</body>

</html>