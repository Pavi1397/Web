<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.deloitte.estore.model.Product" %>  
 <<jsp:include page="header.jsp"></jsp:include> 
    
<%
Product p;
%>
<%
p=(Product)session.getAttribute("product");
%>
<table border="1">
<tr>
<th>Product ID  </th>
<th>Product Name  </th>
<th>Price  </th>
<th colspan=2>Delete/Update </th>
</tr>
<%
	out.println("<tr><td>"+p.getPid()+"</td>");
	out.println("<td>"+p.getPname()+"</td>");
	out.println("<td>"+p.getPrice()+"</td>");
	out.println("<td><a href= delete?pid="+p.getPid()+">Delete</a></td>");
	out.println("<td><a href= update?pid="+p.getPid()+">Update</a></td></tr>");
	
%>
</table>
    