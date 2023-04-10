package method_overloading;

public class Method_OverLoading {
	
	public static void main(String[] args) {
		test(4,8);
		test(2.4);
		test("Vikki",'V',true);
		test(false);
	}
	public static void test(int i,int j) {
		System.out.println("Test Method with (int, int) argument");
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
	public static void test(double i) {
		System.out.println("Test Method with (double) argument");
		System.out.println("i : "+i);
	}
	public static void test(String i, char k, boolean j) {
		System.out.println("Test Method with (String , char, boolean) argument");
		System.out.println("i : "+i);
		System.out.println("k : "+k);
		System.out.println("j : "+j);
	}
	public static void test(boolean z) {
		System.out.println("z : "+z);
	}
}
