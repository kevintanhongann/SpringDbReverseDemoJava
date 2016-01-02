/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class EventsWaitsSummaryByThreadByEventName extends TableImpl<EventsWaitsSummaryByThreadByEventNameRecord> {

	private static final long serialVersionUID = 843108050;

	/**
	 * The reference instance of <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
	 */
	public static final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsWaitsSummaryByThreadByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsWaitsSummaryByThreadByEventNameRecord> getRecordType() {
		return EventsWaitsSummaryByThreadByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.COUNT_STAR</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_waits_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryByThreadByEventName() {
		this("events_waits_summary_by_thread_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryByThreadByEventName(String alias) {
		this(alias, EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
	}

	private EventsWaitsSummaryByThreadByEventName(String alias, Table<EventsWaitsSummaryByThreadByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsSummaryByThreadByEventName(String alias, Table<EventsWaitsSummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByThreadByEventName as(String alias) {
		return new EventsWaitsSummaryByThreadByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsWaitsSummaryByThreadByEventName rename(String name) {
		return new EventsWaitsSummaryByThreadByEventName(name, null);
	}
}
