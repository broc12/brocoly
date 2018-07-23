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
    <!-- 체크박스-->
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="./top/top2.jspf" %>
  <!-- Navigation-->
	<script>
          function check(){
        	         	  
            if(f.car_no.value ==""){
               alert("차종코드 채워주세요");
               f.car_no.focus();
               return;
            }
            if(f.car_name.value ==""){
                alert("차종명을 채워주세요");
                f.car_name.focus();
                return;
             }
            if(f.car_manufacturer.value ==""){
                alert("제조사를 채워주세요");
                f.car_manufacturer.focus();
                return;
             }
            if(f.car_fuel.value ==""){
                alert("연료타입을 채워주세요");
                f.car_fuel.focus();
                return;
             }
            if(f.car_type.value ==""){
                alert("차종타입을 채워주세요");
                f.car_type.focus();
                return;
             }
         /*    if(f.car_image.value ==""){
                alert("차종이미지를 채워주세요");
                f.car_image.focus();
                return;
             } */
            var isChecked = "";
      	  
        	if($("input:checkbox[id='customCheck1']").is(":checked")){	// 쳬크 되어있으면
        		isChecked = "오토"
        	}
        	if($("input:checkbox[id='customCheck2']").is(":checked")){	// 쳬크 되어있으면
        		isChecked = "수동"
        	}
        	if($("input:checkbox[id='customCheck1']").is(":checked")&&$("input:checkbox[id='customCheck2']").is(":checked")){	// 쳬크 되어있으면
        		alert("변속기타입을 하나만 선택해주세요");
        		return;
        	}
        	jQuery("#car_trans").val(isChecked);
        	alert("car_no:"+f.car_no.value+"car_name:"+f.car_name.value+"car_manufacturer:"+f.car_manufacturer.value+"car_fuel:"+f.car_fuel.value+"car_type:"+f.car_type.value);
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
        <li class="breadcrumb-item active">차종관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>차종관리</div>
        <div class="card-body">
          <div class="table-responsive">
          <form name="f" action="carinsert.do" method="post" enctype="multipart/form-data">
          	<input type="hidden" name="car_trans" id="car_trans"/>
            <table border="0" width="100%"  cellpadding="0" cellspacing="0">
				<h3 style="color:#007bff">차종등록</h3>	
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종코드</th>
					<th  width="35%" class="text-left">
						<input name="car_no"type="text" size="30" class="form-control" style="width:250px">
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종명</th>
					<th  width="35%" class="text-left">
						<input name="car_name"type="text" size="30" class="form-control" style="width:250px">
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>제조사</th>
					<th  width="35%" class="text-left">
						<select name="car_manufacturer" id="car_manufacturer" class="form-control" style="width:250px">
							<option value="#" style="color:black"></option>
	                        <option value="현대" style="color:black">현대</option>
	                        <option value="르노삼성" style="color:black">르노삼성</option>
	                        <option value="기아" style="color:black">기아</option>
	                        <option value="쉐보레" style="color:black">쉐보레</option>
	                        <option value="쌍용" style="color:black">쌍용</option>
	                        <option value="제네시스" style="color:black">제네시스</option>
	                        <option value="수입" style="color:black">수입</option>
                        </select>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>연료타입</th>
					<th  width="35%" class="text-left">
						<select name="car_fuel" id="car_fuel" class="form-control" style="width:250px">
							<option value="#" style="color:black"></option>
	                        <option value="휘발유" style="color:black">휘발유</option>
	                        <option value="경유" style="color:black">경유</option>
	                        <option value="LPG" style="color:black">LPG</option>
	                        <option value="전기차" style="color:black">전기차</option>
	                        <option value="하이브리드" style="color:black">하이브리드</option>
                        </select>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>승차인원</th>
					<th  width="35%" class="text-left">
						<input name="car_passenger" type="text" size="30" class="form-control" style="width:250px">
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종타입</th>
					<th  width="35%" class="text-left">
						<select name="car_type" id="car_type" class="form-control" style="width:250px">
							<option value="#" style="color:black"></option>
	                        <option value="경차" style="color:black">경차</option>
	                        <option value="중소형" style="color:black">중소형</option>
	                        <option value="중형" style="color:black">중형</option>
	                        <option value="고급" style="color:black">고급</option>
	                        <option value="SUV" style="color:black">SUV</option>
	                        <option value="승합" style="color:black">승합</option>
	                        <option value="수입" style="color:black">수입</option>
                        </select>
					</th>
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>차종이미지</th>
					<th  width="35%" class="text-left">
						<!-- <input type="file"> -->
						<input type="file" accept="image/*" onchange="loadFile(event)" id="uploadfile" name="uploadfile">
						<!-- <script>
						var fileValue = $("#excelFile").val().split("\\");
						var fileName = fileValue[fileValue.length-1]; // 파일명
						</script> -->
						<input type="hidden" name="car_image" id="car_image">
						<img id="output" style="width:400px"/>
						<script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						    var fileValue = $("#uploadfile").val().split("\\");
							var fileName = fileValue[fileValue.length-1]; // 파일명
							jQuery("#car_image").val(fileName);
							alert("파일네임:"+fileName);
						  };
						</script>
					</th>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa"><a style="color:red">*</a>변속기타입</th>
					<th  width="35%" class="text-left">
						<div class="custom-control custom-checkbox">
					   <input type="checkbox" class="custom-control-input" id="customCheck1">
					   <label class="custom-control-label" for="customCheck1">오토메틱</label>
					  </div>
					  <div class="custom-control custom-checkbox">
					   <input type="checkbox" class="custom-control-input" id="customCheck2">
					   <label class="custom-control-label" for="customCheck2">메뉴얼</label>
					  </div>
					</th>
				</tr>
				
				<tr style="font-size:10pt" height="60px">
					<td align="center"></td>
					<td align="right">
					</td>
					<td align="center"></td>
					<td align="right">
						<button type="button" class="btn btn-primary"><a href="car.do" style="color:white">목록</a></button>
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
