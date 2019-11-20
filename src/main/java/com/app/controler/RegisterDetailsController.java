package com.app.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.mail.MailUtil;
import com.app.model.RegisterDetails;

@Controller
public class RegisterDetailsController {
	@Autowired
	private MailUtil mail;
	
	@RequestMapping("/view")
	public String registerPage() {
		return "Register";
	}
	@RequestMapping(value = "/send",method = RequestMethod.POST)
	public String sendDetails(@ModelAttribute RegisterDetails rs,Model map) {
		mail.send(rs.getEmail(), "Your Details Are", "name : "+rs.getName()+",\nEducation : "+rs.getEducation()+",\nemail : "+rs.getEmail()+",\nAdress : "+rs.getAddress());
		map.addAttribute("msg", "mail send sucessfully");
		return "Register";
	}
}
