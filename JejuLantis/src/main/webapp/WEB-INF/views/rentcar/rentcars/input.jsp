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
	
	</head>
	<body>
	<%@ include file="../top/top.jspf" %>
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		
		jQuery("input[name='coupon']").change(function(){
			var total = '${rentcar.totalprice}';
			
			if($(this).val() == 'N'){
				jQuery("#promotion").hide();
				jQuery("#coupon").hide();
				jQuery("#dis").hide();
				$("input[name=couponname]").prop("checked",false);
				jQuery("#sum").val(total);
				jQuery("#rent_payment_discount").val(0);
			}	
			if($(this).val() == 'C'){
				jQuery("#promotion").hide();
				jQuery("#coupon").show();
			}
			if($(this).val() == 'P'){
				jQuery("#promotion").show();
				jQuery("#coupon").hide();
				jQuery("#dis").hide();
				$("input[name=couponname]").prop("checked",false);
				jQuery("#sum").val(total);
				jQuery("#rent_payment_discount").val(0);
			}
			
		});
		
		
		jQuery("input[name='card']").change(function(){
			if($(this).val() == 'N'){
				jQuery("#pay").hide();
			}
			if($(this).val() == 'P'){
				jQuery("#pay").hide();
			}
			if($(this).val() == 'Y'){
				jQuery("#pay").show();
			}
		});
		
		jQuery("input[name='dnum']").change(function(){
			var one = "1종보통";
			var two = "2종보통";
			
			if($(this).val() == 'Y'){
				jQuery("#rent_reserv_license_kind").val(one);
			}
			if($(this).val() == 'N'){
				jQuery("#rent_reserv_license_kind").val(two);
			}
		});
		
		jQuery("input[name='Check']").change(function(){
			
		});
	
	});
	
	function disclick(){
		var total = '${rentcar.totalprice}';
		var per = '${list.get(0).getCoupon_discount()}';
		var sum = "";
		
		jQuery("#dis").show();
		if($("input:radio[name=couponname]").val() == '%'){	
			sum = total-((total*0.01)*per);
			jQuery("#sum").val(sum);
		}else{
			sum = total-per;
			jQuery("#sum").val(sum);
		}
	}
	
	function myclick(){
		var name = "";
		var phone = "";
		var mail = "";
		if($("input:checkbox[name=info]").is(":checked")){
			name = '${log.member_name}';
			phone = '${log.member_tel}';
			mail = '${log.member_email}';
			jQuery("#Rname").val(name);
			jQuery("#Rphone").val(phone);
			jQuery("#Rmail").val(mail);
		}else{
			jQuery("#Rname").val(name);
			jQuery("#Rphone").val(phone);
			jQuery("#Rmail").val(mail);
		}
	}
	
	function Dclick(){
		var birth = "";
		
		if($("input:checkbox[name=dinfo]").is(":checked")){
			jQuery("#Dname").val($("input:text[name=Rname]").val());
			jQuery("#Dphone").val($("input:text[name=Rphone]").val());
			birth = '${log.cut}';
			jQuery("#Dday").val(birth);
			jQuery("#rent_reserv_driver_birth").val(birth);
		}else{
			jQuery("#Dname").val("");
			jQuery("#Dphone").val("");
			jQuery("#Dday").val("");
		}
	}
	
	function check(){
		
		var pay = "";
		
		if($("input:radio[id=card1]").is(":checked")){
			pay = "card";
		}
		if($("input:radio[id=card2]").is(":checked")){
			pay = "trans";
		}
		if($("input:radio[id=card3]").is(":checked")){
			pay = "vbank";
		}
		if($("input:radio[id=card4]").is(":checked")){
			pay = "phone";
		}
		if(pay == ""){
			alert("결제방법을 선택해주세요");
			return;
		}
		var amount = jQuery("#sum").val();
		var car = '${rentcar.car.car_name }';
		var branch = '${rentcar.branch.branch_name }';
		var start = '${requirements.rent_reserve_startDate}';
		var end = '${requirements.rent_reserve_endDate}';
		IMP.init('imp60101607');
		
		IMP.request_pay({
		    pg : 'inicis', // version 1.1.0부터 지원.
		    pay_method : pay,
		    merchant_uid : 'merchant_' + new Date().getTime(),
		    name : car+"("+branch+")"+"["+start+"~"+end+"]",
		    /* amount : amount, */
		    amount : 1000,
		    buyer_email : '${log.member_email}',
		    buyer_name : '${log.member_name}',
		    buyer_tel : '${log.member_tel}',
		    buyer_addr : '서울특별시 강남구 삼성동',
		    buyer_postcode : '123-456',
		    //m_redirect_url : ''
		}, function(rsp) {
		    if ( rsp.success ) {
		        var msg = '결제가 완료되었습니다.';
		        msg += '고유ID : ' + rsp.imp_uid;
		        msg += '상점 거래ID : ' + rsp.merchant_uid;
		        msg += '결제 금액 : ' + rsp.paid_amount;
		        msg += '카드 승인번호 : ' + rsp.apply_num;
		        
		        jQuery("#rent_payment_total_price").val(amount);
		        jQuery("#rent_payment_insurance_price").val('${rentcar.totalinsurance }');
		        jQuery("#rent_payment_carkind_price").val('${rentcar.totalprice}');
		        jQuery("#rent_reserv_driver_name").val($("input:text[name=driver_name]").val());
				/* jQuery("#rent_reserv_driver_birth").val($("input:text[name=driver_birth]").val()); */
				jQuery("#rent_reserv_driver_tel").val($("input:text[name=driver_tel]").val());
		        var way = "";
		        if(pay == "card"){
		        	way = "신용카드";
		        }
		        if(pay == "trans"){
		        	way = "계좌이체";
		        }
		        if(pay == "vbank"){
		        	way = "무통장입금";
		        }
		        if(pay == "phone"){
		        	way = "휴대폰소액결제";
		        }
		        jQuery("#rent_payment_way").val(way);
		        jQuery("#rent_payment_goods_type").val("Y");
		        jQuery("#branch_no").val('${rentcar.branch_no}');
		        jQuery("#car_no").val('${rentcar.car_no}');
		        jQuery("#car_kind_no").val('${rentcar.car_kind_no}');
		        jQuery("#insurance_no").val('${rentcar.insurance_no}');
		        jQuery("#member_no").val('${log.member_no}');
		        jQuery("#rent_payment_no").val('${reserv.rent_payment_no}');
		        jQuery("#rent_reserv_start").val('${requirements.rent_reserve_startDate}');
		        jQuery("#rent_reserv_end").val('${requirements.rent_reserve_endDate}');
		        document.f.submit();
		    } else {
		        var msg = '결제에 실패하였습니다.';
		        msg += '에러내용 : ' + rsp.error_msg;
		    }
		    alert(msg);
		});
	}
	
	</script>
	
	<style>
	 @keyframes check {0% {height: 0;width: 0;}
	  25% {height: 0;width: 10px;}
	  50% {height: 20px;width: 10px;}
	}
	.checkbox{background-color:#2d2f3f;display:inline-block;height:28px;margin:0 .25em;width:28px;border-radius:4px;border:1px solid #ccc;float:right}
	.checkbox span{display:block;height:28px;position:relative;width:28px;padding:0}
	.checkbox span:after{-moz-transform:scaleX(-1) rotate(135deg);-ms-transform:scaleX(-1) rotate(135deg);-webkit-transform:scaleX(-1) rotate(135deg);
		transform:scaleX(-1) rotate(135deg);-moz-transform-origin:left top;-ms-transform-origin:left top;-webkit-transform-origin:left top;transform-origin:left top;
		border-right:4px solid black;border-top:4px solid black;content:'';display:block;height:20px;left:3px;position:absolute;top:15px;width:10px}
	.checkbox span:hover:after{border-color:#999}
	.checkbox input{display:none}
	.checkbox input:checked + span:after{-webkit-animation:check .8s;-moz-animation:check .8s;-o-animation:check .8s;animation:check .8s;border-color:#555}
	.checkbox input:checked + .default:after{border-color:#444}
	.checkbox input:checked + .primary:after{border-color:#2196F3}
	.checkbox input:checked + .success:after{border-color:#8bc34a}
	.checkbox input:checked + .info:after{border-color:#3de0f5}
	.checkbox input:checked + .warning:after{border-color:#FFC107}
	.checkbox input:checked + .danger:after{border-color:#f44336}
	</style>
	<div class="colorlib-loader"></div>
	<form name="f" action="payment.do" method="post">
		<!-- 결제테이블 -->
		<input type="hidden" name="rent_payment_total_price" id="rent_payment_total_price">
		<input type="hidden" name="rent_payment_insurance_price" id="rent_payment_insurance_price">
		<input type="hidden" name="rent_payment_carkind_price" id="rent_payment_carkind_price">
		<input type="hidden" name="rent_payment_way" id="rent_payment_way">
		<input type="hidden" name="rent_payment_discount" id="rent_payment_discount">
		<input type="hidden" name="rent_payment_goods_type" id="rent_payment_goods_type">
		<!-- 예약테이블 -->
		<input type="hidden" name="branch_no" id="branch_no">
		<input type="hidden" name="car_no" id="car_no">
		<input type="hidden" name="car_kind_no" id="car_kind_no">
		<input type="hidden" name="insurance_no" id="insurance_no">
		<input type="hidden" name="member_no" id="member_no">
		<input type="hidden" name="rent_payment_no" id="rent_payment_no">
		<input type="hidden" name="rent_reserv_start" id="rent_reserv_start">
		<input type="hidden" name="rent_reserv_end" id="rent_reserv_end">
		<input type="hidden" name="rent_reserv_license_kind" id="rent_reserv_license_kind">
		<input type="hidden" name="rent_reserv_driver_name" id="rent_reserv_driver_name">
		<input type="hidden" name="rent_reserv_driver_birth" id="rent_reserv_driver_birth">
		<input type="hidden" name="rent_reserv_driver_tel" id="rent_reserv_driver_tel">
	</form>
		
	
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
				<tr style="color:#8c9094;background-color:white;font-size:10pt">			
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
														<td  height="50px" style="background-color: #2d2f3f" align="left">　예약자 정보</td>
														<td align="right" style="background-color: #2d2f3f">
						                                <label class="checkbox">
						                                        <input type="checkbox" id="info" name="info" onclick="myclick()"/>
						                                        <span class="primary"></span>
						                                </label>
														</td>
														<td align="center" width="37%"style="background-color: #2d2f3f;padding-right:10px">회원 정보와 동일함</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이름</label>
																	<div style="width:100%;background-color:white">
																		<input type="text" id="Rname" name="Rname" class="form-control">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>휴대전화</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="Rphone" name="Rphone" class="form-control">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이메일</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="Rmail" name="Rmail" class="form-control">
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
														<td align="left" height="50px" style="background-color: #2d2f3f">　운전자 정보</td>
														<td align="right" style="background-color: #2d2f3f">
						                                <label class="checkbox">
						                                        <input type="checkbox" id="dinfo" name="dinfo" onclick="Dclick()"/>
						                                        <span class="primary"></span>
						                                </label>
														</td>
														<td align="center" width="37%"style="background-color: #2d2f3f;padding-right:10px">예약자 정보와 동일함</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>이름</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="Dname" name="driver_name" class="form-control">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>휴대전화</label>
																	<div style="width:100%;background-color:white">	
																		<input type="text" id="Dphone" name="driver_tel" class="form-control">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p ><div class="row form-group">
																<label>생년월일</label>
																	<div style="width:100%;background-color:white">
																		<input type="date" id="Dday" name="driver_birth"class="form-control date" style="height:50px">
																	</div>
																	</div></p>
															</div>
														</td>
													</tr>
													<tr height="50px">
														<td colspan="3">
															<div class="col-md-12">
																<p><div class="row form-group">
																<label>면허 종류</label>
																	<div style="width:100%;height:50px;background-color:white">
																		&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" style="margin-top:20px" id="one" name="dnum" value="Y">
																		<label class="form-check-label" for="one">
																			<h4 style="font-size:10pt">1종보통</h4>
																		</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																		&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="two" name="dnum" value="N">
																		<label class="form-check-label" for="two">
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
												<div style="width:100%;height:150px;background-color:white">
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="card1" name="card" value="card">
													<label class="form-check-label" for="card1">
														<h4 style="font-size:10pt">신용카드</h4>
													</label></br>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="card2" name="card" value="trans">
													<label class="form-check-label" for="card2">
														<h4 style="font-size:10pt">계좌이체</h4>
													</label></br>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="card3" name="card" value="vbank">
													<label class="form-check-label" for="card3">
														<h4 style="font-size:10pt">무통장입금</h4>
													</label></br>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="card4" name="card" value="phone">
													<label class="form-check-label" for="card4">
														<h4 style="font-size:10pt">휴대폰소액결제</h4>
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
								<tr style="color:white;">			
									<th  height="50px" style="background-color: #2d2f3f">　할인방법(선택사항)</th>
								</tr>
								<tr>
									<td style="background-color:white">
										<div class="col-md-12">
											<p><div class="row form-group">
												<div style="width:100%;height:10px;background-color:white;">
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="exampleCheck1" name="coupon" value="N">
													<label class="form-check-label" for="exampleCheck1">
														<h4 style="font-size:10pt">미선택</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="exampleCheck2" name="coupon" value="C">
													<label class="form-check-label" for="exampleCheck2">
														<h4 style="font-size:10pt">쿠폰함에서 선택</h4>
													</label>
													&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="exampleCheck3" name="coupon" value="P">
													<label class="form-check-label" for="exampleCheck3">
														<h4 style="font-size:10pt">프로모션 코드</h4>
													</label>
												</div>
												</div></p>
										</div>
									</td>
								</tr>
								<tr>
									<td height="10px" style="background-color: white"></td>
								</tr>
								<tr>
									<th>　</th>
								</tr>
								<tr>			
									<td height="50px">
									<div id="coupon" style="display:none">
									<table border="0" width="100%" height="50px">
									<tr height="50px" style="background-color:#2e3040;color:white;">
										<td width="45%" align="center">쿠폰명</td>
										<td width="20%" align="center">할인금액(율)</td>
										<td width="35%" align="center">사용기한</td>
									</tr>
									<c:forEach items="${list}" var="list">
									<tr style="background-color:white" height="30px">
										<td style="padding-left:10px">
											<input type="radio" id="couponname" name="couponname" onclick="disclick()" value='${list.coupon_way}'>
											<label class="form-check-label" for="couponname">
												<span style="font-size:10pt">${list.coupon_name}</span>
											</label>
										</td>
										<td align="center">${list.coupon_discount}${list.coupon_way}</td>
										<td align="center">${list.detail_start}~${list.detail_end}</td>
									</tr>
									</c:forEach>
									</table>
									
									</div>
									
									<div id="promotion" style="display:none">
									<input type="text" style="width:80%" placeholder="　코드 입력">
									<input type="button" value="확인" style="background-color: #2d2f3f;color:white;height:50px;width:77px" border="0">
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
			<label class="form-check-label" for="">
				<h4 style="font-size:14pt">개인정보 수집·이용 및 제3자 정보 제공에 모두 동의합니다.</h4>
			</label></br>
		<div id="pay" name="pay">
		<input type="checkbox">
			<label class="form-check-label" for="">
				<h4 style="font-size:14pt">결제진행약관에 모두 동의합니다.　　　　　　　　　　　</h4>
			</label></br></br>
		</div>
		<button type="button" style="width:200px;height:50px;background-color:black;border:0;outline:0"><span style="color:white;" onclick="check()">결제하기</span></button>
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
                    <label for="" style="color:#8caaca">대여일시</label>
                    <div class="form-field">
                      <span style="color:white;font-size:12pt">${requirements.rent_reserve_startDate}</span></br>
                      <span style="color:white;font-size:12pt">${requirements.rent_reserve_startTime}</span>
                    </div>        
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="" style="color:#8caaca">반납일시</label>
                    <div class="form-field">
                      <span style="color:white;font-size:12pt">${requirements.rent_reserve_endDate}</span></br>
                      <span style="color:white;font-size:12pt">${requirements.rent_reserve_endTime}</span>
                    </div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="" style="color:#8caaca">보험</label>
                    <div class="form-field">
                      <span style="color:white;font-size:12pt">${rentcar.insurance_name}</span>
                    </div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="" style="color:#8caaca">대여업체</label>
                    <div class="form-field">
                      <span style="color:white;font-size:12pt">${rentcar.branch.branch_name }</span>
                    </div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="" style="color:#8caaca">차량</label>
                    <div class="form-field">
                      <span style="color:white;font-size:12pt">${rentcar.car.car_name }</span>
                      <img src="resources/car/${rentcar.car.car_image}" width=100%, height=50%>
                    </div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="" style="color:#8caaca">결제금액</label>
                    <div class="form-field">
                    <input style="width:100%;background-color:#2d2f3f;color:white;font-size:24pt;border:none" name="sum" id="sum" type="text"  value='${rentcar.totalprice}' readOnly></br>
                      <hr></br>
                      <span style="color:#8caaca;font-size:10pt">차량대여료(24시간)</span>
                      <span style="color:white;font-size:10pt">${rentcar.totalrent}</span></br>
                      <span style="color:#8caaca;font-size:10pt">보험료(2일)</span>
                      <span style="color:white;font-size:10pt">${rentcar.totalinsurance }</span><br>
                      
                      
                      <div id="dis" style="display:none">
                      <span style="color:#8caaca;font-size:10pt">할인</span>
                      <span style="color:white;font-size:10pt">${list.get(0).getCoupon_name()}${list.get(0).getCoupon_discount()}${list.get(0).getCoupon_way()}</span>
		              </div>     
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

