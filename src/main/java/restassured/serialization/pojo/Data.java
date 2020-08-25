package restassured.serialization.pojo;

public class Data {

	String Capital;
	int MinimumTemp;
	int MaximumTemp;
	String Currency;
	
	public Data(String capital, int i, int j, String Currency) {
		this.Capital=capital;
		this.MaximumTemp=j;
		this.MinimumTemp=i;
		this.Currency=Currency;
	}
	
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public int getMinimumTemp() {
		return MinimumTemp;
	}
	public void setMinimumTemp(int minimumTemp) {
		MinimumTemp = minimumTemp;
	}
	public int getMaximumTemp() {
		return MaximumTemp;
	}
	public void setMaximumTemp(int maximumTemp) {
		MaximumTemp = maximumTemp;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
}
