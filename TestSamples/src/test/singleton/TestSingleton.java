package test.singleton;

public class TestSingleton {
	private static TestSingleton instance;
	private TestSingleton() {
		
	}
	public static TestSingleton getInstance() {
		if (instance == null) {
			instance = new TestSingleton();
		}
		return instance;
	}
}