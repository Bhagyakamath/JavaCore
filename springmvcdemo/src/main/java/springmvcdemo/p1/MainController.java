package springmvcdemo.p1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/m1")
public class MainController {
	@Autowired
	StudentDao dao;
	
	@GetMapping("/f1")
	public String f1(ModelMap mp) throws Exception {
		System.out.println("Main Controller");
		mp.put("a1", "Bhagya");
		List<String> l1=new ArrayList<String>(Arrays.asList("Ram", "Naina", "Virat", "Dhoni"));
		mp.put("a2", l1);
		mp.put("a3", dao.getStudents());
		return "first";
	}
	
	@GetMapping("/f2")
	public String f2(ModelMap mp) throws Exception {
		
		return "login";
	}
	
	@PostMapping("f3")
	public String f3(@RequestParam("uname") String uname, @RequestParam("pword") String pword, ModelMap mp) throws Exception{
		
		String s1="login";
		LoginEntity l1=new LoginEntity();
		l1.setUsername(uname);
		l1.setPassword(pword);
		if(dao.findUser(l1)) {
			s1="home";
		}
		mp.put("msg", "Invalid creadentials");
		return s1;
	}
	
}
