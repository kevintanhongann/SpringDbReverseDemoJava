/**
 * This class is generated by jOOQ
 */
package com.example.sys.routines;


import com.example.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Checks whether the provided connection id is instrumented within Performance 
 * Schema.
 *  
 *  Parameters
 *  
 *  in_connection_id (BIGINT UNSIGNED):
 *  The id of the connection to check.
 *  
 *  Returns
 *  
 *  ENUM('YES', 'NO', 'UNKNOWN')
 *  
 *  Example
 *  
 *  mysql> SELECT sys.ps_is_thread_instrumented(CONNECTION_ID());
 *  +------------------------------------------------+
 *  | sys.ps_is_thread_instrumented(CONNECTION_ID()) |
 *  +------------------------------------------------+
 *  | YES                                            |
 *  +------------------------------------------------+
 *  
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsIsThreadInstrumented extends AbstractRoutine<String> {

	private static final long serialVersionUID = -84776842;

	/**
	 * The parameter <code>sys.ps_is_thread_instrumented.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(7), false);

	/**
	 * The parameter <code>sys.ps_is_thread_instrumented.in_connection_id</code>.
	 */
	public static final Parameter<Long> IN_CONNECTION_ID = createParameter("in_connection_id", org.jooq.impl.SQLDataType.BIGINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PsIsThreadInstrumented() {
		super("ps_is_thread_instrumented", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(7));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_CONNECTION_ID);
	}

	/**
	 * Set the <code>in_connection_id</code> parameter IN value to the routine
	 */
	public void setInConnectionId(Long value) {
		setValue(IN_CONNECTION_ID, value);
	}

	/**
	 * Set the <code>in_connection_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInConnectionId(Field<Long> field) {
		setField(IN_CONNECTION_ID, field);
	}
}
