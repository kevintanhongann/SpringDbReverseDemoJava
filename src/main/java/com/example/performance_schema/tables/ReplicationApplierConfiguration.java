/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.ReplicationApplierConfigurationRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class ReplicationApplierConfiguration extends TableImpl<ReplicationApplierConfigurationRecord> {

	private static final long serialVersionUID = 79815908;

	/**
	 * The reference instance of <code>performance_schema.replication_applier_configuration</code>
	 */
	public static final ReplicationApplierConfiguration REPLICATION_APPLIER_CONFIGURATION = new ReplicationApplierConfiguration();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReplicationApplierConfigurationRecord> getRecordType() {
		return ReplicationApplierConfigurationRecord.class;
	}

	/**
	 * The column <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
	 */
	public final TableField<ReplicationApplierConfigurationRecord, String> CHANNEL_NAME = createField("CHANNEL_NAME", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
	 */
	public final TableField<ReplicationApplierConfigurationRecord, Integer> DESIRED_DELAY = createField("DESIRED_DELAY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.replication_applier_configuration</code> table reference
	 */
	public ReplicationApplierConfiguration() {
		this("replication_applier_configuration", null);
	}

	/**
	 * Create an aliased <code>performance_schema.replication_applier_configuration</code> table reference
	 */
	public ReplicationApplierConfiguration(String alias) {
		this(alias, REPLICATION_APPLIER_CONFIGURATION);
	}

	private ReplicationApplierConfiguration(String alias, Table<ReplicationApplierConfigurationRecord> aliased) {
		this(alias, aliased, null);
	}

	private ReplicationApplierConfiguration(String alias, Table<ReplicationApplierConfigurationRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierConfiguration as(String alias) {
		return new ReplicationApplierConfiguration(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ReplicationApplierConfiguration rename(String name) {
		return new ReplicationApplierConfiguration(name, null);
	}
}