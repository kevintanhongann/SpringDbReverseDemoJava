/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables.records;


import com.example.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class EventsTransactionsSummaryGlobalByEventNameRecord extends TableRecordImpl<EventsTransactionsSummaryGlobalByEventNameRecord> implements Record16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

	private static final long serialVersionUID = -1638096041;

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_WRITE</code>.
	 */
	public void setCountReadWrite(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_WRITE</code>.
	 */
	public ULong getCountReadWrite() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE</code>.
	 */
	public void setSumTimerReadWrite(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE</code>.
	 */
	public ULong getSumTimerReadWrite() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE</code>.
	 */
	public void setMinTimerReadWrite(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE</code>.
	 */
	public ULong getMinTimerReadWrite() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE</code>.
	 */
	public void setAvgTimerReadWrite(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE</code>.
	 */
	public ULong getAvgTimerReadWrite() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE</code>.
	 */
	public void setMaxTimerReadWrite(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE</code>.
	 */
	public ULong getMaxTimerReadWrite() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_ONLY</code>.
	 */
	public void setCountReadOnly(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_ONLY</code>.
	 */
	public ULong getCountReadOnly() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY</code>.
	 */
	public void setSumTimerReadOnly(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY</code>.
	 */
	public ULong getSumTimerReadOnly() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY</code>.
	 */
	public void setMinTimerReadOnly(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY</code>.
	 */
	public ULong getMinTimerReadOnly() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY</code>.
	 */
	public void setAvgTimerReadOnly(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY</code>.
	 */
	public ULong getAvgTimerReadOnly() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY</code>.
	 */
	public void setMaxTimerReadOnly(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY</code>.
	 */
	public ULong getMaxTimerReadOnly() {
		return (ULong) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_STAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field12() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field13() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field14() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field15() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field16() {
		return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getCountStar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getSumTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getMinTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getAvgTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getMaxTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getCountReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getSumTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getMinTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getAvgTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getMaxTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value12() {
		return getCountReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value13() {
		return getSumTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value14() {
		return getMinTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value15() {
		return getAvgTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value16() {
		return getMaxTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value1(String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value2(ULong value) {
		setCountStar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value3(ULong value) {
		setSumTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value4(ULong value) {
		setMinTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value5(ULong value) {
		setAvgTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value6(ULong value) {
		setMaxTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value7(ULong value) {
		setCountReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value8(ULong value) {
		setSumTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value9(ULong value) {
		setMinTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value10(ULong value) {
		setAvgTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value11(ULong value) {
		setMaxTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value12(ULong value) {
		setCountReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value13(ULong value) {
		setSumTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value14(ULong value) {
		setMinTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value15(ULong value) {
		setAvgTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord value16(ULong value) {
		setMaxTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventNameRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsTransactionsSummaryGlobalByEventNameRecord
	 */
	public EventsTransactionsSummaryGlobalByEventNameRecord() {
		super(EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsTransactionsSummaryGlobalByEventNameRecord
	 */
	public EventsTransactionsSummaryGlobalByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countReadWrite, ULong sumTimerReadWrite, ULong minTimerReadWrite, ULong avgTimerReadWrite, ULong maxTimerReadWrite, ULong countReadOnly, ULong sumTimerReadOnly, ULong minTimerReadOnly, ULong avgTimerReadOnly, ULong maxTimerReadOnly) {
		super(EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME);

		setValue(0, eventName);
		setValue(1, countStar);
		setValue(2, sumTimerWait);
		setValue(3, minTimerWait);
		setValue(4, avgTimerWait);
		setValue(5, maxTimerWait);
		setValue(6, countReadWrite);
		setValue(7, sumTimerReadWrite);
		setValue(8, minTimerReadWrite);
		setValue(9, avgTimerReadWrite);
		setValue(10, maxTimerReadWrite);
		setValue(11, countReadOnly);
		setValue(12, sumTimerReadOnly);
		setValue(13, minTimerReadOnly);
		setValue(14, avgTimerReadOnly);
		setValue(15, maxTimerReadOnly);
	}
}
