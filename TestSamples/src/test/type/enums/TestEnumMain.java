package test.type.enums;

public class TestEnumMain {

	public static void main(String[] args) {
		// testBasicEnum();
		//testSingletonEnum();
		testSwitchCase(WeekDay.SATURDAY);
		testSwitchCase(WeekDay.MONDAY);

	}

	//Consider using enums where constant set of values need to be used ex. week days, error codes etc
	//Makes the code simpler and readable
	private static void testSingletonEnum() {
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		System.out.println("singletonEnum.num1 : " + singletonEnum.getNum1());
		System.out.println("singletonEnum.num2 : " + singletonEnum.getNum2());
		singletonEnum.setNum1(15);
		singletonEnum.setNum2(20);
		System.out.println("singletonEnum.num1 : " + singletonEnum.getNum1());
		System.out.println("singletonEnum.num2 : " + singletonEnum.getNum2());
	}

	private static void testBasicEnum() {
		City city = City.BANGALORE;
		System.out.println("city : " + city);
		System.out.println("city.getCount() : " + city.getCount());

		city = City.CHENNAI;
		System.out.println("city : " + city);
		System.out.println("city.getCount() : " + city.getCount());

		city = City.PUNE;
		System.out.println("city : " + city);
		System.out.println("city.getCount() : " + city.getCount());
		city.setCount(11);
		System.out.println("city.getCount() : " + city.getCount());
	}
	
	//Enums are useful for switch case
	private static void testSwitchCase(WeekDay day) {
		switch(day) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday");
			break;
		case FRIDAY:
			System.out.println("Today is Friday");
			break;
		case SATURDAY:
			System.out.println("Today is Saturday");
			break;
		case SUNDAY:
			System.out.println("Today is Sunday");
		}
	}

}
