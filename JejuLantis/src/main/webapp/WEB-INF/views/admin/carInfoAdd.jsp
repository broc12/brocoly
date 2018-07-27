<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<title>BLUEB</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>document.write(document.lastModified); //일자</script>
<script language="JavaScript">
var lineNo = 0; 
var beforeNo = 0; 

function insertLine(){
	lineNo++;
	var html = "<tr id=content_"+lineNo+">";
html+="<td>"+num+"</td><td><select name=carKind id=carKind";
html+="<option value='#' style='color:black'></option>";
html+="<option value='경차' style='color:black'>경차</option>";
html+="<option value='중소형' style='color:black'>중소형</option>";
html+="<option value='중형' style='color:black'>중형</option>";
html+="<option value='고급' style='color:black'>고급</option>";
html+="<option value='SUV' style='color:black'>SUV</option>";
html+="<option value='승합' style='color:black'>승합</option>";
html+="<option value='수입' style='color:black'>수입</option>";
html+="</select></td><td><input type=text size=15 name=carNumber id=carNumber</td>";
html+="<td><input type=button value=삭제 onclick='del("+lineNo+")' style=\"background:#abcdef;border:1x solid black\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >";
html+="</td></tr>";		
$("#content_"+beforeNo).after(html);
beforeNo++;
num++;
}


/* $(document).ready(function(){
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
}) */

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
		
function input_del_1(no){
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
} 

</script>
<body>
<form name=form1 id=form1 method='post' action='carInfoInsert.do' >		
<table border=0 cellpadding=4 cellspacing=1 bgcolor=777777 width=400>
<td><span style="cursor:hand;color:navy;text-decoration:underline" onClick="insertLine()" onMouseOver="this.style.color='red'" onMouseOut="this.style.color='navy'">입력양식 늘이기</span></td>
<tr bgcolor=white>
</tr>

<tr bgcolor=white>
	<td>
	<table border=1 width=100%>
	<tr>	
	<th width=30%>No.</th>
	<th width=30%>차종</th>
	<th width=40%>차 번호</th>
</tr>
				<script>
				var num=1;
/* 				for(var ii=in_sum ;ii<  parseInt(max_input)+ parseInt(in_sum);ii++){  */
				for(var ii=0 ;ii<  parseInt(max_input);ii++){ 
					/* for(var ii=0 ;ii<parseInt(in_sum);ii++){ */
						document.write("<tr id=content_"+ii+">");
						document.write("<td>");
						document.write(num);
						document.write("</td>");
						document.write("<td>");
						document.write("<select name=carKind id=carKind");											
						document.write("<option value='#' style='color:black'></option>");
						document.write("<option value='경차' style='color:black'>경차</option>");
						document.write("<option value='중소형' style='color:black'>중소형</option>");
						document.write("<option value='중형' style='color:black'>중형</option>");
						document.write("<option value='고급' style='color:black'>고급</option>");
						document.write("<option value='SUV' style='color:black'>SUV</option>");
						document.write("<option value='승합' style='color:black'>승합</option>");
						document.write("<option value='수입' style='color:black'>수입</option>");
						document.write("</select>");
						document.write("</td>");
						document.write("<td>");
						document.write("<input type=text size=15 name=carNumber id=carNumber");
						document.write("</td>");
						document.write("<td>");
						document.write("<input type=button value=삭제 onclick='input_del_1("+num+")' style=\"background:#abcdef;border:1x solid black\" onMouseOrver=\"this.style.background:#000000;border:1x solid black\" >");
						document.write("</td>");
						document.write("</tr>");
						num++;
				}
				</script>
			</table>
	</td>
</tr>
<tr bgcolor=white>
	<td align=center><a href='javascript:document.form1.reset();'>reset</a> /
	<button type="submit" class="btn btn-primary" style="border-radius:0px" id="save">저장</button>
	</td>
</tr>
<input type=hidden name=max_1 value=0>
</table>
</form>
</HTML>
