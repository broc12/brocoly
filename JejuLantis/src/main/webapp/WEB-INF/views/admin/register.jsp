<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">관리자가입</div>
      <div class="card-body">
        <form>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">아이디</label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">성명</label>
                <input class="form-control" id="exampleInputLastName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">이메일</label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">가입코드</label>
                <input class="form-control" id="exampleInputLastName" type="text" aria-describedby="nameHelp" placeholder="">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">비밀번호</label>
                <input class="form-control" id="exampleInputPassword1" type="password" placeholder="">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword">비밀번호확인</label>
                <input class="form-control" id="exampleConfirmPassword" type="password" placeholder="">
              </div>
            </div>
          </div>
          <a class="btn btn-primary btn-block" href="login.do">등록하기</a>
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
