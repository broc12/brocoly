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
    <script src="../resources/ck/ckeditor/ckeditor.js"></script>
    <!-- 체크박스-->
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

	
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="../top/top2.jspf" %>
  <!-- Navigation-->
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
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>관리자 세부내용</div>
        <div class="card-body">
        <div class="table-responsive">
        	<c:forEach items="${adminContentSelect}" var="adminContentSelect" varStatus="status">
		    	<table border="0" width="100%"  cellpadding="0" cellspacing="0">
					<tr style="color:#808080;font-size:12pt">			
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">매니저일련번호</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_no}
						</th>
					</tr>
					<tr style="color:#808080;font-size:12pt">	
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">지점일련번호</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.branch_no}
						</th>
					</tr>
					<tr style="color:#808080;font-size:12pt">
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">지점명</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.branch_name}
						</th>
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">아이디</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_id}
						</th>
					</tr>
					<tr style="color:#808080;font-size:12pt">			
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">이메일</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_email}
						</th>
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">생년월일</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_birth}
						</th>
					</tr>
					<tr style="color:#808080;font-size:12pt">			
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">전화번호</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_tel1}
						</th>
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">등록날짜</th>
						<th  width="35%" class="text-left">
							${adminContentSelect.manager_resist_member}
						</th>
					</tr>
				    <tr style="color:#808080;font-size:12pt">			
						<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">권한</th>
						<th  width="35%" class="text-left">
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck1" disabled="disabled" <c:if test="${adminContentSelect.manager_main eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck1">메인</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck2" disabled="disabled" <c:if test="${adminContentSelect.manager_chart eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck2">차트</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck3" disabled="disabled" <c:if test="${adminContentSelect.manager_reservstatus eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck3">예약현황</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck4" disabled="disabled" <c:if test="${adminContentSelect.manager_travelmanagement eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck4">여행상담관리</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck5" disabled="disabled" <c:if test="${adminContentSelect.manager_review eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck5">이용후기관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck6" disabled="disabled" <c:if test="${adminContentSelect.manager_notice eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck6">공지관리</label>
						  	</div>					  	
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck7" disabled="disabled" <c:if test="${adminContentSelect.manager_user eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck7">회원관리</label>
						  	</div>	
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck1" disabled="disabled" <c:if test="${adminContentSelect.manager_manager eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck8">관리자관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck2" disabled="disabled" <c:if test="${adminContentSelect.manager_company eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck9">업체관리</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck3" disabled="disabled" <c:if test="${adminContentSelect.manager_carkind eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck10">차종관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck4" disabled="disabled" <c:if test="${adminContentSelect.manager_d_carkind eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck11">차종상세관리</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck5" disabled="disabled" <c:if test="${adminContentSelect.manager_carinfo eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck12">차량관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck6" disabled="disabled" <c:if test="${adminContentSelect.manager_paystatus eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck13">결제현황</label>
						  	</div>					  	
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck7" disabled="disabled" <c:if test="${adminContentSelect.manager_salestatus eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck14">매출현황관리</label>
						  	</div>	
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck2" disabled="disabled" <c:if test="${adminContentSelect.manager_banner eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck15">배너관리</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck3" disabled="disabled" <c:if test="${adminContentSelect.manager_coupon eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck16">쿠폰관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck4" disabled="disabled" <c:if test="${adminContentSelect.manager_sms eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck17">SMS관리</label>
						  	</div>
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck5" disabled="disabled" <c:if test="${adminContentSelect.manager_email_at eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck18">이메일관리</label>
						  	</div>
						  	<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck6" disabled="disabled" <c:if test="${adminContentSelect.manager_insurance eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck19">보험관리</label>
						  	</div>					  	
							<div class="custom-control custom-checkbox">
						   		<input type="checkbox" class="custom-control-input" id="customCheck7" disabled="disabled" <c:if test="${adminContentSelect.manager_affiliate eq 'Y' }">checked</c:if>>
						   		<label class="custom-control-label" for="customCheck20">제휴관리</label>
						  	</div>	
						</th>
					</tr>
					<tr style="font-size:10pt" height="60px">
						<td align="center"></td>
						<td align="right">
							<button type="button" class="btn btn-primary"><a href="admin.do?manager_id=${managerlog.manager_id}" style="color:white">목록</a></button>
						</td>
					</tr>
				</table>
			</c:forEach>
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

  </div>
</body>

</html>
