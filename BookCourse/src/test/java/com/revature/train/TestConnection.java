package com.revature.train;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {

	public static void main(String[] args) {
		JdbcTemplate  jdbctemplate=ConnectionBook.getJdbcTemplate();
		System.out.println(jdbctemplate);


	}
}

	