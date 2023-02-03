<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
						<form action="AddUserServlet" method="post">
							<input type="hidden" name="txtId" placeholder="Id" required="">
							<input type="text" name="txtName" placeholder="Name" required="">
							<input type="text" name="txtEmail" placeholder="Email" required="">
							<input type="text" name="txtCountry" placeholder="Country" required="">
							</label>
							<input type="submit" value="Add User" id="btnSubmit" onclick="return Validate()">
							<button><a href="index.jsp">Cancel</a></button>
						</form>
</body>
</html>