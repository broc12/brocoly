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
	<!--[if lt IE 9]>\\\\\\\\
	
	<script src="js/respond.min.js"></script>
	<![endif]-->
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
	<script>
    function checkId(s){
    	var ii = "${id}";
   	 $.ajax({
            url: 'checkId.do',
            data:{"qna_no":s,"id":ii},
            success: function(data){
				 var answer = data.flagId;
				 if(answer==true){
					 location.href = "helpContent.do?qna_no="+s;
				 }
			     else if(answer==false){
			    	 $("#strqna_no").val(s);
			    	 $("#exampleModal2").modal('show');
			     }
			     else {alert('게시물이 없습니다.');
				 	return false;
			     }
            },
            error : function (data) {
           	    alert('게시물이 없습니다.');
           	    return false;
           	   }  
        });
	} 

	function hiddensubmit(){
		document.f.submit();
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
				   					<h1>여행상담</h1>
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
					<th  class="text-center" width="15%"><a href="faq.do" style="color:#8c9094">자주찾는 질문</a></th>
					<th  class="text-center" width="10%"><a href="help.do" style="color:#ffdd01">여행상담</a></th>
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
												<h3>여행상담</h3>
												<a style="color:black">제주란티스 상품 및 서비스에 대해 궁금하신 사항을 친절하게 안내해드리겠습니다.</a></br>
												<a style="color:black">문의 하시기 전 '자주묻는질문' 을 찾아 보시면 신속하게 궁금증을 해소하실 수 있습니다</a></br>
												<div class="col-md-12 text-right">
													<ul class="pagination">
														<form action="helpadd.do" method="POST" >
															<input type="hidden" name="id" value="${id}">
															<input type="hidden" name="memberNum" value="${memberNum}">
															<button type="submit" class="btn btn-primary" style="border-radius:0px">글쓰기</button>
															<!-- <a data-toggle="modal" data-target="#exampleModal2" class="identifyingClass" data-id="">삭제</a> -->
															</form>
													</ul>
												</div>
												<table border="0" width="100%"  cellpadding="0" cellspacing="0">	
													<tr style="color:#808080;font-size:12pt">			
														<th  height="50px" width="10%" class="text-center" style="background-color: #fafafa">번호</th>
														<th  width="35%" class="text-center" style="background-color: #fafafa">제목</th>
														<th  width="15%" class="text-center" style="background-color: #fafafa">작성자</th>
														<th  width="15%" class="text-center" style="background-color: #fafafa">등록일</th>
														<th  width="15%" class="text-center" style="background-color: #fafafa">답변유무</th>
													</tr>
													<c:if test="${empty list}">
														<tr style="font-size:10pt;background-color:#fafafa" height="60px">
												           <td align="center" colspan="5">여행상담이 없습니다.</td>
												        </tr>
													  </c:if>
													  <c:forEach items="${list}" var="board">
														<tr style="font-size:10pt;color:black" height="60px">
															<td align="center" style="color:black">
															<c:if test="${board.qna_lev==0}">
															${board.qna_group}
															</c:if>
															</td>
															<td align="center">
															<a style="color:black" href="javascript:checkId(${board.qna_no});">${board.qna_title}</a>
															<c:if test="${board.qna_secret==0}">
															<img src="resources/rentcar/images/locker.png" width=6% height=10%>
															</c:if>
															</td>	
															<td align="center">${board.qna_name}</td>
															<td align="center">${board.qna_resist}</td>
															<td align="center">${board.qna_answer_checkString}</td>
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
							
						  <div class="row">
							<div class="col-md-12 text-center">
								<ul class="pagination">
									
									<li><a href="#">&laquo;</a></li>
									<c:forEach var="i" begin="1" end="${totalPage}">
								    <li> <a href="help.do?strInput=${i}">${i}</a> </li>
									</c:forEach>
									<li><a href="#">&raquo;</a></li>
								</ul>
					
							</div>
						</div>
					</div>
					<c:forEach var="i" begin="1" end="${totalPage}">
							 <a href="help.do?strInput=$'i'">i</a>
									</c:forEach>
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

<div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2" aria-hidden="true"><!-- 모달 -->
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">비밀번호 확인</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
		  <form action="helpCheckPwd.do" method="POST" name="f">
          <div class="modal-body">
          	<input type="text"  id = "inputPwd" name="inputPwd">
         	<input type="hidden"  id = "strqna_no" name="strqna_no" value="">
          </div>
          
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
            <a class="btn btn-primary" href="#" onclick="hiddensubmit()" name="hiddenValue" id="hiddenValue">확인</a>
            <input type="hidden" value=""/>
          </div>
		  </form>
        </div>
      </div>
    </div>
	</body>
</html>

