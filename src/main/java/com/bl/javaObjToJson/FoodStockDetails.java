package com.bl.javaObjToJson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FoodStockDetails {
static JSONArray foodJsonArray = new JSONArray();
static JSONObject jsonObject = new JSONObject();

public static void add() {
	JSONObject riceJsonObject = new JSONObject();
	riceJsonObject.put("Name", "Basmati Rice");
	riceJsonObject.put("Weight", 10);
	riceJsonObject.put("Price", 1000);
	JSONArray riceJsonArray = new JSONArray();
	riceJsonArray.add(riceJsonObject);
	jsonObject.put("Rice", riceJsonArray);
	foodJsonArray.add(jsonObject);
	
	try {
		FileWriter fileWriter = new FileWriter(System.getProperty("user.dir")+"//foodstack.json");
		fileWriter.write(foodJsonArray.toJSONString());
		fileWriter.flush();
		fileWriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(System.getProperty("user.dir"));
	System.out.println(foodJsonArray);
}

public static void main(String[] args) {
	FoodStockDetails.add();
}
}
