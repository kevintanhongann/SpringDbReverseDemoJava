/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables;


import com.example.sys.Sys;
import com.example.sys.tables.records.X$innodbLockWaitsRecord;

import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$innodbLockWaits extends TableImpl<X$innodbLockWaitsRecord> {

	private static final long serialVersionUID = -1795146054;

	/**
	 * The reference instance of <code>sys.x$innodb_lock_waits</code>
	 */
	public static final X$innodbLockWaits X$INNODB_LOCK_WAITS = new X$innodbLockWaits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$innodbLockWaitsRecord> getRecordType() {
		return X$innodbLockWaitsRecord.class;
	}

	/**
	 * The column <code>sys.x$innodb_lock_waits.wait_started</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Timestamp> WAIT_STARTED = createField("wait_started", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.wait_age</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Time> WAIT_AGE = createField("wait_age", org.jooq.impl.SQLDataType.TIME, this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.wait_age_secs</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Long> WAIT_AGE_SECS = createField("wait_age_secs", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.locked_table</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> LOCKED_TABLE = createField("locked_table", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.locked_index</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> LOCKED_INDEX = createField("locked_index", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.locked_type</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> LOCKED_TYPE = createField("locked_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_trx_id</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> WAITING_TRX_ID = createField("waiting_trx_id", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_trx_started</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Timestamp> WAITING_TRX_STARTED = createField("waiting_trx_started", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_trx_age</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Time> WAITING_TRX_AGE = createField("waiting_trx_age", org.jooq.impl.SQLDataType.TIME, this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_trx_rows_locked</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> WAITING_TRX_ROWS_LOCKED = createField("waiting_trx_rows_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_trx_rows_modified</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> WAITING_TRX_ROWS_MODIFIED = createField("waiting_trx_rows_modified", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_pid</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> WAITING_PID = createField("waiting_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_query</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> WAITING_QUERY = createField("waiting_query", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_lock_id</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> WAITING_LOCK_ID = createField("waiting_lock_id", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.waiting_lock_mode</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> WAITING_LOCK_MODE = createField("waiting_lock_mode", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_trx_id</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> BLOCKING_TRX_ID = createField("blocking_trx_id", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_pid</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> BLOCKING_PID = createField("blocking_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_query</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> BLOCKING_QUERY = createField("blocking_query", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_lock_id</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> BLOCKING_LOCK_ID = createField("blocking_lock_id", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_lock_mode</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> BLOCKING_LOCK_MODE = createField("blocking_lock_mode", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_trx_started</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Timestamp> BLOCKING_TRX_STARTED = createField("blocking_trx_started", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_trx_age</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, Time> BLOCKING_TRX_AGE = createField("blocking_trx_age", org.jooq.impl.SQLDataType.TIME, this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_trx_rows_locked</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> BLOCKING_TRX_ROWS_LOCKED = createField("blocking_trx_rows_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.blocking_trx_rows_modified</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, ULong> BLOCKING_TRX_ROWS_MODIFIED = createField("blocking_trx_rows_modified", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.sql_kill_blocking_query</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField("sql_kill_blocking_query", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>sys.x$innodb_lock_waits.sql_kill_blocking_connection</code>.
	 */
	public final TableField<X$innodbLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField("sql_kill_blocking_connection", org.jooq.impl.SQLDataType.VARCHAR.length(26), this, "");

	/**
	 * Create a <code>sys.x$innodb_lock_waits</code> table reference
	 */
	public X$innodbLockWaits() {
		this("x$innodb_lock_waits", null);
	}

	/**
	 * Create an aliased <code>sys.x$innodb_lock_waits</code> table reference
	 */
	public X$innodbLockWaits(String alias) {
		this(alias, X$INNODB_LOCK_WAITS);
	}

	private X$innodbLockWaits(String alias, Table<X$innodbLockWaitsRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$innodbLockWaits(String alias, Table<X$innodbLockWaitsRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$innodbLockWaits as(String alias) {
		return new X$innodbLockWaits(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$innodbLockWaits rename(String name) {
		return new X$innodbLockWaits(name, null);
	}
}
