<%@ page isErrorPage="true" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>500 Internal Server Error</title>
</head>
<body>
	<h1>Errore del server</h1>
	<p>Si è verificato un errore interno.</p>
	<p>
		Eccezione:
		<%=exception != null ? exception.getMessage() : "N/A"%></p>
</body>
</html>