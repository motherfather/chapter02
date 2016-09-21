package chapter02;

public class Person {
	public Person() {
		System.out.println("Person() called");
	}
	
	public Person(int age) {
		System.out.println("Person(int age) called");
	}
	int age;	// default access
	protected String name;	// protected 
	private int height;
	public int weight;
}
