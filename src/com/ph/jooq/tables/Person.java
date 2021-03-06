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
public class Person extends org.jooq.impl.TableImpl<com.ph.jooq.tables.records.PersonRecord> {

	private static final long serialVersionUID = 1984184288;

	/**
	 * The singleton instance of <code>public.person</code>
	 */
	public static final com.ph.jooq.tables.Person PERSON = new com.ph.jooq.tables.Person();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ph.jooq.tables.records.PersonRecord> getRecordType() {
		return com.ph.jooq.tables.records.PersonRecord.class;
	}

	/**
	 * The column <code>public.person.id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.person.firstname</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.lastname</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.middleinitial</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> MIDDLEINITIAL = createField("middleinitial", org.jooq.impl.SQLDataType.CHAR.length(1), this);

	/**
	 * The column <code>public.person.city</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.state</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.streetaddress1</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> STREETADDRESS1 = createField("streetaddress1", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.streetaddress2</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> STREETADDRESS2 = createField("streetaddress2", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.zip</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.String> ZIP = createField("zip", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.person.job_id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.PersonRecord, java.lang.Integer> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>public.person</code> table reference
	 */
	public Person() {
		super("person", com.ph.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.person</code> table reference
	 */
	public Person(java.lang.String alias) {
		super(alias, com.ph.jooq.Public.PUBLIC, com.ph.jooq.tables.Person.PERSON);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonRecord> getPrimaryKey() {
		return com.ph.jooq.Keys.PERSON_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonRecord>>asList(com.ph.jooq.Keys.PERSON_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonRecord, ?>>asList(com.ph.jooq.Keys.PERSON__FK_PERSON_JOB_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ph.jooq.tables.Person as(java.lang.String alias) {
		return new com.ph.jooq.tables.Person(alias);
	}
}
