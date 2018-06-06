package com.beans;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class AbstractDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

/*	private void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("in setter");
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	
	
}
