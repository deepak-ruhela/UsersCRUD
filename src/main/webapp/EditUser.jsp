<%@page import="model.UserDetailBean"%>
<%@page import="java.util.LinkedList"%>
<%@page import="model.DBHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  DBHandler objdh=new DBHandler();
String id = request.getParameter("strid");
  LinkedList<UserDetailBean> lst=objdh.getUserDetail(id);
  for(UserDetailBean l : lst){
%>
						<form action="EditUserServlet" method="Post">
							<input type="hidden" name="txtId" value=<%=id%>>
							<input type="text" name="txtName" required="" value=<%=l.getStrName()%>>
							<input type="text" name="txtEmail" required="" value= <%=l.getStrEmail()%>>
							<input type="text" name="txtCountry" required="" value=<%=l.getStrCountry()%>>
							
							<input type="submit" value="Update" id="btnSubmit" onclick="return Validate()">
							<button><a href="index.jsp">Cancel</a></button>
						</form>
						<%} %>

</body>
</html>