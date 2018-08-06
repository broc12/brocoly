package com.khd.jejulantis.admin.insurance.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.insurance.Service.InsuranceService;
import com.khd.jejulantis.model.Insurance;


@Controller
public class InsuranceController {
	@Autowired
	private InsuranceService iservice;
	@RequestMapping(value="admin/insuranceList.do")
	public ModelAndView insuranceList(@RequestParam("manager_id")String manager_id) {
//		List<Insurance> insuranceList = iservice.insuranceListService(manager_id);
//		System.out.println("branch_no : " + insuranceList.get(0).getBranch_no());
		List<Insurance> identyBNo= iservice.identyBNoService(manager_id);
		List<Insurance> selectOne;
		if(identyBNo.get(0).getBranch_no()==1) {
			selectOne = iservice.insuranceAllListService();
		}
		else {
			selectOne = iservice.insuranceListService(manager_id);
		}
		String view = "admin/insurances/insuranceList";
		ModelAndView mv = new ModelAndView(view, "insuranceList", selectOne);
		return mv;
	}
	@RequestMapping(value="admin/insuranceContent.do")
	public ModelAndView insuranceContent(@RequestParam("insurance_no")int insurance_no) {
		List<Insurance> insuranceContent = iservice.insuranceContentService(insurance_no);
		String view = "admin/insurances/insuranceContent";
		ModelAndView mv = new ModelAndView(view, "insuranceContent", insuranceContent);
		return mv;
		//return "admin/insurances/insuranceContent";
	}
	@RequestMapping(value="admin/insuranceInsert.do")
	public ModelAndView insuranceInsert(@RequestParam("manager_id")String manager_id) {
		List<Insurance> branchNoSelect = iservice.branchNoSelectService(manager_id);
		List<Insurance> carKindSelectBox = iservice.carKindSelectBoxService(manager_id);
		List<Insurance> kingbranchNotSelect = iservice.kingbranchNotSelectService(manager_id);
		String view = "admin/insurances/insuranceInsert";
		ModelAndView mv = new ModelAndView(view, "branchNoSelect", branchNoSelect);
		mv.addObject("carKindSelectBox", carKindSelectBox);
		mv.addObject("kingbranchNotSelect", kingbranchNotSelect);
		return mv;
	}
	@RequestMapping(value="admin/insuranceInsertOk.do", method=RequestMethod.POST)
	public String insuranceInsertOk(@RequestParam("manager_id")String manager_id,
			Insurance insurance,
			@RequestParam("branch_no")int branch_no,
			@RequestParam("car_kind_no")int car_kind_no,
			@RequestParam("insurance_name")String insurance_name,
			@RequestParam("insurance_price")int insurance_price,
			@RequestParam("insurance_limit")String insurance_limit,
			@RequestParam("insurance_burden_price")int insurance_burden_price,
			@RequestParam("insurance_limit_age")int insurance_limit_age,
			@RequestParam("insurance_limit_carrier")int insurance_limit_carrier
			) {
		System.out.println("branch_no : "+branch_no);
		System.out.println("car_kind_no : "+car_kind_no);
		System.out.println("insurance_name : "+insurance_name);
		System.out.println("insurance_price : "+insurance_price);
		System.out.println("insurance_limit : "+insurance_limit);
		System.out.println("insurance_burden_price : "+insurance_burden_price);
		System.out.println("insurance_limit_age : "+insurance_limit_age);
		System.out.println("insurance_limit_carrier : "+insurance_limit_carrier);
		System.out.println("manager_id : " + manager_id);
		//List<Insurance> insuranceCarNo = iservice.insuranceCarNoService(manager_id, car_kind_no);
		
		iservice.insertService(insurance);
		return "redirect:insuranceList.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/insuranceUpdate.do")
	public ModelAndView insuranceUpdate(@RequestParam("manager_id")String manager_id, @RequestParam("insurance_no")int insurance_no) {
		List<Insurance> insuranceUpdate = iservice.insuranceUpdateService(insurance_no);
		List<Insurance> carKindNotSelect = iservice.carKindNotSelectBoxService(manager_id, insurance_no);
		List<Insurance> carKindSelectBox = iservice.carKindSelectBoxService(manager_id);
		List<Insurance> kingbranchNotSelect = iservice.kingbranchNotSelectService(manager_id);
		List<Insurance> identyBNo= iservice.identyBNoService(manager_id);
		String view = "admin/insurances/insuranceUpdate";
		ModelAndView mv = new ModelAndView(view, "insuranceUpdate", insuranceUpdate);
		mv.addObject("carKindNotSelect", carKindNotSelect);
		mv.addObject("kingbranchNotSelect", kingbranchNotSelect);
		mv.addObject("carKindSelectBox", carKindSelectBox);
		mv.addObject("identyBNo", identyBNo);
		return mv;
		//return "admin/insurances/insuranceUpdate";
	}
	@RequestMapping(value="admin/insuranceUpdateOk.do", method=RequestMethod.POST)
	public String insuranceUpdateOk(@RequestParam("manager_id")String manager_id,
			Insurance insurance) {
		iservice.updateOkService(insurance);
		return "redirect:insuranceList.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/insuranceDelete.do")
	public String insuranceDelete(@RequestParam("manager_id")String manager_id, @RequestParam("insurance_no")int insurance_no) {
		iservice.deleteService(insurance_no);
		return "redirect:insuranceList.do?manager_id="+manager_id;
	}
	@RequestMapping(value= "admin/ajax1.do")
	public @ResponseBody List<Insurance> ajax1(@RequestParam("branch_no") int branch_no)  {
		System.out.println("1");
		System.out.println("branch_no : " + branch_no);
		List<Insurance> list = iservice.kingBranchCarKindSelectService(branch_no);
		System.out.println("2");
		
	    return list;
	}
	@RequestMapping(value= "admin/ajax.do")
	public @ResponseBody List<Insurance> ajax(@RequestParam("branch_no") int branch_no)  {
		System.out.println("1");
		System.out.println("branch_no : " + branch_no);
		List<Insurance> list = iservice.kingbranchNotSelectService(branch_no);
		System.out.println("2");
		
	    return list;
	}
}
