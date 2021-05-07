package kr.smhrd.frontcontroller;

public class ViewResolver {
   public static String makeView(String view) {
	   return "/WEB-INF/member/"+view+".jsp";
   }
}
