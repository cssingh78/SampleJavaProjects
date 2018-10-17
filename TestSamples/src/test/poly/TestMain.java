package test.poly;

import test.commons.Car;
import test.commons.Vehicle;

public class TestMain {

	public static void main(String[] args) {
		Vehicle car1 = new Car();
		Car car2 = new Car();
		car1.staticMethod();
		car2.staticMethod();
		car1.test();
		int i;
		boolean flag = false;
		if(flag) i = 0;
	}

}
