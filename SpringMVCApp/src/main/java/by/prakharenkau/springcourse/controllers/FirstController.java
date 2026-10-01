package by.prakharenkau.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

	@GetMapping("/hello")
	public String helloPage(HttpServletRequest request) {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		
		System.out.println("Hello " + name + " " + surname);
		return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodbyePage(@RequestParam(value = "name", required = false) String name, 
			@RequestParam(value = "surname", required = false) String surname, Model model) {
		//System.out.println("Name " + name + " " + surname);
		model.addAttribute("message", "Goodbye " + name + " " + surname);
		return "first/goodbye";
	}
	
	@GetMapping("/calculator")
	public String calculate(@RequestParam("a") int a, @RequestParam("b") int b, 
			@RequestParam ("action") String action, Model model) {
		model.addAttribute("answer", calc(a, b, action));
		return "first/calculator";
	}
	
	public String calc(int a, int b, String action) {
		 if (action.equals("multiplication")) {
			 return a + " * " + b + " = " + (a * b);
		 } else if (action.equals("addition")) {
			 return a + " + " + b + " = " + (a + b);
		 } else if (action.equals("subtraction")) {
			 return a + " - " + b + " = " + (a - b);
		 } else if (action.equals("division")) {
			 return String.format("%d / %d = %.2f", a, b, ((double)a / b));
		 }
		 return "Unknow operation";
	}
	
	public String getTheOperationSign(String action) {
		switch (action) {
		case "multiplication": {
			return "*";
		}
		case "addition": {
			return "+";
		}
		case "subtraction": {
			return "-";
		}
		case "multiplica": {
			return "*";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}
}
