/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables.records;


import com.example.mysql.tables.ServerCost;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ServerCostRecord extends UpdatableRecordImpl<ServerCostRecord> implements Record4<String, Double, Timestamp, String> {

	private static final long serialVersionUID = -1584182005;

	/**
	 * Setter for <code>mysql.server_cost.cost_name</code>.
	 */
	public void setCostName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.server_cost.cost_name</code>.
	 */
	public String getCostName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.server_cost.cost_value</code>.
	 */
	public void setCostValue(Double value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.server_cost.cost_value</code>.
	 */
	public Double getCostValue() {
		return (Double) getValue(1);
	}

	/**
	 * Setter for <code>mysql.server_cost.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.server_cost.last_update</code>.
	 */
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>mysql.server_cost.comment</code>.
	 */
	public void setComment(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.server_cost.comment</code>.
	 */
	public String getComment() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, Double, Timestamp, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, Double, Timestamp, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ServerCost.SERVER_COST.COST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Double> field2() {
		return ServerCost.SERVER_COST.COST_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return ServerCost.SERVER_COST.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ServerCost.SERVER_COST.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getCostName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double value2() {
		return getCostValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCostRecord value1(String value) {
		setCostName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCostRecord value2(Double value) {
		setCostValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCostRecord value3(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCostRecord value4(String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCostRecord values(String value1, Double value2, Timestamp value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ServerCostRecord
	 */
	public ServerCostRecord() {
		super(ServerCost.SERVER_COST);
	}

	/**
	 * Create a detached, initialised ServerCostRecord
	 */
	public ServerCostRecord(String costName, Double costValue, Timestamp lastUpdate, String comment) {
		super(ServerCost.SERVER_COST);

		setValue(0, costName);
		setValue(1, costValue);
		setValue(2, lastUpdate);
		setValue(3, comment);
	}
}
