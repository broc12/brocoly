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
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.min.js">
  </script>
  <script>
  $(document).ready(function(){
	  $("#checkall").click(function(){
// 			alert("hi");
				//클릭되었어요
				if($("#checkall").prop("checked")){
					$("input[type='checkbox']").prop("checked",true);
				}else{
					$("input[type='checkbox']").prop("checked",false);
				}
		})
  })
  </script>
  <script>
//   var length=0;
//   var length_select=0;
//   var list = [];
// 	function smsAjax(){
// 		alert("성공");	
// 		$.ajax({
// 			url : "smsAjax.do",
// 			type : "get",
// 			success : function(responseData){
// 				length=responseData.length;
// 				console.log(responseData);
// // 				alert(responseData.length);
// 				$("#smsAjaxSub").empty();
// 				var html = "";
// 				html += "<table border='1' width='50%' cellpadding='1' id='smsAjaxSub2'>";
// 				html += "<tr>";
// 				html += "<th>멤버코드</th>";
// 				html += "<th>이름</th>";
// 				html += "<th>이메일</th>";
// 				html += "<th>선택</th>";
// 				html += "</tr>";
// // 				alert("성공1");
// 				if(responseData.length != 0){
// 					for (var i=0; i<responseData.length; i++){
// 						html += "<tr>";
// 						html += "<td align='center'>"+responseData[i].member_no+"</td>";
// 						html += "<td align='center'>"+responseData[i].member_name+"</td>";
// 						html += "<td align='center'>"+responseData[i].member_email+"</td>";
// 						html += "<td align='center'><input type='checkbox' 'id="+responseData[i].member_no+" name='smsEmail' value="+responseData[i].member_email+"></td>";
// 						html += "</tr>";
// // 						list.push(responseData[i].member_email);
// 					}
// // 					alert("성공1");
// 				}else{
// 					html += "<tr>";
// 					html += "<td colspan='4' align='center'>조회된 결과가 없습니다.</td>";
// 	                html += "</tr>";
// 				}
// 				html += "</table>";
// // 				alert("성공1");
// 				$("#smsAjaxResult").append(html);
// 			}
// 		})
// 	}
 	function check(){
// // 		var html = "";
// // 		var isChecked = "";
// // 		var list_select = [];
// // 		$("#smsEmailResult").empty();
// // 		for(var i=1;i<=length;i++){		  
// // 			if($("input:checkbox[id="+i+"]").is(":checked")){
// // 				list_select.push(list[i]);
// // 			}
// // 	  	}
// // 	  	for(var i=1;i<=length_select;i++){
// // 			html += "<input type='hidden' name='smsEmail' value="+list_select[i]+"/>";
// // 	  	}
// // 	  	$("#smsEmailResult").append(html);
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
        <li class="breadcrumb-item active">이메일관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>이메일관리</div>
	        <div class="card-body">
	          <div class="table-responsive">
	          	<form name="f" action="mailSenderOk.do" method="post">
<!-- 					<div align="center">받는 사람 이메일 -->
<!-- 						<input type="button" value="눌러주세요" onclick="smsAjax()"/> -->
							<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" style="font-size:8pt">
				              <thead>
				                <tr>
				                  <th width="5%">멤버일련번호</th>
				                  <th width="5%">이름</th>
				                  <th width="5%">이메일</th>
				                  <th width="5%">전체선택&nbsp;<input type='checkbox' id='checkall' name='checkall'/></th>             
				                </tr>
				              </thead>
				              <tbody>
				              <c:forEach items="${emailSenderList}" var="emailSenderList" varStatus="status">
				                <tr>
									<td>${emailSenderList.member_no}</td>
									<td>${emailSenderList.member_name}</td>
									<td>${emailSenderList.member_email}</td>
				                	<td align='center'>
<%-- 				                    <button type="button" class="btn btn-defalut btn-sm"><a href="insuranceContent.do?insurance_no=${insuranceList.insurance_no}">세부내용</a></button> --%>
<%-- 				                  	<button type="button" class="btn btn-defalut btn-sm"><a href="insuranceUpdate.do?insurance_no=${insuranceList.insurance_no}&manager_id=${managerlog.manager_id}">수정</a></button> --%>
<%-- 				                  	<button type="button" class="btn btn-defalut btn-sm"><a href="insuranceDelete.do?insurance_no=${insuranceList.insurance_no}&manager_id=${managerlog.manager_id}">삭제</a></button> --%>
				                		<input type='checkbox' 'id="member_no" name='smsEmail' value="${emailSenderList.member_email}">
				                	</td>                  
				                </tr>
				                </c:forEach>
				              </tbody>
				            </table>
								

<!-- 						<div id="smsAjaxResult"> -->
<!-- 						</div> -->
<!-- 					</div> -->
					<div align="center"><!-- 제목 -->
						<input type="text" name="title" id="title" size="120" style="width:100%" placeholder="제목을 입력해주세요" class="form-control" >
					</div>
					<p>
					<div align="center"><!-- 내용 --> 
						<textarea name="content" id="content" cols="120" rows="12" style="width:100%; resize:none" placeholder="내용을 입력해주세요" class="form-control"></textarea>
					</div>
					<p>
					<div align="center">
						<input type="button" value="메일 보내기" class="btn btn-warning" onclick="check()">
						 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
					</div>
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
