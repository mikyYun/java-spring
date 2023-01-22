<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ page import="java.util.Random" %>
<%-- <%! Class Area %> --%>
<%!
	int getRandomInt(int range) {
	return new Random().nextInt(range) + 1;
	}
%>
<%-- <% Methods Area :: service() %> --%>
<%
	int idx1 = getRandomInt(6);
	int idx2 = getRandomInt(3);
%>
<html>
<head>
	<title>twoDice.jsp</title>
</head>
<body>
	<img src="resources/img/dice<%=idx1%>.jpg">
	<img src="resources/img/dice<%=idx2%>.jpg">
</body>
</html>