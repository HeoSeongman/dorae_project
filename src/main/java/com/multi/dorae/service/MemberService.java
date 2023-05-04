package com.multi.dorae.service;

import org.springframework.stereotype.Service;

import com.multi.dorae.dao.MemberDAO;
import com.multi.dorae.vo.MemberVO;

@Service
public class MemberService {
	
	private MemberDAO dao;
	
	public MemberService(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	public void createMember(MemberVO vo) {
		vo.setManager("ROLE_USER");
		dao.create(vo);
	}
}
