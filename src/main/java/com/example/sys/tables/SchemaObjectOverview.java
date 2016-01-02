/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables;


import com.example.sys.Sys;
import com.example.sys.tables.records.SchemaObjectOverviewRecord;

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
public class SchemaObjectOverview extends TableImpl<SchemaObjectOverviewRecord> {

	private static final long serialVersionUID = -2130282066;

	/**
	 * The reference instance of <code>sys.schema_object_overview</code>
	 */
	public static final SchemaObjectOverview SCHEMA_OBJECT_OVERVIEW = new SchemaObjectOverview();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SchemaObjectOverviewRecord> getRecordType() {
		return SchemaObjectOverviewRecord.class;
	}

	/**
	 * The column <code>sys.schema_object_overview.db</code>.
	 */
	public final TableField<SchemaObjectOverviewRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_object_overview.object_type</code>.
	 */
	public final TableField<SchemaObjectOverviewRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.schema_object_overview.count</code>.
	 */
	public final TableField<SchemaObjectOverviewRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sys.schema_object_overview</code> table reference
	 */
	public SchemaObjectOverview() {
		this("schema_object_overview", null);
	}

	/**
	 * Create an aliased <code>sys.schema_object_overview</code> table reference
	 */
	public SchemaObjectOverview(String alias) {
		this(alias, SCHEMA_OBJECT_OVERVIEW);
	}

	private SchemaObjectOverview(String alias, Table<SchemaObjectOverviewRecord> aliased) {
		this(alias, aliased, null);
	}

	private SchemaObjectOverview(String alias, Table<SchemaObjectOverviewRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaObjectOverview as(String alias) {
		return new SchemaObjectOverview(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SchemaObjectOverview rename(String name) {
		return new SchemaObjectOverview(name, null);
	}
}
