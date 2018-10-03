package com.yds.api.web.jdbc.dao.procedure;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
public abstract class BaseProcedure extends StoredProcedure {
	public static final String FIRST_RESTULTSET = "#result-set-1";
	public static final String SECOND_RESTULTSET = "#result-set-2";
	
	public BaseProcedure() {
	}

	public BaseProcedure(DataSource ds, String name) {
		super(ds, name);
	}

	public BaseProcedure(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
	}

}
