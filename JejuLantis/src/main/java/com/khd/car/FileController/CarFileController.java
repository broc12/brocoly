package com.khd.car.FileController;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;

import com.khd.car.file.FileService;
import com.khd.car.file.FileDTO;

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
