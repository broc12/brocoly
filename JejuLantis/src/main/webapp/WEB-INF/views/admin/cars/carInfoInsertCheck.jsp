<%@page contentType="text/html;charset=utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	

<script>
    if(${flag}){
		alert("입력 성공");
    }else{
		alert("입력 실패");
	}
    location.href='carInfo.do?manager_id=${managerlog.manager_id}';
</script>
