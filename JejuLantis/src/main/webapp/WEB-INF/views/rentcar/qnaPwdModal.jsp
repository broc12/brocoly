<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="pwdModal.do" method="POST" >
		<input type="hidden" name="qna_pwd" value="${qna_pwd}">
		<input type="hidden" name="qna_no" value="${qna_no}">
		<button type="submit" class="btn btn-primary" style="border-radius:0px">글쓰기</button>
		<a data-toggle="modal" data-target="#exampleModal2" class="identifyingClass" data-id="">삭제</a>
		</form>
		
<div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">비밀번호 확인</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body"><input type="text" name="inputPwd"></div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
            <a class="btn btn-primary" href="javascript:goDelModal();" name="hiddenValue" id="hiddenValue">확인</a>
          </div>
        </div>
      </div>
    </div>		
</body>
</html>