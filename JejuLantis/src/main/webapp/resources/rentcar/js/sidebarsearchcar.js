$(document).ready(
function(){
	$("input[type='checkbox']").click(function(){
    	var checkListmanu = [];
    	$("input[id='car_manufacture']").each(function(i){
    		if($(this).is(":checked")){
    			checkListmanu.push($(this).val());
    		}
    	});
    	var checkListfuel = [];
    	$("input[id='car_fuel']").each(function(i){
    		if($(this).is(":checked")){
    			checkListfuel.push($(this).val());
    		}
    	});
    	var checkListtype = [];
    	$("input[id='car_type']").each(function(i){
    		if($(this).is(":checked")){
    			checkListtype.push($(this).val());
    		}
    	});
    	var checkListoption = [];
    	$("input[id='car_option']").each(function(i){
    		if($(this).is(":checked")){
    			checkListoption.push($(this).val());
    		}
    	});
        $.ajax({
        	url:"searchcar.do",
            type:'GET',
            data:{"checkListmanu":checkListmanu,
            	"checkListfuel":checkListfuel,
            	"checkListtype":checkListtype,
            	"checkListoption":checkListoption,
            	"checkindate":$("#searchstartdate").val(),
            	"checkoutdate":$("#searchenddate").val(),
            	"car_name":$("#searchcarname").val()},
            success:function(data){
            	console.log(data);
            	var html = "<div id='inner'>";
    			if(!data){
    				html += "<p>검색결과없음</p>";
    			}else{
    				$("#result").empty();
    				if(data.length != 0){
						for (var i=0; i<data.length; i++) {							
							html += "<div class='row'><div class='wrap-division'><div class='row'><div class='col-md-6 col-sm-6 animate-box' style='width:40%;padding:0px'>";
							html += "<div class='hotel-entry' style='background-color:#f8fafb;padding:15px;height:410px'></br>";
							html += "<span style='color:black;font-size:18pt'>"+ data[i].car_name +"</span>";
							html += "<span style='color:black'>"+ data[i].car_manufacturer +"</span>";
							html += "<img width='100%' weight='200' src='resources/car/2017Avante.png'/><div class='desc'>";
							html += "<p align='center' style='color:#0090f0'>실시간 예약 가능 차량 : "+ data[i].cn +"</p>";
							html += "</div></br><div class='desc'><p align='center'>";
							html += "<span class='glyphicon glyphicon-road'>"+ data[i].car_type +"</span>";
							html += "<span class='glyphicon glyphicon-user'>"+ data[i].car_passenger +"인승</span>";
							html += "<span class='glyphicon glyphicon-tint'>"+ data[i].car_fuel +"</span>";
							html += "</p></div></div></div><div class='col-md-6 col-sm-6 animate-box' style='padding:0px;width:60%'>";
							html += "<div class='hotel-entry' style='background-color:white'><div class='desc' style='padding:15px;height:410px'></br>";
							html += "<span style='font-size:18pt;color:black'>"+ data[i].blist[0].branch_name +"</span><div align='right'>";
							html += "<span style='color:red;text-decoration: line-through'>43,000원</span>";
							html += "span style='font-size:18pt;color:black'>32,400원</span>";
							html += "</div><p class='star'><span><i class='icon-star-full'></i><i class='icon-star-full'></i>";
							html += "<i class='icon-star-full'></i><i class='icon-star-full'></i><i class='icon-star-full'></i></span> 545 Reviews</p>";
							html += "<span class='place'>"+ data[i].blist[0].car_kind_naviView + " " + data[i].blist[0].car_kind_sensorView +" "+ data[i].blist[0].car_kind_bluetoothView +" "+ data[i].blist[0].car_kind_blackboxView +" "+ data[i].blist[0].car_kind_sunroofView +" "+ data[i].blist[0].car_kind_cameraView +" "+ data[i].blist[0].car_kind_nonsmokeView +"</span>";
							html += "<div id='board'><table border='1' style='border-bottom:none;border-left:hidden;border-right:hidden' width='100%'  cellpadding='0' cellspacing='0'>";
							html += "<tr style='color:#717886;font-size:8pt'>";
							html += "<th  height='30px' width='23%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>대여업체</th>";
							html += "<th  width='7%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>평점</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>대여료</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>보험료</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>보상한도</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'>총 금액</th>";
							html += "<th  width='17%' class='text-center' style='background-color: #f8fafb;border-right: hidden;'></th></tr>";
							for (var j=0; j<data[i].blist.length; j++) {
								html += "<tr style='font-size:8pt;border-bottom: hidden'>";
								html += "<td height='50px' align='center' style='border-right: hidden'>"+ data[i].blist[j].branch_name +"</td>";
								html += "<td align='center' style='border-right: hidden'>"+ 4.5 +"</td>";
								html += "<td align='center' style='border-right: hidden'>"+ data[i].blist[j].car_kind_price_weekView +"원</td>";
								html += "<td align='center' style='border-right: hidden'>"+ data[i].blist[j].insurance_priceView +"원</td>";
								html += "<td align='center' style='border-right: hidden'>"+ "1,000만" +"원</td>";
								html += "<td align='center' style='border-right: hidden'>"+ data[i].blist[j].totView +"원</td>";
								html += "<td align='center'><button type='button' style='background-color:#f8fafb;border:0'><a href='rentcar.do' style='color:black;text-decoration:none'>실시간예약</a></button></td></tr>";
							}
							html += "</table></div></div></div></div></div></div></div>";
						}
    				}else{
							
							/*html += "<div class='row'><div class='wrap-division'><div class='row'><div class='col-md-6 col-sm-6 animate-box'><div class='hotel-entry'>";
							html += "<h3><a>" + data[i].car_name + "</a></h3><span class='place'>" + data[i].car_manufactur + "</span>";
							html += "<a class='hotel-img' style='background-image: url(resources/rentcar/images/car1.jpg);'>";
							html += "<p class='price'><span>" + data[i].mtotView + "</span><small>/24시간</small></p>";
							html += "</a><a>실시간 예약 가능 차량 : " + data[i].cn + "</a>";
							html += "<div class='desc'><p align='center'>" + data[i].car_passenger + "인승" + " " + data[i].car_type + " " + data[i].car_fuel + "</p>";
							html += "</div></div></div><div class='col-md-6 col-sm-6 animate-box'><div class='hotel-entry'><div class='desc'>";
							html += "<h3><a href='rentcar.do'>" + data[i].blist[0].branch_name + "</a></h3>";
							html += "<p class='star'><span><i class='icon-star-full'></i><i class='icon-star-full'></i><i class='icon-star-full'></i><i class='icon-star-full'></i><i class='icon-star-full'></i></span> ??? Reviews</p>";
							html += "<span class='place'>" + data[i].blist[0].car_kind_naviView + " " + data[i].blist[0].car_kind_sensorView +" "+ data[i].blist[0].car_kind_bluetoothView +" "+ data[i].blist[0].car_kind_blackboxView +" "+ data[i].blist[0].car_kind_sunroofView +" "+ data[i].blist[0].car_kind_cameraView +" "+ data[i].blist[0].car_kind_nonsmokeView;
							html += "</span><div id='board'><table border='1' width='100%'  cellpadding='0' cellspacing='0'><tr style='color:white;font-size:8pt'>";			
							html += "<th  height='30px' width='23%' class='text-center' style='background-color: #01bbf0'>대여업체</th>";
							html += "<th  width='7%' class='text-center' style='background-color: #01bbf0'>평점</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #01bbf0'>대여료</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #01bbf0'>보험료</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #01bbf0'>보상한도</th>";
							html += "<th  width='12%' class='text-center' style='background-color: #01bbf0'>총 금액</th>";
							html += "<th  width='17%' class='text-center' style='background-color: #01bbf0'></th></tr>";
							for (var j=0; j<data[i].blist.length; j++) {
								html += "<tr style='font-size:8pt'>";
								html += "<td align='center'>" + data[i].blist[j].branch_name + "</td>";
								html += "<td align='center'>" + "XX" +"</td>";
								html += "<td align='center'>" + data[i].blist[j].car_kind_price_weekView + "원</td>";
								html += "<td align='center'>" + data[i].blist[j].insurance_priceView + "원</td>";
								html += "<td align='center'>" + "XX" + "만원</td>";
								html += "<td align='center'>" + data[i].blist[j].totView + "원</td>";
								html += "<td align='center'>";												
								html += "<button type='button'><a href='rentcar.do?kno=" + data[i].blist[j].car_kind_no + "' style='color:black'>실시간예약</a></button></td></tr>";		
							}
							html += "</table></div></div></div></div></div></div></div><hr>";
						}*/
    					html += "<p>검색결과없음</p>";
					}
    				html += "</div>";
    				$("#result").append(html);
					
    			}
            },
            error:function(jqXHR, textStatus, errorThrown){
                alert("검색 실패\n서버 오류" + textStatus + " : " + errorThrown);
                self.close();
            }
        });
    });
	
	jQuery('#date1').datepicker({
		  format: 'yyyy-mm-dd',
		  autoclose: true,
		  startDate:"today"
		});
	$('#date1').on('changeDate', function() {
	    var temp = $('#date1').datepicker('getFormattedDate');
	    var c = new Date(temp);
	    c.setDate(c.getDate()+1);
	    $('#date2').val( c.getFullYear()+"-"+("0"+(c.getMonth()+1)).slice(-2) +"-"+("0"+(c.getDate())).slice(-2) );
	    $('#date2').datepicker('setStartDate',c.getFullYear()+"-"+ (c.getMonth()+1) +"-" + c.getDate());
	    c.setDate(c.getDate()+6);
	    $('#date2').datepicker('setEndDate',c);
	});
	jQuery('#date2').datepicker({
		  format: 'yyyy-mm-dd',
		  autoclose: true,
		  startDate:"today"
	});
	$('#date2').on('changeDate', function() {
		var a = new Date($('#date2').datepicker('getFormattedDate'));
	    var b = new Date($('#date1').datepicker('getFormattedDate'));
	    if(a<b){
	    	$('#date1').val(
	    	        $('#date2').datepicker('getFormattedDate')
	    	    );
	    }
	});
$("#searchbutton").click(
function(){
	
	var startT = new Date(document.getElementById("date1").value+" "+document.getElementById("Checkintime").value);
	var endT = new Date(document.getElementById("date2").value+" "+document.getElementById("Checkouttime").value);
	console.log(startT);
	console.log(endT);
	$.ajax({
    	url:"currenttime.do",
        type:'GET',
        error:function(error) {
            alert("서버와 연결에 실패하엿습니다.");
        },
        success:function(data){
        	if(data!=null){
	        	var d = JSON.parse(data);
	        	var currnetT = new Date(d);
	        	console.log(currnetT);
	        	if(currnetT.getFullYear()==startT.getFullYear()&&
	        			currnetT.getMonth()==startT.getMonth()&&
	        			currnetT.getDate()==startT.getDate()&&
	        			startT.getHours()<14){
	        		alert("당일 예약은 14시 이후부터 가능합니다.");
	        		return false;
	        	}
	        	if(startT<currnetT){
	        		alert("현재 시각 이후부터 검색 가능합니다.");
	        		return false;
	        	}
	        	if(endT<startT){
	        		alert("예약 종료시간이 시작 시간보다 빠릅니다.");
	        		return false;
	        	}
	        	var g = endT-startT;
	        	if((g/3600000)<24){
	        		alert("최소 예약 시간은 24시간입니다.");
	        		return false;
	        	}
	        	if((g/3600000)>180){
	        		alert("최대 예약 시간은 180시간 입니다.");
	        		return false;
	        	}
	        	$("#searchform").submit();
        	}else{
        		alert("서버와 연결에 실패하엿습니다.");
        	}
        }
	});
/*	if(endT<startT){
		alert("시간오류");
		return false;
	}
	var g = endT-startT;
	if((g/3600000)<24){
		alert("최소시간 오류");
		return false;
	}
	if((g/3600000)>180){
		alert("최대시간 오류");
		return false;
	}*/
	/*$("#searchform").submit();*/
});
});