<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.form{
		display: inline-block;
	}
</style>
</head>
<body>
	<c:if test="${svo==null}">
		<form action="/02_login/SessionController" method="post" class="form">
			<input type="submit" value="로그인">
			<input type="hidden" name="cmd" value="s_login">
		</form>
		<form action="/02_login/SessionController" method="post" class="form">
			<input type="submit" value="회원가입">
			<input type="hidden" name="cmd" value="s_join">
	</form>
	</c:if>
	<c:if test="${svo!=null}">
		<span class="form">${svo.name}님 환영합니다.</span>
		<form action="/02_login/SessionController" method="post" class="form">
			<%-- 이거 대신에 CookieLoginOkCommand에서 id와 pwd를 cookie에 담았다.
			<input type="hidden" name="id" value="${cvo.id}">
			<input type="hidden" name="pwd" value="${cvo.pwd}">
			 --%>
			<input type="submit" value="마이페이지">
			<input type="hidden" name="cmd" value="s_profile">
		</form>
		<form action="/02_login/SessionController" method="post" class="form">
			<input type="submit" value="로그아우웃">
			<input type="hidden" name="cmd" value="s_logout">
		</form>
	</c:if>
</body>
</html>