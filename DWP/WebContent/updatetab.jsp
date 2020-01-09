<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.deloitte.estore.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Product product =(Product)session.getAttribute("product");%>


<form action = "updatedata">

Product Id <input type = "text" name = "uid" value = <%=product.getPid()%> readonly><br>
<!--Product Id <input type = "text" value=${product}.getPid() readonly><br> -->

Product Name <input type = "text" name = "uname" value = <%=product.getPname()%>><br>

Product Price <input type = "text" name = "uprice" value = <%=product.getPrice()%>><br>

<input type="submit" value="Update">
</form>
</body>
</html>