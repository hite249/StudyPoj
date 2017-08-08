<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
<a href="/main/main.do" >메인</a>
<a href="/board02/board.do" >게시판2</a>
<table>
<c:forEach items="${result2}" var="item" varStatus="status">
<tr>
	<td>
	<a href="/main/view.do?seq=${item.no}">
			${item.no} | ${status.count }
		</a>
	</td>
	<td>${item.subject}</td>
	<td>${item.content}</td>
	<td><c:if test="${item.no == '1'}">new</c:if></td>
</tr>
</c:forEach>
</table>

<c:forEach begin="1" end="10" var="item" varStatus="status">
	<span <c:if test="${param.page == item}">style='font-size:20px;'</c:if>>${item}</span>
</c:forEach>

</body>
</html>
