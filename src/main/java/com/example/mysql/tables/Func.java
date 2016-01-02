/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables;


import com.example.mysql.Keys;
import com.example.mysql.Mysql;
import com.example.mysql.enums.FuncType;
import com.example.mysql.tables.records.FuncRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * User defined functions
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Func extends TableImpl<FuncRecord> {

	private static final long serialVersionUID = 643124421;

	/**
	 * The reference instance of <code>mysql.func</code>
	 */
	public static final Func FUNC = new Func();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FuncRecord> getRecordType() {
		return FuncRecord.class;
	}

	/**
	 * The column <code>mysql.func.name</code>.
	 */
	public final TableField<FuncRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.func.ret</code>.
	 */
	public final TableField<FuncRecord, Byte> RET = createField("ret", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.func.dl</code>.
	 */
	public final TableField<FuncRecord, String> DL = createField("dl", org.jooq.impl.SQLDataType.CHAR.length(128).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.func.type</code>.
	 */
	public final TableField<FuncRecord, FuncType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.example.mysql.enums.FuncType.class), this, "");

	/**
	 * Create a <code>mysql.func</code> table reference
	 */
	public Func() {
		this("func", null);
	}

	/**
	 * Create an aliased <code>mysql.func</code> table reference
	 */
	public Func(String alias) {
		this(alias, FUNC);
	}

	private Func(String alias, Table<FuncRecord> aliased) {
		this(alias, aliased, null);
	}

	private Func(String alias, Table<FuncRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "User defined functions");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FuncRecord> getPrimaryKey() {
		return Keys.KEY_FUNC_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FuncRecord>> getKeys() {
		return Arrays.<UniqueKey<FuncRecord>>asList(Keys.KEY_FUNC_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Func as(String alias) {
		return new Func(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Func rename(String name) {
		return new Func(name, null);
	}
}
