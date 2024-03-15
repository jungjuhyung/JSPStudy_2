<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	1. http://www,servlets.com에서 라이브러리 다운로드하자
		-> COS File Upload Library -> cos-22.05.zip 다운
	2. 다운로드한 라이브러리를 WEB-INF의 lib 폴더에 넣어준다.
		cos-22.05.zip -> lib 안에 있는 .jar 파일을 넣어준다. => 해
	3. 업로드 시 반드시 <form action="" method="post" enctype="multipart/form-data"></form>로 설정해야 된다.
	
	주의사항) 이클립스로 실행해서 업로드하면 실제 파일 위치는 가상 톰켓에 저장된다.
			프로젝트 때는 원하는 위치에 저장하는 방법을 배울 예정
 --%>
 	<form action="/02_login/FileUpController" method="post" enctype="multipart/form-data">
 		<p>올린사람 : <input type="text" name="name"></p>
 		<p>첨부파일 : <input type="file" name="f_name"></p>
 		<input type="submit" value="업로드">
 	</form>
</body>
</html>