package com.yds.api.web.jdbc.dao.procedure;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.stereotype.Component;

import com.yds.api.web.jdbc.dao.rowmapper.UserMapper;
import com.yds.api.web.param.User;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
@Component
public class UserCreateProcedure extends BaseProcedure{
	
	public static final String PROC_NAME = "users_insert";

	@Inject
	public UserCreateProcedure(DataSource dataSource, UserMapper mapper) {
		this.setDataSource(dataSource);
		this.setFunction(false);
		this.setSql(PROC_NAME);
		this.declareParameter(new SqlParameter("firstName", Types.VARCHAR));
		this.declareParameter(new SqlParameter("lastName", Types.VARCHAR));
		this.declareParameter(new SqlParameter("email", Types.VARCHAR));
		this.declareParameter(new SqlParameter("phNumber", Types.VARCHAR));
		this.declareParameter(new SqlParameter("mandal", Types.VARCHAR));
		this.declareParameter(new SqlParameter("lastUpdatedOn", Types.DATE));
		this.declareParameter(new SqlReturnResultSet(FIRST_RESTULTSET, mapper));
		this.compile();
	}

	public void execute(User user) {
		Map<String, Object> inParams = new HashMap<String, Object>();
		inParams.put("firstName", user.getFirstName());
		inParams.put("lastName", user.getLastName());
		inParams.put("email", user.getEmail());
		inParams.put("phNumber", user.getPhNumber());
		inParams.put("mandal", user.getMandal());
		inParams.put("lastUpdatedOn", user.getLastUpdatedOn());
		
		this.execute(inParams);
	}

}
