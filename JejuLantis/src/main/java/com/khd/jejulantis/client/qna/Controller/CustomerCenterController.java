package com.khd.jejulantis.client.qna.Controller;

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

import com.khd.jejulantis.client.qna.Service.CustomerCenterService;
import com.khd.jejulantis.model.CustomerCenter;
import com.khd.jejulantis.model.Member;
import com.khd.jejulantis.model.Qna;


/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerCenterController {
	
	@Autowired 
	private CustomerCenterService service;
	
	
	@RequestMapping(value="help.do",method=RequestMethod.GET)
	public ModelAndView help(@RequestParam(value="strInput",required=false) String strInput,
			HttpSession session) {
		int input;
		String id = "GUEST";
		long memberNum = -1;
		if (strInput==null) {
		input = 1;
		}else input =Integer.parseInt(strInput);
		long groupNum = service.groupNum();
		long totalNum = service.totalNum();
		long showList = 5;
		/*long betweenA = groupNum-((input)*showList)+1; 
		long betweenB = groupNum-((input-1)*showList); */
		long betweenA = ((input-1)*showList)+1;
		long betweenB = (input*showList);
		
		if(betweenB<0)betweenB=0;
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("A", betweenA);
		map.put("B", betweenB);
		long totalPage = 0;
		System.out.println("TOTALNUM "+totalNum);
		System.out.println("계산1"+ totalNum%showList);
		System.out.println("totalNum/showList"+ totalNum/showList);
		if(totalNum%showList!=0){
			totalPage = (totalNum/showList)+1;
			}else {
				totalPage =(totalNum/showList);
			}
			List<Qna> list = service.qnaList(map);
			Member temp = (Member)session.getAttribute("log");
			if(temp!=null) {
				id = temp.getMember_id();	
				memberNum = temp.getMember_no();
			}
			String view = "rentcar/helps/help";
			ModelAndView mv = new ModelAndView(view,"list",list);
				mv.addObject("id", id);
				mv.addObject("memberNum", memberNum);
				mv.addObject("totalPage", totalPage);
				System.out.println("totalPage " +totalPage);
		return mv;
	}
	@RequestMapping(value="helpadd.do",method=RequestMethod.POST)
	public ModelAndView helpadd(@RequestParam("id") String id,@RequestParam("memberNum") long memberNum) {
		String view = "rentcar/helps/helpadd";
		ModelAndView mv = new ModelAndView(view, "id", id);
		mv.addObject("memberNum", memberNum);
		return mv;
	}
	@RequestMapping(value="helpInsert.do",method=RequestMethod.POST)
	public ModelAndView helpInsert(@RequestParam("qna_name") String qna_name, @RequestParam("qna_email") String qna_email, @RequestParam("qna_tel") String qna_tel, @RequestParam("qna_title") String qna_title, @RequestParam("qna_content") String qna_content, @RequestParam("qna_pwd") String qna_pwd, 
	@RequestParam("qna_secret") String Strqna_secret, @RequestParam("id") String id,@RequestParam("memberNum") long memberNum) {
		//System.out.println(Strqna_secret);
		int qna_secret = 0;
		if(Strqna_secret.equals("on"))qna_secret = 0;
		else qna_secret = 1;
		System.out.println("memberNum = "+ memberNum);
		Qna qna = new Qna(-1, -1, -1, qna_name, qna_email, qna_tel, qna_title, qna_content, qna_pwd, 0, qna_secret, null, id, memberNum , -1, -1);
		boolean flag = service.insert(qna);
		String view = "rentcar/helps/helpInsertCheck";
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
			//System.out.println("checkId Strqna_no = "+Strqna_no);
			//System.out.println("checkId id = "+id);
		Qna qna = service.qnaContent(qna_no);
		System.out.println("qna_no = "+ qna_no);
		System.out.println("qna.getQna_resist_id() = "+ qna.getQna_answer_checkString());
		if(qna.getQna_resist_id() == null ||qna.getQna_resist_id().equals("GUEST")) flag= false;
			else if(qna.getQna_resist_id().equals(id)) flag=true;
		else flag=false;
		System.out.println("flag "+flag);
		HashMap<String,Boolean>v = new HashMap<String, Boolean>();
		v.put("flagId", flag);
		return v;		
	}
	//@RequestParam("hiddenValue") String Strqna_no, @RequestParam("inputPwd") String inputPwd ��ȣ����
	@RequestMapping(value="helpContent.do",method=RequestMethod.GET)
	public ModelAndView helpContent(@RequestParam("qna_no") String Strqna_no) {
		long qna_no = 0;
		String view = "rentcar/helps/helpContent";
			if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
			if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
			Qna qna = service.qnaContent(qna_no);
				/*System.out.println("���� id  "+ id);
				System.out.println("�� id  "+qna.getQna_resist_id());
				if(qna.getQna_resist_id().equals(id))*/
			ModelAndView mv = new ModelAndView(view,"qna",qna);
		return mv;
	}
	@RequestMapping(value="helpCheckPwd.do",method=RequestMethod.POST)
	public ModelAndView helpCheckPwd(@RequestParam("inputPwd") String inputPwd, @RequestParam("strqna_no") String Strqna_no) {
		System.out.println("inputPwd" + inputPwd );
		System.out.println("qna_no" + Strqna_no);
		long qna_no = 0;	
		String view = null;
		if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
		if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
		Qna qna = service.qnaContent(qna_no);
		if(inputPwd.equals(qna.getQna_pwd())) view = "rentcar/helps/helpContent";
		else view = "rentcar/helps/failedPwd";
		ModelAndView mv = new ModelAndView(view,"qna",qna);
		
		return mv;
	}
	
	
}