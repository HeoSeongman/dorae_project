<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin/memberJoin">
		<p>아이디 : <input name="id"></p>
		<p>닉네임 : <input name="nickname"></p>
		<p>이름 : <input name="name"></p>
		<p>이메일 : <input type="email" name="email"></p>
		<p>성별 : <input name="gender"></p>
		<p>나이 : <input name="age"></p>
		<p>생일 : <input name="birthday"></p>
		<p>프로필 사진 : <input name="profile_image"></p>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>