/**
 * This class is generated by jOOQ
 */
package com.example.employees.tables;


import com.example.employees.Employees;
import com.example.employees.Keys;
import com.example.employees.tables.records.SalariesRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Salaries extends TableImpl<SalariesRecord> {

	private static final long serialVersionUID = -1182605396;

	/**
	 * The reference instance of <code>employees.salaries</code>
	 */
	public static final Salaries SALARIES = new Salaries();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SalariesRecord> getRecordType() {
		return SalariesRecord.class;
	}

	/**
	 * The column <code>employees.salaries.emp_no</code>.
	 */
	public final TableField<SalariesRecord, Integer> EMP_NO = createField("emp_no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>employees.salaries.salary</code>.
	 */
	public final TableField<SalariesRecord, Integer> SALARY = createField("salary", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>employees.salaries.from_date</code>.
	 */
	public final TableField<SalariesRecord, Date> FROM_DATE = createField("from_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>employees.salaries.to_date</code>.
	 */
	public final TableField<SalariesRecord, Date> TO_DATE = createField("to_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>employees.salaries</code> table reference
	 */
	public Salaries() {
		this("salaries", null);
	}

	/**
	 * Create an aliased <code>employees.salaries</code> table reference
	 */
	public Salaries(String alias) {
		this(alias, SALARIES);
	}

	private Salaries(String alias, Table<SalariesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Salaries(String alias, Table<SalariesRecord> aliased, Field<?>[] parameters) {
		super(alias, Employees.EMPLOYEES, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SalariesRecord> getPrimaryKey() {
		return Keys.KEY_SALARIES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SalariesRecord>> getKeys() {
		return Arrays.<UniqueKey<SalariesRecord>>asList(Keys.KEY_SALARIES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<SalariesRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<SalariesRecord, ?>>asList(Keys.SALARIES_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Salaries as(String alias) {
		return new Salaries(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Salaries rename(String name) {
		return new Salaries(name, null);
	}
}
