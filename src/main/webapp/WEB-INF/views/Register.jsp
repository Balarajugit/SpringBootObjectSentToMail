<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="send" method="post">
<pre>
Name : <input type="text" name="name"/>
Education : <input type="text" name="education"/>
Email : <input type="text" name="email"/>
Adress : <input type="text" name="address"/>

<input type="submit" value="send"/>
</pre>
</form>
${msg }
</body>
</html>