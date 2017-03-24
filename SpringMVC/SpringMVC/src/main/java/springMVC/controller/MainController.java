package springMVC.controller;

import java.util.List;

import springMVC.dao.StudentDAO;
import springMVC.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller classes are used to control the path of the application.
 * 
 * @author ThuHien
 */
@Controller
public class MainController {

	@Autowired
	private StudentDAO StudentDAO;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		List<Student> list = StudentDAO.listStudent();
		model.addAttribute("students", list);
		return "index";
	}

}