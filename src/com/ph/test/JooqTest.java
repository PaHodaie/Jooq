package com.ph.test;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.ph.db.JooqConnection;
import com.ph.jooq.tables.Family;
import com.ph.jooq.tables.records.FamilyRecord;

public class JooqTest {
	/**
	 * save an entry in Family table
	 * @param create
	 */
	private static void store(DSLContext create) {
		FamilyRecord f = create.newRecord(Family.FAMILY);
		f.setId(new Integer(0));
		f.setDescription("Description");
		f.store();
		System.out.println("Family RECORDS saved");
	}
	/**
	 * select all entries in Table Family
	 * @param create
	 */
	private static void selection(DSLContext create) {
		// SELECTING RECORDS
		Result<Record> families = create.select().from(Family.FAMILY).fetch();
		for (Record f : families) {
			FamilyRecord fr = (FamilyRecord) f;
			System.out.println("Family: " + fr.toString());
		}

		System.out.println("Family RECORDS selected");

	}
	/**
	 * udate record  with id=0;
	 * @param create
	 */
	private static void update(DSLContext create) {
		// SELECTING RECORDS
		create.update(Family.FAMILY)

		.set(Family.FAMILY.DESCRIPTION, "updated")

		.where(Family.FAMILY.ID.equal(0)).execute();

		System.out.println("Family RECORD updated");

	}
	/**
	 * delete all records in family table
	 * @param create
	 */
	private static void delete(DSLContext create) {
		// deleting RECORDS
		create.delete(Family.FAMILY).execute();
		System.out.println("Family RECORDS deleted");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			DSLContext create = DSL.using(JooqConnection.getConnection(),
					SQLDialect.POSTGRES);

			// INSERTING of records
			store(create);

			// selection of records
			selection(create);

			// deleting of records
			update(create);
			
			// selection of records
			selection(create);
			
			//delete entries
			delete(create);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
