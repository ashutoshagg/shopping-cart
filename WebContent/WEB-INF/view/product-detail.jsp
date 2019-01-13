<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Detail</title>
</head>
<body>
<h3>Product Detail</h3>

  <form:form modelAttribute="product">
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <td><b>Id</b></td>
                <td>${product.id }</td>
            </tr>
            <tr>
                 <td><b>Name</b></td>
                <td>${product.name }</td>
            </tr>
            <tr>
                <td><b>Color</b></td>
                <td>${product.color }</td>
            </tr>
            <tr>
               <!--  <td colspan="2"><input type="submit" value="Add Employee"/></td> -->
                <td><b>Price</b></td>
                <td>${product.price }</td>
            </tr>
               <tr>
                <td><b>Available Quantity</b></td>
                <td>${product.availabe_quantity }</td>
            </tr>
        </table>
        <a href="${pageContext.request.contextPath }/products/list">Back to Product List</a>
      
    </form:form>

</body>
</html>