<%@page import="kr.smhrd.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
     MemberVO vo=(MemberVO)request.getAttribute("vo");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세보기</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2><%=vo.getName()%> 회원상세보기</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">
      <table class="table table-bordered">
          <tr>
             <td>번호</td>
             <td><%=vo.getNum()%></td>
          </tr>   
          <tr>
             <td>아이디</td>
             <td><%=vo.getId()%></td>
          </tr>         
          <tr>
             <td>비밀번호</td>
             <td><%=vo.getPass()%></td>
          </tr> 
          <tr>
             <td>나이</td>
             <td><%=vo.getAge()%></td>
          </tr> 
          <tr>
             <td>이메일</td>
             <td><%=vo.getEmail()%></td>
          </tr>   
          <tr>
             <td>전화번호</td>
             <td><%=vo.getPhone()%></td>
          </tr>                   
      </table>
    </div>
    <div class="panel-footer">
           지능형IoT융합SW전문가과정(NCS): 박매일
    </div>
  </div>
</div>
</body>
</html>