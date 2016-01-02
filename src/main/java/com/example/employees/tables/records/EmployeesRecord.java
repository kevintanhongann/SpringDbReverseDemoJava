/**
 * This class is generated by jOOQ
 */
package com.example.employees.tables.records;


import com.example.employees.enums.EmployeesGender;
import com.example.employees.tables.Employees;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EmployeesRecord extends UpdatableRecordImpl<EmployeesRecord> implements Record6<Integer, Date, String, String, EmployeesGender, Date> {

	private static final long serialVersionUID = -826439077;

	/**
	 * Setter for <code>employees.employees.emp_no</code>.
	 */
	public void setEmpNo(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>employees.employees.emp_no</code>.
	 */
	public Integer getEmpNo() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>employees.employees.birth_date</code>.
	 */
	public void setBirthDate(Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>employees.employees.birth_date</code>.
	 */
	public Date getBirthDate() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>employees.employees.first_name</code>.
	 */
	public void setFirstName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>employees.employees.first_name</code>.
	 */
	public String getFirstName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>employees.employees.last_name</code>.
	 */
	public void setLastName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>employees.employees.last_name</code>.
	 */
	public String getLastName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>employees.employees.gender</code>.
	 */
	public void setGender(EmployeesGender value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>employees.employees.gender</code>.
	 */
	public EmployeesGender getGender() {
		return (EmployeesGender) getValue(4);
	}

	/**
	 * Setter for <code>employees.employees.hire_date</code>.
	 */
	public void setHireDate(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>employees.employees.hire_date</code>.
	 */
	public Date getHireDate() {
		return (Date) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Date, String, String, EmployeesGender, Date> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Date, String, String, EmployeesGender, Date> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Employees.EMPLOYEES.EMP_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return Employees.EMPLOYEES.BIRTH_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Employees.EMPLOYEES.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Employees.EMPLOYEES.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<EmployeesGender> field5() {
		return Employees.EMPLOYEES.GENDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return Employees.EMPLOYEES.HIRE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getEmpNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value2() {
		return getBirthDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesGender value5() {
		return getGender();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getHireDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value1(Integer value) {
		setEmpNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value2(Date value) {
		setBirthDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value3(String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value4(String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value5(EmployeesGender value) {
		setGender(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord value6(Date value) {
		setHireDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeesRecord values(Integer value1, Date value2, String value3, String value4, EmployeesGender value5, Date value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmployeesRecord
	 */
	public EmployeesRecord() {
		super(Employees.EMPLOYEES);
	}

	/**
	 * Create a detached, initialised EmployeesRecord
	 */
	public EmployeesRecord(Integer empNo, Date birthDate, String firstName, String lastName, EmployeesGender gender, Date hireDate) {
		super(Employees.EMPLOYEES);

		setValue(0, empNo);
		setValue(1, birthDate);
		setValue(2, firstName);
		setValue(3, lastName);
		setValue(4, gender);
		setValue(5, hireDate);
	}
}
