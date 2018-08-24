<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
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
  <script type="text/javascript">
var token = $("meta[name='_csrf']").attr("content");
var header = $("meta[name='_csrf_header']").attr("content");
 
$(function() {
    $(document).ajaxSend(function(e, xhr, options) {
        xhr.setRequestHeader(header, token);
    });
});
</script>
<script type="text/javascript"> 
		function doLogin() {
			if(frm.manager_id.value == "") {
				alert("아이디를 입력해주세요.");
				return;
			}
			if(frm.manager_pwd.value == "") {
				alert("패스워드를 입력해주세요.");
				return;
			}
			
			frm.submit();
		}
		
	</script>	
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
        <form name="frm" action="./j_spring_security_check" method="post">
          <div class="form-group">
            <label for="exampleInputEmail1">아이디</label>
            	<input type="text" id="fname" name="manager_id"	class="form-control" placeholder="아이디">
<!--             <input class="form-control" id="exampleInputEmail1" type="email" aria-describedby="emailHelp" placeholder=""> -->
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">비밀번호</label>
            	<input type="password" id="fname" name="manager_pwd" class="form-control" placeholder="비밀번호">
<!--             <input class="form-control" id="exampleInputPassword1" type="password" placeholder=""> -->
          </div>
          	   <input type="submit" class="btn btn-primary btn-block" value="로그인" onclick="doLogin()"/>
          	   <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
          	  

<!--           <a class="btn btn-primary btn-block" href="index.do">Login</a> -->
        </form>
        <div class="text-center">
        <a href="./managerfind_id_form.do">아이디찾기</a> ｜ <a href="./managerfind_pwd_form.do">비밀번호찾기</a>
          <a class="d-block small mt-3" href="./register.do">회원가입</a>
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
