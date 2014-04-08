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
public class Users extends org.jooq.impl.TableImpl<com.ph.jooq.tables.records.UsersRecord> {

	private static final long serialVersionUID = 1255438372;

	/**
	 * The singleton instance of <code>public.users</code>
	 */
	public static final com.ph.jooq.tables.Users USERS = new com.ph.jooq.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ph.jooq.tables.records.UsersRecord> getRecordType() {
		return com.ph.jooq.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>public.users.id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.users.age</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.users.name</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.city</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.state</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.streetaddress1</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> STREETADDRESS1 = createField("streetaddress1", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.streetaddress2</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> STREETADDRESS2 = createField("streetaddress2", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.zip</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.UsersRecord, java.lang.String> ZIP = createField("zip", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>public.users</code> table reference
	 */
	public Users() {
		super("users", com.ph.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		super(alias, com.ph.jooq.Public.PUBLIC, com.ph.jooq.tables.Users.USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.ph.jooq.tables.records.UsersRecord, java.lang.Integer> getIdentity() {
		return com.ph.jooq.Keys.IDENTITY_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord> getPrimaryKey() {
		return com.ph.jooq.Keys.USERS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord>>asList(com.ph.jooq.Keys.USERS_PKEY, com.ph.jooq.Keys.USERS_NAME_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ph.jooq.tables.Users as(java.lang.String alias) {
		return new com.ph.jooq.tables.Users(alias);
	}
}