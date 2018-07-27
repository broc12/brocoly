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

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="./top/top2.jspf" %>
  <!-- Navigation-->
	<script>
          function check(){
        	 
        	var isChecked = "";
        	  
        	if($("input:checkbox[id='topYn']").is(":checked")){	// 쳬크 되어있으면
        		isChecked = "Y"
        	} else {
        		isChecked = "N"
        	}
        	
        	jQuery("#announce_top").val(isChecked);
        	  
            if(f.announce_title.value ==""){
               alert("제목을 채워주세요");
               f.announce_title.focus();
               return;
            }
            
            var _contents = CKEDITOR.instances.announce_content.document.getBody().getText();

            if (_contents.trim() == '') {
            	alert("내용을 채워주세요");
            	f.announce_content.focus();
            	return false;
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
        <li class="breadcrumb-item active">공지사항관리</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i>공지</div>
        <div class="card-body">
          <div class="table-responsive">
          <form name="f" action="write.do" method="post">
          	<input type="hidden" name="announce_top" id="announce_top"/>
            <table border="0" width="100%"  cellpadding="0" cellspacing="0">
				<h3 style="color:#007bff">공지작성</h3>	
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">제목</th>
					<th  width="35%" class="text-left">
						<input name="announce_title"type="text" size="80" placeholder="">
					</th>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<td height="100px" align="center" style="background-color: #fafafa">내용</td>
					<td align="left">
						<textarea class="ckeditor" rows="8" cols="110" name="announce_content" id="announce_content"></textarea>
					</td>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<td align="center" style="background-color: #fafafa">중요</td>
					<td align="left">
						&nbsp;&nbsp;&nbsp;<input type="checkbox" id="topYn" name="topYn" />
					</td>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<td align="center"></td>
					<td align="right">
						<button type="button" class="btn btn-primary"><a href="service.do" style="color:white">목록</a></button>
						<button type="button" class="btn btn-primary" onclick="check()">작성완료</button>
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
   <script>
	    CKEDITOR.replace('announce_content',{
	            /* toolbar: 'Full',
	            uiColor: '#9AB8F3', */
	    	filebrowserImageUploadUrl: '/community/imageUpload'
	        }
	    );
	</script>
  </div>
</body>

</html>
