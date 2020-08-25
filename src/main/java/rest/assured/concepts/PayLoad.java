package rest.assured.concepts;

public class PayLoad {

	public static String employeeWipro() {
		
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"TotalSalary\": 210000,\r\n" + 
				"    \"Company\": \"Wipro\",\r\n" + 
				"    \"Project\": \"HealthCare\"\r\n" + 
				"  },\r\n" + 
				"  \"EmployeeDetails\": [\r\n" + 
				"    {\r\n" + 
				"      \"Name\": \"Arun\",\r\n" + 
				"      \"Salary\": 60000,\r\n" + 
				"      \"Exp\": 3\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"Name\": \"Bala\",\r\n" + 
				"      \"Salary\": 70000,\r\n" + 
				"      \"Exp\": 3\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"Name\": \"Chandru\",\r\n" + 
				"      \"Salary\": 80000,\r\n" + 
				"      \"Exp\": 3\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
	}
}
