/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables.records;


import com.example.mysql.tables.ColumnsPriv;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Column privileges
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsPrivRecord extends UpdatableRecordImpl<ColumnsPrivRecord> implements Record7<String, String, String, String, String, Timestamp, String> {

	private static final long serialVersionUID = 305748878;

	/**
	 * Setter for <code>mysql.columns_priv.Host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Db</code>.
	 */
	public void setDb(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Db</code>.
	 */
	public String getDb() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.columns_priv.User</code>.
	 */
	public void setUser(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.User</code>.
	 */
	public String getUser() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Column_name</code>.
	 */
	public void setColumnName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Column_name</code>.
	 */
	public String getColumnName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Column_priv</code>.
	 */
	public void setColumnPriv(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Column_priv</code>.
	 */
	public String getColumnPriv() {
		return (String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record5<String, String, String, String, String> key() {
		return (Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, String, String, String, Timestamp, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, String, String, String, Timestamp, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ColumnsPriv.COLUMNS_PRIV.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ColumnsPriv.COLUMNS_PRIV.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ColumnsPriv.COLUMNS_PRIV.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ColumnsPriv.COLUMNS_PRIV.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return ColumnsPriv.COLUMNS_PRIV.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ColumnsPriv.COLUMNS_PRIV.COLUMN_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getColumnPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value2(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value3(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value4(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value5(String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value6(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value7(String value) {
		setColumnPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ColumnsPrivRecord
	 */
	public ColumnsPrivRecord() {
		super(ColumnsPriv.COLUMNS_PRIV);
	}

	/**
	 * Create a detached, initialised ColumnsPrivRecord
	 */
	public ColumnsPrivRecord(String host, String db, String user, String tableName, String columnName, Timestamp timestamp, String columnPriv) {
		super(ColumnsPriv.COLUMNS_PRIV);

		setValue(0, host);
		setValue(1, db);
		setValue(2, user);
		setValue(3, tableName);
		setValue(4, columnName);
		setValue(5, timestamp);
		setValue(6, columnPriv);
	}
}
