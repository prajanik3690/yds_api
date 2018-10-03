package com.yds.api.web.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yds.api.web.jdbc.dao.UserJdbcDAO;
import com.yds.api.web.param.User;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private  UserJdbcDAO userJdbcDAO;

	/* (non-Javadoc)
	 * @see com.yds.api.web.service.UserService#create(com.yds.api.web.param.User)
	 */
	public void create(User user) {
		userJdbcDAO.create(user);
	}

}
