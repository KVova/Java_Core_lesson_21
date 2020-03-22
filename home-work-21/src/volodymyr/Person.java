package volodymyr;

public class Person {

	@MyCustomAnnotation(" My name is Volodymyr")
	private String myName;
	@MyCustomAnnotation(" My age is 24")
	private int myAge;
	@MyCustomAnnotation(" My birthday is 1 day of spring")
	private int myBirthday;
	
	public Person(String myName, int myAge, int myBirthday) {
		super();
		this.myName = myName;
		this.myAge = myAge;
		this.myBirthday = myBirthday;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public int getMyBirthday() {
		return myBirthday;
	}

	public void setMyBirthday(int myBirthday) {
		this.myBirthday = myBirthday;
	}

	@Override
	public String toString() {
		return "Person [myName=" + myName + ", myAge=" + myAge + ", myBirthday=" + myBirthday + "]";
	}
	
}
