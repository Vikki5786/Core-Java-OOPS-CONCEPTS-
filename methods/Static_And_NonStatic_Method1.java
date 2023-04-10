package methods;

public class Static_And_NonStatic_Method1 {
	public static void color() {
		System.out.println("Blue and Black Color");
	}
	public static void brand() {
		System.out.println("Rabbit Brand Shirt");
	}
	public void type() {
		System.out.println("Silk type");
	}
	public void cost() {
		System.out.println("The Shirt Cost is 500");
	}
	public static void main(String[] args) {
		
		color();
		brand();
		Static_And_NonStatic_Method1 object1 = new Static_And_NonStatic_Method1();
		Static_And_NonStatic_Method1 object2 = new Static_And_NonStatic_Method1();
		object1.type();
		object1.cost();
		object2.type();
		object2.cost();
	}
}
