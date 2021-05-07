<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
  <h2>회원가입화면</h2>
  <div class="panel panel-default">
    <div class="panel-heading">
         회원로그인 성공(누구님이 로그인 하였습니다.)
         환영합니다.    
    </div>
    <div class="panel-body">
    <form action="<c:url value='/memberInsert.do'/>" method="post">
       <table class="table table-bordered">
          <tr>
            <td>아이디</td>
            <td><input type="text" id="id" name="id" class="form-control input-sm" style="width: 30%"/></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type="password" id="pass" name="pass" class="form-control input-sm" style="width: 30%"/></td>
          </tr>
         <tr>
            <td>이름</td>
            <td><input type="text" id="name" name="name" class="form-control input-sm" style="width: 30%"/></td>
          </tr>  
         <tr>
            <td>나이</td>
            <td><input type="text" id="age" name="age" class="form-control input-sm" style="width: 10%"/></td>
          </tr> 
         <tr>
            <td>이메일</td>
            <td><input type="text" id="email" name="email" class="form-control input-sm" style="width: 40%"/></td>
          </tr> 
         <tr>
            <td>전화번호</td>
            <td><input type="text" id="phone" name="phone" class="form-control input-sm" style="width: 40%"/></td>
          </tr> 
          <tr>
             <td colspan="2" style="text-align: center;">
                  <input type="submit" value="가입" class="btn btn-primary">
                  <input type="reset" value="취소" class="btn btn-warning">
                  <input type="button" value="리스트" class="btn btn-success" onclick="goList()">
             </td>
          </tr>                                 
       </table> 
       </form>   
    </div>
    <div class="panel-footer">지능형IoT융합SW전문가과정(NCS):박매일</div>
  </div>
</div>
</body>
</html>