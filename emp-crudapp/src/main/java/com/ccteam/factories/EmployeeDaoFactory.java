package com.ccteam.factories;

import com.ccteam.dao.EmployeeDao;
import com.ccteam.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
	private static EmployeeDao employeeDao=null;
	static {
		employeeDao=new EmployeeDaoImpl();
	}
	public static EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

}
