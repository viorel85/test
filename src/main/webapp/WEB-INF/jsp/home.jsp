<%-- 
    Document   : home
    Created on : Nov 23, 2020, 8:29:48 PM
    Author     : Viorel
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGINA DE CONFIRMARE</title>
    </head>
    <body>
        <p>Your reservation is confirmed successfully. Please, re-check the details.</p>
        First Name : ${reservation.firstName} <br>
        Last Name : ${reservation.lastName} <br>
        Gender: ${reservation.gender}<br>
        Meals: 
        <ul>
            <c:forEach var="meal" items="${reservation.food}">
                <li>${meal}</li>
            </c:forEach>
        </ul>
        Leaving From : ${reservation.cityFrom} <br>
        Going To : ${reservation.cityTo}
    </body>
</html>
