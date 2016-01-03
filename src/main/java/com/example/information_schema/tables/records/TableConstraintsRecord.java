/**
 * This class is generated by jOOQ
 */
package com.example.information_schema.tables.records;


import com.example.information_schema.tables.TableConstraints;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> implements Record6<String, String, String, String, String, String> {

	private static final long serialVersionUID = 1650387456;

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
	 */
	public void setConstraintCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
	 */
	public String getConstraintCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
	 */
	public void setConstraintSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
	 */
	public String getConstraintSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
	 */
	public void setConstraintName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
	 */
	public String getConstraintName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
	 */
	public void setConstraintType(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
	 */
	public String getConstraintType() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getConstraintCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getConstraintSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getConstraintName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getConstraintType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value1(String value) {
		setConstraintCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value2(String value) {
		setConstraintSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value3(String value) {
		setConstraintName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value4(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value5(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord value6(String value) {
		setConstraintType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
	 * Create a detached TableConstraintsRecord
	 */
	public TableConstraintsRecord() {
		super(TableConstraints.TABLE_CONSTRAINTS);
	}

	/**
	 * Create a detached, initialised TableConstraintsRecord
	 */
	public TableConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableSchema, String tableName, String constraintType) {
		super(TableConstraints.TABLE_CONSTRAINTS);

		setValue(0, constraintCatalog);
		setValue(1, constraintSchema);
		setValue(2, constraintName);
		setValue(3, tableSchema);
		setValue(4, tableName);
		setValue(5, constraintType);
	}
}