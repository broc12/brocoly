package com.khd.jejulantis.admin.carInfo.Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.khd.jejulantis.client.qna.Service.CustomerCenterService;
import com.khd.jejulantis.model.CarInfo;

@Controller
public class CarInfoController {
	@Autowired
	private CustomerCenterService customerService;
	@Autowired
	private ExcelUploadService excelUploadService;
	@Autowired
	private CarInfoService carInfoService;
	
	@RequestMapping(value="admin/carInfo.do",method=RequestMethod.GET)
	public String carInfo() {
		return "admin/cars/carInfo";
	}
	@RequestMapping(value="admin/carInfoAdd.do",method=RequestMethod.GET)
	public String carInfoAdd() {
		
		return "admin/cars/carInfoAdd";
		
	}
	@RequestMapping(value="admin/carInfoUpload.do",method=RequestMethod.GET)
	public String carInfoUpload() {
		
		return "admin/cars/excelUploadForm";
		
	}	
	@RequestMapping(value="admin/carInfoInsert.do",method=RequestMethod.POST)
	public ModelAndView carInfoInsert(@RequestParam(value="carKind",required = true)List <String> carKind,
								@RequestParam(value="carNumber",required = true)List <String> carNumber){
		for(String cars : carKind) {
			System.out.println("name"+cars);
		}
		for(String cars : carNumber) {
			System.out.println("size"+cars);
		}
		List<CarInfo> car = new ArrayList<CarInfo>();
		for(int i=0; i<carKind.size();i++) {
			car.add(new CarInfo(1, 1, 1, 1, 1, "Y", "신차","N", carNumber.get(i),null));
		}
		System.out.println("��Ʈ�ѷ� ������"+car.size());
		boolean flag = carInfoService.carInsert(car);
		String view = "admin/carInfoInsertCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}
	@ResponseBody
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
    }
}




