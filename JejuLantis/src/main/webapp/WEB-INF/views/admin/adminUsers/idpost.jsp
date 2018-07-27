<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%-- <%@ page import="java.util.*,com.test.mybatis.*"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>결과창</title>
</head>
<script>
    //main페이지로 값 전달: 부모로 값전달하기 위해서는 opener사용
    function sendAdd(manager_no,manager_id, manager_name, branch_name,manager_main,manager_chart,
    		manager_reservstatus,manager_ars_reserv,manager_travelmanagement,manager_review,
    		manager_notice,manager_user,manager_manager,manager_company,manager_carkind,
    		manager_d_carkind,manager_carinfo,manager_paystatus,manager_salestatus,
    		manager_banner,manager_coupon,manager_sms,manager_insurance){
        alert("부모로 값전달");
        opener.document.getElementById("manager_no").value = manager_no;
        opener.document.getElementById("manager_name").value = manager_name;
        opener.document.getElementById("manager_id").value= manager_id;
        opener.document.getElementById("branch_name").value= branch_name;
        
        if(manager_main=='Y'){
        	opener.document.getElementById("manager_main").checked=true;
        }
        
        if(manager_chart=='Y'){
        	opener.document.getElementById("manager_chart").checked=true;
        }
        if(manager_reservstatus=='Y'){
        	opener.document.getElementById("manager_reservstatus").checked=true;
        }
        if(manager_ars_reserv=='Y'){
        	opener.document.getElementById("manager_ars_reserv").checked=true;
        }
        if(manager_travelmanagement=='Y'){
        	opener.document.getElementById("manager_travelmanagement").checked=true;
        }
        if(manager_review=='Y'){
        	opener.document.getElementById("manager_review").checked=true;
        }
        if(manager_notice=='Y'){
        	opener.document.getElementById("manager_notice").checked=true;
        }
        if(manager_user=='Y'){
        	opener.document.getElementById("manager_user").checked=true;
        }
        if(manager_manager=='Y'){
        	opener.document.getElementById("manager_manager").checked=true;
        }
        if(manager_company=='Y'){
        	opener.document.getElementById("manager_company").checked=true;
        }
        if(manager_carkind=='Y'){
        	opener.document.getElementById("manager_carkind").checked=true;
        }
        if(manager_d_carkind=='Y'){
        	opener.document.getElementById("manager_d_carkind").checked=true;
        }
        if(manager_carinfo=='Y'){
        	opener.document.getElementById("manager_carinfo").checked=true;
        }
        if(manager_paystatus=='Y'){
        	opener.document.getElementById("manager_paystatus").checked=true;
        }
        if(manager_salestatus=='Y'){
        	opener.document.getElementById("manager_salestatus").checked=true;
        }
        if(manager_banner=='Y'){
        	opener.document.getElementById("manager_banner").checked=true;
        }
        if(manager_coupon=='Y'){
        	opener.document.getElementById("manager_coupon").checked=true;
        }
        if(manager_sms=='Y'){
        	opener.document.getElementById("manager_sms").checked=true;
        }
        if(manager_insurance=='Y'){
        	opener.document.getElementById("manager_insurance").checked=true;
        }
        
        window.close(); 
    }
    //널값체크
    function check() {
        var checkValue = document.f.manager_id.value;
        alert("checkValue : "+checkValue);
        if(checkValue == ""){
            alert("아이디를 입력하세요.");
            document.f.manager_id.focus();
            return false;
        }   
    }
</script>
<body>
    <form name="f" action="./idpost" method="post" onsubmit="check()">
        <table border="1" width="100%">
            <tr align="center">
                <td colspan="3">아이디 검색 : <input type="text" id="a" name="manager_id" size="15">
                    <input type="submit" value="검색">
                </td>
            </tr>
          	<tr>
          		<td>아이디</td>
          		<td>이름</td>
          		<td>업체명</td>
          	</tr>
            <c:forEach items="${result}" var="post">
                <tr>
                    <td>
                    	<a id="manager_name" href="javascript:sendAdd('${post.manager_no}','${post.manager_id}','${post.manager_name}','${post.branch_name}',
                    	'${post.manager_main}','${post.manager_chart}','${post.manager_reservstatus}','${post.manager_ars_reserv}',
                    	'${post.manager_travelmanagement}','${post.manager_banner}','${post.manager_coupon}','${post.manager_sms}',
                    	'${post.manager_insurance}','${post.manager_review}','${post.manager_notice}','${post.manager_user}',
                    	'${post.manager_manager}','${post.manager_company}','${post.manager_carkind}','${post.manager_d_carkind}',
                    	'${post.manager_carinfo}','${post.manager_paystatus}','${post.manager_salestatus}',)" >
                     ${post.manager_id}</a>
                    </td>
                    <td>${post.manager_name}</td>
                    <td>${post.branch_name}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>


