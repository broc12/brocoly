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
				   					<h1>자주찾는 질문</h1>
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
					<th  height="60px" class="text-center" width="15%" style="color:black">고객센터</th>
					<th  class="text-center" width="10%"><a href="service.do" style="color:#8c9094">공지사항</a></th>
					<th  class="text-center" width="15%"><a href="faq.do" style="color:#ffdd01">자주찾는 질문</a></th>
					<th  class="text-center" width="10%"><a href="help.do" style="color:#8c9094">여행상담</a></th>
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
								<div class="">
									<div class="hotel-entry">
										<div class="desc">
											<!-- <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p> -->
											<div id="board">
												<table border="0" width="100%" height="100" style="background-color:#eef2f5">
													<tr>
														<td  colspan="3" height="50px" style="font-size:18pt" align="center">실시간예약</td>
													</tr>
													<tr>
													 <td width="45%" height="250px" valign="top">
													 	<h style="color:#8caaca">여러 대를 한 번에 예약할 수 있나요?</h></br></br>
													 	<a style="color:black">한 번에 한 대씩만 예약할 수 있습니다.</a></br></br>
													 	<a style="color:black">참고로 홈페이지와 APP에서는 각 렌트카 회사에서 보유중인 차량 대수가 표시되지 않기 때문에 혹시나 예약할 차량 수가 많다면 고객센터(1544-0445)로 문의주시기 바랄게요~!</a></br>	
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">예약하려면 회원가입이 필요한가요?</h></br></br>
													 	<a style="color:black">회원가입을 하지 않아도 예약이 가능합니다.</a></br></br>
													 	<a style="color:black">단, 온라인 회원 전용 요금제인 '이코노미'는 회원가입 및 로그인 이후 사용할 수 있는데요. 이코노미 요금으로 예약하고자 한다면 회원가입을 해 주셔야 합니다.</a></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">차량 대여료의 할인률은 어떻게 되나요?</h></br></br>
													 	<a style="color:black">렌트카 회사 별로 할인율은 상이하지만 시즌과 차량 수요에 따라 최대 95%까지 할인됩니다. 뿐만 아니라 자차보험료도 할인된 금액으로 제공한다는 점 기억해 주세요!</a></br>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">보험료도 예약 시 함께 결제하나요?</h></br></br>
													 	<a style="color:black">네~ 차량대여료와 보험료를 한 번에 결제합니다. 따라서 홈페이지 및 APP에서 표시되는 결제금액은 차량대여료와 보험료가 모두 포함되어 있는 금액으로 봐주세요.</a></br>
													 </td>
													</tr>
													<tr>
													 <td valign="top">
													 	<h style="color:#8caaca">실시간예약은 결제를 하면 예약이 확정되는 건가요?</h></br></br>
													 	<a style="color:black">실시간 예약서비스를 제공하므로 결제와 동시에 예약이 확정돼요. 예약완료 후 카카오톡 알림메시지(혹은 예약문자)가 전송되니 예약정보를 꼭! 검토해 주세요.</a></br>
													 </td>
													 <td width="5%">
													 </td>
													</tr>
												</table></br>
												
												<table border="0" width="100%" height="100" style="background-color:#eef2f5">
													<tr>
														<td  colspan="3" height="50px" style="font-size:18pt" align="center">대여안내</td>
													</tr>
													<tr>
													 <td width="45%" height="250px" valign="top">
													 	<h style="color:#8caaca">외국인도 렌트카 대여가 가능한가요?</h></br></br>
													 	<a style="color:black">외국인도 아래의 조건을 충족한 경우, 렌트가 대여가 가능합니다.</a></br></br>
													 	<a style="color:black">① 각 차량마다 대여규정이 다를 수 있으니 대여조건을 꼭! 확인하셔야 합니다. (ex. 만 26세 이상)</a></br>	</br>
													 	<a style="color:black">② 유효기간 내의 국제운전면허증(제네바 및 비엔나 협약국 발급)과 여권을 꼭 지참하셔야 합니다.</a></br></br>
													 	<a style="color:black">③ 한국어로 의사소통이 가능해야 합니다.</a></br></br>
													 	<a style="color:black">또한, 국내 면허증을 취득하였더라도 렌트카 업체에 따라 국제운전면허증+여권을 추가로 확인할 수 있으니, 예약 전 렌트카 업체로 대여 절차를 꼭 확인해주시기 바랍니다.</a></br></br></br>	
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">차량 대여조건은 어떻게 되나요?</h></br></br>
													 	<a style="color:black">만 21세 이상, 면허취득 후 1년 경과한 경우 렌트카 대여가 가능합니다.</a></br></br>
													 	<a style="color:black">* 승용, 9인승 승합 : 2종보통 면허</a></br>
													 	<a style="color:black">* 11인승 이상 승합 : 1종보통 면허</a></br></br>
													 	<a style="color:black">① 각 차량마다 대여조건이 다를 수 있으니 대여조건을 꼭! 확인해 주세요.</a></br>
													 	<a style="color:black">② 외국인은 국제면허증과 여권을 소지해야 하며, 한국어로 의사소통이 가능해야 합니다.</a></br>
													 	<a style="color:black">③ 면허재취득 시, 총 운전경력이 1년 이상인 경우 '운전면허경력증명서'를 지참해 주세요.</a>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">운전면허증 없이 차량을 대여할 수 있나요?</h></br></br>
													 	<a style="color:black">면허증이 없는 경우 주민등록증과 대체서류를 지참해 주세요.</a></br></br>
													 	<a style="color:black">※ 면허증 대체 서류</a></br>
													 	<a style="color:black">①국제면허증 [발급기관 : 도로교통공단]</a></br>
													 	<a style="color:black">②임시면허증 [발급기관 : 경찰서]</a></br></br></br>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">군인도 차량을 대여할 수 있나요?</h></br></br>
													 	<a style="color:black">직업군인은 렌트카를 예약할 수 있습니다. 군 복무중인 장병은 렌트카를 예약할 수 없다는 점! 참고해 주세요</a></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">예약자와 운전자가 동일해야 하나요?</h></br></br>
													 	<a style="color:black">그렇지 않아요! 예약할 때 예약자와 운전자 정보를 따로 입력하게 된답니다. 단, 운전자의 정보가 대여기준에 적합해야 렌트카 대여와 보험을 가입할 수 있으므로 정보는 정확히 입력해 주세요.</a>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top" valign="top">
													 	<h style="color:#8caaca">렌트카는 며칠동안 대여할 수 있나요?</h></br></br>
													 	<a style="color:black">렌트카는 최소 24시간 이상, 최대 7일(144시간)까지 예약할 수 있으며, 그 이상의 장기대여는 제공되지 않습니다.</a></br></br>
													 	<a style="color:black">7일 이상 이용을 원하는 경우, A 업체에서 7일 예약 후 B 업체(타 업체)에서 이후 일정을 예약하셔야 하는데요. </a></br></br>
													 	<a style="color:black">사전협의 없이 A 업체에서 7일 예약 후 동일 업체에 추가 일정으로 2차 예약을 하는 경우, 2차 예약은 취소될 수 있는 점, 참고 부탁드립니다.</a></br></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">승합차 대여는 누구나 가능한가요?</h></br></br>
													 	<a style="color:black">11인승 이상 승합차량은 1종보통 이상 면허가 필요합니다. 승합차량을 예약하기 전에는 면허종류를 꼭! 확인해 주시기 바랍니다.</a>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">어린이도 렌트카 탑승인원에 포함되나요?</h></br></br>
													 	<a style="color:black">어린이도 탑승인원에 포함되는데요. 예를 들어, '성인 5명&어린이 2명'이 탑승한다면 7인승 이상의 차량을 예약하셔야 합니다.</a></br></br>
													 	<a style="color:black">만일 탑승자의 수가 차량의 인원을 초과한다면 교통법규와 안전상의 이유로 차량 대여가 거부될 수 있으니 예약 전 미리 확인해 주세요.</a></br></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">전연령 렌트카 대여가 가능한가요?</h></br></br>
													 	<a style="color:black">제주란티스 렌트카에서는 전연령 렌트카를 대여하지 않습니다. 만 21세 이상, 면허취득일부터 1년 경과 시 렌트카를 대여할 수 있는 점 참고해 주세요.</a>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">군인도 차량을 대여할 수 있나요?</h></br></br>
													 	<a style="color:black">직업군인은 렌트카를 예약할 수 있습니다. 군 복무중인 장병은 렌트카를 예약할 수 없다는 점! 참고해 주세요</a></br>
													 </td>
													</tr>
												</table></br>
												
												<table border="0" width="100%" height="100" style="background-color:#eef2f5">
													<tr>
														<td  colspan="3" height="50px" style="font-size:18pt" align="center">인수/반납</td>
													</tr>
													<tr>
													 <td width="45%" height="250px" valign="top">
													 	<h style="color:#8caaca">운전자는 몇 명까지 등록할 수 있나요?</h></br></br>
													 	<a style="color:black">운전자는 총 2명까지 등록할 수 있습니다.</a></br></br>
													 	<a style="color:black">렌트카 예약 시 기본 운전자 정보를 등록하게 되며, 렌트카 회사에서 차량 인수를 받을 때에 운전자 1인을 추가로 등록할 수 있는데요.</a></br>	</br>
													 	<a style="color:black">대여 규정 및 자차보험 규정에 적합한 분만 운전자 등록이 가능하므로 예약 전 대여 규정/자차보험 규정을 꼭 확인해 주세요.</a></br></br>	
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">운전경력은 1년 이상인데, 면허 재발급으로 취득일부터 1년이 넘지 않아요.</h></br></br>
													 	<a style="color:black">면허증과 운전경력증명서를 통해 총 운전 경력 1년 이상이 확인되면 렌트카를 대여할 수 있습니다.</a></br></br>
													 	<a style="color:black">다만, 렌트카 회사에 따라 필요한 조건(서류)이 추가될 수 있으므로, 예약을 원하는 렌트카 회사로 대여 조건을 정확히 확인한 후 차량을 예약하셔야 합니다.</a></br></br>
													 	<a style="color:black">운전경력증명서는 가까운 관할경찰서에서 발급받을 수 있으니 참고해 주세요.</a></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">예약한 차량과 다른 차량이 배차되는 경우도 있나요?</h></br></br>
													 	<a style="color:black">예약하신 차량이 고장, 사고로 대여할 수 없는 상황일 때는 동일 차종 혹은 다른 차량으로 변경될 수 있는데요. 부득이하게 다른 차량으로 변경되는 경우 렌트카 회사에서 사전에 안내해 드린답니다.</a></br></br>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">08시~20시 외 차량인수/반납이 가능한가요?</h></br></br>
													 	<a style="color:black">보통 렌트카 인수/반납은 오전 08시부터 오후 08까지 진행되는데요. 이 외 시간에는 일부 렌트카 업체만 야간인수/조기반납이 가능하며, 추가 요금이 발생할 수 있습니다.</a></br></br>
													 	<a style="color:black">예약 전 고객센터(1544-0445)를 통해 야간인수/조기반납 가능 유무와 추가 요금에 대해 꼭! 문의해 주시기 바랍니다.</a></br></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">공항에서 렌트카 차고지까지는 얼마나 소요되나요?</h></br></br>
													 	<a style="color:black">제주공항과 업체의 거리, 그리고 공항 근처의 교통상황에 따라 조금씩 차이는 있지만 평균 5~20분 정도 소요된답니다. 업체 별 소요시간은 차량 예약 전 업체정보에서 확인해 주세요~!</a>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top" valign="top">
													 	<h style="color:#8caaca">렌트카 셔틀버스 탑승은 어디서 하나요?</h></br></br>
													 	<a style="color:black">제주공항 1층 5번 게이트에서 횡단보도를 건너 오른쪽으로 쭈~욱이동하면  '렌트카 종합안내센터(구.렌트카하우스)'가 있습니다. 종합안내센터 앞 셔틀버스 탑승장에서 셔틀버스를 탑승하시면 됩니다.</a></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">차량 인수와 반납은 어떻게 하나요?</h></br></br>
													 	<a style="color:black">2016년 9월 1일부터 제주공항 렌트카하우스 내 대여업무가 종료되어 렌트카 회사의 차고지에서 차량을 인수/반납하고 있답니다.</a>
													 	<a style="color:black">제주공항 도착 후 렌트카 업체에서 운행하는 셔틀차량 탑승, 차고지까지 이동하게 되며 셔틀차량 탑승장소는 예약완료 시 발송되는 안내메시지에 기재되어 있으니, 이용에 참고 바랍니다.</a>
													 </td>
												
													</tr>
												</table></br>
												
												<table border="0" width="100%" height="100" style="background-color:#eef2f5">
													<tr>
														<td  colspan="3" height="50px" style="font-size:18pt" align="center">자차보험</td>
													</tr>
													<tr>
													 <td width="45%" height="250px" valign="top">
													 	<h style="color:#8caaca">손해사정 상담 서비스에 대해 알려주세요.</h></br></br>
													 	<a style="color:black">제주란티스 렌트카에서는 여행 중 발생한 사고로 인해 억울한 일이 발생하지 않도록 무료 손해사정 상담서비스를 제공하고 있는데요. 보험급 지급 및 분쟁/산정, 과실평가, 사고조사 등울 도와드리고 있답니다.</a></br></br>
													 	<a style="color:black">만약 손해사정 상담서비스가 필요하다면 고객센터(1544-0704)로 문의해 주세요~!</a></br>	
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">자차보험은 사고날때마다 보험처리가 가능한가요?</h></br></br>
													 	<a style="color:black">자차보험은 1회 소멸성으로 중복 보장이 되지 않습니다. 만약 차량 운행 중 사고가 발생한다면 대여한 렌트카 회사로 꼭! 사고/고장 접수를 해 주세요.</a></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">자차보험을 꼭 선택해야 하나요?</h></br></br>
													 	<a style="color:black">자차보험은 일반자차, 완전자차 두 가지로 운영하고 있으며, 필수 가입사항이랍니다.</a></br></br>
													 	<a style="color:black">렌트카 업체마다 운전자의 연령이나 운전경력에 따라 자차보험 가입기준이 다르기 때문에 예약 전 보험규정을 꼭! 확인해 주세요.</a></br></br>
													 	<a style="color:black">[1]일반자차 : 수리비의 20%정도, 휴차보상료(1일 정상요금의 50% X 수리기간)를 부담함</a></br>
													 	<a style="color:black">[2]완전자차 : 보상한도 내에서 발생한 수리비, 면책금, 휴차보상료 면제</a></br></br>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">자동차 종합보험이 가입되어 있나요?</h></br></br>
													 	<a style="color:black">제주도의 모든 렌트카회사는 '종합보험'에 가입되어 있어요.</a></br></br>
													 	<a style="color:black">단, 종합보험의 보상범위는 대인/대물/자손에 한정되므로, 렌트카 회사에서 자차보험(차량운전자 면책보험)을 별도로 운영하고 있는데요. 렌트카 회사마다 운영하는 자차보험의 보상한도와 범위에는 차이가 있으니 예약 전 상세규정을 꼭! 확인해 주세요.</a></br>
													 </td>
													</tr>
												</table></br>
												
												<table border="0" width="100%" height="100" style="background-color:#eef2f5">
													<tr>
														<td  colspan="3" height="50px" style="font-size:18pt" align="center">취소/환불</td>
													</tr>
													<tr>
													 <td width="45%" height="250px" valign="top">
													 	<h style="color:#8caaca">일정을 변경하고 싶어요.</h></br></br>
													 	<a style="color:black">요금제에 따라 일정변경 규정이 다르답니다.</a></br></br>
													 	<a style="color:black">[이코노미]</a></br>
													 	<a style="color:black">일정변경 불가</a></br></br>
													 	<a style="color:black">[스탠다드]</a></br>	
													 	<a style="color:black">1. 비수기</a></br>	
													 	<a style="color:black">- 인수시점까지 72시간 미만 : 3천원</a></br>	
													 	<a style="color:black"> 인수시점까지 24시간 미만 : 변경불가</a></br></br>	
													 	<a style="color:black">2. 성수기</a></br>	
													 	<a style="color:black">- 인수시점까지 72시간 미만 : 변경불가</a></br>	
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">예약취소는 어떻게 하나요?</h></br></br>
													 	<a style="color:black">제주란티스 렌트카 홈페이지/APP에서 직접 예약을 취소할 수 있으나, 렌트카 대여시점까지 24시간이 남지 않는 경우, 고객센터(1544-0445)로 문의주셔야 합니다.</a></br></br>
													 	<a style="color:black">참고로 이용 요금제에 따라 일정변경 유무와 수수료가 상이하므로 상세규정을 꼭! 확인해 주세요.</a></br></br>
													 	<a style="color:black">[취소방법]</a></br>
													 	<a style="color:black">홈페이지/APP에서 로그인 후 [예약확인]에서 예약취소</a></br></br>
													 	<a style="color:black">[요금제 별 예약취소 규정]</a></br></br>
													 	<a style="color:black">(비수기)</a></br>
													 	<a style="color:black">1. 이코노미</a></br>
													 	<a style="color:black">* 결제 후 24시간 이내 : 수수료 없음</a></br>
													 	<a style="color:black">* 결제 후 24시간 경과 : 수수료 30%</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 24시간 이내 : 수수료 30%</a></br>
													 	<a style="color:black">* No-Show : 환불불가</a></br></br>
													 	<a style="color:black">2. 스탠다드</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 72시간 이전 : 수수료 없음</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 24시간 이내 : 수수료 30%</a></br>
													 	<a style="color:black">* No-Show : 수수료 50%</a></br></br>
													 	<a style="color:black">(성수기)</a></br>
													 	<a style="color:black">1. 이코노미</a></br>
													 	<a style="color:black">* 결제 후 24시간 이내 : 수수료 없음</a></br>
													 	<a style="color:black">* 결제 후 24시간 경과 : 수수료 30%</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 24시간 이내 : 수수료 30%</a></br>
													 	<a style="color:black">* No-Show : 환불불가</a></br></br>
													 	<a style="color:black">2. 스탠다드</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 72시간 이전 : 수수료 없음</a></br>
													 	<a style="color:black">* 대여(인수)시점 기준 24시간 이내 : 수수료 30%</a></br>
													 	<a style="color:black">* No-Show : 수수료 50%</a></br></br></br>
													 </td>
													</tr>
													<tr>
													 <td height="180px" valign="top">
													 	<h style="color:#8caaca">연료가 남았을 경우 환불받을 수 있나요?</h></br></br>
													 	<a style="color:black">렌트카를 이용할 때 사용되는 연료는 운전자가 부담한답니다.</a></br></br>
													 	<a style="color:black">렌트카 대여 시 인수할 때 차량에 남아있는 연료량을 확인하고 반납할 때 다시 확인하는데요. 차량반납 시 인수할 때보다 연료가 부족한 경우 유류비가 청구될 수 있으므로 차량인수 시 확인했던 연료량만큼 연료를 채워주셔야 해요.</a></br></br>
													 	<a style="color:black">반대로 연료가 남았을 경우 초과된 연료만큼 환불하거나, 포인트로 적립하기도 하지만 환불/적립되지 않을 수 있답니다. 환불/적립 규정은 각 업체마다 다르므로 렌트카 대여 전 꼭! 업체 규정을 확인하시길 바랄게요.</a></br></br>
													 </td>
													 <td width="5%">
													 </td>
													 <td valign="top">
													 	<h style="color:#8caaca">결항으로 렌트카를 이용할 수 없는데 환불받을 수 있나요?</h></br></br>
													 	<a style="color:black">천재지변으로 인해 제주행 항공기/선박이 결항되는 경우 결제금액 모두 환불해 드립니다.</a></br></br>
													 	<a style="color:black">단, 결항사실을 확인할 수 있는 '결항확인서' 접수가 필요한데요.</a></br></br>
													 	<a style="color:black">결항확인서는 항공사, 선박사에서 발급받을 수 있으며,발급받은 서류는 플러스친구(@제주란티스렌트카)를 통해 접수하시면 된답니다.</a></br></br>
													 	<a style="color:black">※ 결항확인서 접수방법</a></br></br>
													 	<a style="color:black">1단계. 카카오톡 플러스친구(@제주란티스)를 추가해 주세요.</a></br>
													 	<a style="color:black">2단계. 1:1문의 클릭 → 결항확인서를 사진으로 발송하면 됩니다.</a></br>
													 	<a style="color:black">3단계. 예약자명+휴대폰번호 또는 예약번호를 1:1문의로 접수하면 끝!</a></br></br>
													 	<a style="color:black">3단계까지 끝났다면, 플러스친구의 답변을 기다려 주시기 바랍니다.</a></br></br>
													 </td>
													</tr>
												</table></br>
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

