/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.tables.X$schemaTableLockWaits;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;
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
public class X$schemaTableLockWaitsRecord extends TableRecordImpl<X$schemaTableLockWaitsRecord> implements Record18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> {

	private static final long serialVersionUID = -735003257;

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.object_schema</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.object_schema</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.object_name</code>.
	 */
	public void setObjectName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.object_name</code>.
	 */
	public String getObjectName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_thread_id</code>.
	 */
	public void setWaitingThreadId(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_thread_id</code>.
	 */
	public ULong getWaitingThreadId() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_pid</code>.
	 */
	public void setWaitingPid(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_pid</code>.
	 */
	public ULong getWaitingPid() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_account</code>.
	 */
	public void setWaitingAccount(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_account</code>.
	 */
	public String getWaitingAccount() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_lock_type</code>.
	 */
	public void setWaitingLockType(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_lock_type</code>.
	 */
	public String getWaitingLockType() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_lock_duration</code>.
	 */
	public void setWaitingLockDuration(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_lock_duration</code>.
	 */
	public String getWaitingLockDuration() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_query</code>.
	 */
	public void setWaitingQuery(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_query</code>.
	 */
	public String getWaitingQuery() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_query_secs</code>.
	 */
	public void setWaitingQuerySecs(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_query_secs</code>.
	 */
	public Long getWaitingQuerySecs() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_query_rows_affected</code>.
	 */
	public void setWaitingQueryRowsAffected(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_query_rows_affected</code>.
	 */
	public ULong getWaitingQueryRowsAffected() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.waiting_query_rows_examined</code>.
	 */
	public void setWaitingQueryRowsExamined(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.waiting_query_rows_examined</code>.
	 */
	public ULong getWaitingQueryRowsExamined() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.blocking_thread_id</code>.
	 */
	public void setBlockingThreadId(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.blocking_thread_id</code>.
	 */
	public ULong getBlockingThreadId() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.blocking_pid</code>.
	 */
	public void setBlockingPid(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.blocking_pid</code>.
	 */
	public ULong getBlockingPid() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.blocking_account</code>.
	 */
	public void setBlockingAccount(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.blocking_account</code>.
	 */
	public String getBlockingAccount() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.blocking_lock_type</code>.
	 */
	public void setBlockingLockType(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.blocking_lock_type</code>.
	 */
	public String getBlockingLockType() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.blocking_lock_duration</code>.
	 */
	public void setBlockingLockDuration(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.blocking_lock_duration</code>.
	 */
	public String getBlockingLockDuration() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.sql_kill_blocking_query</code>.
	 */
	public void setSqlKillBlockingQuery(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.sql_kill_blocking_query</code>.
	 */
	public String getSqlKillBlockingQuery() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>sys.x$schema_table_lock_waits.sql_kill_blocking_connection</code>.
	 */
	public void setSqlKillBlockingConnection(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_lock_waits.sql_kill_blocking_connection</code>.
	 */
	public String getSqlKillBlockingConnection() {
		return (String) getValue(17);
	}

	// -------------------------------------------------------------------------
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> fieldsRow() {
		return (Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> valuesRow() {
		return (Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.OBJECT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_ACCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_LOCK_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_LOCK_DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_SECS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_ROWS_AFFECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_ROWS_EXAMINED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field12() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.BLOCKING_THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field13() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.BLOCKING_PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.BLOCKING_ACCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.BLOCKING_LOCK_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.BLOCKING_LOCK_DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.SQL_KILL_BLOCKING_QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS.SQL_KILL_BLOCKING_CONNECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getObjectName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getWaitingThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getWaitingPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getWaitingAccount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getWaitingLockType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getWaitingLockDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getWaitingQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value9() {
		return getWaitingQuerySecs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getWaitingQueryRowsAffected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getWaitingQueryRowsExamined();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value12() {
		return getBlockingThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value13() {
		return getBlockingPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getBlockingAccount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getBlockingLockType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getBlockingLockDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getSqlKillBlockingQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getSqlKillBlockingConnection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value1(String value) {
		setObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value2(String value) {
		setObjectName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value3(ULong value) {
		setWaitingThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value4(ULong value) {
		setWaitingPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value5(String value) {
		setWaitingAccount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value6(String value) {
		setWaitingLockType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value7(String value) {
		setWaitingLockDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value8(String value) {
		setWaitingQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value9(Long value) {
		setWaitingQuerySecs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value10(ULong value) {
		setWaitingQueryRowsAffected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value11(ULong value) {
		setWaitingQueryRowsExamined(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value12(ULong value) {
		setBlockingThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value13(ULong value) {
		setBlockingPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value14(String value) {
		setBlockingAccount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value15(String value) {
		setBlockingLockType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value16(String value) {
		setBlockingLockDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value17(String value) {
		setSqlKillBlockingQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord value18(String value) {
		setSqlKillBlockingConnection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableLockWaitsRecord values(String value1, String value2, ULong value3, ULong value4, String value5, String value6, String value7, String value8, Long value9, ULong value10, ULong value11, ULong value12, ULong value13, String value14, String value15, String value16, String value17, String value18) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$schemaTableLockWaitsRecord
	 */
	public X$schemaTableLockWaitsRecord() {
		super(X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS);
	}

	/**
	 * Create a detached, initialised X$schemaTableLockWaitsRecord
	 */
	public X$schemaTableLockWaitsRecord(String objectSchema, String objectName, ULong waitingThreadId, ULong waitingPid, String waitingAccount, String waitingLockType, String waitingLockDuration, String waitingQuery, Long waitingQuerySecs, ULong waitingQueryRowsAffected, ULong waitingQueryRowsExamined, ULong blockingThreadId, ULong blockingPid, String blockingAccount, String blockingLockType, String blockingLockDuration, String sqlKillBlockingQuery, String sqlKillBlockingConnection) {
		super(X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS);

		setValue(0, objectSchema);
		setValue(1, objectName);
		setValue(2, waitingThreadId);
		setValue(3, waitingPid);
		setValue(4, waitingAccount);
		setValue(5, waitingLockType);
		setValue(6, waitingLockDuration);
		setValue(7, waitingQuery);
		setValue(8, waitingQuerySecs);
		setValue(9, waitingQueryRowsAffected);
		setValue(10, waitingQueryRowsExamined);
		setValue(11, blockingThreadId);
		setValue(12, blockingPid);
		setValue(13, blockingAccount);
		setValue(14, blockingLockType);
		setValue(15, blockingLockDuration);
		setValue(16, sqlKillBlockingQuery);
		setValue(17, sqlKillBlockingConnection);
	}
}
