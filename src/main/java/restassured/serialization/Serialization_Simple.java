package restassured.serialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import restassured.deserialization.pojo.PayLoad;

public class Serialization_Simple {

	public static void main(String[] args) throws JsonProcessingException {
		
		String FirstName="Arun";
		String LastName="Kumar";
		int age=26;
		String Profession="QA";
		List<String> skills=new ArrayList<>();
		skills.add("Automation Testing");
		skills.add("Mobile Testing");
		
		PayLoad payload=new PayLoad(FirstName, LastName, age, Profession, skills);
		
		ObjectMapper objmap=new ObjectMapper();
		
		String jsonFile = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		System.out.println(jsonFile);
		
		
	}
}
