<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
		Nume: <form:input path="nume" />		
		<br><br>
		Prenume: <form:input path="prenume" />
		<br><br>
		Gen: 
		Mas<form:radiobutton path="genul" value="Masculin"/>
		Fem<form:radiobutton path="genul" value="Femenin"/>
		<br><br>
		Limbaje de programare:
		Java<form:checkbox path="limbajul" value="Java"/>
		Rubi<form:checkbox path="limbajul" value="Rubi"/>
		Python<form:checkbox path="limbajul" value="Python"/>
		<br><br>
		Orasul: <form:select path="orasul">
		<form:option value="" label=""/>
		<form:option value="Chisinau" label="Chisinau"/>
		<form:option value="Balti" label="Balti"/>
		<form:option value="Cahul" label="Cahul"/>
		<form:option value="Soroca" label="Soroca"/>
		</form:select>
		<br><br>
		Localiatate: <form:select path="localitatea">
		<form:option value=" " label=" "/>
		<form:option value="Heciul Vechi" label="Heciul Vechi"/>
		<form:option value="Heciul Nou" label="Heciul Nou"/>
		<form:option value="Elizaveta" label="Elizaveta"/>
		<form:option value="GDR" label="GDR"/>
		</form:select>
		<br><br>
		<input type="submit" value="Salvaeza" />
	</form:form>
</body>
</html>


