/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.EventsStagesSummaryByUserByEventNameRecord;

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
public class EventsStagesSummaryByUserByEventName extends TableImpl<EventsStagesSummaryByUserByEventNameRecord> {

	private static final long serialVersionUID = -872928552;

	/**
	 * The reference instance of <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
	 */
	public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = new EventsStagesSummaryByUserByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsStagesSummaryByUserByEventNameRecord> getRecordType() {
		return EventsStagesSummaryByUserByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_stages_summary_by_user_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByUserByEventName() {
		this("events_stages_summary_by_user_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_stages_summary_by_user_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByUserByEventName(String alias) {
		this(alias, EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
	}

	private EventsStagesSummaryByUserByEventName(String alias, Table<EventsStagesSummaryByUserByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStagesSummaryByUserByEventName(String alias, Table<EventsStagesSummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventName as(String alias) {
		return new EventsStagesSummaryByUserByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsStagesSummaryByUserByEventName rename(String name) {
		return new EventsStagesSummaryByUserByEventName(name, null);
	}
}
