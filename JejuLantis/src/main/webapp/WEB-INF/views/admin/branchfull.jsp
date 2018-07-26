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
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="./top/top2.jspf" %>
	<script>
	function goDel (v){
		if (confirm("정말 탈퇴하시겠습니까??"+v) == true){    //확인
			location.href="branchWithdraw.do?branch_no=" +v;
		}else{   //취소
		    return;
		}
	}
	</script>
  
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">업체관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>업체관리</div>
        <div class="card-body">
          <div class="table-responsive">
          <!-- <form name="f" action="branchModify.do" method="post"> -->
          	<input type="hidden" name="branch_today" id="branch_today"/>
          	<c:forEach items="${subject}" var="subject">
            <table border="0" width="100%"  cellpadding="0" cellspacing="0">
				<h3 style="color:#007bff">업체정보</h3>
				<tr style="color:#808080;font-size:12pt">
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체코드</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_no}</a>
					</th>		
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체명</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_name}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체전화번호</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_tel}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체팩스</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_fax}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체주소</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_local}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체평점</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_rating}</a>
					</th>
				
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">사업자번호</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_business_no}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">대표자명</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_boss}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">계좌번호</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_bankaccount}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">담당자명</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_member_name}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">담당자전화번호1</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_member_tel}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">담당자전화번호2</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_member_tel2}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">업체로고</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_logo}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">담당자이메일</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_email}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">셔틀소요시간</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_bustime}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">당일예약가능여부</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_today}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">셔틀탑승장소</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_busspot}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">당일예약가능시간</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_todaytime}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">셔틀간격</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_busgap}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">수수료율</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_comfee}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">탈퇴여부</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_withdraw_at}</a>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">등록날짜</th>
					<th  width="35%" class="text-left">
						<a>${subject.branch_resist}</a>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">일반규정</th>
					<th  width="35%" class="text-left" colspan="3">
						<a>${subject.branch_rule}</a>
					</th>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<td align="center"></td>
					<td align="right">
					</td>
					<td align="center"></td>
					<td align="right">
						<button type="button" class="btn btn-primary"><a href="enter.do" style="color:white">목록</a></button>
						<button type="button" class="btn btn-primary"><a style="color:white" href="branchSubject.do?branch_no=${subject.branch_no}">수정</a></button>
						<button type="button" class="btn btn-primary">
						<a style="color:white" href="javascript:goDel(${subject.branch_no});">업체탈퇴</a></button>
					</td>
				</tr>
			</table>
			</c:forEach>
			<!-- </form> -->
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
