<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.LinkedList"%>
<%@page import="model.DBHandler"%>
<%@page import="model.UsersBean"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" href="css/IndexStylesheet.css">
</head>
<body>
<h2>HomePage</h2>

<%
  DBHandler objdh=new DBHandler();
  LinkedList<UsersBean> lst=objdh.getUsersInfoTable();
%>
 <button><a href="AddUser.jsp">Add</a></button>
<table id="customers">

  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Country</th>
    <th>Email</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
 <%
    for(UsersBean c:lst)
    {
 %>
 
  <tr>
    <td><%=c.getStrId() %></td>
    <td><%=c.getStrName() %></td>
    <td><%=c.getStrCountry() %></td>
    <td><%=c.getStrEmail() %></td>
    <td><a href="EditUser.jsp?strid=<%=c.getStrId() %>">Edit</a></td>
     <td><a href="DeleteUserServlet?strid=<%=c.getStrId() %>">Delete</a></td>
  </tr>
 

	<%} %>
	</table>
</body>
</html>