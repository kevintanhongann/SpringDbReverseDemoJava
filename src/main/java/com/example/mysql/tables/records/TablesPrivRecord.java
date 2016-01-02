/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables.records;


import com.example.mysql.tables.TablesPriv;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table privileges
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesPrivRecord extends UpdatableRecordImpl<TablesPrivRecord> implements Record8<String, String, String, String, String, Timestamp, String, String> {

	private static final long serialVersionUID = -1417784829;

	/**
	 * Setter for <code>mysql.tables_priv.Host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Db</code>.
	 */
	public void setDb(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Db</code>.
	 */
	public String getDb() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.tables_priv.User</code>.
	 */
	public void setUser(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.User</code>.
	 */
	public String getUser() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Grantor</code>.
	 */
	public void setGrantor(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Grantor</code>.
	 */
	public String getGrantor() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Table_priv</code>.
	 */
	public void setTablePriv(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Table_priv</code>.
	 */
	public String getTablePriv() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Column_priv</code>.
	 */
	public void setColumnPriv(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Column_priv</code>.
	 */
	public String getColumnPriv() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<String, String, String, String> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, Timestamp, String, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, Timestamp, String, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TablesPriv.TABLES_PRIV.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TablesPriv.TABLES_PRIV.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TablesPriv.TABLES_PRIV.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TablesPriv.TABLES_PRIV.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TablesPriv.TABLES_PRIV.GRANTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return TablesPriv.TABLES_PRIV.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TablesPriv.TABLES_PRIV.TABLE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TablesPriv.TABLES_PRIV.COLUMN_PRIV;
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
		return getGrantor();
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
		return getTablePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getColumnPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value2(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value3(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value4(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value5(String value) {
		setGrantor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value6(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value7(String value) {
		setTablePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value8(String value) {
		setColumnPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, String value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TablesPrivRecord
	 */
	public TablesPrivRecord() {
		super(TablesPriv.TABLES_PRIV);
	}

	/**
	 * Create a detached, initialised TablesPrivRecord
	 */
	public TablesPrivRecord(String host, String db, String user, String tableName, String grantor, Timestamp timestamp, String tablePriv, String columnPriv) {
		super(TablesPriv.TABLES_PRIV);

		setValue(0, host);
		setValue(1, db);
		setValue(2, user);
		setValue(3, tableName);
		setValue(4, grantor);
		setValue(5, timestamp);
		setValue(6, tablePriv);
		setValue(7, columnPriv);
	}
}
