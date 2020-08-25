package restassured.deserialization.pojo;

import java.util.List;

public class PayLoad {

	
	private String FirstName;
	private String LastName;
	private int Age;
	private String Profession;
	private List<String> Skills;
	
	public PayLoad(String firtname, String lastname,int age, String profession, List<String> skills) {
		this.FirstName=firtname;
		this.LastName=lastname;
		this.Age=age;
		this.Skills=skills;
		this.Profession=profession;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getProfession() {
		return Profession;
	}

	public void setProfession(String profession) {
		Profession = profession;
	}

	public List<String> getSkills() {
		return Skills;
	}

	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	
	
	
	
	
}
