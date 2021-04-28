<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="kr.smhrd.model.*" %>
<%
          List<MemberVO> list=(List<MemberVO>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>회원관리시스템</h2>
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
      </tr>
    </thead>
    <tbody>
    <% for(int i=0;i<list.size();i++){
    	    MemberVO vo=list.get(i);
    	%>
      <tr>
        <td><%=vo.getNum()%></td>
        <td><%=vo.getId()%></td>
        <td><%=vo.getPass()%></td>
        <td><%=vo.getName()%></td>
        <td><%=vo.getAge()%></td>
        <td><%=vo.getEmail()%></td>
        <td><%=vo.getPhone()%></td>
      </tr>
    <% } %>
    </tbody>
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
