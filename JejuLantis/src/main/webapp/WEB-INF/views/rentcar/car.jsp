<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
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
	<!-- <script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script> -->
	<!-- FOR IE9 below -->
	<!--[if lt IE 9] -->
	<script src="resources/rentcar/js/respond.min.js"></script>
	<!-- [endif] -->
	<!-- sidebar JS -->
	<script src="resources/rentcar/js/sidebarsearchcar.js"></script>
	<script>
	function time(){
		if(${requirements.searchFlag}){
 			var sel = document.getElementById("Checkintime");
			var val;
			for(i=0; i<sel.options.length; i++) {
				if(sel.options[i].value == "${requirements.rent_reserve_startTime}") {
					val = sel.options[i];
					val.selected="true";
					break;
				}
			}
			sel = document.getElementById("Checkouttime");
			for(i=0; i<sel.options.length; i++) {
				if(sel.options[i].value == "${requirements.rent_reserve_endTime}") {
					val = sel.options[i];
					val.selected="true";
					break;
				}
			}
			sel = document.getElementById("carname");
			sel.value="${requirements.car_name}";
		}
	}
	</script>
	</head>
	<body onload="time()">
	<%@ include file="./top/top.jspf" %>
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
				   					<h1>렌트카 검색</h1>
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
					<th  height="60px" class="text-center" width="15%" style="color:#ffdd01">1. 차량/대여업체 선택</th>
					<th  class="text-center" width="10%">2. 요금선택</th>
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
							<div class="col-md-12 text-center">
								<ul class="pagination">
									<li><a href="">최저가순</a></li>
									<li><a href="">인기순</a></li>
									<li><a href="">평점순</a></li>
								</ul>
							</div>
						</div>
						<!-- start -->
						<div id="result">
						<div id="inner">
						<c:forEach items="${list }" var="dto" varStatus="status">
						<div class="row">
							<div class="wrap-division">
								<div class="row">
								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<h3><a>${dto.car_name }</a></h3><span class="place">${dto.car_manufactur }</span>
										<a class="hotel-img" style="background-image: url(resources/rentcar/images/car1.jpg);">
											<p class="price"><span>${dto.mtotView}</span><small>/24시간</small></p>
										</a>
										<a>실시간 예약 가능 차량 : ${dto.actot }</a>
										<div class="desc">
											<p align="center">${dto.car_passenger }인승 ${dto.car_type } ${dto.car_fuel }</p>
										</div>
									</div>
								</div>

								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<div class="desc">
											<h3><a href="rentcar.do">${dto.blist[0].branch_name}</a></h3>
											<p class="star"><span><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i></span> 545 Reviews</p>
											<span class="place">${dto.blist[0].car_kind_naviView} ${dto.blist[0].car_kind_sensorView} ${dto.blist[0].car_kind_bluetoothView} ${dto.blist[0].car_kind_blackboxView} ${dto.blist[0].car_kind_sunroofView} ${dto.blist[0].car_kind_cameraView} ${dto.blist[0].car_kind_nonsmokeView}</span>
											<!-- <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p> -->
											<div id="board">
												<table border="1" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:white;font-size:8pt">			
														<th  height="30px" width="23%" class="text-center" style="background-color: #01bbf0">대여업체</th>
														<th  width="7%" class="text-center" style="background-color: #01bbf0">평점</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">대여료</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">보험료</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">보상한도</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">총 금액</th>
														<th  width="17%" class="text-center" style="background-color: #01bbf0"></th>
													</tr>
													<c:forEach items="${dto.blist }" var="bdto" varStatus="status">
													<tr style="font-size:8pt">
														<td align="center">${bdto.branch_name }</td>
														<td align="center"></td>
														<td align="center">${bdto.car_kind_price_weekView }원</td>
														<td align="center">${bdto.insurance_priceView }원</td>
														<td align="center">만원</td>
														<td align="center">${bdto.totView }원</td>
														<td align="center">													
											            <button type="button"><a href="rentcar.do?kno=${bdto.car_kind_no}" style="color:black">실시간예약</a></button>								                
														</td>
													</tr>
													</c:forEach>
													<tr style="font-size:8pt">
														<td align="center">제주렌트카</td>
														<td align="center">4.5</td>
														<td align="center">13,400원</td>
														<td align="center">13,000원</td>
														<td align="center">1,000만원</td>
														<td align="center">26,400원</td>
														<td align="center">													
											            <button type="button"><a href="rentcar.do" style="color:black">실시간예약</a></button>									                
														</td>
													</tr>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						</div>
						<hr>
						</c:forEach>
						</div>
						</div>
						<!-- end -->
						<div class="row">
							<div class="wrap-division">
								<div class="row">
								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<h3><a>스팅어</a></h3><span class="place">기아</span>
										<a class="hotel-img" style="background-image: url(resources/rentcar/images/car1.jpg);">
											<p class="price"><span>26,400원</span><small> /24시간</small></p>
										</a>
										<a>실시간 예약 가능 차량 : 5</a>
										<div class="desc">
											<p align="center">5인승 경차 휘발유 오토</p>
										</div>
									</div>
								</div>

								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<div class="desc">
											<h3><a href="rentcar.do">특별한 렌트카</a></h3>
											<p class="star"><span><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i></span> 545 Reviews</p>
											<span class="place">금연차량 네비 후방센서  블랙박스 블루투스 후방카메라 썬루프</span>
											<!-- <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p> -->
											<div id="board">
												<table border="1" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:white;font-size:8pt">			
														<th  height="30px" width="23%" class="text-center" style="background-color: #01bbf0">대여업체</th>
														<th  width="7%" class="text-center" style="background-color: #01bbf0">평점</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">대여료</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">보험료</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">보상한도</th>
														<th  width="12%" class="text-center" style="background-color: #01bbf0">총 금액</th>
														<th  width="17%" class="text-center" style="background-color: #01bbf0"></th>
													</tr>
													<tr style="font-size:8pt">
														<td align="center">특별한렌트카</td>
														<td align="center">4.5</td>
														<td align="center">13,400원</td>
														<td align="center">13,000원</td>
														<td align="center">1,000만원</td>
														<td align="center">26,400원</td>
														<td align="center">													
											                  	<button type="button"><a href="rentcar.do" style="color:black">실시간예약</a></button>								                
														</td>
													</tr>
													<tr style="font-size:8pt">
														<td align="center">제주렌트카</td>
														<td align="center">4.5</td>
														<td align="center">13,400원</td>
														<td align="center">13,000원</td>
														<td align="center">1,000만원</td>
														<td align="center">26,400원</td>
														<td align="center">													
											                  	<button type="button"><a href="rentcar.do" style="color:black">실시간예약</a></button>									                
														</td>
													</tr>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						</div>
						<div class="row">
							<div class="col-md-12 text-center">
								<ul class="pagination">
									<li class="disabled"><a href="#">&laquo;</a></li>
									<li class="active"><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">&raquo;</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- SIDEBAR-->
					<div class="col-md-3">
						<div class="sidebar-wrap">
							<div class="side search-wrap animate-box">
								<h3 class="sidebar-heading">차량검색</h3>
								<form action="car.do" method="post" class="colorlib-form">
				              	<div class="row">
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">대여일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date1" name="Checkindate" class="form-control indate" placeholder="Check-in date" value="${requirements.rent_reserve_startDate }"/>
				                    </div>        
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">대여시간</label>
				                    <div class="form-field">
				                      <i class="icon icon-arrow-down3"></i>
				                      <select name="Checkintime" id="Checkintime" class="form-control">
				                        <option value="08:00" style="color:black">08:00</option>
				                        <option value="08:30" style="color:black">08:30</option>
				                        <option value="09:00" style="color:black">09:00</option>
				                        <option value="09:30" style="color:black">09:30</option>
				                        <option value="10:00" style="color:black">10:00</option>
				                        <option value="10:30" style="color:black">10:30</option>
				                        <option value="11:00" style="color:black">11:00</option>
				                        <option value="11:30" style="color:black">11:30</option>
				                        <option value="12:00" style="color:black">12:00</option>
				                        <option value="12:30" style="color:black">12:30</option>
				                        <option value="13:00" style="color:black">13:00</option>
				                        <option value="13:30" style="color:black">13:30</option>
				                        <option value="14:00" style="color:black">14:00</option>
				                        <option value="14:30" style="color:black">14:30</option>
				                        <option value="15:00" style="color:black">15:00</option>
				                        <option value="15:30" style="color:black">15:30</option>
				                        <option value="16:00" style="color:black">16:00</option>
				                        <option value="16:30" style="color:black">16:30</option>
				                        <option value="17:00" style="color:black">17:00</option>
				                        <option value="17:30" style="color:black">17:30</option>
				                        <option value="18:00" style="color:black">18:00</option>
				                        <option value="18:30" style="color:black">18:30</option>
				                        <option value="19:00" style="color:black">19:00</option>
				                        <option value="19:30" style="color:black">19:30</option>
				                        <option value="20:00" style="color:black">20:00</option>
				                        <option value="20:30" style="color:black">20:30</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">반납일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date2" name="Checkoutdate" class="form-control outdate" placeholder="Check-out date" value="${requirements.rent_reserve_endDate }"/>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">반납시간</label>
				                    <div class="form-field">
				                      <i class="icon icon-arrow-down3"></i>
				                      <select name="Checkouttime" id="Checkouttime" class="form-control">
				                        <option value="08:00" style="color:black">08:00</option>
				                        <option value="08:30" style="color:black">08:30</option>
				                        <option value="09:00" style="color:black">09:00</option>
				                        <option value="09:30" style="color:black">09:30</option>
				                        <option value="10:00" style="color:black">10:00</option>
				                        <option value="10:30" style="color:black">10:30</option>
				                        <option value="11:00" style="color:black">11:00</option>
				                        <option value="11:30" style="color:black">11:30</option>
				                        <option value="12:00" style="color:black">12:00</option>
				                        <option value="12:30" style="color:black">12:30</option>
				                        <option value="13:00" style="color:black">13:00</option>
				                        <option value="13:30" style="color:black">13:30</option>
				                        <option value="14:00" style="color:black">14:00</option>
				                        <option value="14:30" style="color:black">14:30</option>
				                        <option value="15:00" style="color:black">15:00</option>
				                        <option value="15:30" style="color:black">15:30</option>
				                        <option value="16:00" style="color:black">16:00</option>
				                        <option value="16:30" style="color:black">16:30</option>
				                        <option value="17:00" style="color:black">17:00</option>
				                        <option value="17:30" style="color:black">17:30</option>
				                        <option value="18:00" style="color:black">18:00</option>
				                        <option value="18:30" style="color:black">18:30</option>
				                        <option value="19:00" style="color:black">19:00</option>
				                        <option value="19:30" style="color:black">19:30</option>
				                        <option value="20:00" style="color:black">20:00</option>
				                        <option value="20:30" style="color:black">20:30</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">자동차 모델</label>
				                    <div class="form-field">
				                      <input type="text" name="car_name" id="car_name" class="form-control" placeholder="모델명 입력" value="">
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <input type="submit" name="submit" id="submit" value="차량검색" class="btn btn-primary btn-block">
				                </div>
				              </div>
				            </form>
							</div>
						
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading">제조사</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check">
												<input type="checkbox" class="form-check-input" id="car_manufacture" value="현대" >
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">현대</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_manufacture" value="르노삼성">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">르노삼성</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_manufacture" value="기아">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">기아</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_manufacture" value="쉐보레">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">쉐보레</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_manufacture" value="쌍용">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">쌍용</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_manufacture" value="제네시스">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">제네시스</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_manufacture" value="수입">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">수입</h4>
												</label>
										   </div>
										</form>
									</div>
								</div>
							</div>
							
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading">연료타입</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check">
												<input type="checkbox" class="form-check-input" id="car_fuel" value="휘발유">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">휘발유</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_fuel" value="경유">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">경유</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_fuel" value="전기차">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">전기차</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_fuel" value="LPG">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">LPG</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_fuel" value="하이브리드">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">하이브리드</h4>
												</label>
										   </div>
									
										</form>
									</div>
								</div>
							</div>
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading">차종</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check">
												<input type="checkbox" class="form-check-input" id="car_type" value="경차">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">경차</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_type" value="중소형">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">중소형</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_type" value="중형">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">중형</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_type" value="고급">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">고급</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_type" value="SUV">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">SUV</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_type" value="승합">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">승합</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_type" value="수입">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">수입</h4>
												</label>		
										   </div>
									
										</form>
									</div>
								</div>
							</div>
							
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading">차량옵션</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check">
												<input type="checkbox" class="form-check-input" id="car_option" value="car_kind_nonsmoke">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">금연차량</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_option" value="car_kind_navi">
												<label class="form-check-label" for="exampleCheck1">
													<h4 class="place">네비</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_option" value="car_kind_sensor">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">후방센서</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_option" value="car_kind_blackbox">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">블랙박스</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_option" value="car_kind_bluetooth">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">블루투스</h4>
												</label>
												<input type="checkbox" class="form-check-input" id="car_option" value=car_kind_camera>
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">후방카메라</h4>
												</label>
										   </div>
										   
										   <div class="form-check">
										      <input type="checkbox" class="form-check-input" id="car_option" value="car_kind_sunroof">
										      <label class="form-check-label" for="exampleCheck1">
													<h4 class="place">썬루프</h4>
												</label>		
										   </div>
									
										</form>
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
	<input type="hidden" id="searchstartdate" value="${requirements.rent_reserve_startDateTime }">
	<input type="hidden" id="searchenddate" value="${requirements.rent_reserve_endDateTime }">
	<input type="hidden" id="searchcarname" value="${requirements.car_name }" />
	</body>
</html>

