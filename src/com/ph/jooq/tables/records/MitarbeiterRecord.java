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
public class MitarbeiterRecord extends org.jooq.impl.UpdatableRecordImpl<com.ph.jooq.tables.records.MitarbeiterRecord> implements org.jooq.Record6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1755062533;

	/**
	 * Setter for <code>public.mitarbeiter.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.id</code>. 
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.mitarbeiter.first_name</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.first_name</code>. 
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.mitarbeiter.last_name</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.last_name</code>. 
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.mitarbeiter.telefon</code>. 
	 */
	public void setTelefon(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.telefon</code>. 
	 */
	public java.lang.String getTelefon() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.mitarbeiter.e_mail</code>. 
	 */
	public void setEMail(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.e_mail</code>. 
	 */
	public java.lang.String getEMail() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.mitarbeiter.firma_id</code>. 
	 */
	public void setFirmaId(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.mitarbeiter.firma_id</code>. 
	 */
	public java.lang.Integer getFirmaId() {
		return (java.lang.Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.TELEFON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.E_MAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.ph.jooq.tables.Mitarbeiter.MITARBEITER.FIRMA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTelefon();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEMail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getFirmaId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MitarbeiterRecord
	 */
	public MitarbeiterRecord() {
		super(com.ph.jooq.tables.Mitarbeiter.MITARBEITER);
	}

	/**
	 * Create a detached, initialised MitarbeiterRecord
	 */
	public MitarbeiterRecord(java.lang.Long id, java.lang.String firstName, java.lang.String lastName, java.lang.String telefon, java.lang.String eMail, java.lang.Integer firmaId) {
		super(com.ph.jooq.tables.Mitarbeiter.MITARBEITER);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, telefon);
		setValue(4, eMail);
		setValue(5, firmaId);
	}
}