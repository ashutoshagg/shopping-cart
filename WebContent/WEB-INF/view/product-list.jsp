<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Products</title>
</head>
<body>
<h3>Products List</h3>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Color</th>
			<th>Price</th>
			<th>Available Quantity</th>
			<th>Action</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id }</td>
				<td><a href="product/${product.id}">${product.name }</a></td>
				<td>${product.color }</td>
				<td>${product.price }</td>
				<td>${product.availabe_quantity }</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/add/${product.id}">Add to cart</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath }/cart/show">Show Cart</a>
</body>
</html>