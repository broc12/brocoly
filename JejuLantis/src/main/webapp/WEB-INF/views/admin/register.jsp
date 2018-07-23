
<%@ page session="true" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">관리자가입</div>
      <div class="card-body">
        <form action="resist.do" method="post">												
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">             		
                <label for="exampleInputName"><a style="color:red">*</a>이메일</label>
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
       <div class="container" ng-app="bookApp" ng-controller="bookController">
        <div class="row">
            <div class="col-md-4">
                Search By:
                <select class="form-control" ng-model='SearchTerm'>
                    <option value='$'>전체</option>
                    <option value='id'>업체명</option>
                    <option value='title'>업체주소</option>
                    <option value='author'>업체번호</option>
                    
                </select>
            </div>
            
            <div style="text-align:left" class="col-md-8">
            
             
                Search Key:
                <input type="text" class="form-control" ng-model="searchKeyword[SearchTerm]">
            </div>
        </div>
        <br />
        <div class="row">
            <div class="col-md-12">
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <td>업체명</td>
                            <td>업체주소</td>
                            <td>업체번호</td>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="book in bookList | filter: searchKeyword">
                            <td>{{ book.id }}</td>
                            <td>{{ book.title }}</td>
                            <td>{{ book.author }}</td>
                            
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <script>
        var bookApp = angular.module("bookApp", []);
        
        bookApp.controller('bookController', function ($scope) {
            $scope.searchKeyword = {}
            $scope.SearchTerm = '$';
            $scope.bookList = [
            	<c:forEach var="i" begin="1" end="7">
                    { "id": "${i}", "title": "${i}", "author": "${i}"},
                    </c:forEach>
                    ];
        });
    </script>



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
          <input type="submit" class="btn btn-primary btn-block" value="등록하기">
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
