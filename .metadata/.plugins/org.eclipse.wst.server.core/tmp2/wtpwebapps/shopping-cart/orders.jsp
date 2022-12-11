<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="com.test.connection.DbCon" %>
<%@page import ="com.test.model.*" %>
<%@page import="java.util.*"%>
    
    <% User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
    	request.setAttribute("auth", auth);
    }
    
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null) {
    	request.setAttribute("cart_list", cart_list);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<title>Orders Page</title>

<!-- The jsp:include action tag is used to include the content of another resource it may be jsp, html or servlet. -->
<%@include file="includes/head.jsp" %>  
</head>
<body>

<%@include file="includes/navbar.jsp"  %>
<%@include file="includes/footer.jsp" %>
</body>
</html>