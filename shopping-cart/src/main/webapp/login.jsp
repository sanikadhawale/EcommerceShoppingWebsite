<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import ="com.test.model.*" %>
    
    <% User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
    	response.sendRedirect("index.jsp");
    }
    
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null) {
    	request.setAttribute("cart_list", cart_list);
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>

<!-- The jsp:include action tag is used to include the content of another resource it may be jsp, html or servlet. -->
<%@include file="includes/head.jsp" %>  
</head>
<body>
<%@include file="includes/navbar.jsp"  %>

<div class="container">
	<div class="card w-50 mx-auto my-5">
		<div class="card-header text-center">User Login</div>
		<div class="card-body">
			<form action="user-login" method="post">
				<div class="form-group">
					<label>Email Address</label>
					<input type="email" class="form-control" name="login-email" placeholder="Enter your Email" required>
				</div>
				<div class="form-group">
					<label>Email Address</label>
					<input type="password" class="form-control" name="login-password" placeholder="Enter your Password" required>
				</div>
				<div class="text-center">
				<button type="submit" class="btn btn-primary">Login</button>
				</div>
			
			
			</form>

		</div>
	</div>
</div>
<%@include file="includes/footer.jsp" %>
</body>
</html>