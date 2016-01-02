/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables.records;


import com.example.performance_schema.enums.ReplicationApplierStatusByCoordinatorServiceState;
import com.example.performance_schema.tables.ReplicationApplierStatusByCoordinator;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ReplicationApplierStatusByCoordinatorRecord extends TableRecordImpl<ReplicationApplierStatusByCoordinatorRecord> implements Record6<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, Timestamp> {

	private static final long serialVersionUID = -598777190;

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.CHANNEL_NAME</code>.
	 */
	public void setChannelName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.CHANNEL_NAME</code>.
	 */
	public String getChannelName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.THREAD_ID</code>.
	 */
	public void setThreadId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.THREAD_ID</code>.
	 */
	public ULong getThreadId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.SERVICE_STATE</code>.
	 */
	public void setServiceState(ReplicationApplierStatusByCoordinatorServiceState value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.SERVICE_STATE</code>.
	 */
	public ReplicationApplierStatusByCoordinatorServiceState getServiceState() {
		return (ReplicationApplierStatusByCoordinatorServiceState) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_NUMBER</code>.
	 */
	public void setLastErrorNumber(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_NUMBER</code>.
	 */
	public Integer getLastErrorNumber() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE</code>.
	 */
	public void setLastErrorMessage(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE</code>.
	 */
	public String getLastErrorMessage() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP</code>.
	 */
	public void setLastErrorTimestamp(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP</code>.
	 */
	public Timestamp getLastErrorTimestamp() {
		return (Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, Timestamp> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, Timestamp> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.CHANNEL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ReplicationApplierStatusByCoordinatorServiceState> field3() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.SERVICE_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getChannelName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorServiceState value3() {
		return getServiceState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getLastErrorNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastErrorMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getLastErrorTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value1(String value) {
		setChannelName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value2(ULong value) {
		setThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value3(ReplicationApplierStatusByCoordinatorServiceState value) {
		setServiceState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value4(Integer value) {
		setLastErrorNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value5(String value) {
		setLastErrorMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord value6(Timestamp value) {
		setLastErrorTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierStatusByCoordinatorRecord values(String value1, ULong value2, ReplicationApplierStatusByCoordinatorServiceState value3, Integer value4, String value5, Timestamp value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReplicationApplierStatusByCoordinatorRecord
	 */
	public ReplicationApplierStatusByCoordinatorRecord() {
		super(ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR);
	}

	/**
	 * Create a detached, initialised ReplicationApplierStatusByCoordinatorRecord
	 */
	public ReplicationApplierStatusByCoordinatorRecord(String channelName, ULong threadId, ReplicationApplierStatusByCoordinatorServiceState serviceState, Integer lastErrorNumber, String lastErrorMessage, Timestamp lastErrorTimestamp) {
		super(ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR);

		setValue(0, channelName);
		setValue(1, threadId);
		setValue(2, serviceState);
		setValue(3, lastErrorNumber);
		setValue(4, lastErrorMessage);
		setValue(5, lastErrorTimestamp);
	}
}
