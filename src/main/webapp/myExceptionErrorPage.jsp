<%@ page isErrorPage="true" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>My Custom Exception Page</title>
</head>
<body>
	<h1>Errore personalizzato!</h1>
	<p>
		Messaggio:
		<%= exception.getMessage() %></p>
</body>
</html>