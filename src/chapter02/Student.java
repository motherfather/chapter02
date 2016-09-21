package chapter02;

public class Student extends Person {
	public Student() {
		super();	// 디폴트로 자동삽입!! 따로 쓸때는 맨 위에다 쓰지 않으면 에러!!!
		System.out.println("Student() called");
		age = 40; 				// 부모의 default 접근자는 접근 가능! 단, 같은 패키지에서만 가능!!
		name = "안대혁"; 	// protected는 자식에서 접근 가능! 다른 패키지에서도 가능!!
//		height = 172;	// private은 접근 불가!
		weight = 75;			// public은 접근 가능!
	}
	
	public Student(int age) {
		super(age);
		System.out.println("Student(int age) called");
	}

}
