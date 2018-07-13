$(document).ready(function(){
	$("input[type='checkbox']").click(function(){
    	var list_manufactur_val = [];
    	$("input[id='car_kind_manufactur']").each(function(i){
    		list_manufactur_val.push($(this).is(":checked")+":"+$(this).val());
    		});
    	var list_manufactur_id = [];
    	$("input[id='car_kind_manufactur']").each(function(i){
    		list_manufactur_id.push($(this).val());
    		});
    	var list_fuel_val = [];
    	$("input[id='car_kind_fuel']").each(function(i){
    		list_fuel_val.push($(this).is(":checked"));
    		});
    	var list_fuel_id = [];
    	$("input[id='car_kind_fuel']").each(function(i){
    		list_fuel_id.push($(this).val());
    		});
    	var list_type_val = [];
    	$("input[id='car_kind_type']").each(function(i){
    		list_type_val.push($(this).is(":checked"));
    		});
    	var list_type_id = [];
    	$("input[id='car_kind_type']").each(function(i){
    		list_type_id.push($(this).val());
    		});
    	var list_option_val = [];
    	$("input[id='car_kind_option']").each(function(i){
    		list_option_val.push($(this).is(":checked"));
    		});
    	var list_option_id = [];
    	$("input[id='car_kind_option']").each(function(i){
    		list_option_id.push($(this).val());
    		});
        $.ajax({
            url:"searchcar.do",
            type:'GET',
            data:{"list_manufactur_val":list_manufactur_val},
            success:function(data){
                alert("완료!");
            },
            error:function(jqXHR, textStatus, errorThrown){
                alert("에러 발생~~ \n" + textStatus + " : " + errorThrown);
                self.close();
            }
        });
    });
});