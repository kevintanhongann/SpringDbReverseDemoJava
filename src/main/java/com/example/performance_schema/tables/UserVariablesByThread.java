/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.UserVariablesByThreadRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class UserVariablesByThread extends TableImpl<UserVariablesByThreadRecord> {

	private static final long serialVersionUID = 2097138112;

	/**
	 * The reference instance of <code>performance_schema.user_variables_by_thread</code>
	 */
	public static final UserVariablesByThread USER_VARIABLES_BY_THREAD = new UserVariablesByThread();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserVariablesByThreadRecord> getRecordType() {
		return UserVariablesByThreadRecord.class;
	}

	/**
	 * The column <code>performance_schema.user_variables_by_thread.THREAD_ID</code>.
	 */
	public final TableField<UserVariablesByThreadRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.user_variables_by_thread.VARIABLE_NAME</code>.
	 */
	public final TableField<UserVariablesByThreadRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.user_variables_by_thread.VARIABLE_VALUE</code>.
	 */
	public final TableField<UserVariablesByThreadRecord, byte[]> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * Create a <code>performance_schema.user_variables_by_thread</code> table reference
	 */
	public UserVariablesByThread() {
		this("user_variables_by_thread", null);
	}

	/**
	 * Create an aliased <code>performance_schema.user_variables_by_thread</code> table reference
	 */
	public UserVariablesByThread(String alias) {
		this(alias, USER_VARIABLES_BY_THREAD);
	}

	private UserVariablesByThread(String alias, Table<UserVariablesByThreadRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserVariablesByThread(String alias, Table<UserVariablesByThreadRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserVariablesByThread as(String alias) {
		return new UserVariablesByThread(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserVariablesByThread rename(String name) {
		return new UserVariablesByThread(name, null);
	}
}
