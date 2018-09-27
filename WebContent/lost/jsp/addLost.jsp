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
	<a href="${pageContext.request.contextPath}/jumpLost.do">返回上一级</a>
	<form action="${pageContext.request.contextPath}/addLost.do" method="post">
			图片：<input type="text" name="lostHead"><br/>
			拾取地点：<input type="text" name="lostSite"><br/>
			拾取时间：<input type="text" name="lostTime"><br/>
			信息描述：<input type="text" name="lostDescribe"><br/>
			类型选择：	<label><input type="radio" name="lostJudge" value="0">拾取物品</label>
					<label><input type="radio" name="lostJudge" value="1">丢失物品</label><br />
			物品分类：
			<c:forEach items="${typeList}" var="tl">
				<label><input type="checkbox" name="lostTypeList[${tl.typeId }].typeId" value="${tl.typeId }">${tl.typeName}</label>
			</c:forEach> <br/>
			<input type="submit" value="提交"/>
	</form>
</body>
</html>