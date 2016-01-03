/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables;


import com.example.mysql.Keys;
import com.example.mysql.Mysql;
import com.example.mysql.enums.TimeZoneUseLeapSeconds;
import com.example.mysql.tables.records.TimeZoneRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * Time zones
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZone extends TableImpl<TimeZoneRecord> {

	private static final long serialVersionUID = -1735280565;

	/**
	 * The reference instance of <code>mysql.time_zone</code>
	 */
	public static final TimeZone TIME_ZONE = new TimeZone();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TimeZoneRecord> getRecordType() {
		return TimeZoneRecord.class;
	}

	/**
	 * The column <code>mysql.time_zone.Time_zone_id</code>.
	 */
	public final TableField<TimeZoneRecord, UInteger> TIME_ZONE_ID = createField("Time_zone_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone.Use_leap_seconds</code>.
	 */
	public final TableField<TimeZoneRecord, TimeZoneUseLeapSeconds> USE_LEAP_SECONDS = createField("Use_leap_seconds", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.example.mysql.enums.TimeZoneUseLeapSeconds.class), this, "");

	/**
	 * Create a <code>mysql.time_zone</code> table reference
	 */
	public TimeZone() {
		this("time_zone", null);
	}

	/**
	 * Create an aliased <code>mysql.time_zone</code> table reference
	 */
	public TimeZone(String alias) {
		this(alias, TIME_ZONE);
	}

	private TimeZone(String alias, Table<TimeZoneRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimeZone(String alias, Table<TimeZoneRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "Time zones");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TimeZoneRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_TIME_ZONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TimeZoneRecord> getPrimaryKey() {
		return Keys.KEY_TIME_ZONE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TimeZoneRecord>> getKeys() {
		return Arrays.<UniqueKey<TimeZoneRecord>>asList(Keys.KEY_TIME_ZONE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZone as(String alias) {
		return new TimeZone(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TimeZone rename(String name) {
		return new TimeZone(name, null);
	}
}