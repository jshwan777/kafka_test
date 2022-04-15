<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
테스트 메인 페이지 입니다.

<c:forEach var="member" items="${memberList}">
	<li>${member.mbrNm }</li>
</c:forEach>

</body>
</html>