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
public class Firma extends org.jooq.impl.TableImpl<com.ph.jooq.tables.records.FirmaRecord> {

	private static final long serialVersionUID = 1375772825;

	/**
	 * The singleton instance of <code>public.firma</code>
	 */
	public static final com.ph.jooq.tables.Firma FIRMA = new com.ph.jooq.tables.Firma();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ph.jooq.tables.records.FirmaRecord> getRecordType() {
		return com.ph.jooq.tables.records.FirmaRecord.class;
	}

	/**
	 * The column <code>public.firma.id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.FirmaRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>public.firma.name</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.FirmaRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this);

	/**
	 * The column <code>public.firma.adresse</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.FirmaRecord, java.lang.String> ADRESSE = createField("adresse", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * Create a <code>public.firma</code> table reference
	 */
	public Firma() {
		super("firma", com.ph.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.firma</code> table reference
	 */
	public Firma(java.lang.String alias) {
		super(alias, com.ph.jooq.Public.PUBLIC, com.ph.jooq.tables.Firma.FIRMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ph.jooq.tables.records.FirmaRecord> getPrimaryKey() {
		return com.ph.jooq.Keys.FIRMA_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ph.jooq.tables.records.FirmaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ph.jooq.tables.records.FirmaRecord>>asList(com.ph.jooq.Keys.FIRMA_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ph.jooq.tables.Firma as(java.lang.String alias) {
		return new com.ph.jooq.tables.Firma(alias);
	}
}
