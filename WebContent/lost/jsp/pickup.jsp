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
	<a href="${pageContext.request.contextPath}/jumpPersonalCenter.do">个人中心</a>
	<a href="${pageContext.request.contextPath}/jumpLost.do">丢失物品</a>
	<a href="${pageContext.request.contextPath}/jumpAddLost.do">添加物品</a>
	
	<table border="1">
			<tr>
				<td>图片</td>
				<td>拾取地点</td>
				<td>拾取时间</td>
				<td>物品描述</td>
				<td>物品分类</td>
			</tr>
			<c:forEach items="${pickupList}" var="pl">
				<tr>
					<td><a href="">${pl.lostHead}</a></td>
					<td>${pl.lostSite}</td>
					<td>${pl.lostTime}</td>
					<td>${pl.lostDescribe}</td>
					<td>
						<c:forEach items="${pl.lostTypeList}" var="ltl">
							${ltl.typeName}
						</c:forEach>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/deleteLost.do?lostId=${ll.lostId}">删除</a>
						<a href="${pageContext.request.contextPath}/updateLost.do?lostId=${ll.lostId}">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>