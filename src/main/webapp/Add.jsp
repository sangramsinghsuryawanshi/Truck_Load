<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="Header.jsp" %>
<body>
	<form action="/Add" method="post">
		<h2>Add Truck</h2>
		<label>Driver Name:</label>
		<input type="text" name="DN" placeholder="Enter Driver Name" required="required"><br><br>
		<label>Capacity:</label>
		<input type="number" name="c" placeholder="Enter truck capacity" required="required"><br><br>
		<label>Load Capacity:</label>
		<input type="number" name="lc" placeholder="Enter load capacity" required="required"><br><br>
		<label>Location:</label>
		<input type="text" name="l" placeholder="Enter Location" required="required"><br><br>
		<button type="submit">Add</button>
	</form>
	<h2>${m}</h2>
</body>
</html>