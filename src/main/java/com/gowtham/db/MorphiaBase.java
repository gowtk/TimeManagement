package com.gowtham.db;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MorphiaBase {

	Morphia morphia;

	public MorphiaBase() {
		morphia = new Morphia();
		morphia.mapPackage("com.gowtham.bean");

		// create the Datastore connecting to the default port on the local host
	/*	final Datastore datastore = morphia.createDatastore(new MongoClient(), "morphia_example");
		datastore.ensureIndexes();*/
	}

}
