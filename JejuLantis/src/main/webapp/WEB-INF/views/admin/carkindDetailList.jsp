<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
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
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="./top/top2.jspf" %>
  <!-- Navigation-->

  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">차종상세관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>차종상세목록</div>
        <div class="card-body">
        <button type="button" class="btn btn-primary btn-xs" align="right"><a href="carDetailWrite.do?manager_id=${managerlog.manager_id}" style="color:white">차종상세등록</a></button></br></br>
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" style="font-size:8pt">
              <thead>
                <tr>
                  <th width="5%">지점일련번호</th>
                  <th width="5%">보험일련번호</th>
                  <th width="5%">차일련번호</th>
                  <th width="5%">대여횟수</th>
                  <th width="5%">주중가</th>
                  <th width="5%">주말가</th>
                  <th width="5%">관리</th>               
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${carDetailList}" var="carDetailList" varStatus="status">
                <tr>
					<td>${carDetailList.branch_no}</td>
					<td>${carDetailList.insurance_no}</td>
					<td>${carDetailList.car_no}</td>
					<td>${carDetailList.car_kind_count}</td>
					<td>${carDetailList.car_kind_price_week}</td>
					<td>${carDetailList.car_kind_price_weekend}</td>
                	<td>
                    <button type="button" class="btn btn-defalut btn-sm"><a href="carDetailContent.do?car_kind_no=${carDetailList.car_kind_no}">세부내용</a></button>
                  	<button type="button" class="btn btn-defalut btn-sm"><a href="carDetailUpdate.do?car_kind_no=${carDetailList.car_kind_no}">수정</a></button>
                  	<button type="button" class="btn btn-defalut btn-sm"><a href="carDetailDel.do?car_kind_no=${carDetailList.car_kind_no}">삭제</a></button>
                	</td>                  
                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
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
  </div>
</body>

</html>
