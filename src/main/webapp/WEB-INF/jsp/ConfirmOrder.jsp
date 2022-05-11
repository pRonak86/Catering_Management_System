<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<%@page import="com.bean.Customer"%>
<html>
<head>
<meta charset="UTF-8">
<title>Mixed Rice Restaurant</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div id="page">
		<div id="header">
			<a href="index.html" id="logo"><img src="images/logo.gif" alt=""></a>
			<ul id="navigation">
				<li class="first"><a href="index.jsp">Home</a></li>
				<li class="selected"><a href="menu.html">Menu</a></li>
				<li><a href="register">Register</a></li>
				<li><a href="loginPage">Login</a></li>
				<li><a href="contact">Contact us</a></li>
			</ul>
		</div>
		<form action="order" method="get">


				<h2 align="center">Thanks For Order</h2>
				<h2 align="center">You will Get Your Order After 20 Minutes</h2>
				<h2 align="center">Collect it from the Counter</h2>
				<h2 align="center">Enjoy Your Meal</h2>
		</form>
		<div id="footer">
			<div>
				<div class="section1">
					<a href="blog.html"><img src="images/health-benefits.jpg"
						alt=""></a>
					<h4>Health Benefits</h4>
					<p>
						Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
						nonummy ut lao magna. <a href="blog.html">Read More</a>
					</p>
				</div>
				<div class="section2">
					<a href="blog.html"><img src="images/mixed-rice.jpg" alt=""></a>
					<p>
						<span>Lorem ipsum</span> dolor sit amet, consectetuer adipiscing
						elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore
						magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis
						nostrud. <a href="blog.html">Read More</a>
					</p>
				</div>
				<div class="section3">
					<a href="blog.html"><img src="images/mixed-rice2.jpg" alt=""></a>
					<p>
						<span>Lorem ipsum</span> dolor sit amet, consectetuer adipiscing
						elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore
						magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis
						nostrud. <a href="blog.html">Read More</a>
					</p>
				</div>
			</div>
			<div id="footnote">
				<p>&#169; Copyright 2012. All Rights Reserved.</p>
			</div>
		</div>
	</div>
</body>
</html>
