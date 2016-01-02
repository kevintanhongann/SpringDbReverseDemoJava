/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.tables.X$ioGlobalByFileByBytes;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class X$ioGlobalByFileByBytesRecord extends TableRecordImpl<X$ioGlobalByFileByBytesRecord> implements Record9<String, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long, BigDecimal> {

	private static final long serialVersionUID = -1047462310;

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.file</code>.
	 */
	public void setFile(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.file</code>.
	 */
	public String getFile() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.count_read</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.count_read</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.total_read</code>.
	 */
	public void setTotalRead(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.total_read</code>.
	 */
	public Long getTotalRead() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.avg_read</code>.
	 */
	public void setAvgRead(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.avg_read</code>.
	 */
	public BigDecimal getAvgRead() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.count_write</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.count_write</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.total_written</code>.
	 */
	public void setTotalWritten(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.total_written</code>.
	 */
	public Long getTotalWritten() {
		return (Long) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.avg_write</code>.
	 */
	public void setAvgWrite(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.avg_write</code>.
	 */
	public BigDecimal getAvgWrite() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.total</code>.
	 */
	public void setTotal(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.total</code>.
	 */
	public Long getTotal() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$io_global_by_file_by_bytes.write_pct</code>.
	 */
	public void setWritePct(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$io_global_by_file_by_bytes.write_pct</code>.
	 */
	public BigDecimal getWritePct() {
		return (BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long, BigDecimal> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long, BigDecimal> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.FILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.COUNT_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.AVG_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.COUNT_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL_WRITTEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.AVG_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES.WRITE_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getFile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getCountRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getTotalRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getAvgRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getCountWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value6() {
		return getTotalWritten();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getAvgWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getWritePct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value1(String value) {
		setFile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value2(ULong value) {
		setCountRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value3(Long value) {
		setTotalRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value4(BigDecimal value) {
		setAvgRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value5(ULong value) {
		setCountWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value6(Long value) {
		setTotalWritten(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value7(BigDecimal value) {
		setAvgWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value8(Long value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord value9(BigDecimal value) {
		setWritePct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytesRecord values(String value1, ULong value2, Long value3, BigDecimal value4, ULong value5, Long value6, BigDecimal value7, Long value8, BigDecimal value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$ioGlobalByFileByBytesRecord
	 */
	public X$ioGlobalByFileByBytesRecord() {
		super(X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES);
	}

	/**
	 * Create a detached, initialised X$ioGlobalByFileByBytesRecord
	 */
	public X$ioGlobalByFileByBytesRecord(String file, ULong countRead, Long totalRead, BigDecimal avgRead, ULong countWrite, Long totalWritten, BigDecimal avgWrite, Long total, BigDecimal writePct) {
		super(X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES);

		setValue(0, file);
		setValue(1, countRead);
		setValue(2, totalRead);
		setValue(3, avgRead);
		setValue(4, countWrite);
		setValue(5, totalWritten);
		setValue(6, avgWrite);
		setValue(7, total);
		setValue(8, writePct);
	}
}
