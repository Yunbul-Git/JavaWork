<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cookieName1 = "num";
	String cookieValue1 = "" + (int)(Math.random() * 10);
	Cookie cookie1 = new Cookie(cookieName1, cookieValue1); // 이름-값으로 쿠키 생성
	cookie1.setMaxAge(2 * 30); // 쿠키 파기(expirt) 시간 설정 (생성 시점으로 부터 2*30 초 후 )
	response.addCookie(cookie1);
	
	// 쿠키는 얼마든지 생성 가능.
	String cookieName2 = "datetime";
%>
<script>
alert("<%= cookieName1%> 쿠키 생성");
location.href = "cookieList.jsp";
</script>