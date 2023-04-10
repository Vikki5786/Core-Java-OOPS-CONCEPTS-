package overLoad_MainMethod;

public class OverLoad_MainMethod {
	public static void main(int i) {
		System.out.println("Overloaded main() method invoked");
	}
	public static void main(char i) {
		System.out.println("Overloaded main method");
	}
	public static void main(String[] args) {
		System.out.println("Original main() method invoked");
//		main(7);
//		main('V');
	}
}
