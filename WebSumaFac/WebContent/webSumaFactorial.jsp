<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Suma de dos numeros</h1>
	<form action="SumaFacServlet" method="get">
		<input type="text" name="num1" required></input>
		<input type="text" name="num2" required></input>
		<button type="submit" value="Sumar">Sumar</button>
		${mensaje1}
	</form>
	
	<h1>Calcular Factorial</h1>
	<form action="Factorial" method="get">
		<input type="text" name="num3" required></input>
		<button type="submit" value="Calcular Factorial">Factorial</button>
		${mensaje2}
	</form>
</body>
</html>