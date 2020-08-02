<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer</title>
</head>
<body>
<form action="insertCustomer" method="post">
<label>Customer Name: </label>
<input type="text" name="customer_Name"><br><br>
<label>Customer's City Location:</label>
<input type="text" name="city"><br><br>
<label>Customer's mobile number:</label>
<input type="text" name="mobile"><br><br>
<input type="submit">
</form>
</body>
</html>