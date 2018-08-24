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
  <title>SB Admin</title>
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
<%@ include file="../top/top2.jspf" %>
<script>
function replysubmit(){
	document.h.submit();
}

</script>

  <!-- Navigation-->

  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">여행상담관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>여행상담</div>
        <div class="card-body">
          <div class="table-responsive">
            <table border="0" width="100%"  cellpadding="0" cellspacing="0">	
				<tr>			
					<th height="100px" width="10%" style="background-color: #fafafa">
					<a style="color:black;font-size:14pt">${qna.qna_title}</a></br>
					<a style="color:#808090;font-size:8pt">${qna.qna_name}</a><a style="color:#808090;font-size:8pt">|</a><a style="color:#808090;font-size:8pt">${qna.qna_resist}</a>
					</th>
				</tr>
				<tr style="font-size:10pt" height="150px">
					<td>${qna.qna_content}</td>
				</tr>
				<form action="qnaReply.do" method="POST" name="h">
					<tr style="font-size:10pt" height="60px">
						<td>
							<hr>
							<a style="color:#007bff;font-size:14pt">답변달기</a></br>
								<textarea rows="8" cols="110" id = "contents" name="contents"></textarea></br>
							<!-- <button type="submit" class="btn btn-primary" style="border-radius: 0px"> -->
								<input type="hidden" name ="qna_group" value="${qna.qna_group}"/>
								<input type="hidden" name ="qna_name" value="${qna.qna_name}"/>
								<input type="hidden" name ="qna_pwd" value="${qna.qna_pwd}"/>
								<input type="hidden" name ="manager_no" value="${managerlog.manager_no}"/>
							<a href="#" onclick="replysubmit()" style="color:white" class="btn btn-primary">등록</a>
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> 
							<!-- <button class="btn btn-primary" style="border-radius: 0px"> -->
							<a href="del.do?qna_no=${qna.qna_no}"  class="btn btn-primary" style="color:white">삭제</a>
						</td>
					</tr>
				</form>
				<tr style="font-size:10pt" height="60px">
					<td align="right">
						<button type="submit" class="btn btn-primary" style="border-radius: 0px">
							<a href="tables.do" style="color:white">목록</a>
						</button>
					</td>
				</tr>
			</table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
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
