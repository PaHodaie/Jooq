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
public class JobRecord extends org.jooq.impl.UpdatableRecordImpl<com.ph.jooq.tables.records.JobRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Double> {

	private static final long serialVersionUID = 553398603;

	/**
	 * Setter for <code>public.job.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.job.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.job.jobdescr</code>. 
	 */
	public void setJobdescr(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.job.jobdescr</code>. 
	 */
	public java.lang.String getJobdescr() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.job.salery</code>. 
	 */
	public void setSalery(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.job.salery</code>. 
	 */
	public java.lang.Double getSalery() {
		return (java.lang.Double) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Double> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Double> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.ph.jooq.tables.Job.JOB.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.ph.jooq.tables.Job.JOB.JOBDESCR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return com.ph.jooq.tables.Job.JOB.SALERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getJobdescr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getSalery();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobRecord
	 */
	public JobRecord() {
		super(com.ph.jooq.tables.Job.JOB);
	}

	/**
	 * Create a detached, initialised JobRecord
	 */
	public JobRecord(java.lang.Integer id, java.lang.String jobdescr, java.lang.Double salery) {
		super(com.ph.jooq.tables.Job.JOB);

		setValue(0, id);
		setValue(1, jobdescr);
		setValue(2, salery);
	}
}