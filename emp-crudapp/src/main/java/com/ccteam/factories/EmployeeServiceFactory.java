package com.ccteam.factories;

import com.ccteam.service.EmployeeService;
import com.ccteam.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService employeeService=null;
	static {
		employeeService = new EmployeeServiceImpl();
		
	}
	public static EmployeeService getEmployeeService() {
		return employeeService;
		
	}

}
