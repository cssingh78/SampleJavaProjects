package test.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import test.commons.Car;

public class TestReflections {
	public static void main(String args[]) throws Exception {
		Car car = new Car();
		Class cls = car.getClass();
		System.out.println(cls.getName());
		Constructor[] cons = cls.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method);
			if (method.getParameterCount() == 0){
				System.out.println("method.invoke(car) : "+method.invoke(car));
			}else {
				System.out.println("method.invoke(car) : "+method.invoke(car, "Test"));
			}
		}

		Field[] fields = cls.getDeclaredFields();
		for(Field field: fields) {
			System.out.println(field);
		}

		
	}

}
