package com.multi.dorae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dorae.Enums.HelpCategory;
import com.multi.dorae.dao.ContactDAO;
import com.multi.dorae.vo.ContactVO;

@Controller
public class ContactController {
	
	private ContactDAO dao;
	
	public ContactController(ContactDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("contactWrite")
	public String contactWrite(String member, Model model) {
		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("member", member);
		return "contact/contactWrite";
	}
	
	@RequestMapping("contactCreate")
	public String contactCreate(ContactVO vo) {
		dao.create(vo);
		System.out.println(vo);
		return "redirect:help";
	}
	
	@RequestMapping("contactList")
	public String contactList(String member, Model model) {
		model.addAttribute("contactList", dao.selectList(member));
		model.addAttribute("member", member);
		return "contact/contactList";
	}
	
}
