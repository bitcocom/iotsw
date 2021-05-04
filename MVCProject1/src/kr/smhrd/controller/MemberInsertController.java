package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

public class MemberInsertController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 파라메터수집(VO)
		  String id = request.getParameter("id");
	      String pass = request.getParameter("pass");
	      String name = request.getParameter("name"); //한글
	      int age = Integer.parseInt(request.getParameter("age"));
	      String email = request.getParameter("email");
	      String phone = request.getParameter("phone");
	      
	      MemberVO vo=new MemberVO();
	      vo.setId(id);
	      vo.setPass(pass);
	      vo.setName(name);
	      vo.setAge(age);
	      vo.setEmail(email);
	      vo.setPhone(phone);		
		
	      MemberDAO dao=new MemberDAO();
	      int cnt=dao.memberInsert(vo);
	      String view=null;
	      if(cnt>0) {
	    	  //성공->
	    	  view="/mp/memberList.do";
	      }else {
	    	  throw new ServletException("error");
	      }	      
		return view;
	}	
}
