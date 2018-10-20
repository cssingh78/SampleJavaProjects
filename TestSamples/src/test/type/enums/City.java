package test.type.enums;

public enum City {
	BANGALORE, CHENNAI(5), HYDERABAD, DELHI, MUMBAI, PUNE;
	private int count;

	City() {
		this.count = -1;
	}

	City(int count) {
		this.count = count;
	}

	int getCount()
	{
		return this.count;
	}
	
	void setCount(int count)
	{
		this.count = count;
	}
}