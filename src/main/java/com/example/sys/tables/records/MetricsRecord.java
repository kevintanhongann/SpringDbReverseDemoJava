/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.tables.Metrics;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetricsRecord extends TableRecordImpl<MetricsRecord> implements Record4<String, String, String, String> {

	private static final long serialVersionUID = 692514501;

	/**
	 * Setter for <code>sys.metrics.Variable_name</code>.
	 */
	public void setVariableName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.metrics.Variable_name</code>.
	 */
	public String getVariableName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.metrics.Variable_value</code>.
	 */
	public void setVariableValue(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.metrics.Variable_value</code>.
	 */
	public String getVariableValue() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.metrics.Type</code>.
	 */
	public void setType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.metrics.Type</code>.
	 */
	public String getType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.metrics.Enabled</code>.
	 */
	public void setEnabled(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.metrics.Enabled</code>.
	 */
	public String getEnabled() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Metrics.METRICS.VARIABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Metrics.METRICS.VARIABLE_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Metrics.METRICS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Metrics.METRICS.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getVariableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getVariableValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MetricsRecord value1(String value) {
		setVariableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MetricsRecord value2(String value) {
		setVariableValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MetricsRecord value3(String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MetricsRecord value4(String value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MetricsRecord values(String value1, String value2, String value3, String value4) {
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
	 * Create a detached MetricsRecord
	 */
	public MetricsRecord() {
		super(Metrics.METRICS);
	}

	/**
	 * Create a detached, initialised MetricsRecord
	 */
	public MetricsRecord(String variableName, String variableValue, String type, String enabled) {
		super(Metrics.METRICS);

		setValue(0, variableName);
		setValue(1, variableValue);
		setValue(2, type);
		setValue(3, enabled);
	}
}
