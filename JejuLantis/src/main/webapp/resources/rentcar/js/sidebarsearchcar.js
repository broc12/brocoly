$(document).ready(function(){
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
    			if(!data){
    				
    			}else{
    				$("#result").empty();
    				var html = "<div id='inner'>";
    				if(data.length != 0){
						for (var i=0; i<data.length; i++) {
							html += "<div class='row'><div class='wrap-division'><div class='row'><div class='col-md-6 col-sm-6 animate-box'><div class='hotel-entry'>";
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
						}
						
					}else{
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
		  autoclose: true
		});

	jQuery('#date2').datepicker({
		  format: 'yyyy-mm-dd',
		  autoclose: true,
		  startDate: function(){
			  return "-Infinity";
		  }
		});
});