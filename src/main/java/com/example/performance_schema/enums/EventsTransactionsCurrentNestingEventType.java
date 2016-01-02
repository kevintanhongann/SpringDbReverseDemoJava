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
public enum EventsTransactionsCurrentNestingEventType implements EnumType {

	TRANSACTION("TRANSACTION"),

	STATEMENT("STATEMENT"),

	STAGE("STAGE"),

	WAIT("WAIT");

	private final String literal;

	private EventsTransactionsCurrentNestingEventType(String literal) {
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
		return "events_transactions_current_NESTING_EVENT_TYPE";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
