<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.deloitte.Person"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!Person p; %>
<% p = (Person)request.getAttribute("person"); %>
<body>
<style>
table
{ border-color: red;
  border-width: .25em;
  border-style: double;

}
</style>

<h1>Person Information </h1>
<table>
<tr>
<th>Property</th>
<th>Value</th>
</tr>

<tr>
<td>Name</td>
<td><%=p.getName()%></td>
</tr>

<tr>
<td>Gender</td>
<td><%=p.getGender() %></td>
</tr>

<tr>
<td>Languages</td>
<td><%=p.getLangs() %></td>
</tr>

<tr>
<td>Country</td>
<td><%=p.getCountry() %></td>
</tr>

</table>

</body>
</html>