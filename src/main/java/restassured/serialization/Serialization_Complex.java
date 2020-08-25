package restassured.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import restassured.serialization.pojo.Countries;
import restassured.serialization.pojo.Data;
import restassured.serialization.pojo.PayLoad;

public class Serialization_Complex {

	public static void main(String[] args) throws JsonProcessingException {
		
		String des="Map containing Country, Capital, Currency, and some States of that Country";
		Data data=new Data("NewDelhi", 6, 45, "Rupee");
		Countries con=new Countries("India", data);
		PayLoad payload=new PayLoad(des, "Asia", con);
		
		ObjectMapper objMap=new ObjectMapper();
		
		String json = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		System.out.println(json);
	}
}
