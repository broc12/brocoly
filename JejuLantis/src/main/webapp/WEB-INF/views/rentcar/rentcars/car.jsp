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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<!-- <script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script> -->
	<!-- FOR IE9 below -->
	<!--[if lt IE 9] -->
	<script src="resources/rentcar/js/respond.min.js"></script>
	<!-- [endif] -->
	<!-- sidebar JS -->
	<script src="resources/rentcar/js/sidebarsearchcar.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
	
	<script>
	function settime(){
		if(!${requirements.errorFlag}){
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
			if("${requirements.car_name}"!="")
			sel.value="${requirements.car_name}";
		}
		}else{
			alert("${requirements.errorMsg}");
			location.href="car.do";
		}
	}
	function reservcar(carkindno){
		alert(carkindno);
		document.getElementById("carkindno").value = carkindno;
		document.getElementById("confirmreserv").submit();
	}
</script>
<style type="text/css">
.checkbox label:after, 
.radio label:after {
    content: '';
    display: table;
    clear: both;
}

.checkbox .cr,
.radio .cr {
    position: relative;
    display: inline-block;
    border: 1px solid #a9a9a9;
    border-radius: .25em;
    width: 1.3em;
    height: 1.3em;
    margin-right: .5em;
}

.radio .cr {
    border-radius: 50%;
}

.checkbox .cr .cr-icon,
.radio .cr .cr-icon {
    position: unset;
    /* font-size: .8em; */
    line-height: 0;
    top: 50%;
    left: 20%;
}

.radio .cr .cr-icon {
    margin-left: 0.04em;
}

.checkbox label input[type="checkbox"],
.radio label input[type="radio"] {
    display: none;
}

.checkbox label input[type="checkbox"] + .cr > .cr-icon,
.radio label input[type="radio"] + .cr > .cr-icon {
    transform: scale(3) rotateZ(-20deg);
    opacity: 0;
    transition: all .3s ease-in;
}

.checkbox label input[type="checkbox"]:checked + .cr > .cr-icon,
.radio label input[type="radio"]:checked + .cr > .cr-icon {
    transform: scale(1) rotateZ(0deg);
    opacity: 1;
}

.checkbox label input[type="checkbox"]:disabled + .cr,
.radio label input[type="radio"]:disabled + .cr {
    opacity: .5;
}
</style>
	</head>
	<body onload="settime()">
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
				<tr style="color:#8c9094;background-color:white;font-size:10pt">			
					<th  height="60px" class="text-center" width="15%" style="color:#ffdd01">1. 차량/대여업체 선택</th>
					<th  class="text-center" width="10%">2. 요금선택</th>
					<th  class="text-center" width="15%">3. 고객 정보 입력 & 결제</th>
					<th  class="text-center" width="10%">4. 예약 완료</th>
					<th  class="text-center"></th>
				</tr>
			</table>
		</div>

		<div class="colorlib-wrap" style="background-color:#eef2f5">
			<div class="container">
				<div class="row">
					<div class="col-md-9">
						<div class="row">
							<div class="col-md-12 text-left">
								<ul class="pagination">
									<li><button class="sortmenu" value="minimum" type="button" style="background-color:#f8fafb;border:0">최저가순</button></li>
									<li><button class="sortmenu" value="count" type="button" style="background-color:#f8fafb;border:0">인기순</button></li>
									<li><button class="sortmenu" value="rating" type="button" style="background-color:#f8fafb;border:0">평점순</button></li>
							<input type="hidden" id="sort" name="sort" value="${requirements.sort }"/>
								</ul>
							</div>
						</div>
						<!-- start -->
						<div id="result">
						<div id="inner">
						 <c:if test="${empty list }">
						<h4>사용 가능한 차량이 없습니다</h4>
						</c:if>
						<c:forEach items="${list }" var="dto" varStatus="status">
							<div class="row">
							<div class="wrap-division">
								<div class="row">
								<div class="col-md-6 col-sm-6 animate-box" style="width:40%;padding:0px">
									<div class="hotel-entry" style="background-color:#f8fafb;padding:15px;height:410px"></br>
										<span style="color:black;font-size:18pt">${dto.car_name }</span><span style="color:black">${dto.car_manufacturer }</span>
										<img width="100%" weight="200" src="resources/car/${dto.car_image}"/>
										<div class="desc">
											<p align="center" style="color:#0090f0">실시간 예약 가능 차량 : ${dto.actot }</p>
										</div>
										</br>
										<div class="desc">
											<p align="center">
												<span class="glyphicon glyphicon-road">${dto.car_type }</span>
												<span class="glyphicon glyphicon-user">${dto.car_passenger }인승</span>
												<span class="glyphicon glyphicon-tint">${dto.car_fuel }</span>
											</p>
										</div>
									</div>
								</div>

								<div class="col-md-6 col-sm-6 animate-box" style="padding:0px;width:60%">
									<div class="hotel-entry" style="background-color:white">
										<div class="desc" style="padding:15px;height:410px"></br>
											<span style="font-size:18pt;color:black">${dto.blist[0].branch_name}</span>
<!-- 											<div align="right">
											<span style="color:red;text-decoration: line-through">43,000원</span>
											<span style="font-size:18pt;color:black">32,400원</span>
											</div> -->
											<!-- <p class="star"><span><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i><i class="icon-star-full"></i></span> 545 Reviews</p> -->
											<span class="place">${dto.blist[0].car_kind_naviView} ${dto.blist[0].car_kind_sensorView} ${dto.blist[0].car_kind_bluetoothView} ${dto.blist[0].car_kind_blackboxView} ${dto.blist[0].car_kind_sunroofView} ${dto.blist[0].car_kind_cameraView} ${dto.blist[0].car_kind_nonsmokeView}</span>
											<!-- <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p> -->
											<div id="board">
												<table border="1" style="border-bottom:none;border-left:hidden;border-right:hidden" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:#717886;font-size:8pt">			
														<th  height="30px" width="23%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">대여업체</th>
														<th  width="7%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">평점</th>
														<th  width="12%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">대여료</th>
														<th  width="12%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">보험료</th>
														<th  width="12%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">보상한도</th>
														<th  width="12%" class="text-center" style="background-color: #f8fafb;border-right: hidden;">총 금액</th>
														<th  width="17%" class="text-center" style="background-color: #f8fafb;border-right: hidden;"></th>
													</tr>
													<c:forEach items="${dto.blist }" var="bdto" varStatus="status">
													<tr style="font-size:8pt;border-bottom: hidden">
														<td height="50px" align="center" style="border-right: hidden">${bdto.branch_name }</td>
														<td align="center" style="border-right: hidden">${bdto.car_kind_rating }</td>
														<td align="center" style="border-right: hidden">${bdto.totalrent }원</td>
														<td align="center" style="border-right: hidden">${bdto.totalinsurance }원</td>
														<td align="center" style="border-right: hidden">${bdto.insurance_limit }원</td>
														<td align="center" style="border-right: hidden">${bdto.totView }원</td>
														<td align="center">													
											              <button type="button" style="background-color:#f8fafb;border:0"><a href="#" onclick="reservcar(${bdto.car_kind_no });return false;" style="color:black;text-decoration:none">실시간예약</a></button>								                
														</td>
													</tr>
													</c:forEach>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						</div>	
						</c:forEach>
						</div>
						</div>
						<form id="confirmreserv" action="rentcar.do" method="post">
							<input type="hidden" id="searchstartdate" name="rentstartdate" value="${requirements.rent_reserve_startDateTime }">
							<input type="hidden" id="searchenddate" name="rentenddate" value="${requirements.rent_reserve_endDateTime }">
							<input type="hidden" id="searchcarname" name="rentcarname" value="${requirements.car_name }" />
							<input type="hidden" id="carkindno" name="carkindno" />
						</form>						
						<!-- end -->
					</div>

					<!-- SIDEBAR-->
					<div class="col-md-3">
						<div class="sidebar-wrap">
							<div class="side search-wrap animate-box">
								<h3 class="sidebar-heading">차량검색</h3>
								<form action="car.do" method="post" class="colorlib-form" id="searchform" >
				              	<div class="row">
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">대여일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date1" name="Checkindate" class="form-control date" placeholder="Check-in date" value="${requirements.rent_reserve_startDate }"/>
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
				                        <option value="09:00" style="color:black">09:00</option>
				                        <option value="10:00" style="color:black">10:00</option>
				                        <option value="11:00" style="color:black">11:00</option>
				                        <option value="12:00" style="color:black">12:00</option>
				                        <option value="13:00" style="color:black">13:00</option>
				                        <option value="14:00" style="color:black">14:00</option>
				                        <option value="15:00" style="color:black">15:00</option>
				                        <option value="16:00" style="color:black">16:00</option>
				                        <option value="17:00" style="color:black">17:00</option>
				                        <option value="18:00" style="color:black">18:00</option>
				                        <option value="19:00" style="color:black">19:00</option>
				                        <option value="20:00" style="color:black">20:00</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date">반납일</label>
				                    <div class="form-field">
				                      <i class="icon icon-calendar2"></i>
				                      <input type="text" id="date2" name="Checkoutdate" class="form-control date" placeholder="Check-out date" value="${requirements.rent_reserve_endDate }"/>
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
				                        <option value="09:00" style="color:black">09:00</option>
				                        <option value="10:00" style="color:black">10:00</option>
				                        <option value="11:00" style="color:black">11:00</option>
				                        <option value="12:00" style="color:black">12:00</option>
				                        <option value="13:00" style="color:black">13:00</option>
				                        <option value="14:00" style="color:black">14:00</option>
				                        <option value="15:00" style="color:black">15:00</option>
				                        <option value="16:00" style="color:black">16:00</option>
				                        <option value="17:00" style="color:black">17:00</option>
				                        <option value="18:00" style="color:black">18:00</option>
				                        <option value="19:00" style="color:black">19:00</option>
				                        <option value="20:00" style="color:black">20:00</option>
				                      </select>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="guests">자동차 모델</label>
				                    <div class="form-field">
				                      <input type="text" name="car_name" id="car_name" class="form-control" placeholder="모델명 입력" value=""/>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <input type="button" id="searchbutton" value="차량검색" class="btn btn-primary btn-block" style="background-color:#ffdd00">
				                </div>
				              </div>
				            </form>
							</div>
							<!-- -------------------------------- -->
							<div class="side search-wrap animate-box" style="background-color:white">
								<span class="glyphicon glyphicon-filter">&nbsp;결과 내 검색</span><hr>
								<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading" style="color:black">제조사</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="현대">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	현대
									          </label>
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="르노삼성">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	르노삼성
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="기아">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	기아
									          </label>
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="쉐보레">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	쉐보레
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="쌍용">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	쌍용
									          </label>
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="제네시스">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	제네시스
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_manufacturer" value="수입">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	수입
									          </label>
									        </div>
										   </div>
										</form>
									</div>
								</div>
							</div><hr>
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading" style="color:black">연료타입</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_fuel" value="휘발유">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	휘발유
									          </label>
									          <label>
									            <input type="checkbox" id="car_fuel" value="경유">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	경유
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_fuel" value="전기차">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	전기차
									          </label>
									          <label>
									            <input type="checkbox" id="car_fuel" value="LPG">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	LPG
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_fuel" value="하이브리드">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	하이브리드
									          </label>
									        </div>
										   </div>
									
										</form>
									</div>
								</div>
							</div><hr>
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading" style="color:black">차종</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_type" value="경차">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	경차
									          </label>
									          <label>
									            <input type="checkbox" id="car_type" value="중소형">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	중소형
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_type" value="중형">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	중형
									          </label>
									          <label>
									            <input type="checkbox" id="car_type" value="고급">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	고급
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_type" value="SUV">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	SUV
									          </label>
									          <label>
									            <input type="checkbox" id="car_type" value="승합">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	승합
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_type" value="수입">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	수입
									          </label>
									        </div>		
										   </div>
									
										</form>
									</div>
								</div>
							</div><hr>
							<div class="side animate-box">
								<div class="row">
									<div class="col-md-12">
										<h3 class="sidebar-heading" style="color:black">차량옵션</h3>
										<form method="post" class="colorlib-form-2">
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_nonsmoke">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	금연차량
									          </label>
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_navi">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	네비
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_sensor">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	후방센서
									          </label>
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_blackbox">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	블랙박스
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check" style="height:30px">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_bluetooth">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	블루투스
									          </label>
									           <label>
									            <input type="checkbox" id="car_option" value="car_kind_sunroof">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	썬루프
									          </label>
									        </div>
										   </div>
										   
										   <div class="form-check">
										   <div class="checkbox">
									          <label>
									            <input type="checkbox" id="car_option" value="car_kind_camera">
									            <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
									            	후방카메라
									          </label>
									        </div>		
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
	</body>
</html>

