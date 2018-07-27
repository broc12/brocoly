<%@page contentType="text/html;charset=utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	

<script>
    if(${flag}){
		alert("삭제 성공");
    }else{
		alert("삭제 실패");
	}
    location.href='tables.do';
</script>
