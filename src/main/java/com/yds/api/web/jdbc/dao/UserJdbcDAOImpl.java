package com.yds.api.web.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yds.api.web.jdbc.dao.procedure.UserCreateProcedure;
import com.yds.api.web.param.User;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
@Repository
public class UserJdbcDAOImpl implements UserJdbcDAO {

	@Autowired
	private UserCreateProcedure userCreate;
	
	/* (non-Javadoc)
	 * @see com.yds.api.web.jdbc.dao.UserJdbcDAO#create(com.yds.api.web.param.User)
	 */
	public void create(User user) {
		this.userCreate.execute(user);
	}
	
}
