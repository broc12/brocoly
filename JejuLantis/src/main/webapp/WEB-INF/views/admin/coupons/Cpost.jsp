<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%-- <%@ page import="java.util.*,com.test.mybatis.*"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
  	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>결과창</title>
</head>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script>
	$(document).ready(function(){
		
		jQuery("input[name='coupon']").change(function(){
			
			if($(this).val() == 'N'){
				jQuery("#n").show();
				jQuery("#c").hide();
			}	
			if($(this).val() == 'Y'){
				jQuery("#c").show();
				jQuery("#n").hide();
			}
			
		});
	
	});
    //main페이지로 값 전달: 부모로 값전달하기 위해서는 opener사용
    
    function check() {
    	
    	if(f.coupon_name.value ==""){
            alert("쿠폰명을 채워주세요");
            f.coupon_name.focus();
            return;
         }
    	/* if(f.coupon_discount.value ==""){
            alert("할인금액을 채워주세요");
            f.coupon_discount.focus();
            return;
         } */
    	if(f.coupon_start.value ==""){
            alert("시작날짜를 채워주세요");
            f.coupon_start.focus();
            return;
         }
    	if(f.coupon_end.value ==""){
            alert("종료날짜 채워주세요");
            f.coupon_end.focus();
            return;
         }
    	
    	var isChecked = "";
    	if($("input:radio[id='exampleCheck1']").is(":checked")){	// 쳬크 되어있으면
    		isChecked = "%"
    	}
    	if($("input:radio[id='exampleCheck2']").is(":checked")){	// 쳬크 되어있으면
    		isChecked = "원"
    	}
    	
    	jQuery("#coupon_way").val(isChecked);
    	document.f.submit();
    	alert("쿠폰이 생성되었습니다.");
    	
    }
</script>
<body>
    <form name="f" action="./couponadd.do" method="post">
    <input type="hidden" name="coupon_way" id="coupon_way"/>
        <table border="1" width="100%">
            <tr align="center" style="height:50px">
                <td colspan="2" style="background-color:#343a40;color:white" align="center"> 쿠폰생성</td>
            </tr>
          	<tr style="height:40px">
          		<td style="background-color:#343a40;color:white" align="center">쿠폰명</td>
          		<td><input type="text" name="coupon_name"></td>
          	</tr>
          	<tr style="height:40px">
          		<td style="background-color:#343a40;color:white" align="center">할인방식</td>
          		<td>
          		<input type="radio" id="exampleCheck1" name="coupon" value="N">
				<label class="form-check-label" for="exampleCheck1">
					<span style="font-size:10pt">정율할인</span>
				</label>
				<input type="radio" id="exampleCheck2" name="coupon" value="Y">
				<label class="form-check-label" for="exampleCheck2">
					<span style="font-size:10pt">정액할인</span>
				</label>
          		</td>
          	</tr>
          	<tr style="height:40px" >
          		<td style="display:none;background-color:#343a40;color:white" align="center" id="n">할인율(%)</td>
          		<td style="background-color:#343a40;color:white" align="center" id="c">할인액(원)</td>
          		<td><input type="text" name="coupon_discount"></td>
          	</tr>
          	
         	<tr style="height:40px">
          		<td style="background-color:#343a40;color:white" align="center">쿠폰시작날짜</td>
          		<td><input type="date" name="coupon_start"></td>
          	</tr>
          	<tr style="height:40px">
          		<td style="background-color:#343a40;color:white" align="center">쿠폰종료날짜</td>
          		<td><input type="date" name="coupon_end"></td>
          	</tr>
          	<tr align="center" style="height:40px">
          		<td colspan="2">
          		<input type="button" value="생성완료" style="width:100px" onclick="check()">
          		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
          		</td>
          	</tr>
        </table>
    </form>
</body>
</html>


