package com.khd.car.Controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.khd.car.Car;
import com.khd.car.CarService;
import com.khd.car.FileController.Path;
import com.khd.car.file.FileDTO;
import com.khd.car.file.FileService;

@Controller
public class CarController {
	
	@Autowired
	private CarService service;
	
	@RequestMapping(value="admin/carlist.do",method=RequestMethod.GET)
	public ModelAndView carlist() {
		List<Car>list = service.listService();
		String view = "admin/carlist";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
	@RequestMapping(value="admin/carModify.do",method=RequestMethod.GET)
	public ModelAndView modify(@RequestParam("car_no")String car_no) {
		List<Car>modify = service.modifyService(car_no);
		String view = "admin/carModify";
		ModelAndView mv = new ModelAndView(view,"modify",modify);
		return mv;
	}
	@RequestMapping(value="admin/carUpdate.do",method=RequestMethod.POST)
	public String update(Car car) {
		service.updateService(car);
		return "redirect:carlist.do";
	}
	@Autowired
	private FileService service2;
	
	@RequestMapping(value="admin/carinsert.do",method=RequestMethod.POST)
	public String insert(Car car,@RequestParam("uploadfile")MultipartFile uploadfile) {
		service.insertService(car);
		FileDTO fileDTO = new FileDTO(uploadfile);
		service2.fileUpload(fileDTO);
		return "redirect:carlist.do";
	}
	
	@RequestMapping(value="admin/caradd.do",method=RequestMethod.GET)
	public String caradd() {
		return "admin/caradd";
	}
	@RequestMapping(value="admin/carSubject.do",method=RequestMethod.GET)
	public ModelAndView carSubject(@RequestParam("car_no")String car_no) {
		List<Car>subject = service.subjectService(car_no);
		String view = "admin/carSubject";
		ModelAndView mv = new ModelAndView(view,"subject",subject);
		return mv;
	}
	@RequestMapping("admin/cardel.do")
	public String delete(@RequestParam("car_no")String car_no,@RequestParam("car_image")String car_image) {
		File file = new File(Path.FILE_STORE,car_image);
		if(file.exists()) {
			file.delete();
		}
		service.deleteService(car_no);
		return "redirect:carlist.do";
	}
	
}
