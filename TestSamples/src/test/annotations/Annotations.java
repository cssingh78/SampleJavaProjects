package test.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;

import test.junit.TestCase1;

public class Annotations {
	public static void main(String args[]) {
		Class<TestCase1> aClass = TestCase1.class;
		Method[] methods = aClass.getMethods();
		for (Method method: methods) {
			System.out.println("method - start: " + method.getName());
			Annotation[] annotations = method.getAnnotations();
			System.out.println("annotations.length: " + annotations.length);

			for (Annotation annotation : annotations) {
				System.out.println("annotation: " + annotation);
				if (annotation instanceof Test) {
					Test myAnnotation = (Test) annotation;
					System.out.println("name: " + myAnnotation.toString());
					System.out.println("value: " + myAnnotation.timeout());
				}
			}
			System.out.println("method - end: " + method.getName() + "\n\n");
		}
	}
}
