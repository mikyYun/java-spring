<%@ page contentType="text/html; charset=utf-8" isErrorPage="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>error400.jsp</title>
</head>
<body>
	<h1>Exception happens</h1>
	<p>
		Exception Title: 
		<span>
			${pageContxt.exception}
		</span><br />
	</p>
	<p>
		Exception Message: 
		<span>
			${pageContxt.exception.message}
		</span>
	</p>
	<ol>
	<c:forEach items="${ex.stackTrace}" var="i">
		<li>${i.toString()}</li>
	</c:forEach>
	</ol>
</body>

</html>