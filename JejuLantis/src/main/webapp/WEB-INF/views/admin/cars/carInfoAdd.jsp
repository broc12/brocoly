<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
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
	<script>document.write(document.lastModified); //일자</script>
<script language="JavaScript">
var lineNo = 0; 
var beforeNo = 0; 
function insertLine(){
	lineNo++;	
	var html = "<tr id=content_"+lineNo+">";
html+="<td>"+num+"</td><td><select style='width:90%' name=carKind id=carKind"+lineNo+">";
html+="<c:forEach items='${carList}' var='item'>";
html+="<option value='${item.car_kind_no}'	style='color:black'>${item.car_manufacturer}/${item.car_name}(${item.car_fuel})";
html+="   ${item.stringCar_kind_navi} ${item.stringCar_kind_sensor} ${item.stringCar_kind_blackbox}";
html+="${item.stringCar_kind_bluetooth} ${item.stringCar_kind_sunroof} ${item.stringCar_kind_camera} ${item.stringCar_kind_nonsmoke}</option>";
html+="</c:forEach>";
html+="</select></td><td><input style='width:90%' type=text size=15 name=carNumber id=carNumber"+lineNo+"></td>";
html+="<td><input type=button value=삭제 onclick='del("+lineNo+")' style=\"border-radius:0px\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >";
html+="</td></tr>";		
$("#content_"+beforeNo).after(html);
beforeNo++;
num++;
}

/* 
$(document).ready(function(){
	$("#save").click(function(){tr>
    	var selectListKind = [];
    	$("select[id='aa']").each(function(i){
    		selectListKind.push($(this).val());
    	})		
    	alert("hi1")
	
    	var selectListNumber = [];
    	$("select[id='u_name']").each(function(i){
    		selectListNumber.push($(this).val());
    	});
    	alert("hi2")
	})
})  */
$(document).ready(function(){
	// btn click
	$("#test").click(function(){
	var result = txtFieldCheck() == true ? true : false;
	if(!result){
		document.form1.submit();
	}
	});
	});
	function txtFieldCheck(){
	// form안의 모든 text type 조회
	var txtEle = $("#form1 input[type=text]");
	for(var i = 0; i < txtEle.length; i ++){
	// console.log($(txtEle[i]).val());
	if("" == $(txtEle[i]).val() || null == $(txtEle[i]).val()){
	var ele_id = $(txtEle[i]).attr("id");
	var label_txt = $("label[for='" + ele_id +"']").text();
	console.log("id : " + ele_id + ", label : " + label_txt);
	showAlert(ele_id, label_txt);
	return true;
	}
	}
	}
	function showAlert(ele_id, label_txt){

	alert("모든 항목을 입력해주세요");

	// 해당 id에 focus.

	$("#" + ele_id).focus();
	}

var StaticText='oni';
window.status = StaticText;

var max_input=1; //입력받을 최대 갯수
var in_sum=0; // for 문이 돌기전의 활성화 되있는 객체의 수
max_input=max_input-in_sum;

function dispExample(no){
  var sample=eval("content_"+no);
  if(sample.style.display=="none") sample.style.display="block";
}


function del(no){
	$("#content_"+no).remove();
	if(beforeNo==no){
		beforeNo--;
		lineNo--;
	}
} 
		
/* function input_del_1(no){
        var for_in_type_sum=2; //순환문 안의 input type 갯수
        var no_1=parseInt(no)+((parseInt(no)-2)*for_in_type_sum);
        var no_2=parseInt(no_1)+1;
        
        //삭제시킬 input type 초기화
        document.form1.elements[no_1].value=""
        document.form1.elements[no_2].value=""
        
        //삭제목록 안보이게 하기
        no=parseInt(no)-1;
        var sample=eval("content_"+no);
        sample.style.display="none";
}  */

</script>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">차량관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>차량관리</div>
        <div class="card-body">
          <div class="table-responsive">
          <form name=form1 id=form1 method='post' action='carInfoInsert.do' >		
<table border="0" cellpadding="4" cellspacing="1"  width="100%">
<td><input type=button value="입력양식 +" class="btn btn-primary" style="border-radius:0px" onClick="insertLine()"></td>
<tr bgcolor=white>
</tr>

<tr bgcolor=white>
	<td>
	<table border=0 width=100%>
	<tr>	
	<th width=10%>No.</th>
	<th width=45%>차종</th>
	<th width=45%>차 번호</th>
</tr>
				<script>
				/* var num=1;
				for(var ii=0 ;ii<  parseInt(max_input);ii++){ 
						document.write("<tr id=content_"+ii+">");
						document.write("<td>");
						document.write(num);
						document.write("</td>");
						document.write("<td>");
						document.write("<select style='width:90%' name=carKind id=carKind"+lineNo+">");	
						document.write("for(var i=0;i< ${fn:length(carList)} ;i++){");
						document.write("<option value='${carList[i].getCar_kind_no()}'	style='color:black'>${carList[i].car_manufacturer}/${carList[i].car_name}/${carList[i].car_fuel}");
						document.write("옵션 : ${carList[i].getStringCar_kind_navi()} ${carList[i].stringCar_kind_sensor} ${carList[i].stringCar_kind_blackbox}");
						document.write("${carList[i].stringCar_kind_bluetooth} ${carList[i].stringCar_kind_sunroof} ${carList[i].stringCar_kind_camera} ${carList[i].stringCar_kind_nonsmoke}</option>");				
						document.write("}");
						document.write("</select>");
						document.write("</td>");
						document.write("<td>");
						document.write("<input style='width:90%' type=text size=15 name=carNumber id=carNumber>");
						document.write("</td>");
						document.write("<td>");
						document.write("<input type=button value=삭제  onclick='del("+lineNo+")' style=\"background:#abcdef;border:1x solid black\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >");
						document.write("</td>");
						document.write("</tr>");
						num++;
				} */
				var num=1;
					document.write("<tr id=content_"+0+">");
					document.write("<td>");
					document.write(num);
					document.write("</td>");
					document.write("<td>");
					document.write("<select style='width:90%' name=carKind id=carKind"+lineNo+">");	
					document.write("<c:forEach items='${carList}' var='item'>");
					document.write("<option value='${item.car_kind_no}'	style='color:black'>${item.car_manufacturer}/${item.car_name}(${item.car_fuel})    ");
					document.write("   ${item.stringCar_kind_navi} ${item.stringCar_kind_sensor} ${item.stringCar_kind_blackbox}");
					document.write("${item.stringCar_kind_bluetooth} ${item.stringCar_kind_sunroof} ${item.stringCar_kind_camera} ${item.stringCar_kind_nonsmoke}</option>");				
					document.write("</c:forEach>");
					document.write("</select>");
					document.write("</td>");
					document.write("<td>");
					document.write("<input style='width:90%' type=text size=15 name=carNumber id=carNumber>");
					document.write("</td>");
					document.write("<td>");
					document.write("<input type=button value=삭제  onclick='del("+lineNo+")'style=\"border-radius:0px\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >");
					document.write("</td>");
					document.write("</tr>");
					num++;
				</script>
			</table>
	</td>
</tr>
<tr bgcolor=white>
	
	<td align=right><a class="btn btn-primary" style="border-radius:0px" href='javascript:document.form1.reset();'>reset</a>&nbsp;
	<!-- <button type="submit" class="btn btn-primary" style="border-radius:0px" id="save">저장</button> -->
	<input type="button" class="btn btn-primary" style="border-radius:0px"  id="test" value="저장" />
	</td>
</tr>
<input type=hidden name=max_1 value=0>
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
