package restassured.serialization.pojo;

public class Countries {

	String Country;
	Data Data;

	public Countries(String Country, Data data) {
		this.Country = Country;
		this.Data = data;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Data getData() {
		return Data;
	}

	public void setData(Data data) {
		Data = data;
	}

}
