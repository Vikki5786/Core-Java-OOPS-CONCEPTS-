package methods;

public class Static_And_NonStatic_Method {
	public static void color() {
		System.out.println("It is a Static method..");
		System.out.println("It is a Red color Chair..");
		System.out.println("-------------------------------");
	}
	public void material() {
		System.out.println("It is Non-Static Method..");
		System.out.println("It is a Wooden Chair..");
		System.out.println("----------------------");
	}
	public void sql() {
		System.out.println("It is Non-Static Method..");
		System.out.println("SQL Learning..");
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		color();
		Static_And_NonStatic_Method object = new Static_And_NonStatic_Method();
		Static_And_NonStatic_Method object1 = new Static_And_NonStatic_Method();
		Static_And_NonStatic_Method object2 = new Static_And_NonStatic_Method();
		object.material();
		object.sql();
		object1.material();
		object1.sql();
		object2.material();
		object2.sql();
		
	}
}
