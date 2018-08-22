<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true"%>
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
<link href="../resources/admin/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
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
	<%@ include file="../top/top2.jspf"%>
	<!-- Navigation-->
	<script>
		document.write(document.lastModified); //일자
	</script>
	<script type="text/javascript">
/* 		var lineNo = 0;
		var beforeNo = 0;
		function insertLine() {
			lineNo++;
			var html = "<tr id=content_"+lineNo+">";
			html += "<td>"
					+ num
					+ "</td><td><select style='width:90%' name=carKind id=carKind"
					+ lineNo + ">";
			html += "<c:forEach items='${carList}' var='item'>";
			html += "<option value='${item.car_kind_no}'	style='color:black'>${item.car_manufacturer}/${item.car_name}(${item.car_fuel})";
			html += "   ${item.stringCar_kind_navi} ${item.stringCar_kind_sensor} ${item.stringCar_kind_blackbox}";
			html += "${item.stringCar_kind_bluetooth} ${item.stringCar_kind_sunroof} ${item.stringCar_kind_camera} ${item.stringCar_kind_nonsmoke}</option>";
			html += "</c:forEach>";
			html += "</select></td><td><input style='width:90%' type=text size=15 name=carNumber id=carNumber"
					+ lineNo + "></td>";
			html += "<td><input type=button value=삭제 onclick='del("
					+ lineNo
					+ ")' style=\"border-radius:0px\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >";
			html += "</td></tr>";
			$("#content_" + beforeNo).after(html);
			beforeNo++;
			num++;
		}

		function del(no) {
			$("#content_" + no).remove();
			if (beforeNo == no) {
				beforeNo--;
				lineNo--;
			}
		} */

		$(document).ready(function() {
			
			 $('#btn-add-row').click(function() {
				var html = "<c:forEach items='${carList}' var='item'>";
					html += "<option value='${item.car_kind_no}'	style='color:black'>${item.car_manufacturer}/${item.car_name}(${item.car_fuel})";
					html += "   ${item.stringCar_kind_navi} ${item.stringCar_kind_sensor} ${item.stringCar_kind_blackbox}";
					html += "${item.stringCar_kind_bluetooth} ${item.stringCar_kind_sunroof} ${item.stringCar_kind_camera} ${item.stringCar_kind_nonsmoke}</option>";
					html += "</c:forEach>";
				    $('#mytable > tbody:last').append('<tr><td class="rownum">'+$('#mytable tr').length+'</td><td><select style="width: 90%" name="carKind" id="carKind">'+html+'</select></td><td><input style="width: 90%" type="text" size="15"	name="carNumber" id="carNumber"></td><td><input type="button" value="삭제" 	onclick="delrow(this)" class="btn btn-primary"/></td></tr>');
				  });
			 
			// btn click
			$("#save").click(function() {
				var result = txtFieldCheck() == true ? true : false;
				if (!result) {
					document.form1.submit();
				}
			});
		});
		function txtFieldCheck() {
			// form안의 모든 text type 조회
			var txtEle = $("#form1 input[type=text]");
			for (var i = 0; i < txtEle.length; i++) {
				// console.log($(txtEle[i]).val());
				if ("" == $(txtEle[i]).val() || null == $(txtEle[i]).val()) {
					var ele_id = $(txtEle[i]).attr("id");
					var label_txt = $("label[for='" + ele_id + "']").text();
					console.log("id : " + ele_id + ", label : " + label_txt);
					showAlert(ele_id, label_txt);
					return true;
				}
			}
		}
		function showAlert(ele_id, label_txt) {

			alert("모든 항목을 입력해주세요");

			// 해당 id에 focus.

			$("#" + ele_id).focus();
		}

		var StaticText = 'oni';
		window.status = StaticText;

		var max_input = 1; //입력받을 최대 갯수
		var in_sum = 0; // for 문이 돌기전의 활성화 되있는 객체의 수
		max_input = max_input - in_sum;

		function dispExample(no) {
			var sample = eval("content_" + no);
			if (sample.style.display == "none")
				sample.style.display = "block";
		}
		
		function delrow(th){
			  var length = $('#mytable tr').length;
			  if(length>2){
			  $(th.parentElement.parentElement).remove();
			  var num = 1;
			  $('.rownum').each(function(){
			  $(this).text(num);
			  num++;
			  });
			  }
		}
		function resetrow(){
			while($('#mytable tr').length>2){
				$('#mytable tr:nth-child(2)').remove();
			}
		}
	</script>
	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">JEJULANTIS</a></li>
				<li class="breadcrumb-item active">차량관리</li>
			</ol>
			<!-- Example DataTables Card-->
			<div class="card mb-3">
				<div class="card-header">
					<i class="fa fa-table"></i>차량관리
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<form name=form1 id=form1 method='post' action='carInfoInsert.do'>


							<table border="0" cellpadding="4" cellspacing="1" width="100%">
								<td><input type=button value="입력양식 +" class="btn btn-primary" id='btn-add-row' /></td>
								<tr bgcolor=white>
								</tr>

								<tr bgcolor=white>
									<td>
										<table border=0 width=100% id='mytable' >
											<thead>
												<tr>
													<th width='10%'>No.</th>
													<th width='45%'>차종</th>
													<th width='45%'>차 번호</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td class='rownum'>1</td>
													<td><select style='width: 90%' name='carKind' id='carKind'>
															<c:forEach items='${carList}' var='item'>
																<option value='${item.car_kind_no}' style='color: black'>${item.car_manufacturer}/${item.car_name}(${item.car_fuel})${item.stringCar_kind_navi}${item.stringCar_kind_sensor}${item.stringCar_kind_blackbox}${item.stringCar_kind_bluetooth}${item.stringCar_kind_sunroof}${item.stringCar_kind_camera}${item.stringCar_kind_nonsmoke}</option>
															</c:forEach>
													</select></td>
													<td><input style='width: 90%' type='text' size='15'	name='carNumber' id='carNumber'></td>
													<td><input type='button' value='삭제' 	onclick='delrow(this)' class="btn btn-primary"/></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr bgcolor=white>
									<td align=right>
									<input type="button" class="btn btn-primary" id="reset" onclick='resetrow()' value="reset" />&nbsp;
									<!-- <a class="btn btn-primary" href='javascript:document.form1.reset();'>reset</a>&nbsp; -->
									<input type="button" class="btn btn-primary" id="save" value="저장" />&nbsp;
									<input type="button" class="btn btn-primary" id="list" onclick='location.href="carInfo.do?manager_id=${managerlog.manager_id}"' value="목록" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="card-footer small text-muted">Updated yesterday at
					11:59 PM</div>
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
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fa fa-angle-up"></i>
		</a>
		<!-- Logout Modal-->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Ready to
							Leave?</h5>
						<button class="close" type="button" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="modal-body">Select "Logout" below if you are
						ready to end your current session.</div>
					<div class="modal-footer">
						<button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
						<a class="btn btn-primary" href="login.do">Logout</a>
					</div>
				</div>
			</div>
		</div>
		<!-- Bootstrap core JavaScript-->

	</div>
</body>

</html>
