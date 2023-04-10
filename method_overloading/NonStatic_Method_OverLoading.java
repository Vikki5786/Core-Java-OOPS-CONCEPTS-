package method_overloading;

public class NonStatic_Method_OverLoading {
	public void display(int i) {
		System.out.println("i : "+ i);
	}
	public void display(char a,int b) {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public void display(String i,int b, double v) {
		System.out.println("i : "+i);
		System.out.println("b : "+b);
		System.out.println("v : "+v);
	}
	public static void main(String[] args) {
		NonStatic_Method_OverLoading object = new NonStatic_Method_OverLoading();
		object.display(23);
		object.display('V', 25);
		object.display("Vikki", 5, 2.4);
	}
}