package com.yds.api.web.jdbc.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yds.api.web.param.User;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
@Component
public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setPhNumber(rs.getString("phNumber"));
		user.setMandal(rs.getString("mandal"));
		user.setLastUpdatedOn(rs.getDate("lastUpdatedOn"));
		
		return user;
	}

}
