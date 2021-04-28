package kr.smhrd.frontcontroller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Servlet API = (servlet-api.jar)
// WAS -> Servlet(용어) ?
@WebServlet("*.do") // Servlet mapping
public class MemberFrontController extends HttpServlet{
     public void service(HttpServletRequest request ,HttpServletResponse response) 
    		 throws ServerException, IOException{
		     
    	    String reqUrl=request.getRequestURI();
    	    String cpath=request.getContextPath();
    	    String command=reqUrl.substring(cpath.length());
    	    System.out.println(command);
    	    
	}
}
