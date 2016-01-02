/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.enums.HostCacheHostValidated;
import com.example.performance_schema.tables.records.HostCacheRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class HostCache extends TableImpl<HostCacheRecord> {

	private static final long serialVersionUID = -537027810;

	/**
	 * The reference instance of <code>performance_schema.host_cache</code>
	 */
	public static final HostCache HOST_CACHE = new HostCache();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HostCacheRecord> getRecordType() {
		return HostCacheRecord.class;
	}

	/**
	 * The column <code>performance_schema.host_cache.IP</code>.
	 */
	public final TableField<HostCacheRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.HOST</code>.
	 */
	public final TableField<HostCacheRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>performance_schema.host_cache.HOST_VALIDATED</code>.
	 */
	public final TableField<HostCacheRecord, HostCacheHostValidated> HOST_VALIDATED = createField("HOST_VALIDATED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.example.performance_schema.enums.HostCacheHostValidated.class), this, "");

	/**
	 * The column <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> SUM_CONNECT_ERRORS = createField("SUM_CONNECT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_HOST_BLOCKED_ERRORS = createField("COUNT_HOST_BLOCKED_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_NAMEINFO_TRANSIENT_ERRORS = createField("COUNT_NAMEINFO_TRANSIENT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_NAMEINFO_PERMANENT_ERRORS = createField("COUNT_NAMEINFO_PERMANENT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_FORMAT_ERRORS = createField("COUNT_FORMAT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_ADDRINFO_TRANSIENT_ERRORS = createField("COUNT_ADDRINFO_TRANSIENT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_ADDRINFO_PERMANENT_ERRORS = createField("COUNT_ADDRINFO_PERMANENT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_FCRDNS_ERRORS = createField("COUNT_FCRDNS_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_HOST_ACL_ERRORS = createField("COUNT_HOST_ACL_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_NO_AUTH_PLUGIN_ERRORS = createField("COUNT_NO_AUTH_PLUGIN_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_AUTH_PLUGIN_ERRORS = createField("COUNT_AUTH_PLUGIN_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_HANDSHAKE_ERRORS = createField("COUNT_HANDSHAKE_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_PROXY_USER_ERRORS = createField("COUNT_PROXY_USER_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_PROXY_USER_ACL_ERRORS = createField("COUNT_PROXY_USER_ACL_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_AUTHENTICATION_ERRORS = createField("COUNT_AUTHENTICATION_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_SSL_ERRORS = createField("COUNT_SSL_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_MAX_USER_CONNECTIONS_ERRORS = createField("COUNT_MAX_USER_CONNECTIONS_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS = createField("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_DEFAULT_DATABASE_ERRORS = createField("COUNT_DEFAULT_DATABASE_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_INIT_CONNECT_ERRORS = createField("COUNT_INIT_CONNECT_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_LOCAL_ERRORS = createField("COUNT_LOCAL_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
	 */
	public final TableField<HostCacheRecord, Long> COUNT_UNKNOWN_ERRORS = createField("COUNT_UNKNOWN_ERRORS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.host_cache.FIRST_SEEN</code>.
	 */
	public final TableField<HostCacheRecord, Timestamp> FIRST_SEEN = createField("FIRST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.host_cache.LAST_SEEN</code>.
	 */
	public final TableField<HostCacheRecord, Timestamp> LAST_SEEN = createField("LAST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
	 */
	public final TableField<HostCacheRecord, Timestamp> FIRST_ERROR_SEEN = createField("FIRST_ERROR_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
	 */
	public final TableField<HostCacheRecord, Timestamp> LAST_ERROR_SEEN = createField("LAST_ERROR_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * Create a <code>performance_schema.host_cache</code> table reference
	 */
	public HostCache() {
		this("host_cache", null);
	}

	/**
	 * Create an aliased <code>performance_schema.host_cache</code> table reference
	 */
	public HostCache(String alias) {
		this(alias, HOST_CACHE);
	}

	private HostCache(String alias, Table<HostCacheRecord> aliased) {
		this(alias, aliased, null);
	}

	private HostCache(String alias, Table<HostCacheRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostCache as(String alias) {
		return new HostCache(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HostCache rename(String name) {
		return new HostCache(name, null);
	}
}
