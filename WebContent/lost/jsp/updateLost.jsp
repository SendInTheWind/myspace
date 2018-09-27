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
		<form action="${pageContext.request.contextPath}/updateLost.do" method="post">
			<input type="text" name="lostId" value="${lost.lostId }"><br/>
			图片：<input type="text" name="lostHead" value="${lost.lostHead}"><br/>
			拾取地点：<input type="text" name="lostSite" value="${lost.lostSite}"><br/>
			拾取时间：<input type="text" name="lostTime" value="${lost.lostTime}"><br/>
			信息描述：<input type="text" name="lostDescribe" value="${lost.lostDescribe}"><br/>
			类型选择：	
				<c:if test="${lost.lostJudge==0}">
					<label><input type="radio" name="lostJudge" value="0" checked="checked">拾取物品</label>
				</c:if>
				<c:if test="${lost.lostJudge!=0}">
					<label><input type="radio" name="lostJudge" value="0">拾取物品</label>
				</c:if>
				<c:if test="${lost.lostJudge==1}">
					<label><input type="radio" name="lostJudge" value="1" checked="checked">丢失物品</label>
				</c:if>
				<c:if test="${lost.lostJudge!=1}">
					<label><input type="radio" name="lostJudge" value="1">丢失物品</label>
				</c:if> <br />
			物品分类：
			<c:forEach items="${typeList}" var="tl">
				<c:set var="checked" value=""></c:set>
				<c:forEach items="${lost.lostTypeList}" var="ltl">
					<c:if test="${tl.typeId==ltl.typeId }">
						<c:set var="checked" value="checked"></c:set>
					</c:if>
				</c:forEach>
				<label><input type="checkbox" name="lostTypeList[${tl.typeId }].typeId" value="${tl.typeId }" ${checked}>${tl.typeName}</label>
			</c:forEach> <br/>
					
			<input type="submit" value="提交"/>
	</form>
</body>
</html>