package singleLevelInheritance;

public class Tiger extends Animal{
	
	public Tiger() {
		super();
		System.out.println("Tiger Hunt");
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
	}
}
