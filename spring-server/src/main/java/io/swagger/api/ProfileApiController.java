package io.swagger.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.bson.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Profile;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-19T19:21:59.179Z")

@Controller
public class ProfileApiController implements ProfileApi {

	private MongoClient mongo;
	private MongoDatabase db;
	private MongoCollection<Document> profilesCollection;
	private Gson gson;

	public ProfileApiController() {

		mongo = new MongoClient("localhost", 27017);
		db = mongo.getDatabase("okdb");
		profilesCollection = db.getCollection("profiles");
		gson = new Gson();

	}

	public ResponseEntity<List<Profile>> getAllProfiles() {
		System.out.println("TODO: Get all profiles");

		List<Profile> list = new ArrayList<>();

		FindIterable<Document> iterDoc = profilesCollection.find();
		Iterator<Document> it = iterDoc.iterator();
		while (it.hasNext()) {
			Document doc = (Document) it.next();
			
			//String json = doc.toJson();
			//System.out.println(json);
			//System.out.println(doc.toString());			
			//Profile profile = gson.fromJson(json, Profile.class);
			
			Profile p = new Profile();
			p.setName(doc.getString("name"));
			list.add(p);
		}

		ResponseEntity<List<Profile>> result = new ResponseEntity<>(list, HttpStatus.OK);

		return result;
	}

	public ResponseEntity<Void> profilePost(
			@ApiParam(value = "Create new profile", required = true) @Valid @RequestBody Profile profile) {
		System.out.println("TODO: Create new profile: " + profile);

		String json = gson.toJson(profile);
		System.out.println(json);
		Document obj = Document.parse(json);		
		System.out.println(obj.toJson());
		profilesCollection.insertOne(obj);
		System.out.println("Count = " + profilesCollection.count());

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
