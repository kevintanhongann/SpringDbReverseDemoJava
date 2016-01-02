/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables.records;


import com.example.mysql.tables.HelpCategory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * help categories
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpCategoryRecord extends UpdatableRecordImpl<HelpCategoryRecord> implements Record4<UShort, String, UShort, String> {

	private static final long serialVersionUID = -161245843;

	/**
	 * Setter for <code>mysql.help_category.help_category_id</code>.
	 */
	public void setHelpCategoryId(UShort value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.help_category.help_category_id</code>.
	 */
	public UShort getHelpCategoryId() {
		return (UShort) getValue(0);
	}

	/**
	 * Setter for <code>mysql.help_category.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.help_category.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.help_category.parent_category_id</code>.
	 */
	public void setParentCategoryId(UShort value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.help_category.parent_category_id</code>.
	 */
	public UShort getParentCategoryId() {
		return (UShort) getValue(2);
	}

	/**
	 * Setter for <code>mysql.help_category.url</code>.
	 */
	public void setUrl(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.help_category.url</code>.
	 */
	public String getUrl() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UShort> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UShort, String, UShort, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UShort, String, UShort, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field1() {
		return HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return HelpCategory.HELP_CATEGORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field3() {
		return HelpCategory.HELP_CATEGORY.PARENT_CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return HelpCategory.HELP_CATEGORY.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value1() {
		return getHelpCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value3() {
		return getParentCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpCategoryRecord value1(UShort value) {
		setHelpCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpCategoryRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpCategoryRecord value3(UShort value) {
		setParentCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpCategoryRecord value4(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpCategoryRecord values(UShort value1, String value2, UShort value3, String value4) {
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
	 * Create a detached HelpCategoryRecord
	 */
	public HelpCategoryRecord() {
		super(HelpCategory.HELP_CATEGORY);
	}

	/**
	 * Create a detached, initialised HelpCategoryRecord
	 */
	public HelpCategoryRecord(UShort helpCategoryId, String name, UShort parentCategoryId, String url) {
		super(HelpCategory.HELP_CATEGORY);

		setValue(0, helpCategoryId);
		setValue(1, name);
		setValue(2, parentCategoryId);
		setValue(3, url);
	}
}
