<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>

<head>

<title>Registration Form</title>

</head>

<body>

<h3>Registration</h3>
<h4>Fields with (*) are required </h4>

<form:form action="processForm" modelAttribute="user">

First name (*): <form:input path="firstName" />

<br><br>

Last name (*): <form:input path="lastName" />

<br><br>

Age: <form:input path="age" />

<br><br>

e-mail address (*): <form:input path="emailAddress" />

<br><br>

Male <form:radiobutton path="gender" value="Male" />
Female <form:radiobutton path="gender" value="Female" />
Other <form:radiobutton path="gender" value="Other" />

<br><br>

Country:
<form:select path="country">

<form:options items="${user.countryOptions}" />

</form:select>

<br><br>

<input type="submit" value="Submit" />

</form:form>


</body>

</html>