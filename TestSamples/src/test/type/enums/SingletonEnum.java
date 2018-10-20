package test.type.enums;

//Enum is the simplest and the most sophisticated way of implementing Singleton class
//No need to put clone and serializations safeguards in place
public enum SingletonEnum {
	INSTANCE;
	private int num1;
	private int num2;

	public void setNum1(int num1) {
		this.num1 = num1;
	};

	public void setNum2(int num2) {
		this.num2 = num2;
	};

	public int getNum1() {
		return num1;
	};

	public int getNum2() {
		return num2;
	};
}