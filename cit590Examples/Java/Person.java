package cit590;

public class Person {
	
	String name;
	int age;
	boolean isMale; //standard convention is that boolean variable names begin with 'is'

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public void sayHi(){
		System.out.println(name + " says hi to you.");
	}

}
