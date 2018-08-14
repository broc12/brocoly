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
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top" onload="mychange()">
<%@ include file="../top/top2.jspf" %>
	<script>
	function mychange (){
		var myNo = jQuery("#myCarNo").val();
		var html = "";
		$.ajax({
			url : "myCarNo.do",
			type : "POST",
			data : {no : myNo},
			success : function(responseData){
				var data = responseData;
				var i = "";
				for(i = 0 ; i<data.length ; i++){
					console.log("AVANTE:"+data[i].car_info_back_no);
					html +="<option>"+data[i].car_info_back_no+"</option>";
					$("#infolist").empty().append(html);
				}
			}
		});
	}
	</script>
 <style>
 @keyframes check {0% {height: 0;width: 0;}
  25% {height: 0;width: 10px;}
  50% {height: 20px;width: 10px;}
}
.checkbox{background-color:#23756e;display:inline-block;height:28px;margin:0 .25em;width:28px;border-radius:4px;border:1px solid #ccc;float:right}
.checkbox span{display:block;height:28px;position:relative;width:28px;padding:0}
.checkbox span:after{-moz-transform:scaleX(-1) rotate(135deg);-ms-transform:scaleX(-1) rotate(135deg);-webkit-transform:scaleX(-1) rotate(135deg);
	transform:scaleX(-1) rotate(135deg);-moz-transform-origin:left top;-ms-transform-origin:left top;-webkit-transform-origin:left top;transform-origin:left top;
	border-right:4px solid black;border-top:4px solid black;content:'';display:block;height:20px;left:3px;position:absolute;top:15px;width:10px}
.checkbox span:hover:after{border-color:#999}
.checkbox input{display:none}
.checkbox input:checked + span:after{-webkit-animation:check .8s;-moz-animation:check .8s;-o-animation:check .8s;animation:check .8s;border-color:#555}
.checkbox input:checked + .default:after{border-color:#444}
.checkbox input:checked + .primary:after{border-color:#2196F3}
.checkbox input:checked + .success:after{border-color:#8bc34a}
.checkbox input:checked + .info:after{border-color:#3de0f5}
.checkbox input:checked + .warning:after{border-color:#FFC107}
.checkbox input:checked + .danger:after{border-color:#f44336}
</style>
	
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">JEJULANTIS</a>
        </li>
        <li class="breadcrumb-item active">예약관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>예약관리</div>
        <div class="card-body">
          <div class="table-responsive">
            <table border="1" width="100%"  cellpadding="0" cellspacing="0">
				<tr style="color:#808080;font-size:12pt">
					<td colspan="2" height="30px" width="10%"  style="background-color: #23756e;color:white">임차인정보</td>
					<td width="2%" style="border-top: hidden;border-bottom: hidden;"></td>
					<td height="40px" width="10%" class="text-center" style="background-color: #23756e;color:white;border-right:hidden;">운전자정보</td>
					<td  width="6%" class="text-left" style="background-color: #23756e;">
					</td>
					<td  width="10%" class="text-center" style="background-color: #23756e;border-left:hidden;border-right:hidden">
					<label class="checkbox">
	                    <input type="checkbox" id="dinfo" name="dinfo" onclick="Dclick()"/>
	                    <span class="success"></span>
                    </label>
					</td>
					<td class="text-left" style="background-color: #23756e;color:white">임차인정보와동일합니다.</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;">임차인명</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" name="member_name" value="${res.member.member_name}">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;">운전자명</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" name="rent_reserv_driver_name" value="${res.rent_reserv_driver_name}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">전화번호</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.member.member_tel}" name="member_tel">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">전화번호</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" name="" value="${res.rent_reserv_driver_tel}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">생년월일</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.member.member_birth}">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">생년월일</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.rent_reserv_driver_birth}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">면허번호</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" readonly>
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">면허번호</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">이메일</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.member.member_email}">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">면허종별</td>
					<td  width="12%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<select id="" name="">
						   <option value="010"  selected>${res.rent_reserv_license_kind}</option>
						   <option value="011">1종보통</option>
						   <option value="016">2종보통</option>
						</select>
					</td>
					<td  width="10%" class="text-center" style="border-bottom:hidden;border-left:hidden">유효일자</td>
					<td  class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" placeholder="yyyy-mm-dd">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">주소</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text"><input type="button" value="주소검색" style="background-color:black;color:white;border:0">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td height="40px" width="10%" class="text-center" style="border-bottom:hidden">주소</td>
					<td colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text"><input type="button" value="주소검색" style="background-color:black;color:white;border:0">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center"></td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center"></td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text">
					</td>
				</tr>
				
				<tr style="color:#808080;font-size:12pt">			
					<td  colspan="2" height="20px" width="10%" class="text-center" style="border-left: hidden;border-right: hidden;"></td>
					<td style="border-top: hidden;"></td>
					<td  colspan="5" height="20px" width="10%" class="text-center" style="border-left: hidden;border-right: hidden;"></td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">차종</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<select id="myCarNo" name="" onchange="mychange()">
						<c:forEach items="${kind}" var="kind">
						   <option value="${kind.car_no}" <c:if test="${res.car.car_no eq kind.car_no }">selected</c:if>>${kind.car_name}</option>
						</c:forEach>
						</select>
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;background-color:#c8e1d6">예약시간</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden;background-color:#c8e1d6">
						<input type="date" value="${res.rent_reserv_start}">
						<select id="" name="">
						   <option value="010"  selected>선택하세요</option>
						   <option value="011">10:00</option>
						   <option value="016">12:00</option>
						</select>
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">차량번호</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<select id="infolist" name="">
						</select>
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;background-color:#c8e1d6"></td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden;background-color:#c8e1d6">
						<input type="date" value="${res.rent_reserv_end}">
						<select id="" name="">
						   <option value="010"  selected>선택하세요</option>
						   <option value="011">10:00</option>
						   <option value="016">12:00</option>
						</select>
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">출발연료</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text">%
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">도착변경</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="date">
						<select id="" name="">
						   <option value="010" selected>선택하세요</option>
						   <option value="011">10:00</option>
						   <option value="016">12:00</option>
						</select>
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">출발계기</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text">km
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">차종요금</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.payment.rent_payment_carkind_price}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">결제방법</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.payment.rent_payment_way}">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">할인</td>
					<td  colspan ="3" width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.payment.rent_payment_discount}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;background-color:#f3d1da">취소일시</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden;background-color:#f3d1da">
						<input type="text">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden">보험명</td>
					<td  width="12%" class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.insurance.insurance_name}">
					</td>
					<td  width="10%" class="text-center" style="border-bottom:hidden;border-left:hidden">보험료</td>
					<td  class="text-left" style="border-bottom:hidden;border-left:hidden">
						<input type="text" value="${res.payment.rent_payment_insurance_price}">
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  height="40px" width="10%" class="text-center" style="border-bottom:hidden;background-color:#f3d1da">취소사유</td>
					<td  width="35%" class="text-left" style="border-bottom:hidden;border-left:hidden;background-color:#f3d1da">
						<input type="text">
					</td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td colspan="4" height="40px" width="10%" class="text-center" style="border-bottom:hidden">
						<span>요금합계:</span><span>${res.payment.rent_payment_total_price}</span><span>원</span>
					</td>
				</tr>
				<tr style="color:#808080;font-size:12pt">			
					<td  colspan="2" height="40px" width="10%" class="text-center" style="background-color:#f3d1da"></td>
					<td style="border-top: hidden;border-bottom: hidden;"></td>
					<td colspan="4" height="40px" width="10%" class="text-right" style="padding-right:10px">
					<input type="button" value="다시작성" style="border:0">
					<input type="button" value="계약취소" style="border:0;background-color:#efcf9e;color:white">
					<input type="button" value="계약수정" style="border:0;background-color:#5298ba;color:white">
					</td>
				</tr>
			</table>
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
