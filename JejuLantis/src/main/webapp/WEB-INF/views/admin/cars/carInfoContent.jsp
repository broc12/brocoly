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
	<script>
	function check(){
		/* if(f.branch_no.value ==""){
            alert("지점코드를 채워주세요");
            f.branch_no.focus();
            return;
         }
		if(f.branch_no.value ==""){
            alert("지점코드를 채워주세요");
            f.branch_no.focus();
            return;
         }
		if(f.car_no.value ==""){
            alert("차종코드를 채워주세요");
            f.car_no.focus();
            return;
         }
		if(f.car_kind_price_week.value ==""){
            alert("주중가를 채워주세요");
            f.car_kind_price_week.focus();
            return;
         }
		if(f.car_kind_price_weekend.value ==""){
            alert("주말가를 채워주세요");
            f.car_kind_price_weekend.focus();
            return;
         }
		if(f.car_kind_price_holiday.value ==""){
            alert("성수기가를 채워주세요");
            f.car_kind_price_holiday.focus();
            return;
         }
		if(f.car_kind_price_h_holiday.value ==""){
            alert("극성수기가를 채워주세요");
            f.car_kind_price_h_holiday.focus();
            return;
         } */
		
		var isChecked = "";
    	if($("input:checkbox[id='customCheck1']").is(":checked")){	// 쳬크 되어있으면
    		isChecked = "Y"
    	} else {
    		isChecked = "N"
    	}
    	jQuery("#car_info_rent_at").val(isChecked);
    	document.f.submit();
	}
	</script>
	
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
          <i class="fa fa-table"></i>차종상세관리</div>
        <div class="card-body">
          <div class="table-responsive">
          	<form name="f" action="carInfoUpdate.do" method="post">
          		<input type="hidden" name="car_info_rent_at" id="car_info_rent_at"/>
          		<input type="hidden" name="car_info_no" id="car_info_no" value="${carInfo.car_info_no}"/>
	            		<table border="0" width="100%"  cellpadding="0" cellspacing="0">
							<h3 style="color:#007bff">차종상세등록</h3>	
							<tr style="color:#808080;font-size:12pt">			
								<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차량이름</th>
								<th  width="35%" class="text-left">
									<input name="car_name" type="text" size="30" value="${car_name}" class="form-control" style="width:250px"readonly>
								</th>
							</tr>
							<tr style="color:#808080;font-size:12pt">			
								<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차량번호</th>
								<th  width="35%" class="text-left">
									<input name="car_info_back_no" type="text" size="30" value="${carInfo.car_info_back_no}" class="form-control" style="width:250px"readonly>
								</th>
							</tr>
							<tr style="color:#808080;font-size:12pt">			
								<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차량상태</th>
								<th  width="35%" class="text-left">
									<input name="car_info_state" type="text" size="30" value="${carInfo.car_info_state}" class="form-control" style="width:250px">
								</th>
								<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a></th>
								<th  width="35%" class="text-left">
								</th>
							</tr>
						    <tr style="color:#808080;font-size:12pt">			
								<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">대여가능여부</th>
								<th  width="35%" class="text-left">
									<div class="custom-control custom-checkbox">
								   		<input type="checkbox" class="custom-control-input" id="customCheck1" <c:if test="${carInfo.car_info_rent_at eq 'Y' }">checked</c:if>>
								   		<label class="custom-control-label" for="customCheck1">가능 </label>
								  	</div>
								</th>
							</tr>
							<tr style="font-size:10pt" height="60px">
								<td align="center"></td>
								<td align="right">
									<button type="button" class="btn btn-primary"><a href="carDetail.do?manager_id=${managerlog.manager_id}" style="color:white">목록</a></button>
									<button type="button" class="btn btn-primary" onclick="check()">수정</button>
								</td>
							</tr>
						</table>
				</form>
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
