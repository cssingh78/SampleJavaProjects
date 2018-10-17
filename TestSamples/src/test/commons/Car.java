package test.commons;

public class Car extends Vehicle {
	private String model;
	private String company;
	private String mYear;
	private String engineSize;
	
	public Car() {
		this("Creta", "Hyundai", "2018", "1800cc");
	}
	public Car(String model, String company, String mYear, String engineSize) {
		this.model = model;
		this.company = company;
		this.mYear = mYear;
		this.engineSize = engineSize;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getmYear() {
		return mYear;
	}
	public void setmYear(String mYear) {
		this.mYear = mYear;
	}

//	public static void staticMethod() {
//		System.out.println("Car -> staticMethod()");
//		privateStaticMethod();
//	};
//	public static void privateMethod() {
//		System.out.println("Car -> privateMethod()");
//	};
//	private static void privateStaticMethod() {
//		System.out.println("Car -> privateStaticMethod()");
//	};		
//	
//	@Override
//	public void test() {
//		
//	}
}
