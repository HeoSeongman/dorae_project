package com.multi.dorae.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	private SqlSessionTemplate sql;

	public NoticeDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}
	
	
}
