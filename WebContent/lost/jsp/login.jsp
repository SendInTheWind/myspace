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
		${verifyError}${register}
		<form action="${pageContext.request.contextPath }/loginVerify.do" method="post">
			<input type="text" name="userPhone"/> <br/>
			<input type="password" name="userPassword"/> <br/>
			<input type="submit" value="登录"/> 
			<a href="${pageContext.request.contextPath }/jumpTourist.do"><input type="button" value="游客登录"></a>
			<a href="${pageContext.request.contextPath}/jumpRegister.do"><input type="button" value="注册"></a>
		</form>
		
	</div>
</body>
</html>