/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum SetupConsumersEnabled implements EnumType {

	YES("YES"),

	NO("NO");

	private final String literal;

	private SetupConsumersEnabled(String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "setup_consumers_ENABLED";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}