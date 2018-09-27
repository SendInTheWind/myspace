<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	该页面用于显示个人信息
	<a href="${pageContext.request.contextPath}/jumpPersonalLostPickup.do">跳转到自己上传信息的界面</a>
	<a href="${pageContext.request.contextPath}/jumpLost.do">返回丢失物品界面</a>
	<form action="${pageContext.request.contextPath}/updateUser.do" method="post">
			用户Id：<input type="text" name="userId" value="${user.userId }"><br/>
			电话：<input type="text" name="userPhone" value="${user.userPhone}"><br/>
			密码：<input type="text" name="userPassword" value="${user.userPassword}"><br/>
			邮箱：<input type="text" name="userEmail" value="${user.userEmail}"><br/>
			昵称：<input type="text" name="userName" value="${user.userName}"><br/>
			头像：<input type="text" name="userHead" value="${user.userHead}"><br/>
			经验：<input type="text" name="userGrade" value="${user.userGrade}"><br/>
			<c:if test="${user.userGender=='男'}" >
				<label><input type="radio" name="userGender" value="男" checked="checked">男</label>
			</c:if>
			<c:if test="${user.userGender!='男'}" >
				<label><input type="radio" name="userGender" value="男" >男</label>
			</c:if>
			<c:if test="${user.userGender=='女'}" >
				<label><input type="radio" name="userGender" value="女" checked="checked">女</label>
			</c:if>
			<c:if test="${user.userGender!='女'}" >
				<label><input type="radio" name="userGender" value="女" >女</label>
			</c:if>
			<input type="submit" value="修改"/>
	</form>
	
</body>
</html>