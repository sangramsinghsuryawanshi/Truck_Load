<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="Header.jsp" %>
<body>
	<table border="2">
		<tr>
			<td>Driver Name</td>
			<td>Truck Capacity</td>
			<td>Load Capacity</td>
			<td>Location</td>
			<td>Status</td>
		</tr>
		<c:forEach var="tr" items="${t}">
			<tr>
				<td>${tr.DN}</td>
				<td>${tr.c}</td>
				<td>${tr.lc}</td>
				<td>${tr.l}</td>
				<td><a href="Load.jsp">Click</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>