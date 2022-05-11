<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Mixed Rice Restaurant</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div class="page">
		<div id="header">
			<a href="index.jsp" id="logo"><img src="images/logo.gif" alt=""></a>
			<ul id="navigation">
				<li><a href="index.jsp">Home</a></li>
				<li><a href="booking">Booking</a></li>
				<li><a href="register">Register</a></li>
				<li class="selected first"><a href="loginPage">Login</a></li>
				<li><a href="contact">Contact us</a></li>
			</ul>
			<div id="featured">
				<h4>
					${msg}
					<form action="login" method="post">
						<table>
							<tr>
								<td>User Type</td>
								<td><select name="user">
										<option value="Customer">Customer</option>
										<option value="Administrator">Admin</option>
								</select></td>
							</tr>
							<tr>
								<td>UserName</td>
								<td><input type="text" name="cuser"></td>
							</tr>
							<tr>
								<td>Password</td>
								<td><input type="password" name="pass"></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="Sing Up"></td>
							</tr>
						</table>
					</form>
				</h4>

			</div>
		</div>

		<div id="footer">
			<div>
				<div class="section1">
					<a href="blog"><img src="images/health-benefits.jpg" alt=""></a>
					<h4>Health Benefits</h4>
					<p>
						Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
						nonummy ut lao magna. <a href="blog">Read More</a>
					</p>
				</div>
				<div class="section2">
					<a href="blog"><img src="images/mixed-rice.jpg" alt=""></a>
					<p>
						<span>Lorem ipsum</span> dolor sit amet, consectetuer adipiscing
						elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore
						magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis
						nostrud. <a href="blog">Read More</a>
					</p>
				</div>
				<div class="section3">
					<a href="blog"><img src="images/mixed-rice2.jpg" alt=""></a>
					<p>
						<span>Lorem ipsum</span> dolor sit amet, consectetuer adipiscing
						elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore
						magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis
						nostrud. <a href="blog">Read More</a>
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
