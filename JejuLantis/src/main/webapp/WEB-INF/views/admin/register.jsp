
<%@ page session="true" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
  <meta charset="utf-8">
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
  <script src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
    <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
 --><!--     <style> -->
<!-- /*         body { padding-top: 30px; } */ -->
<!--     </style> -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>
									
<script type="text/javascript">

//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
var idck = 0;
$(document).ready(function() {
	//emailck 버튼을 클릭했을 때 
 $("#emailck").click(function() {
 	var email2 = document.f.manager_email.value;
	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;			
	var emailck = 0;
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
            url : "emailcheckmanager.do",
            dataType : "json",
            contentType: "application/json; charset=UTF-8",
            success : function(data) {
                if (data.cnt > 0) {
                    
                    alert("email가 존재합니다. 다른 email를 입력해주세요.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-error")
                    $("#divInputId").removeClass("has-success")
                    $("#manager_id").focus();				                
                } else {
                    alert("사용가능한 email입니다.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#manager_tel1").focus();
                    //아이디가 중복하지 않으면  idck = 1 
                    idck = 1;								                    
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
                    $("#manager_pwd").focus();
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

function sendIt() {
	var email2 = document.f.manager_email.value;
	var tel2 = document.f.manager_tel1.value;
	var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;								         
	var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/; 
	var regPhone = /(01[0|1|6|9|7])[-](\d{3}|\d{4})[-](\d{4}$)/;
	var hp = '01012345678';
	hp = hp.replace(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/,"$1-$2-$3");
	if(confirm("회원가입을 하시겠습니까?")){
		if(idck==0){
			alert('아이디 중복체크를 해주세요');
			document.f.manager_id.focus()
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
		if (document.f.manager_email.value == "") {
			alert("이메일을 입력하지 않았습니다.")
			document.f.manager_email.focus()
			return false;
		}									        								 
		if (regex.test(email2) === false) {
			alert("잘못된 이메일 형식입니다.");
			document.f.manager_email.value=""
			document.f.manager_email.focus()
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
	    if (document.f.birth2.value == "") {
		    alert(" 월 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
	  	}  
	    if (document.f.birth3.value == "") {
		    alert(" 일 을 입력하지 않았습니다.")
		    document.f.lname.focus()
		    return false;
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
	    alert("회원가입을 축하합니다");
		document.f.submit();
	}
}
</script>



</head>
<script type="text/javascript">
    function branchOpen() {
        alert("test post open");
        win_post = window.open('./post', "post",
				"toolbar=no ,width=450 ,height=400 ,directories=yes,"
						+ "status=yes,scrollbars=yes,menubar=yes");
<%--         var win_post = window.open('<%=request.getContextPath()%>/admin/register/post',  --%>
//         		"post", "toolbar=no ,width=370 ,height=300 ,directories=no," + "status=yes,scrollbars=yes,menubar=no");
    }
</script>

<!-- window.open('/', 'testWindow', 'width=300, height=300, scrollbars=yes'); -->





<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">관리자가입</div>
      <div class="card-body">
        <form name="f" action="./resist.do" method="post">												
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>ID</label>
                <input type="button" value="중복확인" name="confirm_id"
									id="idck" onclick="confirmId(this.form)"></td>
                <input class="form-control" id="manager_id" name="manager_id" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>이메일</label>
                <input type="button" value="중복확인2" name="confirm_email"
									id="emailck"></td>
                <input class="form-control" id="manager_email" name="manager_email" type="text" aria-describedby="nameHelp" placeholder="">
              </div>                
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName"><a style="color:red">*</a>비밀번호</label>
                <input class="form-control" id="manager_pwd1" name="manager_pwd1" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName"><a style="color:red">*</a>비밀번호 확인</label>
                <input class="form-control" id="manager_pwd2" name="manager_pwd2" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1"><a style="color:red">*</a>이름</label>
                <input class="form-control" id="manager_name" name="manager_name" type="text" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword"><a style="color:red">*</a>생년월일</label>
                </br>
                <script language="Javascript">							
								
									var today = new Date();
									var toyear = parseInt(today.getFullYear());
									var start = toyear - 5
									var end = toyear - 70;
									
									document.write("<font size=4><style=font><select name=birth1 id=birth1>");
									document.write("<option value='' selected>");
									for (i=start;i>=end;i--) document.write("<option>"+i);
									document.write("</select>&nbsp;년  "); 
									
									document.write("<select name=birth2 id=birth2>");
									document.write("<option value='' selected>");
									for (i=1;i<=12;i++) document.write("<option>"+i);
									document.write("</select>&nbsp;&nbsp;월  ");
									
									document.write("<select name=birth3 id=birth3>");
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
<%-- //                     </c:forEach> --%>
<!-- //                     ]; -->
<!-- //         }); -->
<!--     </script> -->

			
			
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>핸드폰번호</label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">핸드폰번호2</label>
                <input class="form-control" id="exampleInputLastName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
            <div class="form-row">
            </div>	
            </br>
            
            	<div class="col-md-6">
            	<label for="exampleInputName"><a style="color:red">*</a>업체명</label>
            	<input type="button" value="업체명검색" onclick="branchOpen()">
              	<input type="hidden" id="branch_no" name="branch_no" >                		                
                <input class="form-control"  id="branch_name" value="${branch_name}" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              </br>
          <input type="submit" class="btn btn-primary btn-block" value="등록하기" onclick="sendIt()">
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.do">로그인</a>
          <a class="d-block small" href="forgot-password.do">고객센터 1577-0704</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="../resources/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
