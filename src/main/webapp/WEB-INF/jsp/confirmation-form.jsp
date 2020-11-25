<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Forma de confirmare</h1>
         <p>Daca ai ajuns la aceasta pagina inseamna ca totul e bine. Iata datele introduse</p>
        Nume : ${reservation.nume} <br>
        Prenume : ${reservation.prenume} <br>
        Genul: ${reservation.genul}<br>
        Limbajul de programare: 
        <ul>
            <c:forEach var="meal" items="${reservation.limbajul}">
                <li>${meal}</li>
            </c:forEach>
        </ul>
        Orasul : ${reservation.orasul} <br>
        Localitatea(tipa) : ${reservation.localitatea}
    </body>
</html>
