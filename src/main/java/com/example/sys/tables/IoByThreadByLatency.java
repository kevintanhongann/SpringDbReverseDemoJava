/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables;


import com.example.sys.Sys;
import com.example.sys.tables.records.IoByThreadByLatencyRecord;

import java.math.BigInteger;

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
public class IoByThreadByLatency extends TableImpl<IoByThreadByLatencyRecord> {

	private static final long serialVersionUID = -715147705;

	/**
	 * The reference instance of <code>sys.io_by_thread_by_latency</code>
	 */
	public static final IoByThreadByLatency IO_BY_THREAD_BY_LATENCY = new IoByThreadByLatency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IoByThreadByLatencyRecord> getRecordType() {
		return IoByThreadByLatencyRecord.class;
	}

	/**
	 * The column <code>sys.io_by_thread_by_latency.user</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.total</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, BigInteger> TOTAL = createField("total", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.total_latency</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.min_latency</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, String> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.avg_latency</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.max_latency</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.thread_id</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, ULong> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.io_by_thread_by_latency.processlist_id</code>.
	 */
	public final TableField<IoByThreadByLatencyRecord, ULong> PROCESSLIST_ID = createField("processlist_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * Create a <code>sys.io_by_thread_by_latency</code> table reference
	 */
	public IoByThreadByLatency() {
		this("io_by_thread_by_latency", null);
	}

	/**
	 * Create an aliased <code>sys.io_by_thread_by_latency</code> table reference
	 */
	public IoByThreadByLatency(String alias) {
		this(alias, IO_BY_THREAD_BY_LATENCY);
	}

	private IoByThreadByLatency(String alias, Table<IoByThreadByLatencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private IoByThreadByLatency(String alias, Table<IoByThreadByLatencyRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoByThreadByLatency as(String alias) {
		return new IoByThreadByLatency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IoByThreadByLatency rename(String name) {
		return new IoByThreadByLatency(name, null);
	}
}
