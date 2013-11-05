package cit590;

public class Student extends Person {

	private int PennId;
	
	public Student(String name, int age, boolean isMale, int PennId ){
		this(name, age, isMale);
		this.PennId = PennId;
	}
	
	public Student(String name, int age, boolean isMale) {
		super(name, age, isMale);
	}

}
