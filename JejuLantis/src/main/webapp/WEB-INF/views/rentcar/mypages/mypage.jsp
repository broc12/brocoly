<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
  	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>
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
 <!-- Core plugin JavaScript-->
<!--   <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>							 -->
<!--  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script> -->
	<!-- Theme style  -->
	<link rel="stylesheet" href="resources/rentcar/css/style.css">

	<!-- Modernizr JS -->
	<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>							
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script type="text/javascript">
//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
 var idck = 0;
 var emailck = 0;
 var branchck = 0;
 var token = $("meta[name='_csrf']").attr("content");
 var header = $("meta[name='_csrf_header']").attr("content");
  
 $(function() {
	    $(document).ajaxSend(function(e, xhr, options) {
	        xhr.setRequestHeader(header, token);
	    });
	});
 $(document).ready(function() {
 	//emailck 버튼을 클릭했을 때 
  $("#emailck").click(function() {
  	var email2 = document.f.member_email.value;
 	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;			

     	 if (f.member_email.value == "") {
 	            alert("email를 입력하지 않았습니다.")
 	            f.member_email.focus()
 	            return false;
 	        }
     		 if (regex.test(email2) === false) {
 				alert("잘못된 이메일 형식입니다.");
 				document.f.member_email.value=""
 				document.f.member_email.focus()
 				return false;
 			
 	        }
 	        //email에 공백 사용하지 않기
 	        if (document.f.member_email.value.indexOf(" ") >= 0) {
 	            alert("email에 공백을 사용할 수 없습니다.")
 	            document.f.member_email.focus()      
 	            return false;
 	        }
 	        
         //userid 를 param.
         var useremail =  $("#member_email").val();
         var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
//  		var csrfHeader = $("meta[name='_csrf_header']").attr("content");
  		var _token = $("meta[name='_csrf']").attr("content");
         $.ajax({
             async: true,
             type : 'POST',
             data : useremail,
             url : "./emailcheck.do",
             dataType : "json",
             contentType: "application/json; charset=UTF-8",
             success : function(data) {
                 if (data.cnt > 0) {
                     
                     alert("email가 존재합니다. 다른 email를 입력해주세요.");
                     //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                     $("#divInputId").addClass("has-error")
                     $("#divInputId").removeClass("has-success")
                     $("#member_email").focus();				                
                 } else {
                     alert("사용가능한 email입니다.");
                     //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                     $("#divInputId").addClass("has-success")
                     $("#divInputId").removeClass("has-error")
                     $("#member_pwd").focus();
                     $("#emailCheck").val("emailCheck");
                     //아이디가 중복하지 않으면  idck = 1 
                     emailck = 1;								                    
                 }
             },
             error : function(error) {								                
                 alert("error : " + error);
             }
             
         });
     });


 	//idck 버튼을 클릭했을 때 
     $("#idck").click(function() {
     	 if (f.manager_id.value == "") {
 	            alert("아이디를 입력하지 않았습니다.")
 	            f.manager_id.focus()
 	            return false;
 	        }
 	        //아이디 유효성 검사 (영문소문자, 숫자만 허용)
 	        for (i = 0; i < document.f.manager_id.value.length; i++) {
 	            ch = document.f.manager_id.value.charAt(i)
 	            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')&&!(ch >= 'A' && ch <= 'Z')) {
 	                alert("아이디는 대소문자, 숫자만 입력가능합니다.")
 	                document.f.manager_id.focus()
 	                document.f.manager_id.select()
 	                return false;
 	            }
 	        }
 	        //아이디에 공백 사용하지 않기
 	        if (document.f.manager_id.value.indexOf(" ") >= 0) {
 	            alert("아이디에 공백을 사용할 수 없습니다.")
 	            document.f.manager_id.focus()
 	            document.f.manager_id.select()
 	            return false;
 	        }
 	        //아이디 길이 체크 (4~12자)
 	        if (document.f.manager_id.value.length<4 || document.f.manager_id.value.length>12) {
 	            alert("아이디를 4~12자까지 입력해주세요.")
 	            document.f.manager_id.focus()
 	            document.f.manager_id.select()
 	            return false;
 	        }
         //userid 를 param.
         var userid =  $("#manager_id").val(); 								        
         $.ajax({
             async: true,
             type : 'POST',
             data : userid,
             url : "idcheckmanager.do",
             dataType : "json",
             contentType: "application/json; charset=UTF-8",
             success : function(data) {
                 if (data.cnt > 0) {
                     
                     alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
                     //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                     $("#divInputId").addClass("has-error")
                     $("#divInputId").removeClass("has-success")
                     $("#manager_id").focus();				                
                 } else {
                     alert("사용가능한 아이디입니다.");
                     //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                     $("#divInputId").addClass("has-success")
                     $("#divInputId").removeClass("has-error")
//                      $("#manager_email").focus();
                     $("#member_email").focus();
                     $("#idCheck").val("idCheck");
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

 function inputIdChk(){
 	document.f.idDuplication.value = "idUncheck";
 }
 function inputEmailChk(){
 	document.f.emailDuplication.value = "emailUncheck";
 }
 function pwdsendIt() { 
	 $("#exampleModal2").modal('show');
 }
 function change() { 
	 if(confirm("회원정보를 수정 하시겠습니까?")){
		//비밀번호 입력여부 체크
			if (document.fpwd.member_pwd.value == "") {
				alert("비밀번호를 입력하지 않았습니다.")
				document.fpwd.manager_pwd.focus()
				return false;
			}			
		//비밀번호 길이 체크(4~8자 까지 허용)
			if (document.fpwd.member_pwd.value.length<4 || document.fpwd.member_pwd.value.length>12) {
				alert("비밀번호를 4~12자까지 입력해주세요.")
				document.fpwd.member_pwd.focus()
				document.fpwd.member_pwd.select()
				return false;
			}									 
	//비밀번호와 비밀번호 확인 일치여부 체크
			if (document.fpwd.member_pwd.value != document.fpwd.member_pwd1.value) {
				alert("비밀번호가 일치하지 않습니다")
				document.fpwd.member_pwd.value = ""
				document.fpwd.member_pwd1.focus()
				return false;
			}								
		 alert("수정완료 ")
		 document.fpwd.submit();
	 }
	 document.fpwd.submit();
 }
 
 function sendIt() {  
		var today = new Date();
		var toyear =  today.getFullYear();
		var start = toyear - 5
		var end = toyear - 70;
		
	 if(confirm("회원정보를 수정 하시겠습니까?")){
	 var hp1 =$("#member_tel1 option:selected").val()
	 var hp2 =$("#member_tel2").val()
	 var hp3 =$("#member_tel3").val()
	//alert(hp2)
	$("#member_tel").val(hp1+"-"+hp2+"-"+hp3)
	 var birth1 =$("#member_birth1 option:selected").val()
	 var birth2 =$("#member_birth2 option:selected").val()
	 var birth3 =$("#member_birth3 option:selected").val()
	$("#member_birth").val(birth1+"-"+birth2+"-"+birth3)
	if(document.f.emailDuplication.value == "emailUncheck"){
		alert('이메일 중복체크를 해주세요');
		document.f.member_email.focus()
		return false;
	}
	if(member_tel2.value.length<=2 || member_tel3.value.length!=4){
		alert("휴대폰번호를 제대로 입력해주세요");
		focus.member_tel1;
		return false;
	}
		/*핸드폰이 숫자만 들어가는지 체크*/
		if(isNaN(member_tel2.value) || isNaN(member_tel3.value))
	{
		alert("휴대폰번호는 숫자만 들어갈 수 있습니다.");
		return false;
	}
		if(member_tel2.value.length<=2 || member_tel3.value.length!=4){
			alert("휴대폰번호를 제대로 입력해주세요");
			focus.member_tel4;
			return false;
		}
			/*핸드폰이 숫자만 들어가는지 체크*/
			if(isNaN(member_tel2.value) || isNaN(member_tel3.value))
		{
			alert("휴대폰번호는 숫자만 들어갈 수 있습니다.");
			return false;
		}
		alert("수정완료 ")
		document.f.submit();
// 	 	alert("수정완료 ")
	 	}	
 }
    </script> 
</head>
	<body>
	<%@ include file="../top/top.jspf" %>
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
				   					<h1>MYPAGE</h1>
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
				<form name="f" action="./modify.do" method="post">
					<div class="col-md-10 col-md-offset-1 animate-box">
						<h3>회원정보수정</h3>
						
							<!-- onsubmit="return sendIt();" -->
							<div class="row form-group">
							<c:if test="${log.member_pwd!=null}">
								<div class="col-md-6 padding-bottom">
									<label for="fname">아이디</label></br>
									<input type="text" value="${log.member_id}" name="member_id" readonly id="email" class="form-control" placeholder="ID">
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<!-- <label for="fname">비밀번호</label>  --><input type="hidden"  value="${nn.member_pwd}" name="member_pwd"  id="member_pwd" class="form-control" >
								</div>
								<div class="col-md-6">
									<!-- <label for="lname">비밀번호확인</label> --> <input type="hidden" value="${nn.member_pwd}" id="member_pwd1" name="member_pwd1" class="form-control">
								</div>
							</div>
							</c:if>
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">이름</label><input type="text" value="${nn.member_name}" name="member_name" id="fname" class="form-control" placeholder="NAME">
								</div>
								<div class="col-md-6">
									<label for="lname" id="lname">생년월일</label>
								</div>
									&nbsp;&nbsp;&nbsp;
								 <script language="Javascript">											 								
									var birth1 =${nn.member_birth1}
									var birth2 =${nn.member_birth2}
									var birth3 =${nn.member_birth3}
									var member_birth= birth1+birth2+birth3;
									var today = new Date();
									var toyear = parseInt(today.getFullYear());
 									var start = toyear - 5
 									var end = toyear - 70;
									
									document.write("<font size=2><select name='member_birth1' id='member_birth1' onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;' style='height:50px;width:130px;'>");
									document.write("<option value="+birth1+" selected>"+birth1);
									for (i=start;i>=end;i--) document.write("<option>"+i);
									document.write("</select>&nbsp;&nbsp;&nbsp;년 &nbsp;&nbsp;&nbsp;"); 
									
									document.write("<select name='member_birth2' id='member_birth2' onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;' style='height:50px;width:120px;'>");
									document.write("<option value="+birth2+" selected>"+birth2);
 									for (i=1;i<=12;i++) document.write("<option>"+i);
									document.write("</select>&nbsp;&nbsp;&nbsp;월&nbsp;&nbsp;&nbsp;");
									
 									document.write("<select name='member_birth3' id='member_birth3' onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;' style='height:50px;width:120px;'>");
									document.write("<option value="+birth3+" selected>"+birth3);
									for (i=1;i<=31;i++) document.write("<option>"+i); 
									document.write("</select>&nbsp;일</font>");		
									var birth1 = $("#birth1").val();
									var birth2 = $("#birth2").val();
									var birth3 = $("#birth3").val();
									var member_birth = birth1+birth2+birth3;
									$("#member_birth").val(member_birth);
								</script>
								<input type="hidden" name="member_birth" id="member_birth">
							
							</br></br>
							<div class="row form-group">
								<div class="col-md-12">
									&nbsp;&nbsp; <label for="subject">거주지</label></br>&nbsp;&nbsp; &nbsp;&nbsp;<select name="member_local"
										id="people" style="width:95%;height:50px">
										<option value="${nn.member_local}" style="color:black">${nn.member_local}</option>
										<option value="pp" style="color: black">거주지 선택(시/도)</option>
										<option value="서울" style="color: black">서울</option>
										<option value="부산" style="color: black">부산</option>
										<option value="대구" style="color: black">대구</option>
										<option value="인천" style="color: black">인천</option>
										<option value="광주" style="color: black">광주</option>
										<option value="대전" style="color: black">대전</option>
										<option value="울산" style="color: black">울산</option>
										<option value="세종시" style="color: black">세종시</option>
										<option value="경기" style="color: black">경기</option>
										<option value="강원" style="color: black">강원</option>
										<option value="충남" style="color: black">충남</option>
										<option value="충북" style="color: black">충북</option>
										<option value="전남" style="color: black">전남</option>
										<option value="전북" style="color: black">전북</option>
										<option value="경남" style="color: black">경남</option>
										<option value="경북" style="color: black">경북</option>
										<option value="제주" style="color: black">제주</option>
									</select>
								</div>
							</div>
								<div class="col-md-6 padding-bottom">
									<label for="fname">이메일</label></br>									
									<input type="text" name="member_email" onkeydown="inputEmailChk()" value="${nn.member_email}" id="member_email"  name="member_email"class="form-control" style="width:100%;height:50px"/>
									<input type="button" value="중복확인" style=width:20%;height:40px class="btn btn-primary btn-block" name="confirm_email" id="emailck">	
									<input type="hidden"  id="emailCheck" name="emailDuplication" value="emailcheck" >  
								</div>
				
								<div class="col-md-6">
									<label for="lname">연락처</label></br>
									
									
									<select id="member_tel1" name="member_tel1" style=width:31%;height:50px>
									
								
									  <option value="010"  selected> 010 </option>
									   <option value="${nn.member_tel1}"   selected>${nn.member_tel1} </option>
									   <option value="011"> 011 </option>
									   <option value="016"> 016 </option>
									   <option value="017"> 017 </option>
									   <option value="018"> 018 </option>
									   <option value="019"> 019 </option>
									</select>
									-
									<input type="text" id="member_tel2" name="member_tel2"  value="${nn.member_tel2}" size="2" maxlength="4" style=width:31%;height:50px>
									-
									<input type="text" id="member_tel3" name="member_tel3" value="${nn.member_tel3}" size="2" maxlength="4" style=width:31%;height:50px>
									
									<input type="hidden" id="member_tel" name="member_tel" >
								</div>
							</div>
<!-- onclick="confirmEmail(this.form) -->


			<!-- <form method="post" class="colorlib-form-2"> -->
			<div class="form-check text-center">
				<span class="button-checkbox">
			        <button type="button" class="btn" data-color="warning">SMS수신(이벤트)</button>
			        <input type="checkbox" class="hidden" id="exampleCheck1" name="member_sms_at" value="y"/>
			    </span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    <span class="button-checkbox">
			        <button type="button" class="btn" data-color="warning">이메일 수신(이벤트)</button>
			        <input type="checkbox" class="hidden" id="exampleCheck2" />
			    </span>
			</div></br>
			<!-- </form> -->
			<div class="form-group text-center">
			<a data-toggle="modal" data-target="#exampleModal2"class="btn btn-primary btn-block" data-id="" >비밀번호 변경</a>
			</br>
			<input type="button" value="수정완료"  class="btn btn-primary btn-block" onclick="sendIt()">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
			</div>
			<div class="form-group text-right">
<!-- 								<input type="submit" value="회원탈퇴" class="btn btn-primary"> -->
								<a href="delete.do" class="btn btn-primary btn-block" style="background-color:#eea236;color:white">회원탈퇴</a>
</div>
							</div>
							</form>
 <script>
$(function () {
    $('.button-checkbox').each(function () {

        // Settings
        var $widget = $(this),
            $button = $widget.find('button'),
            $checkbox = $widget.find('input:checkbox'),
            color = $button.data('color'),
            settings = {
                on: {
                    icon: 'glyphicon glyphicon-check'
                },
                off: {
                    icon: 'glyphicon glyphicon-unchecked'
                }
            };

        // Event Handlers
        $button.on('click', function () {
            $checkbox.prop('checked', !$checkbox.is(':checked'));
            $checkbox.triggerHandler('change');
            updateDisplay();
        });
        $checkbox.on('change', function () {
            updateDisplay();
        });

        // Actions
        function updateDisplay() {
            var isChecked = $checkbox.is(':checked');

            // Set the button's state
            $button.data('state', (isChecked) ? "on" : "off");

            // Set the button's icon
            $button.find('.state-icon')
                .removeClass()
                .addClass('state-icon ' + settings[$button.data('state')].icon);

            // Update the button's color
            if (isChecked) {
                $button
                    .removeClass('btn-default')
                    .addClass('btn-' + color + ' active');
            }
            else {
                $button
                    .removeClass('btn-' + color + ' active')
                    .addClass('btn-default');
            }
        }

        // Initialization
        function init() {

            updateDisplay();

            // Inject the icon if applicable
            if ($button.find('.state-icon').length == 0) {
                $button.prepend('<i class="state-icon ' + settings[$button.data('state')].icon + '"></i> ');
            }
        }
        init();
    });
});
</script>
	
	<!--	<footer id="colorlib-footer" role="contentinfo">
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
							Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0.
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart2" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0.</span> 
							<span class="block">Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a> , <a href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div> -->

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
<!-- 	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script> -->
<!-- 	<script src="resources/rentcar/js/google_map.js"></script> -->

	<!-- Main -->
	<script src="resources/rentcar/js/main.js"></script>
</div></div></div>
 <div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2" aria-hidden="true"><!-- 모달 -->
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">비밀번호 변경</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
		  <form action="mypages/memberCheckPwd.do" method="POST" name="fpwd">
          <div class="modal-body">
          	<div class="form-group">
            <div class="form-row">
              <div class="col-md-10">
                <label for="exampleInputName"><a style="color:red">*</a>비밀번호</label>
                <input style="width:100%;height:40px" id="member_pwd" name="member_pwd" value="" type="password" aria-describedby="nameHelp" placeholder="">             
              </br></br>
                <label for="exampleInputLastName"><a style="color:red">*</a>비밀번호 확인</label>
                <input style="width:100%;height:40px" id="member_pwd1" name="member_pwd1" value="" type="password" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div> 
          </div>          
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
<!--             <a class="btn btn-primary" href="./CheckPwd.do" method="POST" onclick="hiddensubmit()" name="hiddenValue" id="hiddenValue">수정</a> -->
            <input type="button" class="btn btn-primary" value="수정" onclick="change()"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
          </div>
		  </form>
        </div>
      </div>
    </div>

	</body>
</html>

