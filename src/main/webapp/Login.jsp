<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<script src="/js/myScript.js"></script>
<style type="text/css">
@import
	url("//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css")
	;
</style>
<link rel="stylesheet" href="css/LoginStylesheet.css">

</head>
<body>

	<section class="login-block">
		<div class="container">
			<div class="row">
				<div class="col-md-4 login-sec">
					<h2 class="text-center">Login Now</h2>
					<form class="login-form" action="LoginServlet" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1" class="text-uppercase">Username</label>
							<input type="text" class="form-control"
								placeholder="Enter Username" id="username" name="txtEmail">

						</div>
						<div class="form-group">
							<label for="exampleInputPassword1" class="text-uppercase">Password</label>
							<input type="password" class="form-control"
								placeholder="Enter Password" id="pass" name="txtPwd">
						</div>


						<div class="form-check">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input" value="remember-me" id="remember_me">
								<small>Remember Me</small>
							</label>
							<button type="submit" class="btn btn-login float-right">Submit</button>

						</div>

					</form>
					<div class="copy-text">
						<a href="ForgetPage.jsp">Forget Password </a> | <a
							href="Signup.jsp"> Signup</a>
					</div>

				</div>
				<div class="col-md-8 banner-sec">
					<div id="carouselExampleIndicators" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#carouselExampleIndicators" data-slide-to="0"
								class="active"></li>
							<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
							<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
						</ol>
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img class="d-block w-100" src="img/Img1" alt="First slide">
							</div>
							<div class="carousel-item">
								<img class="d-block w-100" src="img/Img2" alt="Second slide">
							</div>
							<div class="carousel-item">
								<img class="d-block w-100" src="img/Img3" alt="Third slide">
							</div>
						</div>
						<a class="carousel-control-prev" href="#carouselExampleIndicators"
							role="button" data-slide="prev"> <span
							class="carousel-control-prev-icon" aria-hidden="true"></span> <span
							class="sr-only">Previous</span>
						</a> <a class="carousel-control-next"
							href="#carouselExampleIndicators" role="button" data-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span>
							<span class="sr-only">Next</span>
						</a>
					</div>
				</div>
			</div>
	</section>
</body>
</html>