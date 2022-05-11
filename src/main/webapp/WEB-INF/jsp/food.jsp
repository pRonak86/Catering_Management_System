<!DOCTYPE html >
<!---- Website template by freewebsitetemplates.com ---->
<html>

<head>
	<title>Our Food - Website Template</title>
	<meta  charset=iso-8859-1" />
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<!--[if IE 6]>
		<link href="css/ie6.css" rel="stylesheet" type="text/css" />
	<![endif]-->
	<!--[if IE 7]>
        <link href="css/ie7.css" rel="stylesheet" type="text/css" />  
	<![endif]-->
</head>

<body>
    
	<div id="background">
	  <div class="page">
	       <div id="header">
		          <ul class="navigation">
				  <li><a class="active" href="food">OUR FOOD</a></li>
				  <li><a href="signup">REGISTER</a></li>
				  </ul>
				  
				  <a id="logo" href="index.jsp"><img src="images/logo2.jpg" width="276" height="203" alt="Steak House" title="Steak House"></a>
				  
				  <ul id="navigation">
				  <li><a href="reservation">RESERVATION</a></li>
				  <li><a href="contactus">CONTACT US</a></li>
				  </ul>
		   </div>
		   <div id="body">
		   
		    
				
			   
			    <div class="content">
				   <div class="body">
				   
				        <h3>MENU</h3>
				 
				        <ul class="section">
				 <%
Object s=request.getAttribute("cid");
				 out.print((Integer)s);
				 
%>
				        
						  <form action="order" method="get"> 
						  <%--  <%
request.getAttribute("cemail");
%>   --%>
						   <li class="odd">
								   <h2>Italian Cuisine</h2>
								   <ul>
								       <li>
								       	
									      <h2><input type="checkbox"   name="dish" value="Vegetarian_Salad"> Vegetarian Salad with Pesto Sauce<a href="order"></a></h2> <span>$7.99</span>
										  <p>
										   dish is full of vegetable and  pesto souce in garnishing
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="Panzenella">Panzenella<a href="order">   </a></h2> <span>$8.99</span>
										  <p>
										   contain peparoni with Bacon 
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="Margherita_Pizza">Margherita Pizza<a href="order"></a></h2> <span>$9.99</span>
										  <p>
										   onion, jalapeno,chicken Strips with shredded cheese
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="Pasta ">Pasta <a href="order">  </a></h2> <span>$7.99</span>
										  <p>
										Fried pasta with chedder cheese
										  </p>
									   </li>
									   <li class="last">
									      <h2><input type="checkbox"   name="dish" value="Lasagna">Lasagna<a href="order"></a></h2> <span>$12.99</span>
										  <p>
										   Bean added with choice of meat(Tuna,Shrimp,Bacon) and American cheese 
										  </p>
									   </li>
									   
									   <li class="last">
									      <h2><input type="hidden"   name="cid" value="${cid}">
										  
									   </li>
								   </ul>
							</li>
							
							
							<li>
							   <h2>Yogurt on Side</h2>
								   <ul>
								       <li>
									      <h2><input type="checkbox"   name="dish" value="plain_YOugurt">plain YOugurt   <a href="order">  </a></h2> <span>$1.99</span>
										  <p>
										   no added flavour
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="GREEK_YOGURT">GREEK YOGURT<a href="order"> </a></h2> <span>$3.99</span>
										  <p>
										    contain mint and jalapeno with cilantro
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="ALMOND_YOGURT">ALMOND YOGURT<a href="order"></a></h2> <span>$2.99</span>
										  <p>
										   Healthy row Almond and Almond Milk 
										  </p>
									   </li>
									   <li>
									      <h2><input type="checkbox"   name="dish" value="COCONUT_YOGURT">COCONUT YOGURT<a href="order">
									          </a></h2> <span>$1.99</span>
										  <p>
										    Coconut milk texture, with whole milk or heavy cream
										  </p>
									   </li>
									   <li class="last">
									      <h2><input type="checkbox"   name="dish" value="NON_DAIRY_YOGURT">NON-DAIRY YOGURT <a href="food">    </a></h2> <span>$2.99</span>
										  <p>
										  Contain almond milk, coconut milk or soy milk
										  </p>
									   </li>
								   </ul>
							  
							</li>
							
						
							 	<input type="submit"  value="Place Your Order">
							</form>
						</ul>
				   
				   </div>
				</div>	
			   
		   </div>
		   
		   
		   
		   
		   <div id="footer">
                <ul>
					<li class="first">
					     <ul>
							<li><a href="index.html">Home</a></li>	
							<li><a href="about.html">About</a></li>	
							<li><a href="menu.html">Menu</a></li>	
							<li><a href="beer.html">Beer</a></li>	
							<li><a href="blog.html">Blog</a></li>	
							<li><a href="contact.html">Contact Us</a></li>
						 </ul>
					</li>
					<li>
					   <span>Follow us:</span> 
					   <a href="http://facebook.com/freewebsitetemplates" class="facebook">&nbsp;</a> 
					   <a href="http://twitter.com/fwtemplates" class="twitter">&nbsp;</a>
					</li>
					<li class="last">
				        <span> &copy; copyright 2011 &copy;. All rights reserved.</span> 	
					</li>
				</ul>		       
			   
		   </div>
		
	  </div> 
     </div>	  
	
</body>
</html>