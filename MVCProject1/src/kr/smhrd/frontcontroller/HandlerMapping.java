package kr.smhrd.frontcontroller;

import java.util.HashMap;

import kr.smhrd.controller.Controller;
import kr.smhrd.controller.MemberContentController;
import kr.smhrd.controller.MemberDeleteController;
import kr.smhrd.controller.MemberInsertController;
import kr.smhrd.controller.MemberInsertFormController;
import kr.smhrd.controller.MemberListController;
import kr.smhrd.controller.MemberUpdateController;

public class HandlerMapping {
   private HashMap<String, Controller> mappings;
   public HandlerMapping() {
	   mappings=new HashMap<String, Controller>();
	   mappings.put("/memberList.do", new MemberListController());
	   mappings.put("/memberInsert.do", new MemberInsertController());
	   mappings.put("/memberDelete.do", new MemberDeleteController());
	   mappings.put("/memberInsertForm.do", new MemberInsertFormController());
	   mappings.put("/memberContent.do", new MemberContentController());
	   mappings.put("/memberUpdate.do", new MemberUpdateController());
       
   }
   public Controller getController(String command) {
	   return mappings.get(command);
   }
}
/*
            if(command.equals("/memberList.do")) {
    	    	controller=new MemberListController();    	       	
    	    }else if(command.equals("/memberInsert.do")) {
    	    	controller=new MemberInsertController();      	        
      	    }else if(command.equals("/memberDelete.do")) {
    	        controller=new MemberDeleteController();
    	    }else if(command.equals("/memberInsertForm.do")) {
    	        controller=new MemberInsertFormController();
    	    }else if(command.equals("/memberContent.do")) {
    	        controller=new MemberContentController();
    	    }else if(command.equals("/memberUpdate.do")) {
    	    	controller=new MemberUpdateController();
       	    }



*/