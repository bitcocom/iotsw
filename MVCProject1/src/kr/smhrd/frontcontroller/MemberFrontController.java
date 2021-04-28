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
		     System.out.println("OK");
	}
}
