<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- 1- HTML Form -->
    <form action="formRequestPage" method="POST">
        <input type="text" name="userName" /> <!-- name è il parametro passato nel body -->
        <br>
        <select name="country">
            <option>USA</option>
            <option>UK</option>
            <option>ITA</option>
        </select>
        <br>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>