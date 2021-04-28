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
    	  //List<MemberVO> list=dao.memberList();
    	  List<MemberVO> list=new ArrayList<MemberVO>();
    	  MemberVO vo=new MemberVO();
    	  vo.setNum(1);
    	  vo.setId("admin");
    	  vo.setPass("admin");
    	  vo.setName("박매일");
    	  vo.setAge(39);
    	  vo.setPhone("010-1111-1111");
    	  vo.setEmail("bit@emaps.com");    	  
    	  list.add(vo);
    	  list.add(vo);
    	  list.add(vo);
    	  // 객체바인딩
    	  request.setAttribute("list", list);  
    	  // 다음페이지의 경로를 리턴
    	  return "/WEB-INF/member/memberList.jsp";
      }	
}
