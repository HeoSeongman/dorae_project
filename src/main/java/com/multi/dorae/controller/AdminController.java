package com.multi.dorae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.dorae.service.MemberService;
import com.multi.dorae.vo.MemberVO;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	private MemberService service;
	
	public AdminController(MemberService service) {
		super();
		this.service = service;
	}

	@ResponseBody
	@RequestMapping("memberJoin")
	public MemberVO admin(MemberVO vo) {
		service.createMember(vo);
		System.out.println(vo);
		return vo;
	}
}
