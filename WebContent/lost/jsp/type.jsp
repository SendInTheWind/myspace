<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>type的增删改查</title>
</head>
<body>
	${addType}
	<form action="${pageContext.request.contextPath}/jumpAddType.do" method="post">
		<table border="1">
			<tr>
				<td>类型的名字</td>
				<td><input type="submit" value="添加"/></td>
			</tr>
			<c:forEach items="${typeList}" var="tl">
				<tr>
					<td>${tl.typeName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/deleteType.do?typeId=${tl.typeId}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>