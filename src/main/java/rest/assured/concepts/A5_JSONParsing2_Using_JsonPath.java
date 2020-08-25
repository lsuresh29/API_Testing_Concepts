package rest.assured.concepts;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.path.json.JsonPath;

public class A5_JSONParsing2_Using_JsonPath {

	@Test
	public void test() {

		// file
		// filereader
		// jsonParser
		// jsonObject
		// jsonArray
		// JsonPath

		JsonPath jp = new JsonPath(PayLoad.employeeWipro());

		int noOfEmployees = jp.getInt("EmployeeDetails.size");
		System.out.println(noOfEmployees);

		int totalSalary = jp.getInt("dashboard.TotalSalary");
		System.out.println(totalSalary);

//		String name = jp.get("EmployeeDetails.Name[0]");
//		System.out.println(name);

		// 4. Print All employee names and their respective salaries
		for (int i = 0; i < noOfEmployees; i++) {
			String name = jp.get("EmployeeDetails.Name[" + i + "]");
			int salary = jp.getInt("EmployeeDetails.Salary[" + i + "]");
			System.out.println(name + "  " + salary);
		}

		// 5. Print years of experience of Chandru

		for (int i = 0; i < noOfEmployees; i++) {

			if (jp.get("EmployeeDetails.Name[" + i + "]").equals("Chandru")) {
				int exp = jp.getInt("EmployeeDetails.Exp[" + i + "]");
				System.out.println("Chandru's Exp is: " + exp);
			}
		}

		// 6. Verify if Sum of all employee salary matches with totalSalary
		int totalAmount = 0;
		for (int i = 0; i < noOfEmployees; i++) {

			int salary = jp.getInt("EmployeeDetails.Salary[" + i + "]");
			System.out.println("Salary: " + salary);
			totalAmount = totalAmount + salary;
		}
		System.out.println("Total Amount: " + totalAmount);

		Assert.assertEquals("Sum of all employee salary didnt match with totalSalary",totalSalary, totalAmount);
	}

}
