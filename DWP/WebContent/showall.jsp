<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <!DOCTYPE html>
      <%@ page import="com.deloitte.estore.model.Product" %>
         <%@ page import="java.util.List" %>
       
  <<jsp:include page="header.jsp"></jsp:include>     
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<Product> products=(List<Product>)session.getAttribute("products");
%>
<table border="1">
<tr>
<th>Product ID </th>
<th>Product Name</th>
<th>Price</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%
for(Product p:products)
{
	out.println("<tr><td>"+p.getPid()+"</td>");
	out.println("<td>"+p.getPname()+"</td>");
	out.println("<td>" +p.getPrice()+ "</td>");
	out.println("<td><a href=delete?pid="+p.getPid()+">Delete</a></td>");
	out.println("<td><a href=update?pid="+p.getPid()+">Update</a></td></tr>");}
%>
</table>

</body>
</html>