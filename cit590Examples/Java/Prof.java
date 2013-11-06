package cit590;

public class Prof extends Person {
	
	private String department;

	public Prof(String name, int age, boolean isMale, String deparment){
		super(name,age,isMale);
		this.department = deparment;
	}
	
	
	public static void main(String[] args) {
		Prof p = new Prof("arv", 33, true, "CIS");
		Person p1 = p; // prof to Person is safe
		Prof p2 = (Prof) p1; //person to Prof we need an explicit cast
		System.out.println(p2.department); //the information is retained
		p2.department = "EE";
		System.out.println(p.department);//yikes, reference!
	}
	
}
