<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send_go(f) {
		const pwd = "${pwd}";
		const pwd2 = f.pwd.value;
		if (pwd==pwd2) {
			f.submit();
		}else {
			alert("비밀번호가 틀립니다.");
			f.pwd.value="";
			f.pwd.focus();
			return;
		}
	}
</script>
</head>
<body>
	<form action="/02_login/SessionController" method="post">
		<fieldset>
			<legend style="font-weight: bold; font-size: 20px;">비밀번호 확인</legend>
			<label for="pwd">PW : <input type="password" id="pwd" name="pwd"></label>
			<%-- 쿠키로 id도 가지고 있기 때문에 굳이 받을 필요 없다.
			<input type="hidden" name="id" value="${id}"> --%>
			<input type="hidden" name="cmd" value="s_profile_ok">
			<input type="button" value="비밀번호 확인" onclick="send_go(this.form)">
		</fieldset>
	</form>
</body>
</html>