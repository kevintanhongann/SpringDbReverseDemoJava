/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables.records;


import com.example.performance_schema.enums.EventsStatementsSummaryByProgramObjectType;
import com.example.performance_schema.tables.EventsStatementsSummaryByProgram;

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
public class EventsStatementsSummaryByProgramRecord extends TableRecordImpl<EventsStatementsSummaryByProgramRecord> {

	private static final long serialVersionUID = 1111068417;

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.OBJECT_TYPE</code>.
	 */
	public void setObjectType(EventsStatementsSummaryByProgramObjectType value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.OBJECT_TYPE</code>.
	 */
	public EventsStatementsSummaryByProgramObjectType getObjectType() {
		return (EventsStatementsSummaryByProgramObjectType) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.COUNT_STATEMENTS</code>.
	 */
	public void setCountStatements(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.COUNT_STATEMENTS</code>.
	 */
	public ULong getCountStatements() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_STATEMENTS_WAIT</code>.
	 */
	public void setSumStatementsWait(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_STATEMENTS_WAIT</code>.
	 */
	public ULong getSumStatementsWait() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.MIN_STATEMENTS_WAIT</code>.
	 */
	public void setMinStatementsWait(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.MIN_STATEMENTS_WAIT</code>.
	 */
	public ULong getMinStatementsWait() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.AVG_STATEMENTS_WAIT</code>.
	 */
	public void setAvgStatementsWait(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.AVG_STATEMENTS_WAIT</code>.
	 */
	public ULong getAvgStatementsWait() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.MAX_STATEMENTS_WAIT</code>.
	 */
	public void setMaxStatementsWait(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.MAX_STATEMENTS_WAIT</code>.
	 */
	public ULong getMaxStatementsWait() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_LOCK_TIME</code>.
	 */
	public void setSumLockTime(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_LOCK_TIME</code>.
	 */
	public ULong getSumLockTime() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_ERRORS</code>.
	 */
	public void setSumErrors(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_ERRORS</code>.
	 */
	public ULong getSumErrors() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_WARNINGS</code>.
	 */
	public void setSumWarnings(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_WARNINGS</code>.
	 */
	public ULong getSumWarnings() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_AFFECTED</code>.
	 */
	public void setSumRowsAffected(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_AFFECTED</code>.
	 */
	public ULong getSumRowsAffected() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_SENT</code>.
	 */
	public void setSumRowsSent(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_SENT</code>.
	 */
	public ULong getSumRowsSent() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_EXAMINED</code>.
	 */
	public void setSumRowsExamined(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_EXAMINED</code>.
	 */
	public ULong getSumRowsExamined() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public void setSumCreatedTmpDiskTables(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public ULong getSumCreatedTmpDiskTables() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_TABLES</code>.
	 */
	public void setSumCreatedTmpTables(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_TABLES</code>.
	 */
	public ULong getSumCreatedTmpTables() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_JOIN</code>.
	 */
	public void setSumSelectFullJoin(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_JOIN</code>.
	 */
	public ULong getSumSelectFullJoin() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public void setSumSelectFullRangeJoin(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public ULong getSumSelectFullRangeJoin() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE</code>.
	 */
	public void setSumSelectRange(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE</code>.
	 */
	public ULong getSumSelectRange() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public void setSumSelectRangeCheck(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public ULong getSumSelectRangeCheck() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_SCAN</code>.
	 */
	public void setSumSelectScan(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_SCAN</code>.
	 */
	public ULong getSumSelectScan() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_MERGE_PASSES</code>.
	 */
	public void setSumSortMergePasses(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_MERGE_PASSES</code>.
	 */
	public ULong getSumSortMergePasses() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_RANGE</code>.
	 */
	public void setSumSortRange(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_RANGE</code>.
	 */
	public ULong getSumSortRange() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_ROWS</code>.
	 */
	public void setSumSortRows(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_ROWS</code>.
	 */
	public ULong getSumSortRows() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_SCAN</code>.
	 */
	public void setSumSortScan(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_SORT_SCAN</code>.
	 */
	public ULong getSumSortScan() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_NO_INDEX_USED</code>.
	 */
	public void setSumNoIndexUsed(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_NO_INDEX_USED</code>.
	 */
	public ULong getSumNoIndexUsed() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_program.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public void setSumNoGoodIndexUsed(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_program.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public ULong getSumNoGoodIndexUsed() {
		return (ULong) getValue(31);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsStatementsSummaryByProgramRecord
	 */
	public EventsStatementsSummaryByProgramRecord() {
		super(EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM);
	}

	/**
	 * Create a detached, initialised EventsStatementsSummaryByProgramRecord
	 */
	public EventsStatementsSummaryByProgramRecord(EventsStatementsSummaryByProgramObjectType objectType, String objectSchema, String objectName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countStatements, ULong sumStatementsWait, ULong minStatementsWait, ULong avgStatementsWait, ULong maxStatementsWait, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed) {
		super(EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM);

		setValue(0, objectType);
		setValue(1, objectSchema);
		setValue(2, objectName);
		setValue(3, countStar);
		setValue(4, sumTimerWait);
		setValue(5, minTimerWait);
		setValue(6, avgTimerWait);
		setValue(7, maxTimerWait);
		setValue(8, countStatements);
		setValue(9, sumStatementsWait);
		setValue(10, minStatementsWait);
		setValue(11, avgStatementsWait);
		setValue(12, maxStatementsWait);
		setValue(13, sumLockTime);
		setValue(14, sumErrors);
		setValue(15, sumWarnings);
		setValue(16, sumRowsAffected);
		setValue(17, sumRowsSent);
		setValue(18, sumRowsExamined);
		setValue(19, sumCreatedTmpDiskTables);
		setValue(20, sumCreatedTmpTables);
		setValue(21, sumSelectFullJoin);
		setValue(22, sumSelectFullRangeJoin);
		setValue(23, sumSelectRange);
		setValue(24, sumSelectRangeCheck);
		setValue(25, sumSelectScan);
		setValue(26, sumSortMergePasses);
		setValue(27, sumSortRange);
		setValue(28, sumSortRows);
		setValue(29, sumSortScan);
		setValue(30, sumNoIndexUsed);
		setValue(31, sumNoGoodIndexUsed);
	}
}
