<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	DayTeller!  
</h1>

<P>
	${myDate.year}yr ${myDate.month}m ${myDate.day}. Today is ${date}
</P>
<p>
	year = <%=request.getParameter("year") %>
</p>
</body>
</html>
