<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>개인정보</h2>
	<form action="/02_login/SessionController" method="post" autocomplete="off">
		<p> Name : ${svo.name}</p>
		<p> Email : ${svo.email}</p>
		<p> Addr : ${svo.addr}</p>
		<p> Phone : ${svo.phone}</p>
		<input type="hidden" name="cmd" value="">
		<input type="submit" value="수정">
	</form>
</body>
</html>