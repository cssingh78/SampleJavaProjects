package test.inheritance;

//If base class is declared final, it can't be inherited. 
//That's the reason abstract classes and Interfaces are not allowed be final as they are meant for extension / implementation
//Same applies to abstract methods. They can't be declared final as they are meant to overridden
//final public class Base {
public class Base {
	private final int finalVar;
	private static final int finalStaticVar;
	static {
		System.out.println("Inside Base -> static block");
		finalStaticVar = 10;
	}
	
	Base() {
		finalVar = 5;
	}

	private void basePrivateMethod() {
		
	}

	protected void baseProtectedMethod() {
		
	}

	void baseDefaultMethod() {

	}

	public void basePublicMethod() {

	}

	public final void basePublicFinalMethod() {

	}
// Abstract methods can be declared on
//	public abstract void basePublicAbstractMethod() {
//
//	}


}
