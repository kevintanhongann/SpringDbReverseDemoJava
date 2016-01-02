/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.FileInstancesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


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
public class FileInstances extends TableImpl<FileInstancesRecord> {

	private static final long serialVersionUID = 169478308;

	/**
	 * The reference instance of <code>performance_schema.file_instances</code>
	 */
	public static final FileInstances FILE_INSTANCES = new FileInstances();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FileInstancesRecord> getRecordType() {
		return FileInstancesRecord.class;
	}

	/**
	 * The column <code>performance_schema.file_instances.FILE_NAME</code>.
	 */
	public final TableField<FileInstancesRecord, String> FILE_NAME = createField("FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_instances.EVENT_NAME</code>.
	 */
	public final TableField<FileInstancesRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_instances.OPEN_COUNT</code>.
	 */
	public final TableField<FileInstancesRecord, UInteger> OPEN_COUNT = createField("OPEN_COUNT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.file_instances</code> table reference
	 */
	public FileInstances() {
		this("file_instances", null);
	}

	/**
	 * Create an aliased <code>performance_schema.file_instances</code> table reference
	 */
	public FileInstances(String alias) {
		this(alias, FILE_INSTANCES);
	}

	private FileInstances(String alias, Table<FileInstancesRecord> aliased) {
		this(alias, aliased, null);
	}

	private FileInstances(String alias, Table<FileInstancesRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileInstances as(String alias) {
		return new FileInstances(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FileInstances rename(String name) {
		return new FileInstances(name, null);
	}
}
