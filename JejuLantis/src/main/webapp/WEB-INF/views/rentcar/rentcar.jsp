<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
	<%@ include file="./top/top.jspf" %>
	<div class="colorlib-loader"></div>

	<div id="page">
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
			   	<li style="background-image: url(resources/rentcar/images/cover-img-4.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
				   				<div class="slider-text-inner text-center">
				   					<h2>by colorlib.com</h2>
				   					<h1>Hotel Overview</h1>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>
			  	</ul>
		  	</div>
		</aside>
		<div id="board">
			<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
				<tr style="color:#8c9094;background-color:#eef2f5;font-size:10pt">			
					<th  height="60px" class="text-center" width="15%">1. 차량/대여업체 선택</th>
					<th  class="text-center" width="10%" style="color:#ffdd01">2. 요금선택</th>
					<th  class="text-center" width="15%">3. 고객 정보 입력 & 결제</th>
					<th  class="text-center" width="10%">4. 예약 완료</th>
					<th  class="text-center"></th>
				</tr>
			</table>
		</div>				
		
		<div class="colorlib-wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-9">
						<div class="row">
							<div class="wrap-division">
								<div class="row">
								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<p align="center">스팅어</p>	
										<a class="hotel-img" style="background-image: url(resources/rentcar/images/car1.jpg);"></a>
										<div align="center">
										<a style="color:black;font-size:10pt">5인승 경차 휘발유 오토</a>
										</div>
									</div>
								</div>

								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<div class="blog-entry aside-stretch-right">
											<div class="row">
												<div class="col-md-12 animate-box">		
													<div>
														<a>※차량 인수/ 반납시간 08:00~20:00 이외 이용을 원할경우 업체에 따라 이용제한 또는 추가요금이 발생되거나 완전자차보험을 필수가입해야 하기때문에 상담원과 통화 후 진행바랍니다</a></br></br>
														<h5 style="font-weight: bold">차량정보</h5>
														<a style="color:black;font-size:10pt">5인승 경차 휘발유 오토</a></br></br>
														<h5 style="font-weight: bold">대여규정</h5>
														<table border="0" width="100%">
															<tr align="center" style="background-color: #fafafa;font-weight:bold">
																<td>나이</td>
																<td>운전경력</td>
																<td>면허종류</td>
															<tr>
															<tr align="center">
																<td>만 21세 이상</td>
																<td>1년 이상</td>
																<td>2종보통 이상</td>
															<tr>
														</table></br>
														<h5 style="font-weight: bold">일반자차 보험 규정</h5>
														<table border="0" width="100%">
															<tr align="center" style="background-color: #fafafa;font-weight:bold">
																<td>나이</td>
																<td>운전경력</td>
															<tr>
															<tr align="center">
																<td>만 21세 이상</td>
																<td>1년이상</td>
															<tr>
														</table>
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

					<!-- SIDEBAR-->
					<div class="col-md-3">
						<div class="sidebar-wrap">
							<div class="side search-wrap animate-box">
								<h3 class="sidebar-heading">차량검색</h3>
								<form method="post" class="colorlib-form">
				              	<div class="row">
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">대여일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date" class="form-control date" placeholder="Check-in date">
				                    </div>        
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">대여시간</label>
				                    <div class="form-field">
				                      <i class="icon icon-arrow-down3"></i>
				                      <select name="people" id="people" class="form-control">
				                        <option value="#" style="color:black">08:00</option>
				                        <option value="#" style="color:black">08:30</option>
				                        <option value="#" style="color:black">09:00</option>
				                        <option value="#" style="color:black">09:30</option>
				                        <option value="#" style="color:black">10:00</option>
				                        <option value="#" style="color:black">10:30</option>
				                        <option value="#" style="color:black">11:00</option>
				                        <option value="#" style="color:black">11:30</option>
				                        <option value="#" style="color:black">12:00</option>
				                        <option value="#" style="color:black">12:30</option>
				                        <option value="#" style="color:black">13:00</option>
				                        <option value="#" style="color:black">13:30</option>
				                        <option value="#" style="color:black">14:00</option>
				                        <option value="#" style="color:black">14:30</option>
				                        <option value="#" style="color:black">15:00</option>
				                        <option value="#" style="color:black">15:30</option>
				                        <option value="#" style="color:black">16:00</option>
				                        <option value="#" style="color:black">16:30</option>
				                        <option value="#" style="color:black">17:00</option>
				                        <option value="#" style="color:black">17:30</option>
				                        <option value="#" style="color:black">18:00</option>
				                        <option value="#" style="color:black">18:30</option>
				                        <option value="#" style="color:black">19:00</option>
				                        <option value="#" style="color:black">19:30</option>
				                        <option value="#" style="color:black">20:00</option>
				                        <option value="#" style="color:black">20:30</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">반납일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date" class="form-control date" placeholder="Check-out date">
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">반납시간</label>
				                    <div class="form-field">
				                      <i class="icon icon-arrow-down3"></i>
				                      <select name="people" id="people" class="form-control">
				                        <option value="#" style="color:black">08:00</option>
				                        <option value="#" style="color:black">08:30</option>
				                        <option value="#" style="color:black">09:00</option>
				                        <option value="#" style="color:black">09:30</option>
				                        <option value="#" style="color:black">10:00</option>
				                        <option value="#" style="color:black">10:30</option>
				                        <option value="#" style="color:black">11:00</option>
				                        <option value="#" style="color:black">11:30</option>
				                        <option value="#" style="color:black">12:00</option>
				                        <option value="#" style="color:black">12:30</option>
				                        <option value="#" style="color:black">13:00</option>
				                        <option value="#" style="color:black">13:30</option>
				                        <option value="#" style="color:black">14:00</option>
				                        <option value="#" style="color:black">14:30</option>
				                        <option value="#" style="color:black">15:00</option>
				                        <option value="#" style="color:black">15:30</option>
				                        <option value="#" style="color:black">16:00</option>
				                        <option value="#" style="color:black">16:30</option>
				                        <option value="#" style="color:black">17:00</option>
				                        <option value="#" style="color:black">17:30</option>
				                        <option value="#" style="color:black">18:00</option>
				                        <option value="#" style="color:black">18:30</option>
				                        <option value="#" style="color:black">19:00</option>
				                        <option value="#" style="color:black">19:30</option>
				                        <option value="#" style="color:black">20:00</option>
				                        <option value="#" style="color:black">20:30</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">자동차 모델</label>
				                    <div class="form-field">
				                      <input type="text" id="location" class="form-control" placeholder="모델명 입력">
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <input type="submit" name="submit" id="submit" value="차량검색" class="btn btn-primary btn-block">
				                </div>
				              </div>
				            </form>
							</div>			
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="colorlib-blog" style="background-color:#eef2f5">
			<div class="container">
				<div class="row">	
						<h2>요금선택</h2>		
				</div>
				<div class="blog-flex">
					<table border="0" width="45%" style="background-color:white">
						<!-- <뿌려주기 start> -->
						<tr>
							<td colspan="2" width=33%><p style="margin-left:20px; margin-right:20px;font-weight: bold;">이코노미</p></td>
						</tr>
						<tr>
							<td>
								<h2 style="margin-left:20px; margin-right:20px;color:#868c98; font-weight: bold;">24,200원</h2>
								<a style="margin-left:20px; margin-right:20px;color:#868c98">차량 대여료 6,200원</a></br>
								<a style="margin-left:20px; margin-right:20px;color:#868c98">보험료 18,000원</a>
							</td>
						</tr>
						<tr>
							<td colspan="2"><p style="margin-left:20px; margin-right:20px;margin-top:20px;font-weight: bold;">예약취소</p>
								<a style="margin-left:20px; margin-right:20px;color:black;">결제 24시간 이내 :</a><a style="color:red">수수료 없음 </a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">결제 24시간 이후 :</a><a style="color:red">수수료 30%</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 24시간 이내 :</a><a style="color:red">수수료 30%</a>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<p style="margin-left:20px; margin-right:20px;margin-top:20px;font-weight: bold;">일정변경</p>
								<a style="margin-left:20px; margin-right:20px;color:red;">변경 불가</a>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<p style="margin-left:20px; margin-right:20px;margin-top:60px;font-weight: bold;">예약부도(No-show)</p>
								<a style="margin-left:20px; margin-right:20px;color:red;">환불 불가</a>
							</td>
						</tr>
						<tr>
							<td>
							<div class="col-md-15" style="margin-top:40px" align="center">
				                  <button class="btn btn-default"><a href="rentcar.do" style="color:black">예약하기</a></button>
				                </div>
							</td>
						</tr>
						</table>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						
					<table border="0" width="45%" style="background-color:white">
						<!-- <뿌려주기 start> -->
						<tr>
							<td colspan="2" width=33%><p style="margin-left:20px; margin-right:20px;font-weight: bold; color:#ffdd00;">스탠다드</p></td>
						</tr>
						<tr>
							<td>
								<h2 style="margin-left:20px; margin-right:20px;color:#868c98; font-weight: bold; color:#ffdd00;">26,700원</h2>
								<a style="margin-left:20px; margin-right:20px;color:#868c98; color:#ffeb5f;">차량 대여료 8,700원</a></br>
								<a style="margin-left:20px; margin-right:20px;color:#868c98; color:#ffeb5f;">보험료 18,000원</a>
							</td>
						</tr>
						<tr>
							<td colspan="2"><p style="margin-left:20px; margin-right:20px;margin-top:20px;font-weight: bold;">예약취소</p>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 72시간 이전 :</a><a style="color:red">수수료 없음 </a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 72시간 이내 :</a><a style="color:red">수수료 30%</a>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<p style="margin-left:20px; margin-right:20px;margin-top:35px;font-weight: bold;">일정변경</p>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 72시간 이전 :</a><a style="color:red">수수료 없음 </a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 72시간 이내 :</a><a style="color:red">수수료 3,000원</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">대여 24시간 이내 :</a><a style="color:red">변경불가</a>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<p style="margin-left:20px; margin-right:20px;margin-top:20px;font-weight: bold;">예약부도(No-show)</p>
								<a style="margin-left:20px; margin-right:20px;color:red;">취소수수료 50%</a></br>
							</td>
						</tr>
						<tr>
							<td>
								<div class="col-md-15" style="margin-top:40px" align="center">
				                  <button class="btn btn-primary"><a href="input.do" style="color:black">예약하기</a></button>
				                </div>
							</td>
						</tr>
						</table>	
				</div>
				<div class="row" style="margin-top:30px">	
						<span><span style="color:red">*</span> 차량 옵션은 동일하며, 요금에 따라 취소 / 변경 수수료가 상이합니다.</span></br>
						<span style="font-weight: bold"><span style="color:red">*</span> 이코노미 요금은 온라인 회원 전용이며, 대여 24시간 이내 예약 후에는 취소 시 수수료가 발생합니다.</span></br>
						<span><span style="color:red">*</span> [일정변경]은 날짜와 시간 변경만 가능하며, 예약 후에는 차량 및 대여업체를 변경할 수 없습니다.</span></br>
						<span><span style="color:red">*</span> [예약부도]는 예약된 일정에 사전 연락 없이 차량을 인수받지 않은 경우로, 요금 규정에 따라 취소수수료가 발생합니다.</span></br>
						<span><span style="color:red">*</span> 08:00~20:00 외 차량 대여 / 반납은 일부 업체만 가능하며, 추가요금이 발생하거나 완전자차 보험가입이 필요할 수 있습니다.</span>	
				</div></br></br></br>
				<table border="0" width="100%" style="background-color:white">
					<tr>
						<td rowspan="2" width="50%" height="500px" style="background-image: url(resources/rentcar/images/map1.jpg);">
						</td>
					</tr>
					<tr>
						<td colspan="2" width="50%">
							<h3 style="margin-left:20px; margin-right:20px;color:#868c98; font-weight: bold; color:black;">차량 인수/반납 장소</h3>
							<h3 style="margin-left:20px; margin-right:20px;margin-top:20px;">한성렌트가</h3>
								<a style="margin-left:20px; margin-right:20px;color:#8c9094;">셔틀타는곳</a></br></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">제주공항 1층 5번 게이트 건너편 렌트카종합안내센터 [7구역 3번]</a></br></br>
								<a style="margin-left:20px; margin-right:20px;color:#8c9094;">셔틀 운행간격</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">20분</a></br></br>
								<a style="margin-left:20px; margin-right:20px;color:#8c9094;">소요시간</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">10분</a></br></br>
								<a style="margin-left:20px; margin-right:20px;color:#8c9094;">주소</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">제주시 연미길 42</a></br></br>
								<a style="margin-left:20px; margin-right:20px;color:#8c9094;">전화번호</a></br>
								<a style="margin-left:20px; margin-right:20px;color:black;">011-121-4544</a></br>
						</td>				
					</tr>
					</table>
					
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

