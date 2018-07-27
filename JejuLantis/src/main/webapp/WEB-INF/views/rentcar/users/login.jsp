<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Tour Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link
	href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="resources/rentcar/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="resources/rentcar/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="resources/rentcar/css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="resources/rentcar/css/magnific-popup.css">

<!-- Flexslider  -->
<link rel="stylesheet" href="resources/rentcar/css/flexslider.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="resources/rentcar/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="resources/rentcar/css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet"
	href="resources/rentcar/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet"
	href="resources/rentcar/fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" href="resources/rentcar/css/style.css">

<!-- Modernizr JS -->
<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<%@ include file="../top/top.jspf"%>
	<div class="colorlib-loader"></div>

	<div id="page">
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
					<li
						style="background-image: url(resources/rentcar/images/cover-img-4.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h2>by colorlib.com</h2>
										<h1>LOGIN</h1>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>

		<div class="colorlib-tour" align="center">
			<div class="container">
				<div class="row" style="background-color: white">
					<div class="col-md-12">
						<div class="f-tour">
							<div class="row row-pb-md">
								<div class="col-md-6 animate-box">
									<div class="desc">
										<div class="row">
											<form action="<%=request.getContextPath()%>/login/loginCheck"
												method="post">
												<div class="col-md-12">
													<h3>로그인</h3>
													<p></p>
													<p align="">
													<div class="row form-group">
														<div style="width: 60%">
															<input type="text" id="fname" name="member_id"
																class="form-control" placeholder="아이디">
														</div>
													</div>
													</p>
												</div>
												<div style="width: 60%">
													<input type="password" id="fname" name="member_pwd"
														class="form-control" placeholder="비밀번호"></br>
													<p align="right">
														<a href="<%=request.getContextPath()%>/find_id_form.do">아이디찾기</a> ｜ <a href="<%=request.getContextPath()%>/find_pwd_form.do">비밀번호찾기</a>
													</p>
													<p align="center">
														<input type="submit" class="btn btn-primary" value="로그인" />
														<a href="member.do" class="btn btn-primary"> 회원가입 </a>
													</p>
												</div>
											</form>
										</div>
									</div>
								</div>
								<div class="col-md-6 animate-box">
									<div class="desc">
										<div class="row">
											<div class="col-md-12">
												<h3>비회원 예약확인</h3>
												<!-- <p>예약시 입력하신 예약자명과 연락처로 조회 합니다.</p> -->
												<p align="center">
												<div class="row form-group">
													<div style="width: 60%">
														<input type="text" id="fname" class="form-control"
															placeholder="예약자명">
													</div>
												</div>
												</p>
											</div>
											<div style="width: 60%">
												<input type="text" id="fname" class="form-control"
													placeholder="예약번호"></br>
												<p></p>
												<p align="center">
													<a href="" class="btn btn-primary"> 예약확인 </a>
												</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>





		<footer id="colorlib-footer" role="contentinfo">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 colorlib-widget">
						<h4>Tour Agency</h4>
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
							mollitia reprehenderit. Eos cumque dicta adipisci architecto
							culpa amet.</p>
						<p>
						<ul class="colorlib-social-icons">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Book Now</h4>
						<p>
						<ul class="colorlib-footer-links">
							<li><a href="#">Flight</a></li>
							<li><a href="#">Hotels</a></li>
							<li><a href="#">Tour</a></li>
							<li><a href="#">Car Rent</a></li>
							<li><a href="#">Beach &amp; Resorts</a></li>
							<li><a href="#">Cruises</a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Top Deals</h4>
						<p>
						<ul class="colorlib-footer-links">
							<li><a href="#">Edina Hotel</a></li>
							<li><a href="#">Quality Suites</a></li>
							<li><a href="#">The Hotel Zephyr</a></li>
							<li><a href="#">Da Vinci Villa</a></li>
							<li><a href="#">Hotel Epikk</a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2">
						<h4>Blog Post</h4>
						<ul class="colorlib-footer-links">
							<li><a href="#">The Ultimate Packing List For Female
									Travelers</a></li>
							<li><a href="#">How These 5 People Found The Path to
									Their Dream Trip</a></li>
							<li><a href="#">A Definitive Guide to the Best Dining
									and Drinking Venues in the City</a></li>
						</ul>
					</div>

					<div class="col-md-3 col-md-push-1">
						<h4>Contact Information</h4>
						<ul class="colorlib-footer-links">
							<li>291 South 21th Street, <br> Suite 721 New York NY
								10016
							</li>
							<li><a href="tel://1234567920">+ 1235 2355 98</a></li>
							<li><a href="mailto:info@yoursite.com">info@yoursite.com</a></li>
							<li><a href="#">yoursite.com</a></li>
						</ul>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 text-center">
						<p>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;
							<script>
								document.write(new Date().getFullYear());
							</script>
							All rights reserved | This template is made with <i
								class="icon-heart2" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</span> <span class="block">Demo Images: <a
								href="http://unsplash.co/" target="_blank">Unsplash</a> , <a
								href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>

	<!-- jQuery -->
	<script src="resources/rentcar/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="resources/rentcar/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="resources/rentcar/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="resources/rentcar/js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="resources/rentcar/js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="resources/rentcar/js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="resources/rentcar/js/jquery.magnific-popup.min.js"></script>
	<script src="resources/rentcar/js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script src="resources/rentcar/js/bootstrap-datepicker.js"></script>
	<!-- Stellar Parallax -->
	<script src="resources/rentcar/js/jquery.stellar.min.js"></script>

	<!-- Main -->
	<script src="resources/rentcar/js/main.js"></script>

</body>
</html>

