package kr.smhrd.frontcontroller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.MemberDeleteController;
import kr.smhrd.controller.MemberInsertFormController;
import kr.smhrd.controller.MemberListController;
// Servlet API = (servlet-api.jar)
// WAS -> Servlet(용어) ?
@WebServlet("*.do") // Servlet mapping
public class MemberFrontController extends HttpServlet{
     public void service(HttpServletRequest request ,HttpServletResponse response) 
    		 throws ServletException, IOException{
		    // 1. 클라이언트의 요청을 파악하는 작업 
    	    String reqUrl=request.getRequestURI();    	    
    	    String cpath=request.getContextPath();
    	    String command=reqUrl.substring(cpath.length());
    	    System.out.println(command);
    	    // 2. 각요청에 따른 분기작업
    	    if(command.equals("/memberList.do")) {
    	    	MemberListController controller=new MemberListController();
    	    	///WEB-INF/member/memberList.jsp
    	    	String view=controller.requestHandler(request, response);
    	    	RequestDispatcher rd=request.getRequestDispatcher(view);
    	    	rd.forward(request, response);    	    	
    	    }else if(command.equals("/memberInsert.do")) {
    	        //POJO	
    	    	   	    	
    	    }else if(command.equals("/memberDelete.do")) {
    	        MemberDeleteController controller=new MemberDeleteController();
    	        // /mp/memberList.do
    	        String view=controller.requestHandler(request, response);
    	    	response.sendRedirect(view);   	    	
    	    }else if(command.equals("/memberInsertForm.do")) {
    	        MemberInsertFormController controller=new MemberInsertFormController();
    	        String view=controller.requestHandler(request, response);
    	        RequestDispatcher rd=request.getRequestDispatcher(view);
    	    	rd.forward(request, response);    	  	    	
    	    }      	    
	}
}