package kr.smhrd.controller;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

public class MemberListController{
      public String requestHandler(HttpServletRequest request,HttpServletResponse response)
               throws ServletException, IOException{
    	  // Model과 연동(MemberDAO)
    	  MemberDAO dao=new MemberDAO();
    	  List<MemberVO> list=dao.memberList();    	 
    	  // 객체바인딩
    	  request.setAttribute("list", list);  
    	  // 다음페이지의 경로를 리턴
    	  return "/WEB-INF/member/memberList.jsp";
      }	
}
