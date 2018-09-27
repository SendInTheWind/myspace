<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		${registerError}
		<a href="${pageContext.request.contextPath}/jumpLogin.do">登录</a>
		<form action="${pageContext.request.contextPath}/register.do" method="post">
			电话：<input type="text" name="userPhone"><br/>
			密码：<input type="text" name="userPassword"><br/>
			邮箱：<input type="text" name="userEmail"><br/>
			昵称：<input type="text" name="userName"><br/>
			头像：<input type="text" name="userHead"><br/>
			<label><input type="radio" name="userGender" value="男" checked="checked"/>男</label>
			<label><input type="radio" name="userGender" value="女" />女<label><br/>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>