/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.tables.X$hostSummary;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class X$hostSummaryRecord extends TableRecordImpl<X$hostSummaryRecord> implements Record12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> {

	private static final long serialVersionUID = -1332201829;

	/**
	 * Setter for <code>sys.x$host_summary.host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$host_summary.statements</code>.
	 */
	public void setStatements(BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.statements</code>.
	 */
	public BigInteger getStatements() {
		return (BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$host_summary.statement_latency</code>.
	 */
	public void setStatementLatency(BigInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.statement_latency</code>.
	 */
	public BigInteger getStatementLatency() {
		return (BigInteger) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$host_summary.statement_avg_latency</code>.
	 */
	public void setStatementAvgLatency(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.statement_avg_latency</code>.
	 */
	public BigDecimal getStatementAvgLatency() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$host_summary.table_scans</code>.
	 */
	public void setTableScans(BigInteger value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.table_scans</code>.
	 */
	public BigInteger getTableScans() {
		return (BigInteger) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$host_summary.file_ios</code>.
	 */
	public void setFileIos(BigInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.file_ios</code>.
	 */
	public BigInteger getFileIos() {
		return (BigInteger) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$host_summary.file_io_latency</code>.
	 */
	public void setFileIoLatency(BigInteger value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.file_io_latency</code>.
	 */
	public BigInteger getFileIoLatency() {
		return (BigInteger) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$host_summary.current_connections</code>.
	 */
	public void setCurrentConnections(BigInteger value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.current_connections</code>.
	 */
	public BigInteger getCurrentConnections() {
		return (BigInteger) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$host_summary.total_connections</code>.
	 */
	public void setTotalConnections(BigInteger value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.total_connections</code>.
	 */
	public BigInteger getTotalConnections() {
		return (BigInteger) getValue(8);
	}

	/**
	 * Setter for <code>sys.x$host_summary.unique_users</code>.
	 */
	public void setUniqueUsers(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.unique_users</code>.
	 */
	public Long getUniqueUsers() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>sys.x$host_summary.current_memory</code>.
	 */
	public void setCurrentMemory(BigInteger value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.current_memory</code>.
	 */
	public BigInteger getCurrentMemory() {
		return (BigInteger) getValue(10);
	}

	/**
	 * Setter for <code>sys.x$host_summary.total_memory_allocated</code>.
	 */
	public void setTotalMemoryAllocated(BigInteger value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary.total_memory_allocated</code>.
	 */
	public BigInteger getTotalMemoryAllocated() {
		return (BigInteger) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$hostSummary.X$HOST_SUMMARY.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field2() {
		return X$hostSummary.X$HOST_SUMMARY.STATEMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field3() {
		return X$hostSummary.X$HOST_SUMMARY.STATEMENT_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return X$hostSummary.X$HOST_SUMMARY.STATEMENT_AVG_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field5() {
		return X$hostSummary.X$HOST_SUMMARY.TABLE_SCANS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field6() {
		return X$hostSummary.X$HOST_SUMMARY.FILE_IOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field7() {
		return X$hostSummary.X$HOST_SUMMARY.FILE_IO_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field8() {
		return X$hostSummary.X$HOST_SUMMARY.CURRENT_CONNECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field9() {
		return X$hostSummary.X$HOST_SUMMARY.TOTAL_CONNECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field10() {
		return X$hostSummary.X$HOST_SUMMARY.UNIQUE_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field11() {
		return X$hostSummary.X$HOST_SUMMARY.CURRENT_MEMORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field12() {
		return X$hostSummary.X$HOST_SUMMARY.TOTAL_MEMORY_ALLOCATED;
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
	public BigInteger value2() {
		return getStatements();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value3() {
		return getStatementLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getStatementAvgLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value5() {
		return getTableScans();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value6() {
		return getFileIos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value7() {
		return getFileIoLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value8() {
		return getCurrentConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value9() {
		return getTotalConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value10() {
		return getUniqueUsers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value11() {
		return getCurrentMemory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value12() {
		return getTotalMemoryAllocated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value2(BigInteger value) {
		setStatements(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value3(BigInteger value) {
		setStatementLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value4(BigDecimal value) {
		setStatementAvgLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value5(BigInteger value) {
		setTableScans(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value6(BigInteger value) {
		setFileIos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value7(BigInteger value) {
		setFileIoLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value8(BigInteger value) {
		setCurrentConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value9(BigInteger value) {
		setTotalConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value10(Long value) {
		setUniqueUsers(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value11(BigInteger value) {
		setCurrentMemory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord value12(BigInteger value) {
		setTotalMemoryAllocated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryRecord values(String value1, BigInteger value2, BigInteger value3, BigDecimal value4, BigInteger value5, BigInteger value6, BigInteger value7, BigInteger value8, BigInteger value9, Long value10, BigInteger value11, BigInteger value12) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$hostSummaryRecord
	 */
	public X$hostSummaryRecord() {
		super(X$hostSummary.X$HOST_SUMMARY);
	}

	/**
	 * Create a detached, initialised X$hostSummaryRecord
	 */
	public X$hostSummaryRecord(String host, BigInteger statements, BigInteger statementLatency, BigDecimal statementAvgLatency, BigInteger tableScans, BigInteger fileIos, BigInteger fileIoLatency, BigInteger currentConnections, BigInteger totalConnections, Long uniqueUsers, BigInteger currentMemory, BigInteger totalMemoryAllocated) {
		super(X$hostSummary.X$HOST_SUMMARY);

		setValue(0, host);
		setValue(1, statements);
		setValue(2, statementLatency);
		setValue(3, statementAvgLatency);
		setValue(4, tableScans);
		setValue(5, fileIos);
		setValue(6, fileIoLatency);
		setValue(7, currentConnections);
		setValue(8, totalConnections);
		setValue(9, uniqueUsers);
		setValue(10, currentMemory);
		setValue(11, totalMemoryAllocated);
	}
}
