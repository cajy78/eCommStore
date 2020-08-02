<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Connect</title>
</head>
<body>
<H1>Welcome to the eComm Portal</H1>
<h2>please select your action:</h2>
<div>
<a href="createNewCustomer.jsp">Add new customer into DB</a><br><br>
<form action="displayCustomers" method="post">
<p>Click the submit button to view info on Customers table</p>
<input type="submit">
<br>
</form>
<a href="createNewCustomer.jsp">Update Customer info into DB</a><br><br>
<a href="createNewCustomer.jsp">Delete Customer from DB</a>
</div>
<div></div>
</body>
</html>