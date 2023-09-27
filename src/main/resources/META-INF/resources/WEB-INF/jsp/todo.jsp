<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title> Login Page</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Target date</th>
        <th>Done?</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todoList}" var="todo">
        <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>