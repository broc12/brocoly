<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta property="og:title" content=""/>
<meta property="og:image" content=""/>
<meta property="og:url" content=""/>
<meta property="og:site_name" content=""/>
<meta property="og:description" content=""/>
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">

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
<link rel="stylesheet" href="resources/rentcar/css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet" href="resources/rentcar/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet" href="resources/rentcar/fonts/flaticon/font/flaticon.css">

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
<%@ include file="../top/top.jspf" %>
<div class="colorlib-loader"></div>

<div id="page">
	<aside id="colorlib-hero">
		<div class="flexslider">
			<ul class="slides">
		   	<li style="background-image: url(resources/rentcar/images/test1.jpg);">
		   		<div class="overlay"></div>
		   		<div class="container-fluid">
		   			<div class="row">
			   			<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
			   				<div class="slider-text-inner text-center">
			   					<h2>by colorlib.com</h2>
			   					<h1>예약확인</h1>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>
		  	</ul>
	  	</div>
	</aside>

	<div class="colorlib-wrap" style="background-color:#eef2f5">
		<div class="container">
			<div class="row">
				<div class="col-md-9">
					<div class="row">
						<div class="wrap-division">
							<div class="row">
								<div class="hotel-entry">
									<div class="desc">
										<div id="board">
											<div id="board">
				<c:forEach items="${list}" var="list">
				<table border="0" width="100%">
					<tr>
					<td  rowspan="6" width="3%" style="background-color:#c1c1c1"></td>
					 <td  rowspan="6" width="21%" style="background-color:white"><img src="resources/car/${list.car.car_image}" width=100% height=50%></td>
					 <td width="25%" style="background-color:white">
					 	<h style="color:#8caaca">대여일시</h></br>
					 	<span style="color:black;font-size:18pt">${list.rent_reserv_starts}</span></br>
					 	<span style="color:black">${list.rent_reserv_startTime}</span>
					 </td>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">반납일시</h></br>
					 	<span style="color:black;font-size:18pt">${list.rent_reserv_ends}</span></br>
					 	<span style="color:black">${list.rent_reserv_endTime}</span>
					 </td>
					 <td  rowspan="6" width="26%" style="background-color:white" align="center">
					 	<img src="resources/rentcar/images/예약완료.jpg" width=100% height=50%>
					 	<ul class="pagination">
							<li><a href="">결제영수증</a></li>
							<li><a class="nav-link" data-toggle="modal" data-target="#exampleModal">예약취소</a></li>
							<c:set var="data" value="${list.rent_reserv_cancel_at}" />
							<c:if test="${data eq 'C'}">
								<li><a href="reviewInsert.do?rent_reserv_no=${list.rent_reserv_no}">이용후기</a></li>
							</c:if>
						</ul>
					 </td>
					</tr>
					<tr>
					 <td style="background-color:white">
					 <h style="color:#8caaca">차량</h></br>
					 	<span style="color:black">${list.car.car_name}</span></br>
					 	<span style="color:black">(${list.car.car_fuel})</span>
					 </td>
					 <td style="background-color:white">
					 <h style="color:#8caaca">대여업체</h></br>
					 	<span style="color:black">${list.branch.branch_name}</span></br>
					 	<span style="color:black">(${list.branch.branch_tel})</span>
					 </td>
					</tr>
					<tr>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">요금</h></br>
					 	<span style="color:black">${list.payment.rent_payment_goods_type}</span>
					 </td>
					 <td style="background-color:white">
					 <h style="color:#8caaca">보험</h></br>
					 	<span style="color:black">${list.insurance.insurance_name}</span>
					 </td>
					</tr>
					<tr>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">결제방법</h></br>
					 	<span style="color:black">${list.payment.rent_payment_way}</span>
					 </td>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">결제금액</h></br>
					 	<span style="color:black">${list.payment.rent_payment_total_price}</span>
					 </td>
					</tr>
					<tr>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">예약번호</h></br>
					 	<span style="color:black">${list.rent_reserv_no}</span>
					 </td>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">차량 대여료(24시간)</h></br>
					 	<span style="color:black">${list.payment.rent_payment_carkind_price}</span>
					 </td>
					</tr>
					<tr>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">할인</h></br>
					 	<span style="color:black">${list.payment.rent_payment_discount}</span>
					 </td>
					 <td style="background-color:white">
					 	<h style="color:#8caaca">보험료(2일)</h></br>
					 	<span style="color:black">${list.payment.rent_payment_insurance_price}</span>
					 </td>
					</tr>
				</table></br>
				</c:forEach>
				
			</div>				
		</div>
			</div>
		</div>
	</div>
	</div>
	</div>
</div>
		<!-- 모달시작 -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	      <div class="modal-dialog" role="document">
	        <div class="modal-content">
	          <div class="modal-header">
	            <h5 class="modal-title" id="exampleModalLabel" align="center">예약취소</h5>
	            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
	              <span aria-hidden="true">×</span>
	            </button>
	          </div>
	          <div class="modal-body" align="center">예약취소시 스탠다드 요금규정에 따라</br>결제금액에 100%가 환불됩니다.</div>
	          <div class="modal-body" align="center">대여 72시간 이전:수수료없음</br>대여 72시간 이내:수수료30%</div>
	          <div class="modal-body" align="center">예약을 정말 취소하시겠습니까?</div>
	          <div class="modal-footer">
	            <ul class="pagination">
					<li><a data-dismiss="modal">닫기</a></li>
					<li><a href="">예약취소</a></li>
				</ul>
	          </div>
	        </div>
	      </div>
	    </div>
		<!-- 모달끝 -->
				<!-- SIDEBAR-->
				<div class="col-md-3">
					<div class="sidebar-wrap">
						<div class="side search-wrap animate-box">
							<h3 class="sidebar-heading" align="center">고객센터</h3>
							<form method="post" class="colorlib-form">
			              	<div class="row">
			                 <div class="col-md-18" align="center">
			                 <img src="resources/rentcar/images/phone1.jpg" width=40% height=40% align="center">
			                 <h3 class="sidebar-heading" align="center">1544-0704</h3><hr>
			                 <h3 class="sidebar-heading" align="center">카카오톡 1:1 상담</h3>
			                 <img src="resources/rentcar/images/kakao.jpg" width=40% height=40% align="center">
			                 <h3 class="sidebar-heading" align="center">@제주란티스</h3><hr>
			                 <a class="sidebar-heading" align="left">월-금요일</a>
			                 <a class="sidebar-heading" align="right">09:00-18:00</a></br>
			                 <a class="sidebar-heading" align="left">점심시간</a>
			                 <a class="sidebar-heading" align="right">12:00-13:30</a>
			                </div>
			              </div>
			            </form>
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
					<p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
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
						<li><a href="#">The Ultimate Packing List For Female Travelers</a></li>
						<li><a href="#">How These 5 People Found The Path to Their Dream Trip</a></li>
						<li><a href="#">A Definitive Guide to the Best Dining and Drinking Venues in the City</a></li>
					</ul>
				</div>

				<div class="col-md-3 col-md-push-1">
					<h4>Contact Information</h4>
					<ul class="colorlib-footer-links">
						<li>291 South 21th Street, <br> Suite 721 New York NY 10016</li>
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
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart2" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></span> 
						<span class="block">Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a> , <a href="http://pexels.com/" target="_blank">Pexels.com</a></span>
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

