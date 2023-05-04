package com.multi.dorae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dorae.Enums.HelpCategory;

@Controller
public class HelpController {

	@RequestMapping("help")
	public void getPage(Model model) {
		model.addAttribute("helpCategory", HelpCategory.values());
	}
}
