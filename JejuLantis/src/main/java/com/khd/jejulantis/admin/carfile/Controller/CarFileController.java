package com.khd.jejulantis.admin.carfile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.carfile.Service.FileService;
import com.khd.jejulantis.model.FileDTO;

@Controller
public class CarFileController {
	
	@Autowired
	private FileService service;
	
	@RequestMapping(value = "/file/file.do", method = RequestMethod.POST)
	public ModelAndView fileSubmitUp(FileDTO dto) {
		ModelAndView mv = new ModelAndView();
		
		if(service.fileUpload(dto)) {
			mv.addObject("result",true);
		}else {
			mv.addObject("result",false);
		}
		/*mv.setViewName("file/result_msg");*/
		
		return mv;
	}
}
