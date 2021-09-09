package com.bridgelabz.JSONProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonFiles\\employee.json");
		Object object = jsonParser.parse(reader);
		JSONObject empJsonObject =(JSONObject) object;
		
		String fName = (String) empJsonObject.get("firstName");
		String lName = (String) empJsonObject.get("lastName");
		
		System.out.println("First name is :  "+fName);
		System.out.println("Last name is :  "+lName);
		
		JSONArray array = (JSONArray) empJsonObject.get("address");
		for (int i=0 ; i<array.size() ; i++) {
			JSONObject addressJsonObject =(JSONObject) array.get(i);
			
			String streetString = (String) addressJsonObject.get("street");
			String cityString = (String) addressJsonObject.get("city");
			String stateString = (String) addressJsonObject.get("state");
			
			System.out.println(i +" Address of "+fName+" is ................");
			System.out.println("Street : "+streetString);
			System.out.println("city : "+cityString);
			System.out.println("State : "+stateString);
		}
	}
}
