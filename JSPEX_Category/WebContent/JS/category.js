$(document).ready(function(){
	$("#box1").attr("disabled", false);
	loadPage();
	
	// 첫번째 상자를 고르면 두번째 상자에 값 불러오는 코딩
	
});
function loadPage(name){
	
	$.ajax({
		url : "cate.ajax?name = " + name
		, type : "GET"
		, cache : false
		, success : function(data, status){
			if(status == "success"){
				updateList(data)
			}
		}
	})
}

function updateList(jsonObj){
	result = "";
	
	if(jsonObj.status == "OK"){
		
		var count = jsonObj.count;
		
		
		var i;
		var items = jsonObj.data;
		result += "<option> --선택하세요-- </option>";
		for(i = 0; i < count; i++){
			result += "<option>" + items[i].name + "</option>";
		}
		$('#box1').html(result);
	}
}
