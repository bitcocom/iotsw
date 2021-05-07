<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="kr.smhrd.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
    function delFn(num){
	    location.href="<c:url value='/memberDelete.do'/>?num="+num;	
	}  
    function goWriter(){
    	location.href="<c:url value='/memberInsertForm.do'/>";	
    }
    function goView(num){
    	location.href="<c:url value='/memberContent.do'/>?num="+num;	
    }
  </script>

</head>
<body>
 
<div class="container">
  <h2>회원관리시스템(MVC=FC+POJO+HM+VR+MyBatis+JSTL+EL)</h2>
  <div class="panel panel-default">
    <div class="panel-heading">
	 <form class="form-inline" action="?" method="post">
	  <div class="form-group">
	    <label for="id">ID:</label>
	    <input type="text" class="form-control" id="id" name="id">
	  </div>
	  <div class="form-group">
	    <label for="pass">PW:</label>
	    <input type="password" class="form-control" id="pass" name="pass">
	  </div>
	  <button type="submit" class="btn btn-default">로그인</button>
	  </form>
    </div>
    <div class="panel-body">
      <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>번호</th>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>나이</th>
        <th>이메일</th>
        <th>전화번호</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="vo" items="${list}"> 
      <tr>
        <td>${vo.num}</td>
        <td><a href="javascript:goView(${vo.num})">${vo.id}</a></td>
        <td>${vo.pass}</td>
        <td>${vo.name}</td>
        <td>${vo.age}</td>
        <td>${vo.email}</td>
        <td>${vo.phone}</td>
        <td><input type="button" value="삭제" onclick="delFn(${vo.num})"  class="btn btn-warning"/></td>
      </tr>
   </c:forEach>
    </tbody>
    <tr>
      <td colspan="8">
         <input type="button" value="회원가입" onclick="goWriter()" class="btn btn-default"/>
      </td>
    </tr>
  </table>
  </div>    
    </div>
   <div class="panel-footer">
         지능형IoT융합SW전문가과정(NCS): 박매일
   </div> 
  </div>
</div>
</body>
</html>
