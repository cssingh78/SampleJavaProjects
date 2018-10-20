package test.thread;

public class TestThreadMain {

	public static void main(String[] args) {
		SampleThread sampleThread = new SampleThread();
		SampleThread.staticMethod();
		sampleThread.method();
		sampleThread.method();
		sampleThread.method();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		SampleThread.staticMethod();
		System.out.println(SampleThread.methodAccessCount());
	}

}
