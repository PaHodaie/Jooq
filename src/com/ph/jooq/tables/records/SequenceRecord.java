/**
 * This class is generated by jOOQ
 */
package com.ph.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SequenceRecord extends org.jooq.impl.UpdatableRecordImpl<com.ph.jooq.tables.records.SequenceRecord> implements org.jooq.Record2<java.lang.String, java.math.BigInteger> {

	private static final long serialVersionUID = 323460409;

	/**
	 * Setter for <code>public.sequence.seq_name</code>. 
	 */
	public void setSeqName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.sequence.seq_name</code>. 
	 */
	public java.lang.String getSeqName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.sequence.seq_count</code>. 
	 */
	public void setSeqCount(java.math.BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.sequence.seq_count</code>. 
	 */
	public java.math.BigInteger getSeqCount() {
		return (java.math.BigInteger) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.math.BigInteger> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.math.BigInteger> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.ph.jooq.tables.Sequence.SEQUENCE.SEQ_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field2() {
		return com.ph.jooq.tables.Sequence.SEQUENCE.SEQ_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getSeqName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value2() {
		return getSeqCount();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SequenceRecord
	 */
	public SequenceRecord() {
		super(com.ph.jooq.tables.Sequence.SEQUENCE);
	}

	/**
	 * Create a detached, initialised SequenceRecord
	 */
	public SequenceRecord(java.lang.String seqName, java.math.BigInteger seqCount) {
		super(com.ph.jooq.tables.Sequence.SEQUENCE);

		setValue(0, seqName);
		setValue(1, seqCount);
	}
}
