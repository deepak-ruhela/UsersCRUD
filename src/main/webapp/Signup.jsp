<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Signup</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="keywords" content="Trendy Signup Form Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<link href="css/font-awesome.css" rel="stylesheet"> 
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
<script src="js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/SignupStylesheet.css">
</head>
<body>

<div class="wthree-dot">
	<h1>Signup Form</h1>
	<div class="profile">
		<div class="wrap">
			<div class="wthree-grids">
				<div class="content-left">
					<div class="content-info">
						<h2>Brief History About Us</h2>
						<div class="slider">
							<div class="callbacks_container">
								<ul class="rslides callbacks callbacks1" id="slider4">
									<li>
										<div class="w3layouts-banner-info">
											<h3>Vivamus dui dolor</h3>
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean et placerat leo, non condimentum justo</p>
										</div>
									</li>
									<li>
										<div class="w3layouts-banner-info">
											<h3>Duis in nisl egestas</h3>
											<p>Suspendisse leo lacus, hendrerit consectetur scelerisque in, tempor sit amet tortor. Pellentesque rhoncus</p>
										</div>
									</li>
								</ul>
							</div>
							<div class="clear"> </div>
						</div>
						
						<div class="agileinfo-follow">
							<h4>Sign Up with</h4>
						</div>
						<!-- 
						<div class="agileinfo-social-grids">
							<ul>
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-rss"></i></a>
								<a href="#"><i class="fa fa-vk"></i></a>
								<a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
								<a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
							</ul>
						</div>
						-->
						<div class="agile-signin">
							<h4>Already have an account <a href="LoginPage.jsp">Sign In</a></h4>
						</div>
					</div>
				</div>
				<div class="content-main">
					<div class="w3ls-subscribe">
						<h4>New Customer?</h4>
						<form action="SignupServlet" method="post">
						<input type="text" name="txtUName" placeholder="Username" required="">
							<input type="text" name="txtName" placeholder="Name" required="">
							<input type="email" name="txtEmail" placeholder="Email" required="">
							<input type="password" name="txtPass" placeholder="Password" required="" id="password">
							<label>
							<input type="password" name="txtCPass" placeholder="Confirm Password" required="" id="confirm_password">
							<span id='message'></span>
							</label>
							<input type="submit" value="Sign Up" id="btnSubmit" onclick="return Validate()">
						</form>
					</div>
				</div>
				<div class="clear"> </div>
			</div>
			<div class="wthree_footer_copy">
				<p>© 2018 User Signup Form. All rights reserved | Design by <a href="#">Manan</a></p>
			</div>
		</div>
	</div>
</div>
<script src="js/responsiveslides.min.js"></script>
									<script>
										// You can also use "$(window).load(function() {"
										$(function () {
										  // Slideshow 4
										  $("#slider4").responsiveSlides({
											auto: true,
											pager:true,
											nav:false,
											speed: 400,
											namespace: "callbacks",
											before: function () {
											  $('.events').append("<li>before event fired.</li>");
											},
											after: function () {
											  $('.events').append("<li>after event fired.</li>");
											}
										  });
									
										});
									 </script>
									 <script>
									 $('#password, #confirm_password').on('keyup', function () {
										  if ($('#password').val() == $('#confirm_password').val()) {
										    $('#confirm_password').css('color', 'green');
										  } else 
										    $('#confirm_password').css('color', 'red');
										});
									 </script>
									 
									 <script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirm_password").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>



</body>
</html>