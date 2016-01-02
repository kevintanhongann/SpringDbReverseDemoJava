/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.SessionStatusRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class SessionStatus extends TableImpl<SessionStatusRecord> {

	private static final long serialVersionUID = -1164920560;

	/**
	 * The reference instance of <code>performance_schema.session_status</code>
	 */
	public static final SessionStatus SESSION_STATUS = new SessionStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SessionStatusRecord> getRecordType() {
		return SessionStatusRecord.class;
	}

	/**
	 * The column <code>performance_schema.session_status.VARIABLE_NAME</code>.
	 */
	public final TableField<SessionStatusRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.session_status.VARIABLE_VALUE</code>.
	 */
	public final TableField<SessionStatusRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>performance_schema.session_status</code> table reference
	 */
	public SessionStatus() {
		this("session_status", null);
	}

	/**
	 * Create an aliased <code>performance_schema.session_status</code> table reference
	 */
	public SessionStatus(String alias) {
		this(alias, SESSION_STATUS);
	}

	private SessionStatus(String alias, Table<SessionStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private SessionStatus(String alias, Table<SessionStatusRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionStatus as(String alias) {
		return new SessionStatus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SessionStatus rename(String name) {
		return new SessionStatus(name, null);
	}
}
