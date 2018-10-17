package test.typecast;

public class TestPrimitiveTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("add(3,4) : "+add(3,4));
//		System.out.println("add(3,'a') : "+add(3,'a'));
//		System.out.println("add(3.0,4) : "+add(3.0,4));
//		System.out.println("add(3,4.0) : "+add(3,4.0));
//		System.out.println("add(3.0,4.0): "+add(3.0,4.0));
//		System.out.println("Character.MAX_VALUE: "+Character.MAX_VALUE);
//		System.out.println("Byte.MAX_VALUE: "+Byte.MAX_VALUE+": "+Math.pow(2, 7));
//		System.out.println("Short.MAX_VALUE: "+Short.MAX_VALUE+": "+Math.pow(2, 15));
//		System.out.println("Integer.MAX_VALUE: "+Integer.MAX_VALUE+": "+Math.pow(2, 31));
//		System.out.println("Long.MAX_VALUE: "+Long.MAX_VALUE+": "+Math.pow(2, 63));
//		System.out.println("Float.MAX_VALUE: "+Float.MAX_VALUE);
//		System.out.println("Double.MAX_VALUE: "+Double.MAX_VALUE);
//		boolean isFloatBiggerThanLong = Float.MAX_VALUE > Long.MAX_VALUE;
//		System.out.println("isFloatBiggerThanLong: "+isFloatBiggerThanLong);

	}
	
	public static double add(double a, double b) {
		System.out.println("Inside add(double a, double b)");
		return a+b;
	}
//	public static double add(int a, double b) {
//		System.out.println("Inside add(int a, double b)");
//		return a+b;
//	}
//	private static double add(double a, int b) {
//		System.out.println("Inside add(double a, int b)");
//		return a+b;
//	}
	public static int add(int a, int b) {
		System.out.println("Inside add(int a, int b)");
		return a+b;
	}

}
