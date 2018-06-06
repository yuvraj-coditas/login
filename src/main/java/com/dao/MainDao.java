package com.dao;

import com.beans.AbstractDao;
import com.beans.UserBean;

public class MainDao extends AbstractDao{
	
	public void insertUser(final UserBean bean) 
	{
		StringBuilder sb= new StringBuilder()
				.append("insert into user values (?, ?)");
		getJdbcTemplate().update(sb.toString(),	 new Object[] {bean.getName(),"12345678"});
	}
	
}
