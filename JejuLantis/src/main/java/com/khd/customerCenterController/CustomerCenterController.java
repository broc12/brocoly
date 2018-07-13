package com.khd.customerCenterController;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.customerCenterService.CustomerCenterService;
import com.khd.model.CustomerCenter;
import com.khd.model.Member;
import com.khd.model.Qna;


/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerCenterController {
	
	@Autowired 
	private CustomerCenterService service;
	
	@RequestMapping(value="service.do",method=RequestMethod.GET)
	public ModelAndView list(@RequestParam(value="strInput",required=false) String strInput) {
		//System.out.println(input);
		//if(input == 0) input=1;
		int input;
		if (strInput==null) {
		input = 1;
		}else input =Integer.parseInt(strInput);
		long totalNum = service.totalNum();
		int showList = 10;
		int betweenA = ((input-1)*showList)+1;
		int betweenB = showList*input;	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", betweenA);
		map.put("B", betweenB);
		long totalPage = 0;
			if(totalNum%showList!=0){
				totalPage = (totalNum/showList)+1;
			}else {
				totalPage =(totalNum/showList);
			}

		List<CustomerCenter> list = service.list(map);
		String view = "rentcar/service";
		ModelAndView mv = new ModelAndView(view,"list",list);
		mv.addObject("totalPage", totalPage);
		return mv;
	}
	@RequestMapping(value="help.do",method=RequestMethod.GET)
	public ModelAndView help(@RequestParam(value="strInput",required=false) String strInput,
			HttpSession session) {
		int input;
		String id = null;
		if (strInput==null) {
		input = 1;
		}else input =Integer.parseInt(strInput);
		long groupNum = service.groupNum();
		long showList = 5;
		long betweenA = groupNum-((input)*showList)+1;
		long betweenB = groupNum-((input-1)*showList);
		if(betweenB<0)betweenB=0;
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("A", betweenA);
		map.put("B", betweenB);
		long totalPage = 0;
			if(groupNum%showList!=0){
				totalPage = (groupNum/showList)+1;
			}else {
				totalPage =(groupNum/showList);
			}
			
			List<Qna> list = service.qnaList(map);
			/*System.out.println("A "+betweenA);
			System.out.println("B "+betweenB);
			System.out.println(groupNum);
			System.out.println(list.size());*/
			Member temp = (Member)session.getAttribute("log");
			if(temp!=null)
			id = temp.getId();
			String view = "rentcar/help";
			ModelAndView mv = new ModelAndView(view,"list",list);
			mv.addObject("id", id);
			mv.addObject("totalPage", totalPage);
		return mv;
	}
	@RequestMapping(value="helpadd.do",method=RequestMethod.POST)
	public ModelAndView helpadd(@RequestParam("id") String id) {
		String view = "rentcar/helpadd";
		ModelAndView mv = new ModelAndView(view, "id", id);
		return mv;
	}
	@RequestMapping(value="helpInsert.do",method=RequestMethod.POST)
	public ModelAndView helpInsert(@RequestParam("qna_name") String qna_name, @RequestParam("qna_email") String qna_email, @RequestParam("qna_tel") String qna_tel, @RequestParam("qna_title") String qna_title, @RequestParam("qna_content") String qna_content, @RequestParam("qna_pwd") String qna_pwd, 
	@RequestParam("qna_secret") String Strqna_secret, @RequestParam("id") String id) {
		System.out.println(Strqna_secret);
		int qna_secret = 0;
		if(Strqna_secret.equals("on"))qna_secret = 0;
		else qna_secret = 1;
		Qna qna = new Qna(-1, -1, -1, qna_name, qna_email, qna_tel, qna_title, qna_content, qna_pwd, 0, qna_secret, null, id);
		boolean flag = service.insert(qna);
		String view = "rentcar/helpInsertCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}

	@RequestMapping(value="checkId.do",method=RequestMethod.GET)
	@ResponseBody
	public HashMap checkId( @RequestParam("qna_no") String Strqna_no, @RequestParam("id") String id) {
		long qna_no = 0;
		boolean flag = false;
		String view = null;
			if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
			if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
		Qna qna = service.qnaContent(qna_no);
		if(qna.getQna_resist_id().equals(id)) flag=true;
		else flag=false;
		System.out.println("id "+id);
		System.out.println("qna_no "+qna_no);
		HashMap<String,Boolean>v = new HashMap<String, Boolean>();
		v.put("flagId", flag);
		return v;		
	}
	//@RequestParam("hiddenValue") String Strqna_no, @RequestParam("inputPwd") String inputPwd 경호형님
	@RequestMapping(value="helpContent.do",method=RequestMethod.GET)
	public ModelAndView helpContent(@RequestParam("qna_no") String Strqna_no,@RequestParam("id") String id) {
		long qna_no = 0;
		String view = null;
			if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
			if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
			Qna qna = service.qnaContent(qna_no);
				System.out.println("세션 id  "+ id);
				System.out.println("글 id  "+qna.getQna_resist_id());
				if(qna.getQna_resist_id().equals(id))
				view = "rentcar/helpContent";
				else {
					view = "rentcar/qnaPwdModal"; 
					boolean isModal = true;  //jsp파일에서 boolean값이 true일때만 modal이 실행되게
											// 그다음 모달에서 확인버튼을 누를때 입력한 pwd값이랑 list에서 추출한 pwd 대조, 일치하면 contents.jsp 실행
											//그럼 ajax로 해야하는게 글 클릭할때랑 모달창에서 확인 누를때 2가지?
				}
			ModelAndView mv = new ModelAndView(view,"qna",qna);
		return mv;
	}
	/*@RequestMapping(value="pwdModal.do",method=RequestMethod.POST) //비밀번호 입력하고 확인했을때 실행되는 controller
	public ModelAndView helpInsert(@RequestParam("qna_no") String Strqna_no, @RequestParam("id") String id, @RequestParam("inputPwd") String inputPwd ) {
		long qna_no = 0;
		String view = null;
		ModelAndView mv;
		if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
			if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
		if(id.equals(inputPwd)) {
			Qna qna = service.qnaContent(qna_no);
			view = "rentcar/helpContent";
			mv = new ModelAndView(view,"qna",qna);
		}else //비밀번호 불일치 페이지 만들면 됨 
		return mv;
	}*/	
	
	@RequestMapping(value="faq.do",method=RequestMethod.GET)
	public String faq() {
		return "rentcar/faq";
	}
	
}