/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.enums.EventsStatementsHistoryNestingEventType;
import com.example.performance_schema.tables.records.EventsStatementsHistoryRecord;

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
public class EventsStatementsHistory extends TableImpl<EventsStatementsHistoryRecord> {

	private static final long serialVersionUID = 377460317;

	/**
	 * The reference instance of <code>performance_schema.events_statements_history</code>
	 */
	public static final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = new EventsStatementsHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsStatementsHistoryRecord> getRecordType() {
		return EventsStatementsHistoryRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_statements_history.THREAD_ID</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.EVENT_ID</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.END_EVENT_ID</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.EVENT_NAME</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SOURCE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.TIMER_START</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.TIMER_END</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.TIMER_WAIT</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.LOCK_TIME</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> LOCK_TIME = createField("LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SQL_TEXT</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> SQL_TEXT = createField("SQL_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.DIGEST</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> DIGEST = createField("DIGEST", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.DIGEST_TEXT</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> DIGEST_TEXT = createField("DIGEST_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.CURRENT_SCHEMA</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> CURRENT_SCHEMA = createField("CURRENT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.OBJECT_TYPE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.OBJECT_SCHEMA</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.OBJECT_NAME</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.MYSQL_ERRNO</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, Integer> MYSQL_ERRNO = createField("MYSQL_ERRNO", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.RETURNED_SQLSTATE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> RETURNED_SQLSTATE = createField("RETURNED_SQLSTATE", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.MESSAGE_TEXT</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, String> MESSAGE_TEXT = createField("MESSAGE_TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.ERRORS</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> ERRORS = createField("ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.WARNINGS</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> WARNINGS = createField("WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.ROWS_AFFECTED</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> ROWS_AFFECTED = createField("ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.ROWS_SENT</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> ROWS_SENT = createField("ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.ROWS_EXAMINED</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> ROWS_EXAMINED = createField("ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.CREATED_TMP_DISK_TABLES</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> CREATED_TMP_DISK_TABLES = createField("CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.CREATED_TMP_TABLES</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> CREATED_TMP_TABLES = createField("CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SELECT_FULL_JOIN</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SELECT_FULL_JOIN = createField("SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SELECT_FULL_RANGE_JOIN</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SELECT_FULL_RANGE_JOIN = createField("SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SELECT_RANGE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SELECT_RANGE = createField("SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SELECT_RANGE_CHECK</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SELECT_RANGE_CHECK = createField("SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SELECT_SCAN</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SELECT_SCAN = createField("SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SORT_MERGE_PASSES</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SORT_MERGE_PASSES = createField("SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SORT_RANGE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SORT_RANGE = createField("SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SORT_ROWS</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SORT_ROWS = createField("SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.SORT_SCAN</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> SORT_SCAN = createField("SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.NO_INDEX_USED</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> NO_INDEX_USED = createField("NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.NO_GOOD_INDEX_USED</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> NO_GOOD_INDEX_USED = createField("NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.NESTING_EVENT_ID</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.NESTING_EVENT_TYPE</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, EventsStatementsHistoryNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.example.performance_schema.enums.EventsStatementsHistoryNestingEventType.class), this, "");

	/**
	 * The column <code>performance_schema.events_statements_history.NESTING_EVENT_LEVEL</code>.
	 */
	public final TableField<EventsStatementsHistoryRecord, Integer> NESTING_EVENT_LEVEL = createField("NESTING_EVENT_LEVEL", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>performance_schema.events_statements_history</code> table reference
	 */
	public EventsStatementsHistory() {
		this("events_statements_history", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_statements_history</code> table reference
	 */
	public EventsStatementsHistory(String alias) {
		this(alias, EVENTS_STATEMENTS_HISTORY);
	}

	private EventsStatementsHistory(String alias, Table<EventsStatementsHistoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStatementsHistory(String alias, Table<EventsStatementsHistoryRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStatementsHistory as(String alias) {
		return new EventsStatementsHistory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsStatementsHistory rename(String name) {
		return new EventsStatementsHistory(name, null);
	}
}
