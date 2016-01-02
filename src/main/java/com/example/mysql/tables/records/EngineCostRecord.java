/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables.records;


import com.example.mysql.tables.EngineCost;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EngineCostRecord extends UpdatableRecordImpl<EngineCostRecord> implements Record6<String, Integer, String, Double, Timestamp, String> {

	private static final long serialVersionUID = 74930773;

	/**
	 * Setter for <code>mysql.engine_cost.engine_name</code>.
	 */
	public void setEngineName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.engine_name</code>.
	 */
	public String getEngineName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.engine_cost.device_type</code>.
	 */
	public void setDeviceType(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.device_type</code>.
	 */
	public Integer getDeviceType() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>mysql.engine_cost.cost_name</code>.
	 */
	public void setCostName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.cost_name</code>.
	 */
	public String getCostName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.engine_cost.cost_value</code>.
	 */
	public void setCostValue(Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.cost_value</code>.
	 */
	public Double getCostValue() {
		return (Double) getValue(3);
	}

	/**
	 * Setter for <code>mysql.engine_cost.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.last_update</code>.
	 */
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>mysql.engine_cost.comment</code>.
	 */
	public void setComment(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.engine_cost.comment</code>.
	 */
	public String getComment() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<String, String, Integer> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, Integer, String, Double, Timestamp, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, Integer, String, Double, Timestamp, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return EngineCost.ENGINE_COST.ENGINE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return EngineCost.ENGINE_COST.DEVICE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return EngineCost.ENGINE_COST.COST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Double> field4() {
		return EngineCost.ENGINE_COST.COST_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return EngineCost.ENGINE_COST.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return EngineCost.ENGINE_COST.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getEngineName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getDeviceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCostName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double value4() {
		return getCostValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value1(String value) {
		setEngineName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value2(Integer value) {
		setDeviceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value3(String value) {
		setCostName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value4(Double value) {
		setCostValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value5(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord value6(String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCostRecord values(String value1, Integer value2, String value3, Double value4, Timestamp value5, String value6) {
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
	 * Create a detached EngineCostRecord
	 */
	public EngineCostRecord() {
		super(EngineCost.ENGINE_COST);
	}

	/**
	 * Create a detached, initialised EngineCostRecord
	 */
	public EngineCostRecord(String engineName, Integer deviceType, String costName, Double costValue, Timestamp lastUpdate, String comment) {
		super(EngineCost.ENGINE_COST);

		setValue(0, engineName);
		setValue(1, deviceType);
		setValue(2, costName);
		setValue(3, costValue);
		setValue(4, lastUpdate);
		setValue(5, comment);
	}
}
