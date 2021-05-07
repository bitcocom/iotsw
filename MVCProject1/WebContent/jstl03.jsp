<%@page import="java.util.ArrayList"%>
<%@page import="kr.smhrd.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
   // ArrayList
   ArrayList<MemberVO> list=new ArrayList<MemberVO>();
   MemberVO vo=new MemberVO();
   vo.setName("홍길동");
   vo.setEmail("bit@empas.com");
   vo.setPhone("010-1111-1111");
   
   list.add(vo);
   list.add(vo);
   list.add(vo);
      
   request.setAttribute("list", list); // items="${list}"   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="vo" items="${list}">
 ${vo.name}, ${vo.email}, ${vo.phone}<br>
</c:forEach>
</body>
</html>