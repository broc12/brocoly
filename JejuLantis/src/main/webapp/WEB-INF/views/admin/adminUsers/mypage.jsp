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
 <script type="text/javascript">
 function sendIt() {  
	 var hp3 =$("#manager_tel3 option:selected").val()
	 var hp4 =$("#managerr_tel4").val()
	 var hp5 =$("#manager_tel5").val()
// 	 alert(hp2)
	$("#manager_tel1").val(hp3+"-"+hp4+"-"+hp5)
	 var hp6 =$("#manager_tel4 option:selected").val()
	 var hp7 =$("#managerr_tel5").val()
	 var hp8 =$("#manager_tel6").val()
	 //alert(hp2)
	$("#manager_tel2").val(hp6+"-"+hp7+"-"+hp8)
	 var birth1 =$("#manager_birth1 option:selected").val()
	 var birth2 =$("#manager_birth2 option:selected").val()
	 var birth3 =$("#manager_birth3 option:selected").val()
	$("#manager_birth").val(birth1+"-"+birth2+"-"+birth3)
		document.f.submit();
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
        <form name="f" action="managermypage.do"  method="post">												
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>ID</label></br>      
                <input style="width:70%;height:40px" onkeydown="inputIdChk()" readonly id="manager_id" name="manager_id" value="${nn.manager_id}" type="text" aria-describedby="nameHelp" placeholder="">
              <!-- 	<input type="button" value="중복확인" name="confirm_id"
									id="idck" onclick="confirmId(this.form)" class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt"> -->
<!--               						<input type="hidden" id="idCheck" name="idDuplication" value="idUncheck"> -->
              </div>
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>이메일</label></br>
                <input style="width:70%;height:40px" onkeydown="inputEmailChk()" value="${nn.manager_email}" id="manager_email" name="manager_email" type="text" aria-describedby="nameHelp" placeholder="">
              	<input type="button" value="중복확인" name="confirm_email"
									id="emailck"  class="btn btn-primary" style="width:80px;height:40px;margin-top:-5px;font-size:10pt"></td>    
<!-- 									<input type="hidden"  id="emailCheck" name="emailDuplication" value="emailUncheck" >          	 -->
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
                <select id="manager_tel4" name="manager_tel4" style="width:28%;height:40px">
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
                <input style="width:81%;height:40px" readonly id="branch_name" name="branch_name" type="text" aria-describedby="nameHelp" placeholder="">
                <input type="button" id="branchck" value="업체명검색"  onclick="sendIt()" class="btn btn-primary" style="width:100px;height:40px;font-size:10pt;margin-top:-5px;">   
            </div>
            </div>
          </div>
              </br>
          <input type="button" class="btn btn-primary btn-block" value="등록하기" >
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
