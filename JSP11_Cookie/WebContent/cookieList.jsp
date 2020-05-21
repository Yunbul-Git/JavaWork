<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>cookie 리스트</title>
</head>
<body>
	<%
		// 사용자 컴퓨터 안의 쿠키 정보는 request 시에 서버로 전달된다.
		// request.getCookies() 로 쿠기 받아온다.
		Cookie[] cookies = request.getCookies(); // Cookie[] 배열 리턴

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				String cookieName = cookies[i].getName(); // 쿠키'이름'
				String cookieValue = cookies[i].getValue(); // 쿠키'값'
				out.println((i + 1) + "] " + cookieName + " : " + cookieValue + "<br>");
			}
		} else {
			out.println("쿠키가 없습니다");
		}
	%>
	
<hr>
<form action="cookieCreate.jsp">
	<input type="submit" value="쿠키생성&갱신">
</form>	
<br>
<form action="cookieDelete.jsp">
	<input type="submit" value="쿠키삭제">
</form>
</body>
</html>