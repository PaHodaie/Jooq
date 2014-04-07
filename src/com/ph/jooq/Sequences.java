/**
 * This class is generated by jOOQ
 */
package com.ph.jooq;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.address_sequence</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> ADDRESS_SEQUENCE = new org.jooq.impl.SequenceImpl<java.lang.Long>("address_sequence", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.bee_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> BEE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("bee_id_seq", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.customer_sequence</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CUSTOMER_SEQUENCE = new org.jooq.impl.SequenceImpl<java.lang.Long>("customer_sequence", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.hibernate_sequence</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> HIBERNATE_SEQUENCE = new org.jooq.impl.SequenceImpl<java.lang.Long>("hibernate_sequence", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.honey_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> HONEY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("honey_id_seq", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.stock_stock_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> STOCK_STOCK_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("stock_stock_id_seq", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_id_seq", com.ph.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
