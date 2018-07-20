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
	<!-- 이니시스 -->
	<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
	<script type="text/javascript" src="https://service.iamport.kr/js/iamport.payment-1.1.5.js"></script>
	
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
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
	<%@ include file="./top/top.jspf" %>
	
	<script type="text/javascript">
	function check(){
		IMP.init('imp60101607');
		
		IMP.request_pay({
		    pg : 'inicis', // version 1.1.0부터 지원.
		    pay_method : 'card',
		    merchant_uid : 'merchant_' + new Date().getTime(),
		    name : '주문명:결제테스트',
		    amount : 14000,
		    buyer_email : 'iamport@siot.do',
		    buyer_name : '구매자이름',
		    buyer_tel : '010-1234-5678',
		    buyer_addr : '서울특별시 강남구 삼성동',
		    buyer_postcode : '123-456',
		    m_redirect_url : 'https://www.yourdomain.com/payments/complete'
		}, function(rsp) {
		    if ( rsp.success ) {
		        var msg = '결제가 완료되었습니다.';
		        msg += '고유ID : ' + rsp.imp_uid;
		        msg += '상점 거래ID : ' + rsp.merchant_uid;
		        msg += '결제 금액 : ' + rsp.paid_amount;
		        msg += '카드 승인번호 : ' + rsp.apply_num;
		    } else {
		        var msg = '결제에 실패하였습니다.';
		        msg += '에러내용 : ' + rsp.error_msg;
		    }
		    alert(msg);
		});
		}
	</script>
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
				   					<h1>고객 정보 입력 & 결제</h1>
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
					<th  class="text-center" width="10%">2. 요금선택</th>
					<th  class="text-center" width="15%" style="color:#ffdd01">3. 고객 정보 입력 & 결제</th>
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
							<div class="wrap-division">
								<div class="row">
								<h3>고객 정보 입력</h3>
								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<div class="desc">
											<div id="board">
												<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:white">			
														<th  height="50px" style="background-color: #2d2f3f">　예약자 정보</th>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이름</label>
																	<div style="width:100%;background-color:white">
																		<input type="text" id="fname" class="form-control" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>휴대전화</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="fname" class="form-control" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이메일</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="fname" class="form-control" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
											
												</table>
											</div>
										</div>
									</div>
								</div>

								<div class="col-md-6 col-sm-6 animate-box">
									<div class="hotel-entry">
										<div class="desc">
											<div id="board">
												<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:white">			
														<th  height="50px" style="background-color: #2d2f3f">　운전자 정보</th>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이름</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="fname" class="form-control" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>휴대전화</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="fname" class="form-control" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>생년월일</label>
																	<div style="width:100%;background-color:white">
																		<input type="text" id="date" class="form-control date" placeholder="">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td>
															<div class="col-md-12">
																<p><div class="row form-group">
																<label>면허 종류</label>
																	<div style="width:100%;height:50px;background-color:white">
																		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" style="margin-top:20px">
																		<label class="form-check-label" for="exampleCheck1">
																			<h4 style="font-size:10pt">1종보통</h4>
																		</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																		&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
																		<label class="form-check-label" for="exampleCheck1">
																			<h4 style="font-size:10pt">2종보통</h4>
																		</label>
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row">	
									<span><span style="color:red">*</span>차량 운전은 운전 경력 1년 이상 경과 및 만 21세 이상 성인 운전자만 가능합니다.</span></br>
									<span><span style="color:red">*</span>운전자 정보는 렌터카 이용 시 긴급사항 발생에 대비하여 즉시 연락이 가능한 정보를 입력하셔야 합니다.</span></br>
									<span><span style="color:red">*</span>잘못된 정보 또는 수신이 불가한 정보 입력으로 연락이 불가능할 경우 발생되는 불이익에 대해 당사는 책임지지 않으니 유의해 주시기 바랍니다.</span></br>
									<span><span style="color:red">*</span>운전자 추가 등록은 차량 대여 시 현장에서 신청 가능합니다.</span></br>
							</div></br></br></br>
							
							<div id="colorlib-reservation">
				<div class="row">
					<div class="search-wrap">
						<div class="container">
							<ul class="nav nav-tabs">
								
								<li><a data-toggle="tab" href="#hotel">대여규정</a></li>
								<li><a data-toggle="tab" href="#car">보험규정</a></li>
								<li><a data-toggle="tab" href="#cruises">취소/환불규정</a></li>
							</ul>
						</div>
						<div class="tab-content">
				         <div id="hotel" class="tab-pane fade">  
		                   <a style="color:white">1. 운영시간 : 08:00 ~ 20:00</a></br><a style="color:white">(운영시간 외 차량 인수/반납은 불가하거나 추가 비용 발생할 수 있습니다.)</a></br></br>
		                   <a style= "color:white">2. 대여불가 항목</a></br><a style="color:white">① 탑승인원 초과 ② 낚시용품 소지 ③ 애견동반 ④ 예약 일정 6박 7일 초과 ⑤ 군 장병(직업군인 가능)</a></br></br>
		                   <a style="color:white">3. 대여 시 주의사항</a></br><a style="color:white">* 렌트카 조기반납 시 미사용 일정에 대한 대여료·보험료 환불불가</a></br><a style="color:white">* 외국인은 예약 전 대여 가능 여부 확인 필요</a></br></br>
		                   <a style="color:white">4. 운전자 대여 조건 : 만 21세 이상, 면허취득 1년 경과, 2종보통 이상</a></br><a style="color:white">* 승합(11인승 이상) : 만 26세 이상, 면허취득 1년 경과, 1종보통 이상</a>  
						  </div>
						   <div id="car" class="tab-pane fade">
						   	 <a style="color:white">1. 가입기준 : 만 26세 이상, 면허취득 1년 경과</a></br></br>
			                   <a style= "color:white">2. 보상한도 : 경형 200만원, 소형 이상 300만원</a></br><a style="color:white">＊보상한도 초과금액은 고객 부담</a></br></br>
			                   <a style="color:white">3. 보상내용</a></br><a style="color:white">＊보상한도까지 수리비, 면책금, 휴차보상료 면제</a></br></br>
			                   <a style="color:white">4. 보험 미적용 사항</a></br><a style="color:white">＊사고미보고 및 11대 중과실 사고</a></br>
			                   <a style="color:white">＊타이어/휠 훼손, 키분실, 키/체인/실내부품/네비게이션 분실 및 훼손</a></br><a style="color:white">＊견인 및 긴급출동비용, 차량침수</a></br></br>
			                   <a style="color:white">※ 11대 중과실 교통사고</a></br><a style="color:white">① 신호위반　②중앙선침범　 ③ 제한속도보다 20km 이상 과속　 ④ 앞지르기 방법위반 </a></br>
			                   <a style="color:white">⑤ 철길건널목 통과방법위반　⑥ 횡단보도사고 　⑦ 무면허 운전 　⑧ 음주운전　⑨ 보도를 침범 </a></br>
			                   <a style="color:white">⑩ 승객추락방지의무위반　　 ⑪ 어린이보호구역 안전운전 의무위반</a>
						   </div>
						   <div id="cruises" class="tab-pane fade">
						      <a style="color:white">요금상품에 따른 취소/환불/변경 규정은 아래와 같습니다.</a></br></br></br>
			                   <a style= "color:white">[스탠다드] 요금제</a></br></br></br>
			                   <a style="color:white">* 예약취소</a></br><a style="color:white">대여 72시간 이전 : 수수료 없음</a></br>
			                   <a style="color:white">대여 72시간 이내 : 수수료 30%</a></br><a style="color:white">No-show : 취소수수료 50%</a></br></br>
			                   <a style= "color:white">[이코노미] 요금제</a></br></br></br>
			                   <a style="color:white">* 예약취소</a></br><a style="color:white">결제 24시간 이내 : 수수료 없음</a></br>
			                   <a style="color:white">결제 24시간 이후 : 수수료 30%</a></br><a style="color:white">대여 24시간 이내 : 수수료 30%</a></br>
			                   <a style="color:white">No-show : 환불 불가</a>
						   </div>
			         </div>
					</div>
				</div>
			</div>
			
			<div class="row"></br></br>
			<h3>결제 정보 입력</h3>
			<div class="col-md-6 col-sm-6 animate-box">
				<div class="hotel-entry">
					<div class="desc">
						<div id="board">
							<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
								<tr style="color:white">			
									<th  height="50px" style="background-color: #2d2f3f">　결제 방법</th>
								</tr>
								<tr height="50px">
									<td style="background-color:white">
										<div class="col-md-12">
											<p><div class="row form-group">
												<div style="width:100%;height:50px;background-color:white">
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">정기결제 (신용카드 등록 후 결제)</h4>
													</label></br>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">신용카드/체크카드</h4>
													</label>
												</div>
												</div></p>
										</div>
									</td>
								</tr>
								<tr>
									<th>　</th>
								</tr>
								<tr style="color:white;">			
									<th  height="50px" style="background-color: #2d2f3f">　할인방법(선택사항)</th>
								</tr>
								<tr>
									<td style="background-color:white">
										<div class="col-md-12">
											<p><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">미선택</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">쿠폰함에서 선택</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">프로모션 코드</h4>
													</label>
												</div>
												</div></p>
										</div>
									</td>
								</tr>	
							</table>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-6 col-sm-6 animate-box">
				<div class="hotel-entry">
					<div class="desc">
						<div id="board">
							<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
								<tr style="color:white">			
									<th  height="50px" style="background-color: #2d2f3f">　정기결제 신용카드 입력</th>
								</tr>
								<tr>
									<td style="background-color:white">
										<div class="col-md-12">
											<p><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">카드번호</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="7" style="height:40px;">
													-&nbsp;<input type="text" size="7" style="height:40px;">
													-&nbsp;<input type="text" size="7" style="height:40px;">
													-&nbsp;<input type="text" size="7" style="height:40px;">
												</div>
												</div></p>
											<p style="margin-top:50px"><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">유효기간</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="7" style="height:40px;">
													월&nbsp;<input type="text" size="7" style="height:40px;">&nbsp;일
												</div>
												</div></p>
											<p style="margin-top:50px"><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">비밀번호</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="7" style="height:40px;">
													<a style="font-size:18pt;color:black;">* *</a>
												</div>
												</div></p>
											<p style="margin-top:50px"><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">카드구분</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">개인</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">법인</h4>
													</label>
												</div>
												</div></p>
											<p style="margin-top:30px"><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">생년월일</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="18" style="height:40px;">
													<a style="font-size:10pt;color:black;">(6자리)</a>
												</div>
												</div></p>
												<a style="color:black;font-size:8pt">* 정기결제는 일시불 결제만 가능합니다. 할부 결제를 원하실 경우 결제방법을 "신용/체크카드"로 선택 후 진행해 주시기 바랍니다.</br>
													* 결제카드 정보는 안전한 전자결제 서비스에 직접 등록되며, 제주패스렌트카에서는 카드정보를 별도 저장하지 않습니다.</a>
										</div>
									</td>
								</tr>		
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div align="center">
		<input type="checkbox">
			<label class="form-check-label" for="exampleCheck1">
				<h4 style="font-size:14pt">개인정보 수집·이용 및 제3자 정보 제공에 모두 동의합니다.</h4>
			</label></br>
		<input type="checkbox">
			<label class="form-check-label" for="exampleCheck1">
				<h4 style="font-size:14pt">결제진행약관에 모두 동의합니다.　　　　　　　　　　　</h4>
			</label></br></br>
		<!-- <input type="button" value="결제하기" class="btn btn-primary"> -->
		<button type="button" class="btn btn-primary"><a style="color:white" onclick="check()">결제하기</a></button>
		</div>
		</div>
	</div>
</div>
					
					<!-- SIDEBAR-->
					<div class="col-md-3">
						<div class="sidebar-wrap">
							<div class="side search-wrap animate-box">
								<h3 class="sidebar-heading">예약내역</h3>
								<form method="post" class="colorlib-form">
				              	<div class="row">
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">대여일시</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:12pt">2017/07/04(수)</a></br>
				                      <a style="color:white;font-size:12pt">09:00</a>
				                    </div>        
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">반납일시</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:12pt">2017/07/05(목)</a></br>
				                      <a style="color:white;font-size:12pt">12:00</a>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">보험</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:12pt">완전자차</a>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">대여업체</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:12pt">한성렌트카</a>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">차량</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:12pt">스팅어</a>
				                      <img src="resources/rentcar/images/car1.jpg" width=100%, height=50%>
				                    </div>
				                  </div>
				                </div>
				                <div class="col-md-12">
				                  <div class="form-group">
				                    <label for="date" style="color:#8caaca">결제금액</label>
				                    <div class="form-field">
				                      <a style="color:white;font-size:24pt">24,200원</a></br>
				                      <hr></br>
				                      <a style="color:#8caaca;font-size:10pt">차량대여료(24시간)</a>
				                      <a style="color:white;font-size:10pt">6,200원</a></br>
				                      <a style="color:#8caaca;font-size:10pt">보험료(2일)</a>
				                      <a style="color:white;font-size:10pt">18,000</a>
				                    </div>
				                  </div>
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

	

	</body>
</html>

