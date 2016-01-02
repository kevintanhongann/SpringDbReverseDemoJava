/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord;

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
public class EventsWaitsSummaryGlobalByEventName extends TableImpl<EventsWaitsSummaryGlobalByEventNameRecord> {

	private static final long serialVersionUID = -33047555;

	/**
	 * The reference instance of <code>performance_schema.events_waits_summary_global_by_event_name</code>
	 */
	public static final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = new EventsWaitsSummaryGlobalByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsWaitsSummaryGlobalByEventNameRecord> getRecordType() {
		return EventsWaitsSummaryGlobalByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryGlobalByEventName() {
		this("events_waits_summary_global_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryGlobalByEventName(String alias) {
		this(alias, EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	private EventsWaitsSummaryGlobalByEventName(String alias, Table<EventsWaitsSummaryGlobalByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsSummaryGlobalByEventName(String alias, Table<EventsWaitsSummaryGlobalByEventNameRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventName as(String alias) {
		return new EventsWaitsSummaryGlobalByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsWaitsSummaryGlobalByEventName rename(String name) {
		return new EventsWaitsSummaryGlobalByEventName(name, null);
	}
}
