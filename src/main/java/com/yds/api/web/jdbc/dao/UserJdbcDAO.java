package com.yds.api.web.jdbc.dao;

import com.yds.api.web.param.User;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
public interface UserJdbcDAO {

	/**
	 * @param user
	 */
	void create(User user);

}
