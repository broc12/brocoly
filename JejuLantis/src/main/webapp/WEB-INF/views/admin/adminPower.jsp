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
  <!-- Page level plugin CSS-->
  <link href="../resources/admin/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="../resources/admin/css/sb-admin.css" rel="stylesheet">
  <!-- Bootstrap core JavaScript-->
  <script src="../resources/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
  <!-- Page level plugin JavaScript-->
  <script src="../resources/admin/vendor/datatables/jquery.dataTables.js"></script>
  <script src="../resources/admin/vendor/datatables/dataTables.bootstrap4.js"></script>
  <!-- Custom scripts for all pages-->
  <script src="../resources/admin/js/sb-admin.min.js"></script>
  <!-- Custom scripts for this page-->
  <script src="../resources/admin/js/sb-admin-datatables.min.js"></script>
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="./top/top2.jspf" %>
  <!-- Navigation-->
<script>
$(document).ready(function(){
    //최상단 체크박스 클릭
    $("#checkall").click(function(){
        //클릭되었으면
        if($("#checkall").prop("checked")){
            //input태그의 name이 chk인 태그들을 찾아서 checked옵션을 true로 정의
            $("input[name=bestseller]").prop("checked",true);
            $("input[name=md]").prop("checked",true);
            $("input[name=charts]").prop("checked",true);
            $("input[name=reserv]").prop("checked",true);
            $("input[name=ars]").prop("checked",true);
            $("input[name=tables]").prop("checked",true);
            $("input[name=list]").prop("checked",true);
            $("input[name=service]").prop("checked",true);
            $("input[name=member]").prop("checked",true);
            $("input[name=admin]").prop("checked",true);
            $("input[name=adminpower]").prop("checked",true);
            $("input[name=enter]").prop("checked",true);
            $("input[name=carlist]").prop("checked",true);
            $("input[name=carDetail]").prop("checked",true);
            $("input[name=carInfo]").prop("checked",true);
            $("input[name=pay]").prop("checked",true);
            $("input[name=payment]").prop("checked",true);
            $("input[name=banner]").prop("checked",true);
            $("input[name=coupon]").prop("checked",true);
            $("input[name=sms]").prop("checked",true);
            $("input[name=ins]").prop("checked",true);
            //클릭이 안되있으면
        }else{
            //input태그의 name이 chk인 태그들을 찾아서 checked옵션을 false로 정의
            $("input[name=bestseller]").prop("checked",false);
            $("input[name=md]").prop("checked",false);
            $("input[name=charts]").prop("checked",false);
            $("input[name=reserv]").prop("checked",false);
            $("input[name=ars]").prop("checked",false);
            $("input[name=tables]").prop("checked",false);
            $("input[name=list]").prop("checked",false);
            $("input[name=service]").prop("checked",false);
            $("input[name=member]").prop("checked",false);
            $("input[name=admin]").prop("checked",false);
            $("input[name=adminpower]").prop("checked",false);
            $("input[name=enter]").prop("checked",false);
            $("input[name=carlist]").prop("checked",false);
            $("input[name=carDetail]").prop("checked",false);
            $("input[name=carInfo]").prop("checked",false);
            $("input[name=pay]").prop("checked",false);
            $("input[name=payment]").prop("checked",false);
            $("input[name=banner]").prop("checked",false);
            $("input[name=coupon]").prop("checked",false);
            $("input[name=sms]").prop("checked",false);
            $("input[name=ins]").prop("checked",false);
        }
    })
})
</script>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">관리자관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <i class="fa fa-fw fa-user" style="color:#007bff"></i><span>관리자권한관리</span><hr>
       <table border="1" width="100%">
	       <tr>
		     <td width="40%" align="center">
		     	<b>아이디</b>
		     </td>
		     <td>
		     	<input type="text" style="width:50%"/>
		     	<button class="btn btn-default" type="button">
                  <i class="fa fa-search"></i>
                </button>
		     </td>
	       </tr>
	       <tr>
	       	<td width="40%" align="center"><b>관리자 이름</b></td>
	       	<td><input type="text"style="width:50%"/></td>
	       </tr>
	       <tr>
	       	<td width="40%" align="center"><b>메뉴 권한</b></td>
	       	<td>
	       		<input type="checkbox" id="checkall"/><span>전체선택</span></br>
	       		<input type="checkbox" name="bestseller"/><span>베스트셀러관리</span></br>
	       		<input type="checkbox" name="md"/><span>MD추천관리</span></br>
	       		<input type="checkbox" name="charts"/><span>그래프</span></br>
	       		<input type="checkbox" name="reserv"/><span>예약현황</span></br>
	       		<input type="checkbox" name="ars"/><span>ARS예약현황</span></br>
	       		<input type="checkbox" name="tables"/><span>여행상담관리</span></br>
	       		<input type="checkbox" name="list"/><span>이용후기관리</span></br>
	       		<input type="checkbox" name="service"/><span>공지관리</span></br>
	       		<input type="checkbox" name="member"/><span>회원관리</span></br>
	       		<input type="checkbox" name="admin"/><span>관리자관리</span></br>
	       		<input type="checkbox" name="adminpower"/><span>관리자권한관리</span></br>
	       		<input type="checkbox" name="enter"/><span>업체관리</span></br>
	       		<input type="checkbox" name="carlist"/><span>차종관리</span></br>
	       		<input type="checkbox" name="carDetail"/><span>차종상세관리</span></br>
	       		<input type="checkbox" name="carInfo"/><span>차량관리</span></br>
	       		<input type="checkbox" name="pay"/><span>결제현황</span></br>
	       		<input type="checkbox" name="payment"/><span>매출현황관리</span></br>
	       		<input type="checkbox" name="banner"/><span>배너관리</span></br>
	       		<input type="checkbox" name="coupon"/><span>쿠폰관리</span></br>
	       		<input type="checkbox" name="sms"/><span>SMS관리</span></br>
	       		<input type="checkbox" name="ins"/><span>보험관리</span></br>
	       	</td>
	       </tr>
	       <tr>
	       	<td colspan="2" align="right"><input type="button" value="완료" class="btn btn-primary" style="width:150px;"/></td>
	       </tr>
       </table>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Your Website 2018</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.do">Logout</a>
          </div>
        </div>
      </div>
    </div>
    
  </div>
</body>

</html>
