/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables.records;


import com.example.performance_schema.tables.TableLockWaitsSummaryByTable;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableLockWaitsSummaryByTableRecord extends TableRecordImpl<TableLockWaitsSummaryByTableRecord> {

	private static final long serialVersionUID = -1244377575;

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
	 */
	public void setObjectType(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
	 */
	public String getObjectType() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
	 */
	public ULong getSumTimerRead() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
	 */
	public ULong getMinTimerRead() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
	 */
	public ULong getAvgTimerRead() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
	 */
	public ULong getMaxTimerRead() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
	 */
	public ULong getSumTimerWrite() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
	 */
	public ULong getMinTimerWrite() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
	 */
	public ULong getAvgTimerWrite() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
	 */
	public ULong getMaxTimerWrite() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
	 */
	public void setCountReadNormal(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
	 */
	public ULong getCountReadNormal() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
	 */
	public void setSumTimerReadNormal(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
	 */
	public ULong getSumTimerReadNormal() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
	 */
	public void setMinTimerReadNormal(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
	 */
	public ULong getMinTimerReadNormal() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
	 */
	public void setAvgTimerReadNormal(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
	 */
	public ULong getAvgTimerReadNormal() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
	 */
	public void setMaxTimerReadNormal(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
	 */
	public ULong getMaxTimerReadNormal() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
	 */
	public void setCountReadWithSharedLocks(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
	 */
	public ULong getCountReadWithSharedLocks() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public void setSumTimerReadWithSharedLocks(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public ULong getSumTimerReadWithSharedLocks() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public void setMinTimerReadWithSharedLocks(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public ULong getMinTimerReadWithSharedLocks() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public void setAvgTimerReadWithSharedLocks(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public ULong getAvgTimerReadWithSharedLocks() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public void setMaxTimerReadWithSharedLocks(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
	 */
	public ULong getMaxTimerReadWithSharedLocks() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
	 */
	public void setCountReadHighPriority(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
	 */
	public ULong getCountReadHighPriority() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public void setSumTimerReadHighPriority(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public ULong getSumTimerReadHighPriority() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public void setMinTimerReadHighPriority(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public ULong getMinTimerReadHighPriority() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public void setAvgTimerReadHighPriority(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public ULong getAvgTimerReadHighPriority() {
		return (ULong) getValue(31);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public void setMaxTimerReadHighPriority(ULong value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
	 */
	public ULong getMaxTimerReadHighPriority() {
		return (ULong) getValue(32);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
	 */
	public void setCountReadNoInsert(ULong value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
	 */
	public ULong getCountReadNoInsert() {
		return (ULong) getValue(33);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
	 */
	public void setSumTimerReadNoInsert(ULong value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
	 */
	public ULong getSumTimerReadNoInsert() {
		return (ULong) getValue(34);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
	 */
	public void setMinTimerReadNoInsert(ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
	 */
	public ULong getMinTimerReadNoInsert() {
		return (ULong) getValue(35);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
	 */
	public void setAvgTimerReadNoInsert(ULong value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
	 */
	public ULong getAvgTimerReadNoInsert() {
		return (ULong) getValue(36);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
	 */
	public void setMaxTimerReadNoInsert(ULong value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
	 */
	public ULong getMaxTimerReadNoInsert() {
		return (ULong) getValue(37);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
	 */
	public void setCountReadExternal(ULong value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
	 */
	public ULong getCountReadExternal() {
		return (ULong) getValue(38);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
	 */
	public void setSumTimerReadExternal(ULong value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
	 */
	public ULong getSumTimerReadExternal() {
		return (ULong) getValue(39);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
	 */
	public void setMinTimerReadExternal(ULong value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
	 */
	public ULong getMinTimerReadExternal() {
		return (ULong) getValue(40);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
	 */
	public void setAvgTimerReadExternal(ULong value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
	 */
	public ULong getAvgTimerReadExternal() {
		return (ULong) getValue(41);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
	 */
	public void setMaxTimerReadExternal(ULong value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
	 */
	public ULong getMaxTimerReadExternal() {
		return (ULong) getValue(42);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
	 */
	public void setCountWriteAllowWrite(ULong value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
	 */
	public ULong getCountWriteAllowWrite() {
		return (ULong) getValue(43);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public void setSumTimerWriteAllowWrite(ULong value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public ULong getSumTimerWriteAllowWrite() {
		return (ULong) getValue(44);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public void setMinTimerWriteAllowWrite(ULong value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public ULong getMinTimerWriteAllowWrite() {
		return (ULong) getValue(45);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public void setAvgTimerWriteAllowWrite(ULong value) {
		setValue(46, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public ULong getAvgTimerWriteAllowWrite() {
		return (ULong) getValue(46);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public void setMaxTimerWriteAllowWrite(ULong value) {
		setValue(47, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
	 */
	public ULong getMaxTimerWriteAllowWrite() {
		return (ULong) getValue(47);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
	 */
	public void setCountWriteConcurrentInsert(ULong value) {
		setValue(48, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
	 */
	public ULong getCountWriteConcurrentInsert() {
		return (ULong) getValue(48);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public void setSumTimerWriteConcurrentInsert(ULong value) {
		setValue(49, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public ULong getSumTimerWriteConcurrentInsert() {
		return (ULong) getValue(49);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public void setMinTimerWriteConcurrentInsert(ULong value) {
		setValue(50, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public ULong getMinTimerWriteConcurrentInsert() {
		return (ULong) getValue(50);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public void setAvgTimerWriteConcurrentInsert(ULong value) {
		setValue(51, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public ULong getAvgTimerWriteConcurrentInsert() {
		return (ULong) getValue(51);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public void setMaxTimerWriteConcurrentInsert(ULong value) {
		setValue(52, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
	 */
	public ULong getMaxTimerWriteConcurrentInsert() {
		return (ULong) getValue(52);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
	 */
	public void setCountWriteLowPriority(ULong value) {
		setValue(53, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
	 */
	public ULong getCountWriteLowPriority() {
		return (ULong) getValue(53);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public void setSumTimerWriteLowPriority(ULong value) {
		setValue(54, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public ULong getSumTimerWriteLowPriority() {
		return (ULong) getValue(54);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public void setMinTimerWriteLowPriority(ULong value) {
		setValue(55, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public ULong getMinTimerWriteLowPriority() {
		return (ULong) getValue(55);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public void setAvgTimerWriteLowPriority(ULong value) {
		setValue(56, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public ULong getAvgTimerWriteLowPriority() {
		return (ULong) getValue(56);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public void setMaxTimerWriteLowPriority(ULong value) {
		setValue(57, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
	 */
	public ULong getMaxTimerWriteLowPriority() {
		return (ULong) getValue(57);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
	 */
	public void setCountWriteNormal(ULong value) {
		setValue(58, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
	 */
	public ULong getCountWriteNormal() {
		return (ULong) getValue(58);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
	 */
	public void setSumTimerWriteNormal(ULong value) {
		setValue(59, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
	 */
	public ULong getSumTimerWriteNormal() {
		return (ULong) getValue(59);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
	 */
	public void setMinTimerWriteNormal(ULong value) {
		setValue(60, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
	 */
	public ULong getMinTimerWriteNormal() {
		return (ULong) getValue(60);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
	 */
	public void setAvgTimerWriteNormal(ULong value) {
		setValue(61, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
	 */
	public ULong getAvgTimerWriteNormal() {
		return (ULong) getValue(61);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
	 */
	public void setMaxTimerWriteNormal(ULong value) {
		setValue(62, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
	 */
	public ULong getMaxTimerWriteNormal() {
		return (ULong) getValue(62);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
	 */
	public void setCountWriteExternal(ULong value) {
		setValue(63, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
	 */
	public ULong getCountWriteExternal() {
		return (ULong) getValue(63);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
	 */
	public void setSumTimerWriteExternal(ULong value) {
		setValue(64, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
	 */
	public ULong getSumTimerWriteExternal() {
		return (ULong) getValue(64);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
	 */
	public void setMinTimerWriteExternal(ULong value) {
		setValue(65, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
	 */
	public ULong getMinTimerWriteExternal() {
		return (ULong) getValue(65);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
	 */
	public void setAvgTimerWriteExternal(ULong value) {
		setValue(66, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
	 */
	public ULong getAvgTimerWriteExternal() {
		return (ULong) getValue(66);
	}

	/**
	 * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
	 */
	public void setMaxTimerWriteExternal(ULong value) {
		setValue(67, value);
	}

	/**
	 * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
	 */
	public ULong getMaxTimerWriteExternal() {
		return (ULong) getValue(67);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TableLockWaitsSummaryByTableRecord
	 */
	public TableLockWaitsSummaryByTableRecord() {
		super(TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE);
	}

	/**
	 * Create a detached, initialised TableLockWaitsSummaryByTableRecord
	 */
	public TableLockWaitsSummaryByTableRecord(String objectType, String objectSchema, String objectName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong countReadNormal, ULong sumTimerReadNormal, ULong minTimerReadNormal, ULong avgTimerReadNormal, ULong maxTimerReadNormal, ULong countReadWithSharedLocks, ULong sumTimerReadWithSharedLocks, ULong minTimerReadWithSharedLocks, ULong avgTimerReadWithSharedLocks, ULong maxTimerReadWithSharedLocks, ULong countReadHighPriority, ULong sumTimerReadHighPriority, ULong minTimerReadHighPriority, ULong avgTimerReadHighPriority, ULong maxTimerReadHighPriority, ULong countReadNoInsert, ULong sumTimerReadNoInsert, ULong minTimerReadNoInsert, ULong avgTimerReadNoInsert, ULong maxTimerReadNoInsert, ULong countReadExternal, ULong sumTimerReadExternal, ULong minTimerReadExternal, ULong avgTimerReadExternal, ULong maxTimerReadExternal, ULong countWriteAllowWrite, ULong sumTimerWriteAllowWrite, ULong minTimerWriteAllowWrite, ULong avgTimerWriteAllowWrite, ULong maxTimerWriteAllowWrite, ULong countWriteConcurrentInsert, ULong sumTimerWriteConcurrentInsert, ULong minTimerWriteConcurrentInsert, ULong avgTimerWriteConcurrentInsert, ULong maxTimerWriteConcurrentInsert, ULong countWriteLowPriority, ULong sumTimerWriteLowPriority, ULong minTimerWriteLowPriority, ULong avgTimerWriteLowPriority, ULong maxTimerWriteLowPriority, ULong countWriteNormal, ULong sumTimerWriteNormal, ULong minTimerWriteNormal, ULong avgTimerWriteNormal, ULong maxTimerWriteNormal, ULong countWriteExternal, ULong sumTimerWriteExternal, ULong minTimerWriteExternal, ULong avgTimerWriteExternal, ULong maxTimerWriteExternal) {
		super(TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE);

		setValue(0, objectType);
		setValue(1, objectSchema);
		setValue(2, objectName);
		setValue(3, countStar);
		setValue(4, sumTimerWait);
		setValue(5, minTimerWait);
		setValue(6, avgTimerWait);
		setValue(7, maxTimerWait);
		setValue(8, countRead);
		setValue(9, sumTimerRead);
		setValue(10, minTimerRead);
		setValue(11, avgTimerRead);
		setValue(12, maxTimerRead);
		setValue(13, countWrite);
		setValue(14, sumTimerWrite);
		setValue(15, minTimerWrite);
		setValue(16, avgTimerWrite);
		setValue(17, maxTimerWrite);
		setValue(18, countReadNormal);
		setValue(19, sumTimerReadNormal);
		setValue(20, minTimerReadNormal);
		setValue(21, avgTimerReadNormal);
		setValue(22, maxTimerReadNormal);
		setValue(23, countReadWithSharedLocks);
		setValue(24, sumTimerReadWithSharedLocks);
		setValue(25, minTimerReadWithSharedLocks);
		setValue(26, avgTimerReadWithSharedLocks);
		setValue(27, maxTimerReadWithSharedLocks);
		setValue(28, countReadHighPriority);
		setValue(29, sumTimerReadHighPriority);
		setValue(30, minTimerReadHighPriority);
		setValue(31, avgTimerReadHighPriority);
		setValue(32, maxTimerReadHighPriority);
		setValue(33, countReadNoInsert);
		setValue(34, sumTimerReadNoInsert);
		setValue(35, minTimerReadNoInsert);
		setValue(36, avgTimerReadNoInsert);
		setValue(37, maxTimerReadNoInsert);
		setValue(38, countReadExternal);
		setValue(39, sumTimerReadExternal);
		setValue(40, minTimerReadExternal);
		setValue(41, avgTimerReadExternal);
		setValue(42, maxTimerReadExternal);
		setValue(43, countWriteAllowWrite);
		setValue(44, sumTimerWriteAllowWrite);
		setValue(45, minTimerWriteAllowWrite);
		setValue(46, avgTimerWriteAllowWrite);
		setValue(47, maxTimerWriteAllowWrite);
		setValue(48, countWriteConcurrentInsert);
		setValue(49, sumTimerWriteConcurrentInsert);
		setValue(50, minTimerWriteConcurrentInsert);
		setValue(51, avgTimerWriteConcurrentInsert);
		setValue(52, maxTimerWriteConcurrentInsert);
		setValue(53, countWriteLowPriority);
		setValue(54, sumTimerWriteLowPriority);
		setValue(55, minTimerWriteLowPriority);
		setValue(56, avgTimerWriteLowPriority);
		setValue(57, maxTimerWriteLowPriority);
		setValue(58, countWriteNormal);
		setValue(59, sumTimerWriteNormal);
		setValue(60, minTimerWriteNormal);
		setValue(61, avgTimerWriteNormal);
		setValue(62, maxTimerWriteNormal);
		setValue(63, countWriteExternal);
		setValue(64, sumTimerWriteExternal);
		setValue(65, minTimerWriteExternal);
		setValue(66, avgTimerWriteExternal);
		setValue(67, maxTimerWriteExternal);
	}
}
