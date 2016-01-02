/**
 * This class is generated by jOOQ
 */
package com.example.employees.tables;


import com.example.employees.Employees;
import com.example.employees.Keys;
import com.example.employees.tables.records.DepartmentsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Departments extends TableImpl<DepartmentsRecord> {

	private static final long serialVersionUID = -237243865;

	/**
	 * The reference instance of <code>employees.departments</code>
	 */
	public static final Departments DEPARTMENTS = new Departments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DepartmentsRecord> getRecordType() {
		return DepartmentsRecord.class;
	}

	/**
	 * The column <code>employees.departments.dept_no</code>.
	 */
	public final TableField<DepartmentsRecord, String> DEPT_NO = createField("dept_no", org.jooq.impl.SQLDataType.CHAR.length(4).nullable(false), this, "");

	/**
	 * The column <code>employees.departments.dept_name</code>.
	 */
	public final TableField<DepartmentsRecord, String> DEPT_NAME = createField("dept_name", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * Create a <code>employees.departments</code> table reference
	 */
	public Departments() {
		this("departments", null);
	}

	/**
	 * Create an aliased <code>employees.departments</code> table reference
	 */
	public Departments(String alias) {
		this(alias, DEPARTMENTS);
	}

	private Departments(String alias, Table<DepartmentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Departments(String alias, Table<DepartmentsRecord> aliased, Field<?>[] parameters) {
		super(alias, Employees.EMPLOYEES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DepartmentsRecord> getPrimaryKey() {
		return Keys.KEY_DEPARTMENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DepartmentsRecord>> getKeys() {
		return Arrays.<UniqueKey<DepartmentsRecord>>asList(Keys.KEY_DEPARTMENTS_PRIMARY, Keys.KEY_DEPARTMENTS_DEPT_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Departments as(String alias) {
		return new Departments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Departments rename(String name) {
		return new Departments(name, null);
	}
}
