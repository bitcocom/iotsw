<%@page import="kr.smhrd.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세보기</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
    function goList(){
       location.href="<c:url value='/memberList.do'/>";	
    }  
  </script>
</head>
<body>
<div class="container">
  <h2>${vo.name} 회원상세보기</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">
    <form action="<c:url value='/memberUpdate.do'/>" method="post">
      <input type="hidden" name="num" value="${vo.num}"/> 
      <table class="table table-bordered">
          <tr>
             <td>번호</td>
             <td>${vo.num}</td>
          </tr>   
          <tr>
             <td>아이디</td>
             <td>${vo.id}</td>
          </tr>         
          <tr>
             <td>비밀번호</td>
             <td>${vo.pass}</td>
          </tr> 
          <tr>
             <td>나이</td>
             <td><input type="text" name="age" value="${vo.age}" class="form-control input-sm" style="width: 20%"/></td>
          </tr> 
          <tr>
             <td>이메일</td>
             <td><input type="text" name="email" value="${vo.email}" class="form-control input-sm" style="width: 30%"/></td>
          </tr>   
          <tr>
             <td>전화번호</td>
             <td><input type="text" name="phone" value="${vo.phone}" class="form-control input-sm" style="width: 30%"/></td>
          </tr> 
          <tr>
            <td align="center" colspan="2">
                <input type="submit" value="수정하기" class="btn btn-primary"/>
                <input type="reset" value="취소" class="btn btn-warning"/>
                <input type="button" value="리스트" class="btn btn-success" onclick="goList()"/>
            </td>
          </tr>                  
      </table>
      </form>
    </div>
    <div class="panel-footer">
           지능형IoT융합SW전문가과정(NCS): 박매일
    </div>
  </div>
</div>
</body>
</html>