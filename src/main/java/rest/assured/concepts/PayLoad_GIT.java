package rest.assured.concepts;

public class PayLoad_GIT {

	public static String createRepo() {

		return "{\r\n" + "  \"name\": \"Hello-World13\",\r\n"
				+ "  \"description\": \"This is your first repository\",\r\n"
				+ "  \"homepage\": \"https://github.com\",\r\n" + "  \"private\": false,\r\n"
				+ "  \"has_issues\": true,\r\n" + "  \"has_projects\": true,\r\n" + "  \"has_wiki\": true\r\n" + "}";
	}

	public static String updateRepo() {

		return "{\r\n" + 
				"    \"names\": [\r\n" + 
				"        \"selenium\",\r\n" + 
				"        \"maven\",\r\n" + 
				"        \"api\",\r\n" + 
				"        \"cucumber\"\r\n" + 
				"    ]\r\n" + 
				"}";
	}
}
