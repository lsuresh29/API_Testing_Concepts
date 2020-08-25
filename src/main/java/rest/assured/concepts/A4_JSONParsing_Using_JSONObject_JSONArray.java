package rest.assured.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.path.json.JsonPath;

public class A4_JSONParsing_Using_JSONObject_JSONArray {

	public static void main(String[] args) throws IOException, ParseException {

		File file = new File(".\\src\\main\\java\\rest\\assured\\concepts\\PayLoad.json");
		
		FileReader reader=new FileReader(file);
		
		JSONParser jp=new JSONParser();
		Object obj1 = jp.parse(reader);
		
		JSONObject jo=(JSONObject) obj1;
		Object obj2 = jo.get("EmployeeDetails");
		
		JSONArray js=(JSONArray) obj2;
		Object obj3 = js.get(0);
		
		JSONObject jo1=(JSONObject) obj3;
		Object object = jo1.get("Name");
		
		System.out.println(object);
	}

}
