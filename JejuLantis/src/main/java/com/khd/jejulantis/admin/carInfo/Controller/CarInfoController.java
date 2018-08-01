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
		System.out.println("manager id : "+manager_id);
		String view = "admin/cars/carInfo";
		ModelAndView mv = new ModelAndView(view,"manager_id",manager_id);
		return mv;
	}
	@RequestMapping(value="admin/carInfoAdd.do",method=RequestMethod.GET)
	public ModelAndView carInfoAdd(@RequestParam("manager_id")String manager_id) {
		List<CarInfoInsert>carList = new ArrayList<CarInfoInsert>();
		carList = carInfoService.carInfoInsert(manager_id);
		String view = "admin/cars/carInfoAdd";
		ModelAndView mv = new ModelAndView(view,"carList",carList);
		return mv;
	}
	@RequestMapping(value="admin/carInfoUpload.do",method=RequestMethod.GET)
	public String carInfoUpload() {
		
		return "admin/cars/excelUploadForm";
		
	}	
	@RequestMapping(value="admin/carInfoInsert.do",method=RequestMethod.POST)
	public String carInfoInsert(@RequestParam(value="carKind",required = true)List <Integer> car_kind_no,
								@RequestParam(value="carNumber",required = true)List <String> carNumber
								){
		for(Integer cars : car_kind_no) {
			System.out.println("name"+cars);
		}
		for(String cars : carNumber) {
			System.out.println("size"+cars);
		}
		List<CarInfoInsert> branchNo = carInfoService.selectBranchNo(car_kind_no.get(0));
		System.out.println("branchNo =" + branchNo.get(0).getBranch_no());
		System.out.println("car_no =" +branchNo.get(0).getCar_no());
		/*boolean flag = carInfoService.carInsert(car);
		String view = "admin/carInfoInsertCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;*/
		return "admin/cars/carInfo";
	}
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




