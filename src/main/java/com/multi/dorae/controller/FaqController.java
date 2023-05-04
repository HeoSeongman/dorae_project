package com.multi.dorae.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dorae.Enums.HelpCategory;
import com.multi.dorae.dao.FaqDAO;
import com.multi.dorae.vo.FaqVO;

@Controller
public class FaqController {

	FaqDAO dao;
	
	public FaqController(FaqDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("faq")
	public String faqByCategory(String helpCategory, Model model) {
		List<FaqVO> list = null;
		if (helpCategory == null) {
			list = dao.selectList();
		} else {
			list = dao.selectListByCategory(helpCategory);
		}

		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("faqList", list);
		return "faq/faq";
	}
	
	@RequestMapping("faqSearch")
	public String faqSearch(String search, Model model) {
		List<FaqVO> list = null;
		if (search == null) {
			list = dao.selectList();
		} else {
			list = dao.selectListBySearch(search);
		}

		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("searchList", list);
		return "faq/faqSearch";
	}
}
