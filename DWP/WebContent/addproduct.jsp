<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <<jsp:include page="header.jsp"></jsp:include>  

<form action="addproduct" method="post">
Enter product id:<input type="number" name="txtpid"><br>
Enter product name:<input type="text"name="txtpname">
Enter product price:<input type="text"name="txtprice">
<input type="submit" value="save">

</form>
