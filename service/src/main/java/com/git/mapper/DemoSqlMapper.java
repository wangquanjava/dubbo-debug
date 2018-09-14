package com.git.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.abel533.sql.SqlMapper;

@Repository
public class DemoSqlMapper{
	@Autowired
	private SqlMapper sqlMapper;
	
	public void cleartable() {
		this.sqlMapper.delete("delete from serial_table");
	}
	
}
