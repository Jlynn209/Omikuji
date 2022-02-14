package com.jeremy.Omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String index(@RequestParam(value="number") Integer number,
						@RequestParam(value="city") String city,
						@RequestParam(value="name") String name,
						@RequestParam(value="hobby") String hobby,
						@RequestParam(value="living") String living,
						@RequestParam(value="message") String message,
						HttpSession session) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("message", message);
		return "redirect:/view";
	}
	
	@RequestMapping("/view")
	public String view(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("message", session.getAttribute("message"));
		return "view.jsp";
	}
}
