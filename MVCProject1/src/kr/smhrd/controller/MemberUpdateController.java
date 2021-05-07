package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;
public class MemberUpdateController implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 String cpath=request.getContextPath();
        //파라메터수집(VO)   
		  int num =Integer.parseInt(request.getParameter("num"));
	      int age = Integer.parseInt(request.getParameter("age"));
	      String email = request.getParameter("email");
	      String phone = request.getParameter("phone");
	      
	      MemberVO vo=new MemberVO();
	      vo.setNum(num);
	      vo.setAge(age);
	      vo.setEmail(email);
	      vo.setPhone(phone);		
		
		  MemberDAO dao=new MemberDAO();
		  int cnt=dao.memberUpdate(vo);
		  String view=null;
		  if(cnt>0) {
			  view="redirect:"+cpath+"/memberList.do";
		  }else {
			 throw new ServletException("error"); 
		  }
		
		return view;
	}

}
