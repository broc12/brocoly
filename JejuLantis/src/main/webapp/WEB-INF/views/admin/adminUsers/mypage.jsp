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
             url : "emailcheckmanager.do",
             dataType : "json",
             contentType: "application/json; charset=UTF-8",
             success : function(data) {
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
                     $("#manager_email").focus();
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
	 if(confirm("회원가입을 하시겠습니까?")){
	 var hp3 =$("#manager_tel3 option:selected").val()
	 var hp4 =$("#manager_tel4").val()
	 var hp5 =$("#manager_tel5").val()
// 	 alert(hp2)
	$("#manager_tel1").val(hp3+"-"+hp4+"-"+hp5)
	 var hp6 =$("#manager_tel6 option:selected").val()
	 var hp7 =$("#manager_tel7").val()
	 var hp8 =$("#manager_tel8").val()
	 //alert(hp2)
	$("#manager_tel2").val(hp6+"-"+hp7+"-"+hp8)
	 var birth1 =$("#manager_birth1 option:selected").val()
	 var birth2 =$("#manager_birth2 option:selected").val()
	 var birth3 =$("#manager_birth3 option:selected").val()
	$("#manager_birth").val(birth1+"-"+birth2+"-"+birth3)
		alert("수정완료 ")
	document.f.submit();
// 	 	alert("수정완료 ")
	 	}	
 }
    </script> 
</head>
<script type="text/javascript">
    function branchOpen() {
        alert("test post open");
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
      <div class="card-header">MYPAGE</div>
      <div class="card-body">
        <form name="f" action="./managermodify.do"  method="post">												
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>ID</label></br>      
                <input style="width:70%;height:40px" onkeydown="inputIdChk()" readonly id="manager_id" name="manager_id"  value="${managerlog.manager_id}" type="text" aria-describedby="nameHelp" placeholder="">
              <!-- 	<input type="button" value="중복확인" name="confirm_id"
									id="idck" onclick="confirmId(this.form)" class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt"> -->
<!--               						<input type="hidden" id="idCheck" name="idDuplication" value="idUncheck"> -->
              </div>
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>이메일</label></br>
                <input style="width:70%;height:40px" onkeydown="inputEmailChk()" value="${nn.manager_email}" id="manager_email" name="manager_email" type="text" aria-describedby="nameHelp" placeholder="">
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
                <input style="width:100%;height:40px" id="manager_pwd" name="manager_pwd" value="${nn.manager_pwd}" type="password" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName"><a style="color:red">*</a>비밀번호 확인</label>
                <input style="width:100%;height:40px" id="manager_pwd1" name="manager_pwd1" value="${nn.manager_pwd}" type="password" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1"><a style="color:red">*</a>이름</label>
                <input style="width:100%;height:40px" readonly id="manager_name" name="manager_name" value="${nn.manager_name}" type="text" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword"><a style="color:red">*</a>생년월일</label>
                </br>
                <script language="Javascript">
                var birth1 =${nn.manager_birth1}
				var birth2 =${nn.manager_birth2}
				var birth3 =${nn.manager_birth3}
				var member_birth= birth1+birth2+birth3;
				var today = new Date();
				var toyear =  today.getFullYear();
				var start = toyear - 5
				var end = toyear - 70;
				
				document.write("<select name=manager_birth1 id=manager_birth1 onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;' style=width:23%;height:40px>");
				document.write("<option value="+birth1+" selected>"+birth1);
				for (i=start;i>=end;i--) document.write("<option>"+i);
				document.write("</select>&nbsp;년  "); 
				
				document.write("<select name=manager_birth2 id=manager_birth2  onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;'style=width:25%;height:40px>");
				document.write("<option value="+birth2+" selected>"+birth2);
				for (i=1;i<=12;i++) document.write("<option>"+i);
				document.write("</select>&nbsp;&nbsp;월  ");
				
				document.write("<select name=manager_birth3 id=manager_birth3  onFocus='this.initialSelect = this.selectedIndex;' onChange='this.selectedIndex = this.initaialSelect;'style=width:25%;height:40px>");
				document.write("<option value="+birth3+" selected>"+birth3);
				for (i=1;i<=31;i++) document.write("<option>"+i); 
				document.write("</select>&nbsp;&nbsp;일   </font>");
				</script>
				<input type="hidden" readonly id="manager_birth" name="manager_birth" >
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
                <select id="manager_tel3" name="manager_tel3" style="width:28%;height:40px">
				    <option value="010"  selected> 010 </option>
				   <option value="${nn.manager_tel3}"  selected> ${nn.manager_tel3} </option>
				   <option value="011"> 011 </option>
				   <option value="016"> 016 </option>
				   <option value="017"> 017 </option>
				   <option value="018"> 018 </option>
				   <option value="019"> 019 </option>
				</select>
				-
				<input type="text" id="manager_tel4" name="manager_tel4" value="${nn.manager_tel4}"size="2" maxlength="4" style="width:30%;height:40px">
				-
				<input type="text" id="manager_tel5" name="manager_tel5" size="2"value="${nn.manager_tel5}" maxlength="4" style="width:30%;height:40px">
					<input type="hidden" id="manager_tel1" name="manager_tel1" >
				
              </div>
              
              <div class="col-md-6">             		
                <label for="exampleInputName">연락처2</label></br>
                <select id="manager_tel6" name="manager_tel6" style="width:28%;height:40px">
				   <option value="010"  selected> 010 </option>
				   <option value="${nn.manager_tel6}"   selected>${nn.manager_tel6} </option>
				   <option value="011"> 011 </option>
				   <option value="016"> 016 </option>
				   <option value="017"> 017 </option>
				   <option value="018"> 018 </option>
				   <option value="019"> 019 </option>
				</select>
				-
				<input type="text" id="manager_tel7" name="manager_tel7" size="2" value="${nn.manager_tel7}"maxlength="4" style="width:30%;height:40px">
				-
				<input type="text" id="manager_tel8" name="manager_tel8" size="2" maxlength="4" value="${nn.manager_tel8}"style="width:30%;height:40px">
					<!-- <script type="text/javascript">
					var target = document.getElementById("manager_tel2");
						target.options[target.selectedIndex].text
					</script> -->
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
                <input style="width:81%;height:40px" readonly id="branch_name" name="branch_name" value="${nn.branch_name}" type="text" aria-describedby="nameHelp" placeholder="">
<!--                 <input type="button" id="branchck" value="업체명검색"  onclick="sendIt()" class="btn btn-primary" style="width:100px;height:40px;font-size:10pt;margin-top:-5px;">    -->
            </div>
            </div>
          </div>
              </br>
          <input type="submit" class="btn btn-primary btn-block" value="수정완료" onclick="sendIt()" >
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.do">로그인</a>
          <a class="d-block small" href="forgot-password.do">고객센터 1577-0704</a>
        </div>
      </div>
    </div>
  </div>
  
</body>

</html>
