package test.commons;

public class Address {
	private String flatNo;
	private String aptName;
	private String area;
	private String city;
	private String pinCode;

	public String toString() {
		return String.join(", ", "FlatNo:" + this.flatNo, "AptName:" + this.aptName, "Area:" + this.area,
				"City:" + this.city, "PinCode:" + this.pinCode);
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
