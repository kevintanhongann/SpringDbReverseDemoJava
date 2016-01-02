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
 *  Returns whether an instrument is enabled by default in this version of 
 * MySQL.
 *  
 *  Parameters
 *  
 *  in_instrument VARCHAR(128): 
 *  The instrument to check.
 *  
 *  Returns
 *  
 *  ENUM('YES', 'NO')
 *  
 *  Example
 *  
 *  mysql> SELECT sys.ps_is_instrument_default_enabled('statement/sql/select');
 *  +--------------------------------------------------------------+
 *  | sys.ps_is_instrument_default_enabled('statement/sql/select') |
 *  +--------------------------------------------------------------+
 *  | YES                                                          |
 *  +--------------------------------------------------------------+
 *  1 row in set (0.00 sec)
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
public class PsIsInstrumentDefaultEnabled extends AbstractRoutine<String> {

	private static final long serialVersionUID = -614418592;

	/**
	 * The parameter <code>sys.ps_is_instrument_default_enabled.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(3), false);

	/**
	 * The parameter <code>sys.ps_is_instrument_default_enabled.in_instrument</code>.
	 */
	public static final Parameter<String> IN_INSTRUMENT = createParameter("in_instrument", org.jooq.impl.SQLDataType.VARCHAR.length(128), false);

	/**
	 * Create a new routine call instance
	 */
	public PsIsInstrumentDefaultEnabled() {
		super("ps_is_instrument_default_enabled", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(3));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_INSTRUMENT);
	}

	/**
	 * Set the <code>in_instrument</code> parameter IN value to the routine
	 */
	public void setInInstrument(String value) {
		setValue(IN_INSTRUMENT, value);
	}

	/**
	 * Set the <code>in_instrument</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInInstrument(Field<String> field) {
		setField(IN_INSTRUMENT, field);
	}
}
