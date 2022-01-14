<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EJB</title>
</head>
<body>
    <h1>Hola mundo EJB</h1>
    <h3>${ saludo }</h3>
    <h3>${ saludo2 }</h3>
    <hr>
    <ul>
        <c:forEach items="${listado}" var="producto">
            <li>${producto.nombre}</li>
        </c:forEach>
    </ul>
</body>
</html>