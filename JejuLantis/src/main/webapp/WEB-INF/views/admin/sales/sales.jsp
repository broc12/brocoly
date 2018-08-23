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
    
    <link rel="stylesheet" href="../resources/sales/jquery/css/ui-lightness/jquery.ui.all.css"> 
<script src="../resources/sales/jquery/js/jquery-1.7.2.js"></script>
<script src="../resources/sales/jquery/js/jquery.ui.core.js"></script>
<script src="../resources/sales/jquery/js/jquery.ui.widget.js"></script>
<script src="../resources/sales/jquery/js/jquery.ui.datepicker.js"></script>
<script language='javascript'>
$(function() {
    $( "#test" ).datepicker({dateFormat:"yy/mm/dd"});
    $( "#test2" ).datepicker({dateFormat:"yy/mm/dd"});
});
</script>
<script language='javascript'>
function check(){
	var start_date = $("#test").val();
	var end_date = $("#test2").val();
	var branch_no = ${branch_no};
	 $.ajax({
	 	url: 'checkDate.do',
        data:{"start_date":start_date,"end_date":end_date},
        success: function(data){
        	console.log(data);
	 	var flag = data;
	 	if(flag==true){
	 $.ajax({
        url: 'salesList.do',
        data:{"start_date":start_date,"end_date":end_date,"branch_no":branch_no},
        success: function(data){
			 var list = data.list;
			 var totalPayment=0;
			 var countPayment=0;
			 var totalNCancle=0;
			 var totalNCount=0;
			 var totalPCancle=0;
			 var totalPCount=0;
			 var netSales=0;
			 var total=0;
			 alert('성공');
			 var html = "";
			 if(!data){
				html += "<p>검색결과없음</p>";
			}else{
				$("#result").empty();
				if(data.length != 0){
					for (var i=0; i<data.length; i++) {
						html +=  "<tr align='center'>";
						html +=  "<td>"+data[i].salesDate+"</td>";
						html +=  "<td>"+data[i].totalPayment+"("+data[i].countPayment+")</td>";
						html +=  "<td>"+data[i].totalNCancle+"("+data[i].totalNCount+")</td>";
						html +=  "<td>"+data[i].totalPCancle+"("+data[i].totalPCount+")</td>";
						html +=  "<td>"+data[i].totalPayment+"("+data[i].countPayment+")</td>";
						html +=  "<td>"+data[i].netSales+"</td>";
						totalPayment += data[i].totalPayment;
						countPayment += data[i].countPayment;
						totalNCancle += data[i].totalNCancle;
						totalNCount += data[i].totalNCount;
						totalPCancle += data[i].totalPCancle;
						totalPCount += data[i].totalPCount;
						netSales += data[i].netSales;
					}
					total += "<tr align='center'>";
					total +=  "<td>총합</td>";
					total +=  "<td>"+totalPayment+"("+countPayment+")</td>";
					total +=  "<td>"+totalNCancle+"("+totalNCount+")</td>";
					total +=  "<td>"+totalPCancle+"("+totalPCount+")</td>";
					total +=  "<td>"+totalPayment+"("+countPayment+")</td>";
					total +=  "<td>"+netSales+"</td>"; 
					$("#result").append(html);	
					$("#result").append(total);
				}
			}
        },
        error : function (data) {
       	    alert('실패');
       	    return false;
       	   }
    });
	 }else{
		 alert('시작날짜와 종료날짜를 확인해주세요.');
		 return false;
		 }
     },
	 error : function(data) {
		 alert('실패');
		 return false;
	 }
});
} 
</script>

</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="../top/top2.jspf" %>
  <!-- Navigation-->

	<script>
	function goDel (v){
		if (confirm("정말 삭제하시겠습니까??"+v) == true){    //확인
			location.href="noticedel.do?announce_no="+v;
		}else{   //취소
		    return;
		}
	}
	
    /* jQuery(document).ready(function(){
    	$(".identifyingClass").click(function () {
             var my_id_value = $(this).data('id');
             //alert(my_id_value);
             $(".modal-footer #hiddenValue").val(my_id_value);
         })
    });
	
	function goDelModal(){
		var anno = jQuery("#hiddenValue").val();
		location.href="del.do?announce_no=" +anno;
	} */
	</script>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">매출관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>매출현황</div>
        <div class="card-body">
       				 기간 &nbsp;&nbsp;
            	  <input type='text' id='test' name='test' value="">&nbsp;&nbsp; ~ &nbsp;&nbsp;
            	  <input type='text' id='test2' name='test2' value="">&nbsp;&nbsp;
            	  <input type='button' id='search' onclick="check()" name='search' class="btn btn-primary" style="border-radius:0px" value="검색">
          <div class="table-responsive">
         		
            <table align="center" class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            	
              <thead>
                <tr align='center'>
                <th rowspan="2" width="10%">날짜</th>
                  <th rowspan="2" width="20%">총결제</th>
                  <th rowspan="2" width="15%">일반취소</th>
                  <th rowspan="2" width="15%">패널티취소</th>
                  <th rowspan="2" width="20%">총매출</th>
                  <th rowspan="2" width="15%">순매출</th>
                 <!--  <th rowspan="2">마진</th> -->
                </tr>
                <!-- <tr height="60px">
                </tr> -->
              </thead>

              <tbody id='result'>
                
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
    <!-- 삭제모달 -->
    <div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">삭제</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">정말 삭제하시겠습니까?</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
            <a class="btn btn-primary" href="javascript:goDelModal();" name="hiddenValue" id="hiddenValue">삭제</a>
          </div>
        </div>
      </div>
    </div>
     
  </div>
</body>

</html>
