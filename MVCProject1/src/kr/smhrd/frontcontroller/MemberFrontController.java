package kr.smhrd.frontcontroller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.Controller;
import kr.smhrd.controller.MemberContentController;
import kr.smhrd.controller.MemberDeleteController;
import kr.smhrd.controller.MemberInsertController;
import kr.smhrd.controller.MemberInsertFormController;
import kr.smhrd.controller.MemberListController;
import kr.smhrd.controller.MemberUpdateController;
// Servlet API = (servlet-api.jar)
// WAS -> Servlet(용어) ?
@WebServlet("*.do") // Servlet mapping
public class MemberFrontController extends HttpServlet{
     public void service(HttpServletRequest request ,HttpServletResponse response) 
    		 throws ServletException, IOException{
		  
    	    request.setCharacterEncoding("utf-8"); // euc-kr
    	    // 1. 클라이언트의 요청을 파악하는 작업 
    	    String reqUrl=request.getRequestURI();    	    
    	    String cpath=request.getContextPath();
    	    String command=reqUrl.substring(cpath.length());
    	    System.out.println(command);
    	    Controller controller=null;
    	    String view=null;
    	    // 2. 각요청에 따른 분기작업
    	    // HandlerMapping
    	    HandlerMapping mappings=new HandlerMapping();
    	    controller=mappings.getController(command);
    	    // view=memberList -> forward
    	    // view=redirect:/mp/memberList.do ->redirect
    	    view=controller.requestHandler(request, response);
    	    if(view!=null) {
    	    	if(view.indexOf("redirect:")!=-1) {
    	    		response.sendRedirect(view.split(":")[1]);
    	    	}else {
    	    		RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeView(view));
    	    		rd.forward(request, response);
    	    	}
    	    }
	}
}