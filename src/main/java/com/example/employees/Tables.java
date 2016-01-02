/**
 * This class is generated by jOOQ
 */
package com.example.employees;


import com.example.employees.tables.Departments;
import com.example.employees.tables.DeptEmp;
import com.example.employees.tables.DeptManager;
import com.example.employees.tables.Employees;
import com.example.employees.tables.Salaries;
import com.example.employees.tables.Titles;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in employees
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table employees.departments
	 */
	public static final Departments DEPARTMENTS = com.example.employees.tables.Departments.DEPARTMENTS;

	/**
	 * The table employees.dept_emp
	 */
	public static final DeptEmp DEPT_EMP = com.example.employees.tables.DeptEmp.DEPT_EMP;

	/**
	 * The table employees.dept_manager
	 */
	public static final DeptManager DEPT_MANAGER = com.example.employees.tables.DeptManager.DEPT_MANAGER;

	/**
	 * The table employees.employees
	 */
	public static final Employees EMPLOYEES = com.example.employees.tables.Employees.EMPLOYEES;

	/**
	 * The table employees.salaries
	 */
	public static final Salaries SALARIES = com.example.employees.tables.Salaries.SALARIES;

	/**
	 * The table employees.titles
	 */
	public static final Titles TITLES = com.example.employees.tables.Titles.TITLES;
}
