/**
 * This class is generated by jOOQ
 */
package com.ph.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends org.jooq.impl.TableImpl<com.ph.jooq.tables.records.StudentRecord> {

	private static final long serialVersionUID = -738943853;

	/**
	 * The singleton instance of <code>public.student</code>
	 */
	public static final com.ph.jooq.tables.Student STUDENT = new com.ph.jooq.tables.Student();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ph.jooq.tables.records.StudentRecord> getRecordType() {
		return com.ph.jooq.tables.records.StudentRecord.class;
	}

	/**
	 * The column <code>public.student.id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StudentRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.student.email</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StudentRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>public.student.first_name</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StudentRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>public.student.last_name</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StudentRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * Create a <code>public.student</code> table reference
	 */
	public Student() {
		super("student", com.ph.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.student</code> table reference
	 */
	public Student(java.lang.String alias) {
		super(alias, com.ph.jooq.Public.PUBLIC, com.ph.jooq.tables.Student.STUDENT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ph.jooq.tables.records.StudentRecord> getPrimaryKey() {
		return com.ph.jooq.Keys.STUDENT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ph.jooq.tables.records.StudentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ph.jooq.tables.records.StudentRecord>>asList(com.ph.jooq.Keys.STUDENT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ph.jooq.tables.Student as(java.lang.String alias) {
		return new com.ph.jooq.tables.Student(alias);
	}
}
