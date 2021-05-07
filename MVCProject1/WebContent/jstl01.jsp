<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="5" step="1">
  <font size="${i}">야호~</font><br>
</c:forEach>
<c:set var="a" value="10"/>
a=${a}<br>
<c:if test="${a%2==0}">
  짝수입니다.
</c:if>
<c:if test="${a%2!=0}">
  홀수입니다.
</c:if>
<br>
<c:choose>
   <c:when test="${a%2==0}">
            짝수입니다.
   </c:when>
   <c:when test="${a%2!=0}">
           홀수입니다.
   </c:when>
   <c:otherwise>
           일치하는 when이 없는 경우에 실행되는 부분
   </c:otherwise>
</c:choose>
</body>
</html>





