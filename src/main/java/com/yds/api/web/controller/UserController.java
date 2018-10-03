package com.yds.api.web.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yds.api.web.param.User;
import com.yds.api.web.service.UserService;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
@RestController
public class UserController {
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/yds/users/", method = RequestMethod.POST, 
		consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
		produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void createFeed(@RequestBody User user){
		if (LOG.isInfoEnabled()) { LOG.info("/yds/users/ POST "+ user.toString()); }
		
		if (StringUtils.isBlank(user.getEmail()) || user.getPhNumber().length() < 3) {
			throw new IllegalArgumentException("email or phone number is missing");
		}
		user.setLastUpdatedOn(new Date());
        userService.create(user);
	}
}
