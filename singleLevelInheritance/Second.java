package singleLevelInheritance;

public class Second extends First{
	
	public Second() {
		super(120);
		System.out.println("Without Argument");
	}
	public static void main(String[] args) {
		Second second = new Second();
	}
}
