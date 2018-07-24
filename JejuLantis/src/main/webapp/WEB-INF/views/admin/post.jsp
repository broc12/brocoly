
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
    function sendAdd(branch_name, branch_no){
        alert("부모로 값전달");
        opener.document.getElementById("branch_name").value = branch_name;
        opener.document.getElementById("branch_no").value= branch_no;
//         opener.document.getElementById("branch_tel").value=branch_tel;
//         opener.document.getElementById("branch_local").value=branch_local; 
        window.close(); 
    }
    //널값체크
    function check() {
//         alert("check 클릭!");
        var checkValue = document.f.branch_name.value;
        alert("checkValue : "+checkValue);
        if(checkValue == ""){
            alert("업체이름을 입력하세요.");
            document.f.branch_name.focus();
            return false;
        }
        
    }
</script>
<body>
    <form name="f" action="./post" method="post" onsubmit="check()">
        <table border="1" width="100%">
            <tr align="center">
                <td>업체이름 검색 : <input type="text" id="a" name="branch_name" size="15">
                    <input type="submit" value="검색">
                </td>
            </tr>
            <tr>
                <!-- 안내문 -->
                <td align=center><font color=red>※ 동이름을 입력하시고 검색 후, 아래
                        부분의<br> 우편번호를 클릭하시면 자동으로 주소가 입력됩니다.
                </font></td>
            </tr>
            <c:forEach items="${result}" var="post">
                <tr>
                    <td><a id="branch_name" href="javascript:sendAdd('${post.branch_name}','${post.branch_line_no}')" >
                     ${post.branch_tel}  ${post.branch_local} ${post.branch_name} 
                    </a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>


