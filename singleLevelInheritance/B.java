package singleLevelInheritance;

public class B extends Single_Level_Inheritence {

	public void display() {
		test();
		System.out.println("Sub Class Display Method");
	}
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
