package com.multi.dorae.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.dorae.vo.MemberVO;

@Repository
public class MemberDAO {
	
	private SqlSessionTemplate sql;
	
	public MemberDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}

	public void create(MemberVO vo) {
		sql.insert("member.create", vo);
	}
}
