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
public class PersonRecord extends org.jooq.impl.UpdatableRecordImpl<com.ph.jooq.tables.records.PersonRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -729396412;

	/**
	 * Setter for <code>public.person.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.person.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.person.firstname</code>. 
	 */
	public void setFirstname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.person.firstname</code>. 
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.person.lastname</code>. 
	 */
	public void setLastname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.person.lastname</code>. 
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.person.middleinitial</code>. 
	 */
	public void setMiddleinitial(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.person.middleinitial</code>. 
	 */
	public java.lang.String getMiddleinitial() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.person.city</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.person.city</code>. 
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.person.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.person.state</code>. 
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.person.streetaddress1</code>. 
	 */
	public void setStreetaddress1(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.person.streetaddress1</code>. 
	 */
	public java.lang.String getStreetaddress1() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.person.streetaddress2</code>. 
	 */
	public void setStreetaddress2(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.person.streetaddress2</code>. 
	 */
	public java.lang.String getStreetaddress2() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.person.zip</code>. 
	 */
	public void setZip(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.person.zip</code>. 
	 */
	public java.lang.String getZip() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>public.person.job_id</code>. 
	 */
	public void setJobId(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.person.job_id</code>. 
	 */
	public java.lang.Integer getJobId() {
		return (java.lang.Integer) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.ph.jooq.tables.Person.PERSON.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.ph.jooq.tables.Person.PERSON.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.ph.jooq.tables.Person.PERSON.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.ph.jooq.tables.Person.PERSON.MIDDLEINITIAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.ph.jooq.tables.Person.PERSON.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.ph.jooq.tables.Person.PERSON.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.ph.jooq.tables.Person.PERSON.STREETADDRESS1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.ph.jooq.tables.Person.PERSON.STREETADDRESS2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.ph.jooq.tables.Person.PERSON.ZIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return com.ph.jooq.tables.Person.PERSON.JOB_ID;
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
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMiddleinitial();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getStreetaddress1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getStreetaddress2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getZip();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getJobId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PersonRecord
	 */
	public PersonRecord() {
		super(com.ph.jooq.tables.Person.PERSON);
	}

	/**
	 * Create a detached, initialised PersonRecord
	 */
	public PersonRecord(java.lang.Integer id, java.lang.String firstname, java.lang.String lastname, java.lang.String middleinitial, java.lang.String city, java.lang.String state, java.lang.String streetaddress1, java.lang.String streetaddress2, java.lang.String zip, java.lang.Integer jobId) {
		super(com.ph.jooq.tables.Person.PERSON);

		setValue(0, id);
		setValue(1, firstname);
		setValue(2, lastname);
		setValue(3, middleinitial);
		setValue(4, city);
		setValue(5, state);
		setValue(6, streetaddress1);
		setValue(7, streetaddress2);
		setValue(8, zip);
		setValue(9, jobId);
	}
}
