<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop list</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durai","root","3dmysql");
Statement s=con.createStatement();
ResultSet r=s.executeQuery("select * from shopidem");
 %> 
<table border="1">
<tr>
<th>Id</th>
<th>Shopid</th>
<th>Pant</th>
<th>Shirt</th>
<th>Shoe</th>
<th>Belt</th>
<th>Mrp</th>
<th>Discount</th>
<th>Total</th>
</tr>
<% while(r.next()){ %>
	<tr>
	<td><%=r.getInt(1) %></td>
		<td><%=r.getInt(2) %></td>
		<td><%=r.getInt(3) %></td>
	    <td><%=r.getInt(4) %></td>
	   	<td><%=r.getInt(5) %></td>
		<td><%=r.getInt(6) %></td>
		<td><%=r.getInt(7) %></td>
	  	<td><%=r.getInt(8) %></td>
		<td><%=r.getInt(9) %></td>
	</tr>
<% } 
s.close();
con.close();
%>
</table>
</body>
</html>