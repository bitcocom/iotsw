package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

public class MemberContentController implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num=Integer.parseInt(request.getParameter("num"));
		
		MemberDAO dao=new MemberDAO();
		
		MemberVO vo=dao.memberContent(num);
		request.setAttribute("vo", vo);
		// "/WEB-INF/member/memberContent.jsp" //View의 물리적인이름
		return "memberContent";// View의 논리적인이름
	}

	
}
