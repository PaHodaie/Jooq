/**
 * This class is generated by jOOQ
 */
package com.ph.jooq;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.ph.jooq.tables.records.StockRecord, java.lang.Integer> IDENTITY_STOCK = Identities0.IDENTITY_STOCK;
	public static final org.jooq.Identity<com.ph.jooq.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.AuthorRecord> AUTHOR_PKEY = UniqueKeys0.AUTHOR_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.BeeRecord> BEE_PKEY = UniqueKeys0.BEE_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CityRecord> CITY_PKEY = UniqueKeys0.CITY_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CompanyRecord> COMPANY_PKEY = UniqueKeys0.COMPANY_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CustomerRecord> CUSTOMER_PKEY = UniqueKeys0.CUSTOMER_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.FamilyRecord> FAMILY_PKEY = UniqueKeys0.FAMILY_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.FirmaRecord> FIRMA_PKEY = UniqueKeys0.FIRMA_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.HoneyRecord> HONEY_PKEY = UniqueKeys0.HONEY_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.JobRecord> JOB_PKEY = UniqueKeys0.JOB_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.MitarbeiterRecord> MITARBEITER_PKEY = UniqueKeys0.MITARBEITER_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonJobRecord> PERSON_JOB_PKEY = UniqueKeys0.PERSON_JOB_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.SequenceRecord> SEQUENCE_PKEY = UniqueKeys0.SEQUENCE_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.StockRecord> STOCK_PKEY = UniqueKeys0.STOCK_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.StudentRecord> STUDENT_PKEY = UniqueKeys0.STUDENT_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;
	public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord> USERS_NAME_KEY = UniqueKeys0.USERS_NAME_KEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.BeeRecord, com.ph.jooq.tables.records.HoneyRecord> BEE__FK10462457E6C5A = ForeignKeys0.BEE__FK10462457E6C5A;
	public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.MitarbeiterRecord, com.ph.jooq.tables.records.FirmaRecord> MITARBEITER__FIRMA_FK = ForeignKeys0.MITARBEITER__FIRMA_FK;
	public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonRecord, com.ph.jooq.tables.records.CompanyRecord> PERSON__FK_PERSON_JOB_ID = ForeignKeys0.PERSON__FK_PERSON_JOB_ID;
	public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonJobRecord, com.ph.jooq.tables.records.JobRecord> PERSON_JOB__FK_PERSON_JOB_JOBLIST_ID = ForeignKeys0.PERSON_JOB__FK_PERSON_JOB_JOBLIST_ID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.ph.jooq.tables.records.StockRecord, java.lang.Integer> IDENTITY_STOCK = createIdentity(com.ph.jooq.tables.Stock.STOCK, com.ph.jooq.tables.Stock.STOCK.STOCK_ID);
		public static org.jooq.Identity<com.ph.jooq.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = createIdentity(com.ph.jooq.tables.Users.USERS, com.ph.jooq.tables.Users.USERS.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.AuthorRecord> AUTHOR_PKEY = createUniqueKey(com.ph.jooq.tables.Author.AUTHOR, com.ph.jooq.tables.Author.AUTHOR.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.BeeRecord> BEE_PKEY = createUniqueKey(com.ph.jooq.tables.Bee.BEE, com.ph.jooq.tables.Bee.BEE.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CityRecord> CITY_PKEY = createUniqueKey(com.ph.jooq.tables.City.CITY, com.ph.jooq.tables.City.CITY.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CompanyRecord> COMPANY_PKEY = createUniqueKey(com.ph.jooq.tables.Company.COMPANY, com.ph.jooq.tables.Company.COMPANY.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.CustomerRecord> CUSTOMER_PKEY = createUniqueKey(com.ph.jooq.tables.Customer.CUSTOMER, com.ph.jooq.tables.Customer.CUSTOMER.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.FamilyRecord> FAMILY_PKEY = createUniqueKey(com.ph.jooq.tables.Family.FAMILY, com.ph.jooq.tables.Family.FAMILY.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.FirmaRecord> FIRMA_PKEY = createUniqueKey(com.ph.jooq.tables.Firma.FIRMA, com.ph.jooq.tables.Firma.FIRMA.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.HoneyRecord> HONEY_PKEY = createUniqueKey(com.ph.jooq.tables.Honey.HONEY, com.ph.jooq.tables.Honey.HONEY.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.JobRecord> JOB_PKEY = createUniqueKey(com.ph.jooq.tables.Job.JOB, com.ph.jooq.tables.Job.JOB.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.MitarbeiterRecord> MITARBEITER_PKEY = createUniqueKey(com.ph.jooq.tables.Mitarbeiter.MITARBEITER, com.ph.jooq.tables.Mitarbeiter.MITARBEITER.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonRecord> PERSON_PKEY = createUniqueKey(com.ph.jooq.tables.Person.PERSON, com.ph.jooq.tables.Person.PERSON.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.PersonJobRecord> PERSON_JOB_PKEY = createUniqueKey(com.ph.jooq.tables.PersonJob.PERSON_JOB, com.ph.jooq.tables.PersonJob.PERSON_JOB.PERSON_ID, com.ph.jooq.tables.PersonJob.PERSON_JOB.JOBLIST_ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.SequenceRecord> SEQUENCE_PKEY = createUniqueKey(com.ph.jooq.tables.Sequence.SEQUENCE, com.ph.jooq.tables.Sequence.SEQUENCE.SEQ_NAME);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.StockRecord> STOCK_PKEY = createUniqueKey(com.ph.jooq.tables.Stock.STOCK, com.ph.jooq.tables.Stock.STOCK.STOCK_ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.StudentRecord> STUDENT_PKEY = createUniqueKey(com.ph.jooq.tables.Student.STUDENT, com.ph.jooq.tables.Student.STUDENT.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord> USERS_PKEY = createUniqueKey(com.ph.jooq.tables.Users.USERS, com.ph.jooq.tables.Users.USERS.ID);
		public static final org.jooq.UniqueKey<com.ph.jooq.tables.records.UsersRecord> USERS_NAME_KEY = createUniqueKey(com.ph.jooq.tables.Users.USERS, com.ph.jooq.tables.Users.USERS.NAME);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.BeeRecord, com.ph.jooq.tables.records.HoneyRecord> BEE__FK10462457E6C5A = createForeignKey(com.ph.jooq.Keys.HONEY_PKEY, com.ph.jooq.tables.Bee.BEE, com.ph.jooq.tables.Bee.BEE.HONEY_ID);
		public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.MitarbeiterRecord, com.ph.jooq.tables.records.FirmaRecord> MITARBEITER__FIRMA_FK = createForeignKey(com.ph.jooq.Keys.FIRMA_PKEY, com.ph.jooq.tables.Mitarbeiter.MITARBEITER, com.ph.jooq.tables.Mitarbeiter.MITARBEITER.FIRMA_ID);
		public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonRecord, com.ph.jooq.tables.records.CompanyRecord> PERSON__FK_PERSON_JOB_ID = createForeignKey(com.ph.jooq.Keys.COMPANY_PKEY, com.ph.jooq.tables.Person.PERSON, com.ph.jooq.tables.Person.PERSON.JOB_ID);
		public static final org.jooq.ForeignKey<com.ph.jooq.tables.records.PersonJobRecord, com.ph.jooq.tables.records.JobRecord> PERSON_JOB__FK_PERSON_JOB_JOBLIST_ID = createForeignKey(com.ph.jooq.Keys.JOB_PKEY, com.ph.jooq.tables.PersonJob.PERSON_JOB, com.ph.jooq.tables.PersonJob.PERSON_JOB.JOBLIST_ID);
	}
}