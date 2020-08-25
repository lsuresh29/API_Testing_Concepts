package restassured.serialization.pojo;

public class PayLoad {

	String Description;
	String Region;
	Countries Countries ;
	
	public PayLoad(String des, String reg, Countries con) {
		this.Description=des;
		this.Region=reg;
		this.Countries=con;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public Countries getCountries() {
		return Countries;
	}
	public void setCountries(Countries countries) {
		Countries = countries;
	}
	
	
}
