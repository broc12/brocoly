<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
  <meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>s
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Tour Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
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
<link rel="stylesheet"
	href="resources/rentcar/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet"
	href="resources/rentcar/fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" href="resources/rentcar/css/style.css">

<!-- Modernizr JS -->
<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
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
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>							

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript">
//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
var idck = 0;
var emailck = 0;
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
	var emailck = 0;
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
        $.ajax({
            async: true,
            type : 'POST',
            data : useremail,
            url : "emailcheck.do",
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
    	 if (f.member_id.value == "") {
	            alert("아이디를 입력하지 않았습니다.")
	            f.member_id.focus()
	            return false;
	        }
	        //아이디 유효성 검사 (영문소문자, 숫자만 허용)
	        for (i = 0; i < document.f.member_id.value.length; i++) {
	            ch = document.f.member_id.value.charAt(i)
	            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')&&!(ch >= 'A' && ch <= 'Z')) {
	                alert("아이디는 대소문자, 숫자만 입력가능합니다.")
	                document.f.member_id.focus()
	                document.f.member_id.select()
	                return false;
	            }
	        }
	        //아이디에 공백 사용하지 않기
	        if (document.f.member_id.value.indexOf(" ") >= 0) {
	            alert("아이디에 공백을 사용할 수 없습니다.")
	            document.f.member_id.focus()
	            document.f.member_id.select()
	            return false;
	        }
	        //아이디 길이 체크 (4~12자)
	        if (document.f.member_id.value.length<4 || document.f.member_id.value.length>12) {
	            alert("아이디를 4~12자까지 입력해주세요.")
	            document.f.member_id.focus()
	            document.f.member_id.select()
	            return false;
	        }
        //userid 를 param.
        var userid =  $("#member_id").val(); 								        
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
                    $("#member_id").focus();				                
                } else {
                    alert("사용가능한 아이디입니다.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#member_pwd").focus();
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

function sendIt() {
	
	var year = Number(document.f.birth1.value);
	var month = Number(document.f.birth2.value);
    var day = Number(document.f.birth3.value);
	var email2 = document.f.member_email.value;
	var tel2 = document.f.member_tel.value;
	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;								         
	var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/; 
	var regPhone = /(01[0|1|6|9|7])[-](\d{3}|\d{4})[-](\d{4}$)/;
	var hp = '01012345678';
	hp = hp.replace(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/,"$1-$2-$3");
	var today = new Date(); // 날자 변수 선언
    var yearNow = today.getFullYear();
    var adultYear = yearNow-20;
	if(confirm("회원가입을 하시겠습니까?")){
		if(document.f.idDuplication.value != "idCheck"){
			alert('아이디 중복체크를 해주세요');
			document.f.member_id.focus()
			return false;
		}
		if(document.f.emailDuplication.value != "emailCheck"){
			alert('이메일 중복체크를 해주세요');
			document.f.member_email.focus()
			return false;
		}
//비밀번호 입력여부 체크
		if (document.f.member_pwd.value == "") {
			alert("비밀번호를 입력하지 않았습니다.")
			document.f.member_pwd.focus()
			return false;
		}
		if (document.f.member_pwd.value == document.f.member_id.value) {
			alert("아이디와 비밀번호가 같습니다.")
			document.f.member_pwd.focus()
			return false;
		}
	//비밀번호 길이 체크(4~8자 까지 허용)
		if (document.f.member_pwd.value.length<4 || document.f.member_pwd.value.length>12) {
			alert("비밀번호를 4~12자까지 입력해주세요.")
			document.f.member_pwd.focus()
			document.f.member_pwd.select()
			return false;
		}									 
//비밀번호와 비밀번호 확인 일치여부 체크
		if (document.f.member_pwd.value != document.f.member_pwd1.value) {
			alert("비밀번호가 일치하지 않습니다")
			document.f.member_pwd.value = ""
			document.f.member_pwd1.focus()
			return false;
		}									 
		if (document.f.member_email.value == "") {
			alert("이메일을 입력하지 않았습니다.")
			document.f.member_email.focus()
			return false;
		}									        								 
		if (regex.test(email2) === false) {
			alert("잘못된 이메일 형식입니다.");
			document.f.member_email.value=""
			document.f.member_email.focus()
			return false;
		}
		if (document.f.member_name.value == "") {
			alert("이름을 입력하지 않았습니다.")
			document.f.member_name.focus()
			return false;
		}
		if(document.f.member_name.value.length<2){
			alert("이름을 2자 이상 입력해주십시오.")
			document.f.member_name.focus()
		    return false;
	    }
	    if (document.f.birth1.value == "") {
		    alert(" 년 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
		} 
	    if (year < 1900 || year > adultYear){
	          alert("년도를 확인하세요. "+adultYear+"년생 이전 출생자만 등록 가능합니다.");
	          return false;
	     }
	    if (document.f.birth2.value == "") {
		    alert(" 월 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
	  	}  
	    if ((month==4 || month==6 || month==9 || month==11) && day==31) {
	          alert(month+"월은 31일이 존재하지 않습니다.");
	          return false;
	     }
	    if (document.f.birth3.value == "") {
		    alert(" 일 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
	  	}
	    if (month == 2) {
	          var isleap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	          if (day>29 || (day==29 && !isleap)) {
	               alert(year + "년 2월은  " + day + "일이 없습니다.");
	               return false;
	          }
	     }
	    
	    if (document.f.people.value == "pp") {
		    alert(" 지역 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
	  	}
	    /*핸드폰 번호 길이 체크*/
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

	    
// 		if ( !regExp.test( $(#tel).val() ) ) {		
// 	    	  alert("잘못된 휴대폰 번호입니다. 숫자, - 를 포함한 숫자만 입력하세요.");
// 		      return false		
// 		}
//		if(document.f.tel.value == ""){
//		alert("휴대폰번호를 제대로 입력해주세요");
//		focus.tel;
//	 	return false;
// 				if(!regPhone.test(phonenum)){

//   alert('잘못된 휴대폰 번호입니다.');

//   $('#phone').focus();

//   return false;    

// if (document.f.my_num.value == "") {
//             alert("주민번호를 입력하지 않았습니다.")
//             document.f.my_num.focus()
//             return false;
//         }
//         if (document.f.my_num.value.length<13||document.f.my_num.value.length>13) {
//             alert("주민번호 길이가 맞지 않습니다.")
//             document.f.my_num.value = ""
//             document.f.my_num.focus()
//             return false;
//         }

//  }
							    
//		/*핸드폰이 숫자만 들어가는지 체크*/
//		if(isNaN(document.f.tel.value))
//		{
//	 	alert("잘못된 휴대폰 번호입니다. 숫자, - 를 포함한 숫자만 입력하세요.");
//		return false;
//		}
	    alert("회원가입을 축하합니다");
	    alert("신규 가입 축하 쿠폰이 발급되었습니다.");
		document.f.submit();
	}
}
//	if(document.f.tel.value == ""){
//	alert("휴대폰번호를 제대로 입력해주세요");
//	focus.tel;
// 	return false;
										    
//	/*핸드폰이 숫자만 들어가는지 체크*/
//	if(isNaN(document.f.tel.value))
//	{
// 	alert("잘못된 휴대폰 번호입니다. 숫자, - 를 포함한 숫자만 입력하세요.");
//	return false;
//	}
//	/**/
								 		
//	if (document.f.tel.length==11 || document.f.tel.length==10){
//	document.getElementById("tel").value = tel;
//	document.f.submit()	 
</script>

</head>
<body>
	<%@ include file="../top/top.jspf"%>
	<div class="colorlib-loader"></div>

	<div id="page">
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(resources/rentcar/images/cover-img-3.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
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
						<form name="f" action="member/memberjoin" method="post">
							<!-- onsubmit="return sendIt();" -->
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">아이디</label></br>
									<input type="text" name="member_id" onkeydown="inputIdChk()" id="member_id" style="width:75%;height:50px"/>
									<input type="button" value="중복확인" style="border-radius:0px;background-color:#eea236;color:white" class="btn btn-dark" name="confirm_id" id="idck" onclick="confirmId(this.form)">		
									<input type="hidden" id="idCheck" name="idDuplication" value="idUncheck">
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">비밀번호</label> <input type="password" id="member_pwd"
										name="member_pwd" style="width:100%;height:50px" placeholder="PASSWORD">
								</div>
								<div class="col-md-6">
									<label for="lname">비밀번호확인</label> <input type="password"
										id="member_pwd1" name="member_pwd1" style="width:100%;height:50px" placeholder="">
								</div>
							</div>

							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">이름</label> <input type="text" id="member_name"
										name="member_name" style="width:100%;height:50px" placeholder="NAME">
								</div>
								<div class="col-md-6">
									<label for="lname" id="lname">생년월일</label></br>
								<script language="Javascript">							
								
									var today = new Date();
									var toyear = parseInt(today.getFullYear());
									var start = toyear - 5
									var end = toyear - 70;
									
									document.write("<font size=2><select name=birth1 id=birth1 style=width:29%;height:50px>");
									document.write("<option value='' selected>");
									for (i=start;i>=end;i--) document.write("<option>"+i);
									document.write("</select>년  "); 
									
									document.write("<select name=birth2 id=birth2 style=width:30%;height:50px>");
									document.write("<option value='' selected>");
									for (i=1;i<=12;i++) document.write("<option>"+i);
									document.write("</select>월  ");
									
									document.write("<select name=birth3 id=birth3 style=width:30%;height:50px>");
									document.write("<option value='' selected>");
									for (i=1;i<=31;i++) document.write("<option>"+i); 
									document.write("</select>일   </font>");
									
									var birth1 = $("#birth1").val();
									var birth2 = $("#birth2").val();
									var birth3 = $("#birth3").val();
									var manager_birth = birth1+birth2+birth3;
									$("#member_birth").val(manager_birth);
									
									</script>
									<input type="hidden" id="member_birth" name="member_birth" >
								</div>
							</div>
							<div class="row form-group">
								<div class="col-md-12">
									<label for="subject">거주지</label> <select name="member_local"
										id="people" style="width:100%;height:50px">
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
<!-- 	<tr> -->
<!-- 	<td>아이디</td> -->
<!-- 	<td><input type="text" name="id" id="id" /> <input type="button" value="중복확인" name="confirm_id" -->
<!-- 	id="idck" onclick="confirmId(this.form)"></td> -->
<!-- 	</tr> -->
							<div class="row form-group">
								<div class="col-md-6 padding-bottom">
									<label for="fname">이메일</label></br>
									<input type="text" name="member_email" onkeydown="inputEmailChk()" id="member_email" style="width:75%;height:50px"/>
									<input type="button" value="중복확인" style="border-radius:0px;background-color:#eea236;color:white" class="btn btn-dark" name="confirm_email" id="emailck">		
									<input type="hidden"  id="emailCheck" name="emailDuplication" value="emailUncheck" >  
								</div>
								<div class="col-md-6">
									<label for="lname">연락처</label></br>
									<select id="hp1" name="hp1" style=width:29%;height:50px>
									   <option value="010"  selected> 010 </option>
									   <option value="011"> 011 </option>
									   <option value="016"> 016 </option>
									   <option value="017"> 017 </option>
									   <option value="018"> 018 </option>
									   <option value="019"> 019 </option>
									</select>
									-
									<input type="text" id="hp2" name="hp2" size="2" maxlength="4" style=width:29%;height:50px>
									-
									<input type="text" id="hp3" name="hp3" size="2" maxlength="4" style=width:29%;height:50px>
									
									<script type="text/javascript">
										var target = document.getElementById("member_tel");
										target.options[target.selectedIndex].text
									</script>
									<input type="hidden" id="member_tel" name="member_tel" >
								</div>
							</div>
<!-- onclick="confirmEmail(this.form) -->
<!-- <label for="subject">번호</label> <input type="text" name="tel" -->
<!-- id="tel" placeholder="phone number" maxlength="13" /> -->
						</div>
					</div>
<!-- <input type="text" id="subject" name= "tel" class="form-control" placeholder="ex)01086308690"/> -->
				</div>
			</div>

			<!-- <form method="post" class="colorlib-form-2"> -->
			<div class="form-check text-center">
				<span class="button-checkbox">
			        <button type="button" class="btn" data-color="warning">SMS수신(이벤트)</button>
			        <input type="checkbox" class="hidden" id="exampleCheck1" name="member_sms_at" value="Y"/>
			    </span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    <span class="button-checkbox">
			        <button type="button" class="btn" data-color="warning">이메일 수신(이벤트)</button>
			        <input type="checkbox" class="hidden" id="exampleCheck2" name="member_email_at" value="Y"/>
			    </span>
			</div></br>
			<!-- </form> -->
			<div class="form-group text-center">
			<input type="button" value="가입하기" style="width:200px;height:50px;border-radius:0px;background-color:#eea236;color:white" class="btn btn-dark" onclick="sendIt()">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
			</div>
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
				</form>
					</div>
					<div class="col-md-10 col-md-offset-1 animate-box">
						<h3>Contact Information</h3>
						<div class="row contact-info-wrap">
							<div class="col-md-3">
								<p>
									<span><i class="icon-location"></i></span> 198 West 21th
									Street, <br> Suite 721 New York NY 10016
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-phone3"></i></span> <a
										href="tel://1234567920">+ 1235 2355 98</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-paperplane"></i></span> <a
										href="mailto:info@yoursite.com">info@yoursite.com</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-globe"></i></span> <a href="#">yoursite.com</a>
								</p>
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
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
							mollitia reprehenderit. Eos cumque dicta adipisci architecto
							culpa amet.</p>
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
							<li><a href="#">The Ultimate Packing List For Female
									Travelers</a></li>
							<li><a href="#">How These 5 People Found The Path to
									Their Dream Trip</a></li>
							<li><a href="#">A Definitive Guide to the Best Dining
									and Drinking Venues in the City</a></li>
						</ul>
					</div>

					<div class="col-md-3 col-md-push-1">
						<h4>Contact Information</h4>
						<ul class="colorlib-footer-links">
							<li>291 South 21th Street, <br> Suite 721 New York NY
								10016
							</li>
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
							Copyright &copy;
							<script>document.write(new Date().getFullYear());</script>
							All rights reserved | This template is made with <i
								class="icon-heart2" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</span> <span class="block">Demo Images: <a
								href="http://unsplash.co/" target="_blank">Unsplash</a> , <a
								href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>

	<!-- Modernizr JS -->
	<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
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
	<!-- FOR IE9 below -->
	<!-- [if lt IE 9] -->
	<script src="resources/rentcar/js/respond.min.js"></script>

</body>
</html>

