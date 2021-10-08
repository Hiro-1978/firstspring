<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--  เพิ่ม tag เพื่อใช้ JSTL --> 
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hiro11 ${sname}</h1><br>
Joker: ${joker.name}<br>
${joker.weight}<br><br>
<!-- Test JSTL -->
<!-- c:if ใช้เพื่อตรวจสอบเงื่อนไข -->
<c:if test= "${joker.weight<50 }">
	ผอมไป
</c:if>

<c:if test= "${joker.weight==''}"> <!-- ข้างในใส่ SingleCote -->
	ม่ายมีค่า
</c:if>

<c:if test= "${joker.weight!=''}">
	มีค่าเป็น ${joker.name}
</c:if>
	
<!-- End Test JSTL -->
<img src="apink.jpg" width=600>
<img src="../apink.jpg" width=600> <!-- ผลจากการเพิ่ม @RequestMapping("/v1") ที่ Controller -->

</body>
</html>