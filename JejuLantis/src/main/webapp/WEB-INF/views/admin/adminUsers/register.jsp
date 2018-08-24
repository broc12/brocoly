<%@ page session="true" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<%--   <meta id="_csrf" name="_csrf" content="${_csrf.token}"/> --%>
<%--   <meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/> --%>
<%--   <meta id="_csrf_parameter" name="_csrf_parameter" content="${_csrf.parameterName}"/> --%>
  	<meta charset="utf-8">
	<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
  	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="../resources/admin/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../resources/admin/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="../resources/admin/css/sb-admin.css" rel="stylesheet">
<%--   <script src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script> --%>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
    <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
 --><!--     <style> -->
<!-- /*         body { padding-top: 30px; } */ -->
<!--     </style> -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>
<!-- Bootstrap core JavaScript-->
  <script src="../resources/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


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
 	var email2 = document.f.manager_email.value;
	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;			

    	 if (f.manager_email.value == "") {
	            alert("email를 입력하지 않았습니다.")
	            f.manager_email.focus()
	            return false;
	        }
    		 if (regex.test(email2) === false) {
				alert("잘못된 이메일 형식입니다.");
				document.f.manager_email.value=""
				document.f.manager_email.focus()
				return false;
			
	        }
	        //email에 공백 사용하지 않기
	        if (document.f.manager_email.value.indexOf(" ") >= 0) {
	            alert("email에 공백을 사용할 수 없습니다.")
	            document.f.manager_email.focus()      
	            return false;
	        }
	        
        //userid 를 param.
        var useremail =  $("#manager_email").val(); 								        
        $.ajax({
            async: true,
            type : 'POST',
            data : useremail,
            url : '../emailcheckmanager.do',
            dataType: 'json',
            contentType: "application/json; charset=UTF-8",
            success : function(data) {
            	console.log(data.cnt)
            	
                if (data.cnt > 0) {
                    
                    alert("email가 존재합니다. 다른 email를 입력해주세요.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-error")
                    $("#divInputId").removeClass("has-success")
                    $("#manager_email").focus();				                
                } else {
                    alert("사용가능한 email입니다.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#manager_pwd").focus();
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
         var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
// 		var csrfHeader = $("meta[name='_csrf_header']").attr("content");
 		var _token = $("meta[name='_csrf']").attr("content");
//         var manager_email = {};
//         var csrfToken = manager_email[csrfParameter];
//         manager_email["name"] = "John";
// 		var headers = {};
// 		headers[csrfHeader] = _token; // 아까 alert으로 띄웠던 키값이 뭐에요? 그게 이거요
// 		_token = 
		$.ajax({
            async: true,
            type : 'POST',
            data :  userid,
            dataType : 'json',
            contentType: 'application/json; charset=utf-8',
            url : '../idcheckmanager.do',
            success : function(data) {
            	console.log(data.cnt)
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
//                     $("#manager_email").focus();
                    $("#manager_email").focus();
                    $("#idCheck").val("idCheck");
                    //아이디가 중복하지 않으면  idck = 1 
                    idck = 1;								                    
                } 
            },
            error : function(error) {								                
                console.log(error);
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
	var email2 = document.f.manager_email.value;
// 	var tel2 = document.f.manager_tel1.value;
	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;								         
	var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/; 
	var regPhone = /(01[0|1|6|9|7])[-](\d{3}|\d{4})[-](\d{4}$)/;
	var hp = '01012345678';
	hp = hp.replace(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/,"$1-$2-$3");
	var today = new Date(); // 날자 변수 선언
    var yearNow = today.getFullYear();
    var adultYear = yearNow-20;
//     var year = Number(document.f.bitrh1.value);
// 	var month = Number(document.f.bitrh2.value);
//     var day = Number(document.f.bitrh3.value);

	if(confirm("회원가입을 하시겠습니까?")){
		if(document.f.idDuplication.value != "idCheck"){
			alert('아이디 중복체크를 해주세요');
			document.f.manager_id.focus()
			return false;
		}
		if(document.f.emailDuplication.value != "emailCheck"){
			alert('이메일 중복체크를 해주세요');
			document.f.manager_email.focus()
			return false;
		}
//비밀번호 입력여부 체크
		if (document.f.manager_pwd.value == "") {
			alert("비밀번호를 입력하지 않았습니다.")
			document.f.manager_pwd.focus()
			return false;
		}
		if (document.f.manager_pwd.value == document.f.manager_id.value) {
			alert("아이디와 비밀번호가 같습니다.")
			document.f.manager_pwd.focus()
			return false;
		}
	//비밀번호 길이 체크(4~8자 까지 허용)
		if (document.f.manager_pwd.value.length<4 || document.f.manager_pwd.value.length>12) {
			alert("비밀번호를 4~12자까지 입력해주세요.")
			document.f.manager_pwd.focus()
			document.f.manager_pwd.select()
			return false;
		}									 
//비밀번호와 비밀번호 확인 일치여부 체크
		if (document.f.manager_pwd.value != document.f.manager_pwd1.value) {
			alert("비밀번호가 일치하지 않습니다")
			document.f.manager_pwd.value = ""
			document.f.manager_pwd1.focus()
			return false;
		}									 
		if (document.f.manager_name.value == "") {
			alert("이름을 입력하지 않았습니다.")
			document.f.manager_name.focus()
			return false;
		}
		if(document.f.manager_name.value.length<2){
			alert("이름을 2자 이상 입력해주십시오.")
			document.f.manager_name.focus()
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
 		/*핸드폰 번호 길이 체크*/
// 		if(hp5.value.length<=2 || hp6.value.length!=4){
// 			alert("휴대폰번호를 제대로 입력해주세요");
// 			focus.hp2;
// 			return false;
// 		}
	
//  		/*핸드폰이 숫자만 들어가는지 체크*/
//  		if(isNaN(hp5.value) || isNaN(hp6.value))
// 		{
// 			alert("휴대폰번호는 숫자만 들어갈 수 있습니다.");
// 			return false;
// 		}
 		
 		
 		 if (hp5.value == "" && hp6.value == "") {
		       
		}else if(hp5.value.length<=2 || hp6.value.length!=4){
			alert("휴대폰번호를 제대로 입력해주세요");
			focus.hp2;
			return false;
		}else if(isNaN(hp5.value) || isNaN(hp6.value))
		{
			alert("휴대폰번호는 숫자만 들어갈 수 있습니다.");
			return false;
		}
 		if(branchck ==0){
			alert('업체명을 입력해주세요');
			document.f.branch_no.focus()
			return false;
		}
 		 
	    alert("회원가입을 축하합니다");
		document.f.submit();
	}
}
</script>
</head>
<script type="text/javascript">
    function branchOpen() {
        
        win_post = window.open('./adminUsers/post', "post",
				"toolbar=no ,width=450 ,height=400 ,directories=yes,"
						+ "status=yes,scrollbars=yes,menubar=yes");
<%--         var win_post = window.open('<%=request.getContextPath()%>/admin/register/post',  --%>
//         		"post", "toolbar=no ,width=370 ,height=300 ,directories=no," + "status=yes,scrollbars=yes,menubar=no");
			branchck =1;
    }
</script>

<!-- window.open('/', 'testWindow', 'width=300, height=300, scrollbars=yes'); -->





<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">관리자가입</div>
      <div class="card-body">
        <form name="f" action="manager.do"  method="post">												
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">           
                <label for="exampleInputName"><a style="color:red">*</a>ID</label></br>      
                <input style="width:70%;height:40px" onkeydown="inputIdChk()"  id="manager_id" name="manager_id" type="text" aria-describedby="nameHelp" placeholder="">
              	<input type="button" value="중복확인" name="confirm_id"
									id="idck"  class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt">
              						<input type="hidden" id="idCheck" name="idDuplication" value="idUncheck">
              </div>
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>이메일</label></br>
                <input style="width:70%;height:40px" onkeydown="inputEmailChk()" id="manager_email" name="manager_email" type="text" aria-describedby="nameHelp" placeholder="">
              	<input type="button" value="중복확인" name="confirm_email"
									id="emailck"  class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt"></td>    
									<input type="hidden"  id="emailCheck" name="emailDuplication" value="emailUncheck" >          	
              </div>                
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName"><a style="color:red">*</a>비밀번호</label>
                <input style="width:100%;height:40px" id="manager_pwd" name="manager_pwd" type="password" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName"><a style="color:red">*</a>비밀번호 확인</label>
                <input style="width:100%;height:40px" id="manager_pwd1" name="manager_pwd1" type="password" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1"><a style="color:red">*</a>이름</label>
                <input style="width:100%;height:40px" id="manager_name" name="manager_name" type="text" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword"><a style="color:red">*</a>생년월일</label>
                </br>
                <script language="Javascript">							
								
				var today = new Date();
				var toyear =  today.getFullYear();
				var start = toyear - 5
				var end = toyear - 70;
				
				document.write("<select name=birth1 id=birth1 style=width:23%;height:40px>");
				document.write("<option value='' selected>");
				for (i=start;i>=end;i--) document.write("<option>"+i);
				document.write("</select>&nbsp;년  "); 
				
				document.write("<select name=birth2 id=birth2  style=width:25%;height:40px>");
				document.write("<option value='' selected>");
				for (i=1;i<=12;i++) document.write("<option>"+i);
				document.write("</select>&nbsp;&nbsp;월  ");
				
				document.write("<select name=birth3 id=birth3  style=width:25%;height:40px>");
				document.write("<option value='' selected>");
				for (i=1;i<=31;i++) document.write("<option>"+i); 
				document.write("</select>&nbsp;&nbsp;일   </font>");
				
				var birth1 = $("#birth1").val();
				var birth2 = $("#birth2").val();
				var birth3 = $("#birth3").val();
				var manager_birth = birth1+birth2+birth3;
				$("#manager_birth").val(manager_birth);
				
				</script>
				<input type="hidden" id="manager_birth" name="manager_birth" >
              </div>
            </div>
          </div>  
<!--        <div class="container" ng-app="bookApp" ng-controller="bookController"> -->
<!--         <div class="row"> -->
<!--             <div class="col-md-4"> -->
<!--                 Search By: -->
<!--                 <select class="form-control" ng-model='SearchTerm'> -->
<!--                     <option value='$'>전체</option> -->
<!--                     <option value='id'>업체명</option> -->
<!--                     <option value='title'>업체주소</option> -->
<!--                     <option value='author'>업체번호</option> -->
                    
<!--                 </select> -->
<!--             </div> -->
            
<!--             <div style="text-align:left" class="col-md-8"> -->
            
             
<!--                 Search Key: -->
<!--                 <input type="text" class="form-control" ng-model="searchKeyword[SearchTerm]"> -->
<!--             </div> -->
<!--         </div> -->
<!--         <br /> -->
<!--         <div class="row"> -->
<!--             <div class="col-md-12"> -->
<!--                 <table class="table table-bordered table-striped"> -->
<!--                     <thead> -->
<!--                         <tr> -->
<!--                             <td>업체명</td> -->
<!--                             <td>업체주소</td> -->
<!--                             <td>업체번호</td> -->
                            
<!--                         </tr> -->
<!--                     </thead> -->
<!--                     <tbody> -->
<!--                         <tr ng-repeat="book in bookList | filter: searchKeyword"> -->
<!--                             <td>{{ book.id }}</td> -->
<!--                             <td>{{ book.title }}</td> -->
<!--                             <td>{{ book.author }}</td> -->
                            
<!--                         </tr> -->
<!--                     </tbody> -->
<!--                 </table> -->
<!--             </div> -->
<!--         </div> -->
<!--     </div> -->

<!--     <script> -->
<!-- //         var bookApp = angular.module("bookApp", []); -->
        
<!-- //         bookApp.controller('bookController', function ($scope) { -->
<!-- //             $scope.searchKeyword = {} -->
<!-- //             $scope.SearchTerm = '$'; -->
<!-- //             $scope.bookList = [ -->
<%-- //             	<c:forEach var="i" begin="1" end="7"> --%>
<%-- //                     { "id": "${i}", "title": "${i}", "author": "${i}"}, --%>
<%-- //                     </c:forEach>  --%>
<!-- //                     ]; -->
<!-- //         }); -->
<!--     </script> -->
     
            <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>연락처1</label></br>
                <select id="hp1" name="hp1" style="width:28%;height:40px">
				   <option value="010"  selected> 010 </option>
				   <option value="011"> 011 </option>
				   <option value="016"> 016 </option>
				   <option value="017"> 017 </option>
				   <option value="018"> 018 </option>
				   <option value="019"> 019 </option>
				</select>
				-
				<input type="text" id="hp2" name="hp2" size="2" maxlength="4" style="width:30%;height:40px">
				-
				<input type="text" id="hp3" name="hp3" size="2" maxlength="4" style="width:30%;height:40px">
					<script type="text/javascript">
					var target = document.getElementById("manager_tel1");
					target.options[target.selectedIndex].text
					</script>
				<input type="hidden" id="manager_tel1" name="manager_tel1" >
              </div>
              
              <div class="col-md-6">             		
                <label for="exampleInputName">연락처2</label></br>
                <select id="hp4" name="hp4" style="width:28%;height:40px">
				   <option value="010"  selected> 010 </option>
				   <option value="011"> 011 </option>
				   <option value="016"> 016 </option>
				   <option value="017"> 017 </option>
				   <option value="018"> 018 </option>
				   <option value="019"> 019 </option>
				</select>
				-
				<input type="text" id="hp5" name="hp5" size="2" maxlength="4" style="width:30%;height:40px">
				-
				<input type="text" id="hp6" name="hp6" size="2" maxlength="4" style="width:30%;height:40px">
<!-- 					<script type="text/javascript"> -->
<!-- // 					var target = document.getElementById("manager_tel2"); -->
<!-- // 						target.options[target.selectedIndex].text -->
<!-- 					</script> -->
				<input type="hidden" id="manager_tel2" name="manager_tel2" >
              </div>                
            </div>
          </div>
            
           	<!-- <div class="col-md-6">
           	<label for="exampleInputName"><a style="color:red">*</a>업체명</label>
           	<input type="button" value="업체명검색" onclick="branchOpen()" class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt">
             	<input type="hidden" id="branch_no" name="branch_noSTR" >                		                
               <input style="width:100%;height:40px" id="branch_name" name="branch_name" type="text" aria-describedby="nameHelp" placeholder="">
             </div> -->
           <div class="form-group">
            <div class="form-row">
            <div class="col-md-12">
                <label for="exampleInputName"><a style="color:red">*</a>업체명</label></br>
                <input type="hidden" id="branch_no" name="branch_noSTR">
                <input style="width:81%;height:40px" readonly  id="branch_name" name="branch_name" type="text" aria-describedby="nameHelp" placeholder="">
                <input type="button" id="branchck" value="업체명검색" onclick="branchOpen()" class="btn btn-primary" style="width:100px;height:40px;font-size:10pt;margin-top:-5px;">   
            	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </div>
            </div>
          </div>
              </br>
          <input type="button" class="btn btn-primary btn-block" value="등록하기" onclick="sendIt()">
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.do">로그인</a>
          <a class="d-block small" href="forgot-password.do">고객센터 1577-0704</a>
        </div>
      </div>
    </div>
  </div>
  
</body>