<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>

	<form action="join" method="post">
		<table align="center" border="1">

			<tr>
				<td colspan="3" align="center">
					<h2>회원 가입</h2>
				</td>
			</tr>
			<tr>
				<td align="right" width="100">아이디</td>
				<td><input type="text" name="id" required="required" /></td>
				<td><input type="button" name="check_id" value="중복확인" onclick="checkId" /></td>
			</tr>

			<tr>
				<td align="right" width="100">비밀번호</td>
				<td><input type="password" name="pw" required colspan="2" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="가입"
					align="right" /> <input type="reset" value="취소" /></td>
			</tr>


		</table>

	</form>
</body>
</html>