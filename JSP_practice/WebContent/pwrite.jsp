<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
function chkSubmit(){
	if(name == ""){
		alert("작성자는 반드시 입력해야합니다.")
		return false;
	}
	if(subject == ""){
		alert("제목은 반드시 입력해야합니다.")
		return false;
	}
	
}
</script>
<body>
<h3>Write Content</h3>
작성자 : <input type="text" name="name">
<br><br>
제목 : <input type="text" name="subject"><br><br>
내용<br>
<textarea name="content">
</textarea>
<br><br><br>
<button onclick="chkSubmit()">등록하기</button>
<button onclick="location.href = 'plist.jsp'">목록으로</button>
</body>
</html>