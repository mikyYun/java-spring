<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>error.jsp</title>
</head>
<body>
	<h1>Exception2 happens</h1>
	<p>
		Exception Title: 
		<span>
			${ex} }
		</span><br />
	</p>
	<p>
		Exception Message: 
		<span>
			${ex.message}
		</span>
	</p>
	<ol>
	<c:forEach items="${ex.stackTrace}" var="i">
		<li>${i.toString()}</li>
	</c:forEach>
	</ol>
</body>

</html>