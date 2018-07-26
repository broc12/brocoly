package com.khd.admin.carInfo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.khd.notice.Notice;
import com.khd.notice.NoticeService;
import com.khd.util.UtilFile;
import com.khd.customerCenterService.CustomerCenterService;
import com.khd.model.Qna;
import com.khd.admin.carInfo.service.*;
import com.khd.carInfo.file.service.*;

@Controller
public class CarInfoController {
	@Autowired
	private CustomerCenterService customerService;
	@Autowired
	private ExcelUploadService excelUploadService;
	
	@RequestMapping(value="admin/carInfo.do",method=RequestMethod.GET)
	public String carInfo() {
		
		return "admin/carInfo";
		
	}
	@RequestMapping(value="admin/carInfoAdd.do",method=RequestMethod.GET)
	public String carInfoAdd() {
		
		return "admin/carInfoAdd";
		
	}
	@RequestMapping(value="admin/carInfoUpload.do",method=RequestMethod.GET)
	public String carInfoUpload() {
		
		return "admin/excelUploadForm";
		
	}	/*@RequestParam(value="aa[]") List<String> aa*/
	@RequestMapping(value="admin/carInfoInsert.do",method=RequestMethod.POST)
	public String carInfoInsert(String[]aa) {
		System.out.println("hi");
		System.out.println("size = "+aa.length);
		
		
		return "admin/carInfo";
		
	}
	@ResponseBody
    @RequestMapping(value = "admin/excelUploadAjax.do", method = RequestMethod.POST)
    public ModelAndView excelUploadAjax(MultipartHttpServletRequest request)  throws Exception{
        MultipartFile excelFile =request.getFile("excelFile");
        System.out.println("엑셀 파일 업로드 컨트롤러");
        if(excelFile==null || excelFile.isEmpty()){
            throw new RuntimeException("엑셀파일을 선택 해 주세요.");
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




