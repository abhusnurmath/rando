package cit590;

public class Person {

	private String name;
	private int age;
	private boolean isMale; // standard convention is that boolean variable
							// names begin

	// with 'is'

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	/**
	 * prints some welcome message using the person's name
	 */
	public void sayHi() {
		System.out.println(name + " says hi to you.");
	}

	public static void main(String[] args) {
		Prof prof = new Prof("a", 33, true, "CS");
		Student s = new Student("b", 19, false, 10204);
		Person p1 = prof;
		Person p2 = s;
		// try and convert the person p2 to a prof
		try {
			Prof prof1 = (Prof) p2; // kabooms!}
		} catch (ClassCastException e) {
			System.out.println("bad casting");
		}
		try {
			Student student1 = (Student) p2; //this is actually fine since p2 was a student
		} catch (ClassCastException e) {
			System.out.println("even worse casting");
		}
	}
}
