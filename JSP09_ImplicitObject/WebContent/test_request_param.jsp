<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>request parameter</title>
</head>
<body>
<%!
	String data1, data2;
	String name, id, pw, gender, local, memo;
	String [] hobbys;
%>
<%
	request.setCharacterEncoding("utf-8");
	data1 = request.getParameter("data1");
	data2 = request.getParameter("data2");
	name = request.getParameter("name");
	id = request.getParameter("id");		
	pw = request.getParameter("pw");
	local = request.getParameter("local");
	gender = request.getParameter("gender");
	hobbys = request.getParameterValues("hobby");
	memo = request.getParameter("memo");
%>

hidden : <%= data1 %>, <%= data2 %><br>
이름 : <%= name %><br>
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>
지역 : <%= local %><br>
성별 : <%= gender %><br>
취미 : <%= Arrays.toString(hobbys) %><br>
메모 : <%= memo %><br>

</body>
</html>