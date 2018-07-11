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
			   	<li style="background-image: url(resources/rentcar/images/cover-img-3.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
				   				<div class="slider-text-inner text-center">
				   					<h2>by colorlib.com</h2>
				   					<h1>MEMBER</h1>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>
			  	</ul>
		  	</div>
		</aside>

		<div id="colorlib-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-10 col-md-offset-1 animate-box">
						<h3>회원가입</h3>
						<script type="text/javascript">
									    function sendIt() {
									        var email2 = document.f.email.value;
									        var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;								         
// 									        var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/; 
									        var hp1 = document.getElementById('hp1'); 
											var hp2 = document.getElementById('hp2'); 								
											var hp3 = document.getElementById('hp3'); 									
											var tel = hp1.value + "-" + hp2.value + "-" + hp3.value;
											if(confirm("회원가입을 하시겠습니까?")){
										        if(idck==0){
										            alert('아이디 중복체크를 해주세요');
										            return false;
										        }else{
										        alert("회원가입을 축하합니다");
										        $("#frm").submit();
										        }
										    }
									        //아이디 입력여부 검사
									        if (f.id.value == "") {
									            alert("아이디를 입력하지 않았습니다.")
									            f.id.focus()
									            return false;
									        }
									        //아이디 유효성 검사 (영문소문자, 숫자만 허용)
									        for (i = 0; i < document.f.id.value.length; i++) {
									            ch = document.f.id.value.charAt(i)
									            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')&&!(ch >= 'A' && ch <= 'Z')) {
									                alert("아이디는 대소문자, 숫자만 입력가능합니다.")
									                document.f.id.focus()
									                document.f.id.select()
									                return false;
									            }
									        }
									        //아이디에 공백 사용하지 않기
									        if (document.f.id.value.indexOf(" ") >= 0) {
									            alert("아이디에 공백을 사용할 수 없습니다.")
									            document.f.id.focus()
									            document.f.id.select()
									            return false;
									        }
									        //아이디 길이 체크 (4~12자)
									        if (document.f.id.value.length<4 || document.f.id.value.length>12) {
									            alert("아이디를 4~12자까지 입력해주세요.")
									            document.f.id.focus()
									            document.f.id.select()
									            return false;
									        }
									        //비밀번호 입력여부 체크
									        if (document.f.pwd.value == "") {
									            alert("비밀번호를 입력하지 않았습니다.")
									            document.f.pwd.focus()
									            return false;
									        }
									        if (f.pwd.value == f.id.value) {
									            alert("아이디와 비밀번호가 같습니다.")
									            document.f.pwd.focus()
									            return false;
									        }
									        //비밀번호 길이 체크(4~8자 까지 허용)
									        if (document.f.pwd.value.length<4 || document.f.pwd.value.length>12) {
									            alert("비밀번호를 4~12자까지 입력해주세요.")
									            document.f.pwd.focus()
									            document.f.pwd.select()
									            return false;
									        }									 
									        //비밀번호와 비밀번호 확인 일치여부 체크
									        if (document.f.pwd.value != document.f.pwd1.value) {
									            alert("비밀번호가 일치하지 않습니다")
									            document.f.pwd.value = ""
									            document.f.pwd1.focus()
									            return false;
									        }									 
									        if (document.f.email.value == "") {
									            alert("이메일을 입력하지 않았습니다.")
									            document.f.email.focus()
									            return false;
									        }									        								 
									        if (regex.test(email2) === false) {
									            alert("잘못된 이메일 형식입니다.");
									            document.f.email.value=""
									            document.f.email.focus()
									            return false;
									        }
									        if (document.f.name.value == "") {
									            alert("이름을 입력하지 않았습니다.")
									            document.f.name.focus()
									            return false;
									        }
									        if(document.f.name.value.length<2){
									            alert("이름을 2자 이상 입력해주십시오.")
									            document.f.name.focus()
									            return false;
									        }
										    if(hp2.value.length<=2 || hp3.value.length!=4){
											alert("휴대폰번호를 제대로 입력해주세요");
											focus.hp2;
											return false;
										}
								 		/*핸드폰이 숫자만 들어가는지 체크*/
								 		if(isNaN(hp2.value) || isNaN(hp3.value))
										{
											alert("휴대폰번호는 숫자만 들어갈 수 있습니다.");
											return false;
										}
								 		/**/
										if (hp2.value.length > 2 || hp3.value.length==4){
											document.getElementById("tel").value = tel;
										}					 
									        document.f.submit()
									    }
									        </script>
						<form name="f" action="member/memberjoin" method="post" onsubmit="return sendIt();">				
					<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
					<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>
							<script type="text/javascript">
								//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
								var idck = 0;
								$(document).ready(function() {
								    //idck 버튼을 클릭했을 때 
								    $("#idck").click(function() {
								    	 if (f.id.value == "") {
									            alert("아이디를 입력하지 않았습니다.")
									            f.id.focus()
									            return false;
									        }
									        //아이디 유효성 검사 (영문소문자, 숫자만 허용)
									        for (i = 0; i < document.f.id.value.length; i++) {
									            ch = document.f.id.value.charAt(i)
									            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')&&!(ch >= 'A' && ch <= 'Z')) {
									                alert("아이디는 대소문자, 숫자만 입력가능합니다.")
									                document.f.id.focus()
									                document.f.id.select()
									                return false;
									            }
									        }
									        //아이디에 공백 사용하지 않기
									        if (document.f.id.value.indexOf(" ") >= 0) {
									            alert("아이디에 공백을 사용할 수 없습니다.")
									            document.f.id.focus()
									            document.f.id.select()
									            return false;
									        }
									        //아이디 길이 체크 (4~12자)
									        if (document.f.id.value.length<4 || document.f.id.value.length>12) {
									            alert("아이디를 4~12자까지 입력해주세요.")
									            document.f.id.focus()
									            document.f.id.select()
									            return false;
									        }
								        //userid 를 param.
								        var userid =  $("#id").val(); 								        
								        $.ajax({
								            async: true,
								            type : 'POST',
								            data : userid,
								            url : "idcheck.do",
								            dataType : "json",
								            contentType: "application/json; charset=UTF-8",
								            success : function(data) {
								                if (data.cnt > 0) {
								                    
								                    alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
								                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
								                    $("#divInputId").addClass("has-error")
								                    $("#divInputId").removeClass("has-success")
								                    $("#id").focus();				                
								                } else {
								                    alert("사용가능한 아이디입니다.");
								                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
								                    $("#divInputId").addClass("has-success")
								                    $("#divInputId").removeClass("has-error")
								                    $("#pwd").focus();
								                    //아이디가 중복하지 않으면  idck = 1 
								                    idck = 1;								                    
								                }
								            },
								            error : function(error) {								                
								                alert("error : " + error);
								            }
								        });
								    });
								});								 							 
								</script>	
							<tr>
								<td>아이디</td>
								<td><input type="text" id="id"/>
								<input type="button" value="중복확인" name="confirm_id"  id="idck"   onclick="confirmId(this.form)"></td>
							</tr>
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">비밀번호</label>
									<input type="password" id="fname" name= "pwd" class="form-control" placeholder="PASSWORD">
								</div>
								<div class="col-md-6">
									<label for="lname">비밀번호확인</label>
									<input type="password" id="lname" name= "pwd1" class="form-control" placeholder="">
								</div>
							</div>

							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">이름</label>
									<input type="text" id="fname" name= "name" class="form-control" placeholder="NAME">
								</div>							
								<script language="Javascript">							
									var today = new Date();
									var toyear = parseInt(today.getFullYear());
									var start = toyear - 5
									var end = toyear - 70;
									
									document.write("<font size=2><select name=birth1>");
									document.write("<option value='' selected>");
									for (i=start;i>=end;i--) document.write("<option>"+i);
									document.write("</select>년  "); 
									
									document.write("<select name=birth2>");
									document.write("<option value='' selected>");
									for (i=1;i<=12;i++) document.write("<option>"+i);
									document.write("</select>월  ");
									
									document.write("<select name=birth3>");
									document.write("<option value='' selected>");
									for (i=1;i<=31;i++) document.write("<option>"+i); 
									document.write("</select>일   </font>");
									
									</script>
								<div class="col-md-6">
									<label for="lname">생년월일</label>
<!-- 									<input type="text" id="lname" name= "birth"class="form-control" placeholder="ex)19920704"> -->
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-12">
									<label for="subject">거주지</label>
									<select name="memeber_local" id="people" class="form-control">
										<option value="#" style="color:black">거주지 선택(시/도)</option>
										<option value="서울" style="color:black">서울</option>
				                        <option value="부산" style="color:black">부산</option>
				                        <option value="대구" style="color:black">대구</option>
				                        <option value="인천" style="color:black">인천</option>
				                        <option value="광주" style="color:black">광주</option>
				                        <option value="대전" style="color:black">대전</option>
				                        <option value="울산" style="color:black">울산</option>
				                        <option value="세종시" style="color:black">세종시</option>
				                        <option value="경기" style="color:black">경기</option>
				                        <option value="강원" style="color:black">강원</option>
				                        <option value="충남" style="color:black">충남</option>
				                        <option value="충북" style="color:black">충북</option>
				                        <option value="전남" style="color:black">전남</option>
				                        <option value="전북" style="color:black">전북</option>
				                        <option value="경남" style="color:black">경남</option>
				                        <option value="경북" style="color:black">경북</option>
				                        <option value="제주" style="color:black">제주</option>
									</select>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-12">
									<label for="subject">이메일</label>
									<input type="text" id="subject" name= "email"class="form-control" placeholder="heima@naver.com"/>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-12">
									<tr>
				<td rowspan="2" height="30" align="center" bgcolor="#FFDEAD">연락처</td>
				<td bgcolor="#E0FFFF">
					<select id="hp1" name="hp1" style="width:70;">
					   <option value="010"  selected> 010 </option>
					   <option value="011"> 011 </option>
					   <option value="016"> 016 </option>
					   <option value="017"> 017 </option>
					   <option value="018"> 018 </option>
					   <option value="019"> 019 </option>
					</select>
					-
					<input type="text" id="hp2" name="hp2" size="2" maxlength="4">
					-
					<input type="text" id="hp3" name="hp3" size="2" maxlength="4">
					<input type="hidden" id="tel" name="tel" >
				</td>
			</tr>
<!-- 									<input type="text" id="subject" name= "tel" class="form-control" placeholder="ex)01086308690"/> -->
								</div>
							</div>
							
<!-- 							<form method="post" class="colorlib-form-2"> -->
								<div class="form-check text-center">
									<input type="checkbox" class="form-check-input" id="exampleCheck1"name="sms_at" value="y" />
										<label class="form-check-label" for="exampleCheck1">
											<h4 class="place">SMS수신(이벤트)</h4>
										</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" class="form-check-input" id="exampleCheck1"/>
										<label class="form-check-label" for="exampleCheck1">
											<h4 class="place">이메일 수신(이벤트)</h4>
										</label>
								</div>
<!-- 							</form> -->
							<div class="form-group text-center">
								<input type="submit" value="가입하기" onclick="sendit()" class="btn btn-primary"/>
							</div>

						</form>		
					</div>
					<div class="col-md-10 col-md-offset-1 animate-box">
						<h3>Contact Information</h3>
						<div class="row contact-info-wrap">
							<div class="col-md-3">
								<p><span><i class="icon-location"></i></span> 198 West 21th Street, <br> Suite 721 New York NY 10016</p>
							</div>
							<div class="col-md-3">
								<p><span><i class="icon-phone3"></i></span> <a href="tel://1234567920">+ 1235 2355 98</a></p>
							</div>
							<div class="col-md-3">
								<p><span><i class="icon-paperplane"></i></span> <a href="mailto:info@yoursite.com">info@yoursite.com</a></p>
							</div>
							<div class="col-md-3">
								<p><span><i class="icon-globe"></i></span> <a href="#">yoursite.com</a></p>
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
	<!-- Google Map -->
	
	<!-- Main -->
	<script src="resources/rentcar/js/main.js"></script>

	</body>
</html>

