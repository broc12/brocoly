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
<%@ include file="../top/top2.jspf" %>
  <!-- Navigation-->
<script>
$(document).ready(function(){
    //최상단 체크박스 클릭
    $("#checkall").click(function(){
        //클릭되었으면
        if($("#checkall").prop("checked")){
            //input태그의 name이 chk인 태그들을 찾아서 checked옵션을 true로 정의
            $("input[name=manager_main]").prop("checked",true);
            $("input[name=manager_chart]").prop("checked",true);
            $("input[name=manager_reservstatus]").prop("checked",true);
            $("input[name=manager_travelmanagement]").prop("checked",true);
            $("input[name=manager_review]").prop("checked",true);
            $("input[name=manager_notice]").prop("checked",true);
            $("input[name=manager_user]").prop("checked",true);
            $("input[name=manager_manager]").prop("checked",true);
            $("input[name=manager_company]").prop("checked",true);
            $("input[name=manager_carkind]").prop("checked",true);
            $("input[name=manager_d_carkind]").prop("checked",true);
            $("input[name=manager_carinfo]").prop("checked",true);
            $("input[name=manager_paystatus]").prop("checked",true);
            $("input[name=manager_salestatus]").prop("checked",true);
            $("input[name=manager_banner]").prop("checked",true);
            $("input[name=manager_coupon]").prop("checked",true);
            $("input[name=manager_sms]").prop("checked",true);
            $("input[name=manager_email_at]").prop("checked",true);
            $("input[name=manager_insurance]").prop("checked",true);
            $("input[name=manager_affiliate]").prop("checked",true);
            //클릭이 안되있으면
        }else{
            //input태그의 name이 chk인 태그들을 찾아서 checked옵션을 false로 정의
            $("input[name=manager_main]").prop("checked",false);
            $("input[name=manager_chart]").prop("checked",false);
            $("input[name=manager_reservstatus]").prop("checked",false);
            $("input[name=manager_travelmanagement]").prop("checked",false);
            $("input[name=manager_review]").prop("checked",false);
            $("input[name=manager_notice]").prop("checked",false);
            $("input[name=manager_user]").prop("checked",false);
            $("input[name=manager_manager]").prop("checked",false);
            $("input[name=manager_company]").prop("checked",false);
            $("input[name=manager_carkind]").prop("checked",false);
            $("input[name=manager_d_carkind]").prop("checked",false);
            $("input[name=manager_carinfo]").prop("checked",false);
            $("input[name=manager_paystatus]").prop("checked",false);
            $("input[name=manager_salestatus]").prop("checked",false);
            $("input[name=manager_banner]").prop("checked",false);
            $("input[name=manager_coupon]").prop("checked",false);
            $("input[name=manager_sms]").prop("checked",false);
            $("input[name=manager_email_at]").prop("checked",false);
            $("input[name=manager_insurance]").prop("checked",false);
            $("input[name=manager_affiliate]").prop("checked",false);
        }
    })
})
</script>
<script>
        function check(){
          var manager_main = "";
          var manager_chart = "";
          var manager_reservstatus = "";
          var manager_travelmanagement = "";
          var manager_review = "";
          var manager_notice = "";
          var manager_user = "";
          var manager_manager = "";
          var manager_company = "";
          var manager_carkind = "";
          var manager_d_carkind = "";
          var manager_carinfo = "";
          var manager_paystatus = "";
          var manager_salestatus = "";
          var manager_banner = "";
          var manager_coupon = "";
          var manager_sms = "";
          var manager_email_at = "";
          var manager_insurance = "";
          var manager_affiliate = "";
          
      	if($("input:checkbox[name=manager_main]").is(":checked")){	// 쳬크 되어있으면
      		manager_main = "Y"
      	}else{
      		manager_main = "N"
      	}
      	if($("input:checkbox[name=manager_chart]").is(":checked")){	// 쳬크 되어있으면
      		manager_chart = "Y"
      	}else{
      		manager_chart = "N"
      	}
    	if($("input:checkbox[name=manager_reservstatus]").is(":checked")){	// 쳬크 되어있으면
    		manager_reservstatus = "Y"
      	}else{
      		manager_reservstatus = "N"
      	}
    	if($("input:checkbox[name=manager_travelmanagement]").is(":checked")){	// 쳬크 되어있으면
    		manager_travelmanagement = "Y"
      	}else{
      		manager_travelmanagement = "N"
      	}
    	if($("input:checkbox[name=manager_review]").is(":checked")){	// 쳬크 되어있으면
    		manager_review = "Y"
      	}else{
      		manager_review = "N"
      	}
    	if($("input:checkbox[name=manager_notice]").is(":checked")){	// 쳬크 되어있으면
    		manager_notice = "Y"
      	}else{
      		manager_notice = "N"
      	}
    	if($("input:checkbox[name=manager_user]").is(":checked")){	// 쳬크 되어있으면
    		manager_user = "Y"
      	}else{
      		manager_user = "N"
      	}
    	if($("input:checkbox[name=manager_manager]").is(":checked")){	// 쳬크 되어있으면
    		manager_manager = "Y"
      	}else{
      		manager_manager = "N"
      	}
    	if($("input:checkbox[name=manager_company]").is(":checked")){	// 쳬크 되어있으면
    		manager_company = "Y"
      	}else{
      		manager_company = "N"
      	}
    	if($("input:checkbox[name=manager_carkind]").is(":checked")){	// 쳬크 되어있으면
    		manager_carkind = "Y"
      	}else{
      		manager_carkind = "N"
      	}
    	if($("input:checkbox[name=manager_d_carkind]").is(":checked")){	// 쳬크 되어있으면
    		manager_d_carkind = "Y"
      	}else{
      		manager_d_carkind = "N"
      	}
    	if($("input:checkbox[name=manager_carinfo]").is(":checked")){	// 쳬크 되어있으면
    		manager_carinfo = "Y"
      	}else{
      		manager_carinfo = "N"
      	}
    	if($("input:checkbox[name=manager_paystatus]").is(":checked")){	// 쳬크 되어있으면
    		manager_paystatus = "Y"
      	}else{
      		manager_paystatus = "N"
      	}
    	if($("input:checkbox[name=manager_salestatus]").is(":checked")){	// 쳬크 되어있으면
    		manager_salestatus = "Y"
      	}else{
      		manager_salestatus = "N"
      	}
    	if($("input:checkbox[name=manager_banner]").is(":checked")){	// 쳬크 되어있으면
    		manager_banner = "Y"
      	}else{
      		manager_banner = "N"
      	}
    	if($("input:checkbox[name=manager_coupon]").is(":checked")){	// 쳬크 되어있으면
    		manager_coupon = "Y"
      	}else{
      		manager_coupon = "N"
      	}
    	if($("input:checkbox[name=manager_sms]").is(":checked")){	// 쳬크 되어있으면
    		manager_sms = "Y"
      	}else{
      		manager_sms = "N"
      	}

    	if($("input:checkbox[name=manager_email_at]").is(":checked")){	// 쳬크 되어있으면
    		manager_email_at = "Y"
      	}else{
      		manager_email_at = "N"
      	}
    	if($("input:checkbox[name=manager_insurance]").is(":checked")){	// 쳬크 되어있으면
    		manager_insurance = "Y"
      	}else{
      		manager_insurance = "N"
      	}
    	if($("input:checkbox[name=manager_affiliate]").is(":checked")){	// 쳬크 되어있으면
    		manager_affiliate = "Y"
      	}else{
      		manager_affiliate = "N"
      	}
    	
      	jQuery("#manager_main").val(manager_main);
      	jQuery("#manager_chart").val(manager_chart);
      	jQuery("#manager_reservstatus").val(manager_reservstatus);
      	jQuery("#manager_travelmanagement").val(manager_travelmanagement);
      	jQuery("#manager_review").val(manager_review);
      	jQuery("#manager_notice").val(manager_notice);
      	jQuery("#manager_user").val(manager_user);
      	jQuery("#manager_manager").val(manager_manager);
      	jQuery("#manager_company").val(manager_company);
      	jQuery("#manager_carkind").val(manager_carkind);
      	jQuery("#manager_d_carkind").val(manager_d_carkind);
      	jQuery("#manager_carinfo").val(manager_carinfo);
      	jQuery("#manager_paystatus").val(manager_paystatus);
      	jQuery("#manager_salestatus").val(manager_salestatus);
      	jQuery("#manager_banner").val(manager_banner);
      	jQuery("#manager_coupon").val(manager_coupon);
      	jQuery("#manager_sms").val(manager_sms);
      	jQuery("#manager_email_at").val(manager_email_at);
      	jQuery("#manager_insurance").val(manager_insurance);
      	jQuery("#manager_affiliate").val(manager_affiliate);
      	
      	alert("권한이 수정되었습니다.");
        document.f.submit();
       }
          
     </script>
<script type="text/javascript">
    function idOpen() {
        win_post = window.open('./idpost', "idpost",
				"toolbar=no ,width=450 ,height=400 ,directories=yes,"
						+ "status=yes,scrollbars=yes,menubar=yes");
    }
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
      <form name="f" action="powerUp.do" method="post">
       <table border="1" width="100%">
       	<input type="hidden" name="manager_no" id="manager_no">
	       <tr>
		     <td width="40%" align="center"/>
		     	<b>아이디</b>
		     </td>
		     <td>
		     	<input type="text" style="background-color:#dddddd;width:50%" id="manager_id" name="manager_id" readonly/>
		     	<button class="btn btn-default" type="button" onclick="idOpen()">
                  <i class="fa fa-search"></i>
                </button>
		     </td>
	       </tr>
	       <tr>
	       	<td width="40%" align="center"><b>관리자 이름</b></td>
	       	<td><input type="text"style="background-color:#dddddd;width:50%" id="manager_name" name="manager_name" readonly/></td>
	       </tr>
	       <tr>
	       	<td width="40%" align="center"><b>업체명</b></td>
	       	<td><input type="text"style="background-color:#dddddd;width:50%" id="branch_name" name="branch_name" readonly/></td>
	       </tr>
	       <tr>
	       	<td width="40%" align="center"><b>메뉴 권한</b></td>
	       	<td>
	       		<input type="checkbox" id="checkall"/><span>전체선택</span></br>
	       		<input type="checkbox" name="manager_main" id="manager_main" /><span>메인관리</span></br>
	       		<input type="checkbox" name="manager_chart" id="manager_chart"/><span>그래프</span></br>
	       		<input type="checkbox" name="manager_reservstatus" id="manager_reservstatus"/><span>예약현황</span></br>
	       		<input type="checkbox" name="manager_travelmanagement" id="manager_travelmanagement"/><span>여행상담관리</span></br>
	       		<input type="checkbox" name="manager_review" id="manager_review"/><span>이용후기관리</span></br>
	       		<input type="checkbox" name="manager_notice" id="manager_notice"/><span>공지관리</span></br>
	       		<input type="checkbox" name="manager_user" id="manager_user"/><span>회원관리</span></br>
	       		<input type="checkbox" name="manager_manager" id="manager_manager"/><span>관리자관리</span></br>
	       		<input type="checkbox" name="manager_company" id="manager_company"/><span>업체관리</span></br>
	       		<input type="checkbox" name="manager_carkind" id="manager_carkind"/><span>차종관리</span></br>
	       		<input type="checkbox" name="manager_d_carkind" id="manager_d_carkind"/><span>차종상세관리</span></br>
	       		<input type="checkbox" name="manager_carinfo" id="manager_carinfo"/><span>차량관리</span></br>
	       		<input type="checkbox" name="manager_paystatus" id="manager_paystatus"/><span>결제현황</span></br>
	       		<input type="checkbox" name="manager_salestatus" id="manager_salestatus"/><span>매출현황관리</span></br>
	       		<input type="checkbox" name="manager_banner" id="manager_banner"/><span>배너관리</span></br>
	       		<input type="checkbox" name="manager_coupon" id="manager_coupon"/><span>쿠폰관리</span></br>
	       		<input type="checkbox" name="manager_sms" id="manager_sms"/><span>SMS관리</span></br>
	       		<input type="checkbox" name="manager_email_at" id="manager_email_at"/><span>이메일관리</span></br>
	       		<input type="checkbox" name="manager_insurance" id="manager_insurance"/><span>보험관리</span></br>
	       		<input type="checkbox" name="manager_affiliate" id="manager_affiliate"/><span>제휴관리</span></br>
	       	</td>
	       </tr>
	       <tr>
	       	<td colspan="2" align="right"><input type="button" value="완료" onclick="check()" class="btn btn-primary" style="width:150px"/></td>
	       </tr>
       </table>
       </form>
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
