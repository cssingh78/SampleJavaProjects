package test.commons;

public class Vehicle {
	public static void staticMethod() {
		System.out.println("Vehicle -> staticMethod()");
		privateStaticMethod();
	};
	public static void privateMethod() {
		System.out.println("Vehicle -> privateMethod()");
	};
	private static void privateStaticMethod() {
		System.out.println("Vehicle -> privateStaticMethod()");
	};	
	
	@Deprecated
	public void test() {
		
	}
}
