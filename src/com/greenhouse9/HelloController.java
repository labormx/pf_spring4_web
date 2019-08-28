package com.greenhouse9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String show(Model model) {

		model.addAttribute("name", "未来一郎");
		return "hello";
	}
}
