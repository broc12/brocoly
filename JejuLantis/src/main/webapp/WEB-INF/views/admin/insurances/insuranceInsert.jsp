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
		if(f.branch_no.value ==""){
            alert("지점코드를 채워주세요");
            f.branch_no.focus();
            return;
         }
		if(f.car_kind_no.value ==""){
            alert("차종상세코드를 채워주세요");
            f.car_kind_no.focus();
            return;
         }
		if(f.insurance_name.value ==""){
            alert("보험명을 채워주세요");
            f.insurance_name.focus();
            return;
         }
		if(f.insurance_price.value ==""){
            alert("보험료를 채워주세요");
            f.insurance_price.focus();
            return;
         }
		if(f.insurance_limit.value ==""){
            alert("보상한도를 채워주세요");
            f.insurance_limit.focus();
            return;
         }
		if(f.insurance_burden_price.value ==""){
            alert("자가부담을 채워주세요");
            f.insurance_burden_price.focus();
            return;
         }
		if(f.insurance_limit_age.value ==""){
            alert("규정나이를 채워주세요");
            f.insurance_limit_age.focus();
            return;
         }
		if(f.insurance_limit_carrier.value ==""){
            alert("규정경력을 채워주세요");
            f.insurance_limit_carrier.focus();
            return;
         }
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
        <li class="breadcrumb-item active">보험관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>보험등록</div>
        <div class="card-body">
          <div class="table-responsive">
          	<form name="f" action="insuranceInsertOk.do" method="post">
				<input type="hidden" name="manager_id" value="${managerlog.manager_id}"/> 
            		<table border="0" width="100%"  cellpadding="0" cellspacing="0">
						<tr style="color:#808080;font-size:12pt">
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>지점코드</th>
							<th  width="35%" class="text-left">
								<c:forEach items="${branchNoSelect}" var="branchNoSelect" varStatus="status">	
									<input name="branch_no" type="text" size="30" value="${branchNoSelect.branch_no}" class="form-control" style="width:250px" readonly>
								</c:forEach>
							</th>
						</tr>
						<tr style="color:#808080;font-size:12pt">	
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종상세코드</th>
							<th  width="35%" class="text-left">
								<select name="car_kind_no" id="car_kind_no" class="form-control" style="width:250px">
									<option value="" style="color:black">차종상세코드</option>
									<c:forEach items="${carKindSelectBox}" var="carKindSelectBox" varStatus="status">
										<option value="${carKindSelectBox.car_kind_no}" style="color:black">${carKindSelectBox.car_kind_no}</option>
									</c:forEach>
                       			</select>
							</th>
						</tr>
						<tr style="color:#808080;font-size:12pt">	
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종코드</th>
							<th  width="35%" class="text-left">
								<select name="insurance_name" id="insurance_name" class="form-control" style="width:250px">
									<option value="" style="color:black">보험명</option>
										<option value="일반자차" style="color:black">일반자차</option>
										<option value="완전자차" style="color:black">완전자차</option>
										<option value="완전자차(무제한)" style="color:black">완전자차(무제한)</option>
                       			</select>
							</th>
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>보험료</th>
							<th  width="35%" class="text-left">
								<input name="insurance_price" type="text" size="30" class="form-control" style="width:250px">
							</th>
						</tr>	
						<tr style="color:#808080;font-size:12pt">
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>보상한도</th>
							<th  width="35%" class="text-left">
								<input name="insurance_limit" type="text" size="30" class="form-control" style="width:250px">
							</th>
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>자가부담</th>
							<th  width="35%" class="text-left">
								<input name="insurance_burden_price" type="text" size="30" class="form-control" style="width:250px">
							</th>
						</tr>
						<tr style="color:#808080;font-size:12pt">
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>규정나이</th>
							<th  width="35%" class="text-left">
								<input name="insurance_limit_age" type="text" size="30" class="form-control" style="width:250px">
							</th>
							<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>규정경력</th>
							<th  width="35%" class="text-left">
								<input name="insurance_limit_carrier" type="text" size="30" class="form-control" style="width:250px">
							</th>
						</tr>
						<tr style="font-size:10pt" height="60px">
							<td align="center"></td>
							<td align="right">
								<button type="button" class="btn btn-primary"><a href="insuranceInsertOk.do?manager_id=${managerlog.manager_id}" style="color:white">목록</a></button>
								<button type="button" class="btn btn-primary" onclick="check()">완료</button>
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
