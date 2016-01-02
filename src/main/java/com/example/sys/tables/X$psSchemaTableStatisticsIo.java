/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables;


import com.example.sys.Sys;
import com.example.sys.tables.records.X$psSchemaTableStatisticsIoRecord;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class X$psSchemaTableStatisticsIo extends TableImpl<X$psSchemaTableStatisticsIoRecord> {

	private static final long serialVersionUID = -929404844;

	/**
	 * The reference instance of <code>sys.x$ps_schema_table_statistics_io</code>
	 */
	public static final X$psSchemaTableStatisticsIo X$PS_SCHEMA_TABLE_STATISTICS_IO = new X$psSchemaTableStatisticsIo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$psSchemaTableStatisticsIoRecord> getRecordType() {
		return X$psSchemaTableStatisticsIoRecord.class;
	}

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.table_schema</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.table_name</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.count_read</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.sum_number_of_bytes_read</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> SUM_NUMBER_OF_BYTES_READ = createField("sum_number_of_bytes_read", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_read</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> SUM_TIMER_READ = createField("sum_timer_read", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.count_write</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.sum_number_of_bytes_write</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> SUM_NUMBER_OF_BYTES_WRITE = createField("sum_number_of_bytes_write", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_write</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> SUM_TIMER_WRITE = createField("sum_timer_write", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.count_misc</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> COUNT_MISC = createField("count_misc", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_misc</code>.
	 */
	public final TableField<X$psSchemaTableStatisticsIoRecord, BigInteger> SUM_TIMER_MISC = createField("sum_timer_misc", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * Create a <code>sys.x$ps_schema_table_statistics_io</code> table reference
	 */
	public X$psSchemaTableStatisticsIo() {
		this("x$ps_schema_table_statistics_io", null);
	}

	/**
	 * Create an aliased <code>sys.x$ps_schema_table_statistics_io</code> table reference
	 */
	public X$psSchemaTableStatisticsIo(String alias) {
		this(alias, X$PS_SCHEMA_TABLE_STATISTICS_IO);
	}

	private X$psSchemaTableStatisticsIo(String alias, Table<X$psSchemaTableStatisticsIoRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$psSchemaTableStatisticsIo(String alias, Table<X$psSchemaTableStatisticsIoRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$psSchemaTableStatisticsIo as(String alias) {
		return new X$psSchemaTableStatisticsIo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$psSchemaTableStatisticsIo rename(String name) {
		return new X$psSchemaTableStatisticsIo(name, null);
	}
}
