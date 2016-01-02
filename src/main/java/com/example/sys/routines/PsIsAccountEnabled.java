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
 *  Determines whether instrumentation of an account is enabled 
 *  within Performance Schema.
 *  
 *  Parameters
 *  
 *  in_host VARCHAR(60): 
 *  The hostname of the account to check.
 *  in_user VARCHAR(32):
 *  The username of the account to check.
 *  
 *  Returns
 *  
 *  ENUM('YES', 'NO', 'PARTIAL')
 *  
 *  Example
 *  
 *  mysql> SELECT sys.ps_is_account_enabled('localhost', 'root');
 *  +------------------------------------------------+
 *  | sys.ps_is_account_enabled('localhost', 'root') |
 *  +------------------------------------------------+
 *  | YES                                            |
 *  +------------------------------------------------+
 *  1 row in set (0.01 sec)
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
public class PsIsAccountEnabled extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1590963501;

	/**
	 * The parameter <code>sys.ps_is_account_enabled.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(3), false);

	/**
	 * The parameter <code>sys.ps_is_account_enabled.in_host</code>.
	 */
	public static final Parameter<String> IN_HOST = createParameter("in_host", org.jooq.impl.SQLDataType.VARCHAR.length(60), false);

	/**
	 * The parameter <code>sys.ps_is_account_enabled.in_user</code>.
	 */
	public static final Parameter<String> IN_USER = createParameter("in_user", org.jooq.impl.SQLDataType.VARCHAR.length(32), false);

	/**
	 * Create a new routine call instance
	 */
	public PsIsAccountEnabled() {
		super("ps_is_account_enabled", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(3));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_HOST);
		addInParameter(IN_USER);
	}

	/**
	 * Set the <code>in_host</code> parameter IN value to the routine
	 */
	public void setInHost(String value) {
		setValue(IN_HOST, value);
	}

	/**
	 * Set the <code>in_host</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInHost(Field<String> field) {
		setField(IN_HOST, field);
	}

	/**
	 * Set the <code>in_user</code> parameter IN value to the routine
	 */
	public void setInUser(String value) {
		setValue(IN_USER, value);
	}

	/**
	 * Set the <code>in_user</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInUser(Field<String> field) {
		setField(IN_USER, field);
	}
}
