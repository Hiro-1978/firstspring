<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--  เพิ่ม tag เพื่อใช้ JSTL --> 
<%@ page language="java" contentType="utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}"  var="forum">
		${form.detail}<br>
	</c:forEach>
	
</body>
</html>