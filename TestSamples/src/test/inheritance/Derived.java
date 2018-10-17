package test.inheritance;

public class Derived extends Base{
	
	//Default access modifier can be changed to protected or public while overriding 
	@Override
	protected void baseDefaultMethod(){
		
	}
	
	//Protected access modifier need to remain protected or can be changed to public
	@Override
	protected void baseProtectedMethod() {
		final int i = 5;
		final Base base = new Base();
		//final local variables too can't be changed after initialization 
		//i = 5;
		//base = new Base();
	}
	
	//Private methods from base class can't be overridden as they are not visible in derived class.
	//Method with same identified / parameters will be a different method
	protected void basePrivateMethod() {
		
	}

}