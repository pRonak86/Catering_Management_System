<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Admin Panel</title>
<!-- BOOTSTRAP STYLES-->
<link href="css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>



	<div id="wrapper">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="adjust-nav">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".sidebar-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"> <img src="images/logo.png"
						width="200" height="90" />

					</a>

				</div>

				<span class="logout-spn"> <a href="loginPage"
					style="color: #fff;">LOGOUT</a>

				</span>
			</div>
		</div>
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">



					<li class="active-link"><a href="adminPage"><svg
								class="bi bi-house-fill" width="1em" height="1em"
								viewBox="0 0 16 16" fill="currentColor"
								xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
									d="M8 3.293l6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6zm5-.793V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z" />
  <path fill-rule="evenodd"
									d="M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z" />
</svg> Dashboard <span class="badge">Included</span></a></li>


					<li><a href="acustdetails"><span
							class="glyphicon glyphicon-search"></span> Custome List</a></li>
					<li><a href="adminOrderDetails"><svg class="bi bi-card-checklist"
								width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor"
								xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
									d="M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z" />
  <path fill-rule="evenodd"
									d="M7 5.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 1 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0zM7 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 0 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0z" />
</svg> Order Details</a></li>

					<li><a href="adminFood"><svg class="bi bi-basket-fill"
								width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor"
								xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
									d="M5.071 1.243a.5.5 0 0 1 .858.514L3.383 6h9.234L10.07 1.757a.5.5 0 1 1 .858-.514L13.783 6H15.5a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-.5.5H15v5a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V9H.5a.5.5 0 0 1-.5-.5v-2A.5.5 0 0 1 .5 6h1.717L5.07 1.243zM3.5 10.5a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3z" />
</svg> Add Food</a></li>
					<li><a href="showFood"><svg class="bi bi-basket-fill"
								width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor"
								xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
									d="M5.071 1.243a.5.5 0 0 1 .858.514L3.383 6h9.234L10.07 1.757a.5.5 0 1 1 .858-.514L13.783 6H15.5a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-.5.5H15v5a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V9H.5a.5.5 0 0 1-.5-.5v-2A.5.5 0 0 1 .5 6h1.717L5.07 1.243zM3.5 10.5a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3zm2.5 0a.5.5 0 0 0-1 0v3a.5.5 0 0 0 1 0v-3z" />
</svg> Show Food</a></li>
					<li><a href="adminBooking"><svg
								class="bi bi-calendar2-date-fill" width="1em" height="1em"
								viewBox="0 0 16 16" fill="currentColor"
								xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
									d="M4 .5a.5.5 0 0 0-1 0V1H2a2 2 0 0 0-2 2v11a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V3a2 2 0 0 0-2-2h-1V.5a.5.5 0 0 0-1 0V1H4V.5zm-2 3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-1zm7.336 9.04c-1.11 0-1.656-.767-1.703-1.407h.683c.043.37.387.82 1.051.82.844 0 1.301-.848 1.305-2.164h-.027c-.153.414-.637.79-1.383.79-.852 0-1.676-.61-1.676-1.77C7.586 7.672 8.457 7 9.383 7c1.172 0 1.953.734 1.953 2.668 0 1.805-.742 2.871-2 2.871zm.066-2.544c.625 0 1.184-.484 1.184-1.18 0-.832-.527-1.23-1.16-1.23-.586 0-1.168.387-1.168 1.21 0 .817.543 1.2 1.144 1.2zm-2.957-2.89v5.332H5.77v-4.61h-.012c-.29.156-.883.52-1.258.777V7.91a12.6 12.6 0 0 1 1.313-.805h.632z" />
</svg> Booking Histrory</a></li>
					<!-- <li><a href="#"><i class="fa fa-edit "></i>My Link Five </a></li>
 -->
				</ul>
			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-lg-12">
						<h2>Booking Details with Food</h2>
					</div>
				</div>
				<!-- /. ROW  -->
				<hr />
				<div class="row">
					<div class="col-lg-12 ">
						<div class="alert alert-info">
							<strong>Welcome Administrator ! </strong>
						</div>

					</div>
				</div>


				<div class="row">
					<div class="col-lg-12 ">
						<div class="alert alert-info">
							<table class="table">
								<thead class="thead-dark">
									<tr bgcolor="#bb886" color="white">
										<th>Order Id</th>
										<th scope="col">Quantity</th>
										<th scope="col">Food Name</th>
										<th scope="col">Approve</th>
										<th scope="col">Delete</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${bf.bo_id }</td>
										<td>${bf.qauntity }</td>
										<td>${bf.foName }</td>
										<td><a href="approve">Approved</a></td>
										<td><a href="deletBookingOrder?bo_id=${bf.bo_id }">Delete</a></td>
									</tr>
								</tbody>
							</table>
						</div>

					</div>
				</div>

				<div class="footer">


					<div class="row">
						<div class="col-lg-12">
							&copy; 2020 spring.com | Design by: <a href="http://spring.com"
								style="color: #fff;" target="_blank">www.spring.com</a>
						</div>
					</div>
				</div>


				<!-- /. WRAPPER  -->
				<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
				<!-- JQUERY SCRIPTS -->
				<script src="js/jquery-1.10.2.js"></script>
				<!-- BOOTSTRAP SCRIPTS -->
				<script src="js/bootstrap.min.js"></script>
				<!-- CUSTOM SCRIPTS -->
				<script src="js/custom.js"></script>
</body>
</html>
