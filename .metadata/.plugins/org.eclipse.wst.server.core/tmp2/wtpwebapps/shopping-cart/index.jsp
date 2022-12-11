<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="com.test.connection.DbCon" %>   
<%@ page import ="com.test.dao.*" %>
<%@ page import ="com.test.model.*" %>
<%@ page import ="java.util.List"%>
<%@page import="java.util.*"%>
    
    <% User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
    	request.setAttribute("auth", auth);
    }
    
    ProductDao pd = new ProductDao(DbCon.getConnection());
    List<Product> products = pd.getAllProducts();
    
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null) {
    	request.setAttribute("cart_list", cart_list);
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Shopping Cart</title>
<!-- The jsp:include action tag is used to include the content of another resource it may be jsp, html or servlet. -->
<%@include file="includes/head.jsp" %>  
</head>
<body>

<%@include file="includes/navbar.jsp" %>
<div class="container">
		<div class="card-header my-3">All Products</div>
		<div class="row">
		<%
			if(!products.isEmpty())
			{
				for(Product p:products){ %>
					<div class="col-md-3 my-3">
					<div class="card w-100">
						<img class="card-img-top" src="product-images/<%= p.getImage() %>" alt="Card image cap">
						
						<div class="card-body">
							<h5 class="card-title"><%= p.getName() %></h5>
							<h6 class="price">Price : Rs.<%= p.getPrice() %></h6>
							<h6 class="category">Category: <%= p.getCategory() %></h6>
							<div class="mt-3 d-flex justify-content-between">
								<a href="add-to-cart?id=<%= p.getId() %>" class="btn btn-outline-primary btn-sm">Add to Cart</a>
								
								<button type="button" class="btn btn-primary btn-sm" >Buy Now</button>
							</div>
						</div>
					</div>
				</div>
				<% }
			}
		%>
		</div>
		</div>	


<%@include file="includes/footer.jsp" %>
</body>
</html>