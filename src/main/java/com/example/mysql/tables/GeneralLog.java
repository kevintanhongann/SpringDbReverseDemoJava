/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables;


import com.example.mysql.Mysql;
import com.example.mysql.tables.records.GeneralLogRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * General log
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLog extends TableImpl<GeneralLogRecord> {

	private static final long serialVersionUID = 702125034;

	/**
	 * The reference instance of <code>mysql.general_log</code>
	 */
	public static final GeneralLog GENERAL_LOG = new GeneralLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GeneralLogRecord> getRecordType() {
		return GeneralLogRecord.class;
	}

	/**
	 * The column <code>mysql.general_log.event_time</code>.
	 */
	public final TableField<GeneralLogRecord, Timestamp> EVENT_TIME = createField("event_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.general_log.user_host</code>.
	 */
	public final TableField<GeneralLogRecord, String> USER_HOST = createField("user_host", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.thread_id</code>.
	 */
	public final TableField<GeneralLogRecord, ULong> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.server_id</code>.
	 */
	public final TableField<GeneralLogRecord, UInteger> SERVER_ID = createField("server_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.command_type</code>.
	 */
	public final TableField<GeneralLogRecord, String> COMMAND_TYPE = createField("command_type", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.argument</code>.
	 */
	public final TableField<GeneralLogRecord, byte[]> ARGUMENT = createField("argument", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * Create a <code>mysql.general_log</code> table reference
	 */
	public GeneralLog() {
		this("general_log", null);
	}

	/**
	 * Create an aliased <code>mysql.general_log</code> table reference
	 */
	public GeneralLog(String alias) {
		this(alias, GENERAL_LOG);
	}

	private GeneralLog(String alias, Table<GeneralLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private GeneralLog(String alias, Table<GeneralLogRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "General log");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GeneralLog as(String alias) {
		return new GeneralLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GeneralLog rename(String name) {
		return new GeneralLog(name, null);
	}
}
