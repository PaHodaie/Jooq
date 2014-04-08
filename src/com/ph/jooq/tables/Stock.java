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
public class Stock extends org.jooq.impl.TableImpl<com.ph.jooq.tables.records.StockRecord> {

	private static final long serialVersionUID = 2050205609;

	/**
	 * The singleton instance of <code>public.stock</code>
	 */
	public static final com.ph.jooq.tables.Stock STOCK = new com.ph.jooq.tables.Stock();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ph.jooq.tables.records.StockRecord> getRecordType() {
		return com.ph.jooq.tables.records.StockRecord.class;
	}

	/**
	 * The column <code>public.stock.stock_id</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StockRecord, java.lang.Integer> STOCK_ID = createField("stock_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.stock.stock_code</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StockRecord, java.lang.String> STOCK_CODE = createField("stock_code", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this);

	/**
	 * The column <code>public.stock.stock_name</code>. 
	 */
	public final org.jooq.TableField<com.ph.jooq.tables.records.StockRecord, java.lang.String> STOCK_NAME = createField("stock_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this);

	/**
	 * Create a <code>public.stock</code> table reference
	 */
	public Stock() {
		super("stock", com.ph.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.stock</code> table reference
	 */
	public Stock(java.lang.String alias) {
		super(alias, com.ph.jooq.Public.PUBLIC, com.ph.jooq.tables.Stock.STOCK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.ph.jooq.tables.records.StockRecord, java.lang.Integer> getIdentity() {
		return com.ph.jooq.Keys.IDENTITY_STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ph.jooq.tables.records.StockRecord> getPrimaryKey() {
		return com.ph.jooq.Keys.STOCK_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ph.jooq.tables.records.StockRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ph.jooq.tables.records.StockRecord>>asList(com.ph.jooq.Keys.STOCK_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ph.jooq.tables.Stock as(java.lang.String alias) {
		return new com.ph.jooq.tables.Stock(alias);
	}
}
