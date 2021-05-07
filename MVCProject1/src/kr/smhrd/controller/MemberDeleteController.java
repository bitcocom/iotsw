package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
public class MemberDeleteController implements Controller{
    public String requestHandler(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
    	
    	String cpath=request.getContextPath();
    	int num=Integer.parseInt(request.getParameter("num"));
    	
    	MemberDAO dao=new MemberDAO();
    	int cnt=dao.memberDelete(num);
    	String view=null;
    	if(cnt>0) {
    		// 삭제가성공하면->/mp
    		view="redirect:"+cpath+"/memberList.do";
    	}else {
    		throw new ServletException("error");
    	}    	
    	return view;
    }
}
