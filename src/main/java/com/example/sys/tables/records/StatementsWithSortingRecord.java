/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.tables.StatementsWithSorting;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class StatementsWithSortingRecord extends TableRecordImpl<StatementsWithSortingRecord> implements Record13<String, String, ULong, String, ULong, BigInteger, ULong, ULong, ULong, BigInteger, Timestamp, Timestamp, String> {

	private static final long serialVersionUID = 1263305773;

	/**
	 * Setter for <code>sys.statements_with_sorting.query</code>.
	 */
	public void setQuery(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.query</code>.
	 */
	public String getQuery() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.db</code>.
	 */
	public void setDb(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.db</code>.
	 */
	public String getDb() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.exec_count</code>.
	 */
	public void setExecCount(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.exec_count</code>.
	 */
	public ULong getExecCount() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.total_latency</code>.
	 */
	public void setTotalLatency(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.total_latency</code>.
	 */
	public String getTotalLatency() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.sort_merge_passes</code>.
	 */
	public void setSortMergePasses(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.sort_merge_passes</code>.
	 */
	public ULong getSortMergePasses() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.avg_sort_merges</code>.
	 */
	public void setAvgSortMerges(BigInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.avg_sort_merges</code>.
	 */
	public BigInteger getAvgSortMerges() {
		return (BigInteger) getValue(5);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.sorts_using_scans</code>.
	 */
	public void setSortsUsingScans(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.sorts_using_scans</code>.
	 */
	public ULong getSortsUsingScans() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.sort_using_range</code>.
	 */
	public void setSortUsingRange(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.sort_using_range</code>.
	 */
	public ULong getSortUsingRange() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.rows_sorted</code>.
	 */
	public void setRowsSorted(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.rows_sorted</code>.
	 */
	public ULong getRowsSorted() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.avg_rows_sorted</code>.
	 */
	public void setAvgRowsSorted(BigInteger value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.avg_rows_sorted</code>.
	 */
	public BigInteger getAvgRowsSorted() {
		return (BigInteger) getValue(9);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.first_seen</code>.
	 */
	public void setFirstSeen(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.first_seen</code>.
	 */
	public Timestamp getFirstSeen() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.last_seen</code>.
	 */
	public void setLastSeen(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.last_seen</code>.
	 */
	public Timestamp getLastSeen() {
		return (Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>sys.statements_with_sorting.digest</code>.
	 */
	public void setDigest(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.statements_with_sorting.digest</code>.
	 */
	public String getDigest() {
		return (String) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<String, String, ULong, String, ULong, BigInteger, ULong, ULong, ULong, BigInteger, Timestamp, Timestamp, String> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<String, String, ULong, String, ULong, BigInteger, ULong, ULong, ULong, BigInteger, Timestamp, Timestamp, String> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.EXEC_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.TOTAL_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.SORT_MERGE_PASSES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field6() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.AVG_SORT_MERGES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.SORTS_USING_SCANS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.SORT_USING_RANGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.ROWS_SORTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field10() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.AVG_ROWS_SORTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.FIRST_SEEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.LAST_SEEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return StatementsWithSorting.STATEMENTS_WITH_SORTING.DIGEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getQuery();
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
	public ULong value3() {
		return getExecCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTotalLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getSortMergePasses();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value6() {
		return getAvgSortMerges();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getSortsUsingScans();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getSortUsingRange();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getRowsSorted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value10() {
		return getAvgRowsSorted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getFirstSeen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value12() {
		return getLastSeen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getDigest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value1(String value) {
		setQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value2(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value3(ULong value) {
		setExecCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value4(String value) {
		setTotalLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value5(ULong value) {
		setSortMergePasses(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value6(BigInteger value) {
		setAvgSortMerges(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value7(ULong value) {
		setSortsUsingScans(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value8(ULong value) {
		setSortUsingRange(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value9(ULong value) {
		setRowsSorted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value10(BigInteger value) {
		setAvgRowsSorted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value11(Timestamp value) {
		setFirstSeen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value12(Timestamp value) {
		setLastSeen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord value13(String value) {
		setDigest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithSortingRecord values(String value1, String value2, ULong value3, String value4, ULong value5, BigInteger value6, ULong value7, ULong value8, ULong value9, BigInteger value10, Timestamp value11, Timestamp value12, String value13) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatementsWithSortingRecord
	 */
	public StatementsWithSortingRecord() {
		super(StatementsWithSorting.STATEMENTS_WITH_SORTING);
	}

	/**
	 * Create a detached, initialised StatementsWithSortingRecord
	 */
	public StatementsWithSortingRecord(String query, String db, ULong execCount, String totalLatency, ULong sortMergePasses, BigInteger avgSortMerges, ULong sortsUsingScans, ULong sortUsingRange, ULong rowsSorted, BigInteger avgRowsSorted, Timestamp firstSeen, Timestamp lastSeen, String digest) {
		super(StatementsWithSorting.STATEMENTS_WITH_SORTING);

		setValue(0, query);
		setValue(1, db);
		setValue(2, execCount);
		setValue(3, totalLatency);
		setValue(4, sortMergePasses);
		setValue(5, avgSortMerges);
		setValue(6, sortsUsingScans);
		setValue(7, sortUsingRange);
		setValue(8, rowsSorted);
		setValue(9, avgRowsSorted);
		setValue(10, firstSeen);
		setValue(11, lastSeen);
		setValue(12, digest);
	}
}