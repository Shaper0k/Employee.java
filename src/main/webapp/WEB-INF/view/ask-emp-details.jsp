<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<h2> Dear employee, please enter your details!</h2>
<br>
<br>

<form:form action="showDetails" modelAttribute = "employee">
    Name <form:input path = "name"></form:input>
    <br><br>
    Surname <form:input path ="surname"></form:input>
    <br><br>
    Salary <form:input path="salary"></form:input>
    <br><br>
    Department <form:select path="department">
   <form:options items="${employee.departments}"></form:options>
    </form:select>
    <br><br>
    Which car do you want?
    <br><br>
   <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign language(s)
    <br><br>
        EN<form:checkbox path="languages" value="English"/>
            SP <form:checkbox path="languages" value="Spanish"/>
           FR <form:checkbox path="languages" value="French"/>
    <br><br>
    <input type="submit" value="ok">
    <br>
</form:form>
</body>
</html>