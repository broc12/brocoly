package com.khd.jejulantis.admin.carInfo.Controller;

import java.awt.Dialog.ModalExclusionType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.carInfo.Service.CarInfoService;
import com.khd.jejulantis.admin.carInfofile.Service.ExcelUploadService;
import com.khd.jejulantis.admin.cardetail.Service.CarkindDetailService;
import com.khd.jejulantis.client.qna.Service.CustomerCenterService;
import com.khd.jejulantis.model.*;

@Controller
public class CarInfoController {
	@Autowired
	private CustomerCenterService customerService;
	@Autowired
	private ExcelUploadService excelUploadService;
	@Autowired
	private CarInfoService carInfoService;
	@Autowired
	private CarkindDetailService carKindService;
	
	@RequestMapping(value="admin/carInfo.do",method=RequestMethod.GET)
	public ModelAndView carInfo(@RequestParam("manager_id")String manager_id ) {
		List<CarInfoSelect> selectList = carInfoService.selectList(manager_id);
		String view = "admin/cars/carInfo";
		ModelAndView mv = new ModelAndView(view,"manager_id",manager_id);
		mv.addObject("selectList",selectList);
		return mv;
	}
	@RequestMapping(value="admin/carInfoAdd.do",method=RequestMethod.GET)
	public ModelAndView carInfoAdd(@RequestParam("manager_id")String manager_id) {
		List<CarInfoInsert>carList = new ArrayList<CarInfoInsert>();
		carList = carInfoService.selectCarJoin(manager_id);
		System.out.println("size"+carList.size());
		String view = "admin/cars/carInfoAdd";
		ModelAndView mv = new ModelAndView(view,"carList",carList);
		return mv;
	}
	@RequestMapping(value="admin/carInfoDel.do",method=RequestMethod.GET)
	public ModelAndView carInfoDel(@RequestParam("car_info_no")String car_info_no) {
		boolean flag = carInfoService.del(car_info_no);
		String view = "admin/cars/carInfoDelete";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}
	@RequestMapping(value="admin/carInfoContent.do",method=RequestMethod.GET)
	public ModelAndView carInfoContent(@RequestParam("car_info_no")String car_info_no,
						@RequestParam("car_name")String car_name) {
		System.out.println("info no "+ car_info_no);
		CarInfo carInfo = carInfoService.carInfoContent(car_info_no);
		String view = "admin/cars/carInfoContent";
		ModelAndView mv = new ModelAndView(view,"carInfo",carInfo);
		mv.addObject("car_name",car_name);
		return mv;
	}
	@RequestMapping(value="admin/carInfoUpdate.do",method=RequestMethod.POST)
	public ModelAndView carInfoUpdate(@RequestParam("car_info_state")String car_info_state, 
			@RequestParam("car_info_rent_at")String car_info_rent_at, @RequestParam("car_info_no")int car_info_no) {
		CarInfo carInfo = new CarInfo(car_info_no, 0, 0, 0, car_info_rent_at, car_info_state, "", "", null);
		boolean flag = carInfoService.carInfoUpdate(carInfo);
		String view = "admin/cars/carInfoUpdateCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}

	@RequestMapping(value="admin/carInfoInsert.do",method=RequestMethod.POST)
	public ModelAndView carInfoInsert(@RequestParam(value="carKind",required = true)List <Integer> car_kind_no,
								@RequestParam(value="carNumber",required = true)List <String> carNumber
								){
		List<CarInfoInsert> branchNo = new ArrayList<CarInfoInsert>();
			for(int i=0; i<carNumber.size();i++)  branchNo.add(carInfoService.selectBranchNo(car_kind_no.get(i)));
		List<CarInfo> carInfoList = new ArrayList<CarInfo>();
			for(int i=0; i<carNumber.size();i++) {
				carInfoList.add(new CarInfo(0, branchNo.get(i).getCar_no(), car_kind_no.get(i),
					branchNo.get(i).getBranch_no(), "Y", "신차", "N", carNumber.get(i), null));
			}
		boolean flag = carInfoService.carInfoInsert(carInfoList);
		String view = "admin/cars/carInfoInsertCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}
	/*@RequestMapping(value="admin/carInfoUpload.do",method=RequestMethod.GET)
	public String carInfoUpload() {
		
		return "admin/cars/excelUploadForm";
		
	}	*/
	
	/*@ResponseBody
    @RequestMapping(value = "admin/cars/excelUploadAjax.do", method = RequestMethod.POST)
    public ModelAndView excelUploadAjax(MultipartHttpServletRequest request)  throws Exception{
        MultipartFile excelFile =request.getFile("excelFile");
        System.out.println("���� ���� ���ε� ��Ʈ�ѷ�");
        if(excelFile==null || excelFile.isEmpty()){
            throw new RuntimeException("���������� ���� �� �ּ���.");
        }
        
        File destFile = new File("C:\\excel\\"+excelFile.getOriginalFilename());
        try{
            excelFile.transferTo(destFile);
        }catch(IOException e){
            throw new RuntimeException(e.getMessage(),e);
        }
        excelUploadService.excelUpload(destFile);
        //FileUtils.delete(destFile.getAbsolutePath());
        
        ModelAndView view = new ModelAndView();
        view.setViewName("");
        return view;
    }*/
}




