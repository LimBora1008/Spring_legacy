<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<!-- 
		이 부분에서 action 경로를 action, action2로 변경하면서 각 경로별로 테스트 
	-->
	<form name="frm" method="post"
		action="${pageContext.request.contextPath}/action1">
		<input type="text" id="name" name="name"> 
		<input type="submit" value="전송">
	</form>
</body>
</html>
