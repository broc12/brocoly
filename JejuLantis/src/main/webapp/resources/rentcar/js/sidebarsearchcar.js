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
    		checkListoption.push($(this).val()+":"+$(this).is(":checked"));
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
            },
            error:function(jqXHR, textStatus, errorThrown){
                alert("검색 실패\n서버 오류" + textStatus + " : " + errorThrown);
                self.close();
            }
        });
    });
});