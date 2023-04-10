package method_with_argument;

public class Method_With_Argument1 {
	
	public static void main(String[] args) {
		Method_With_Argument1 object = new Method_With_Argument1();
		object.display1("Vikki");
		object.display2(24, 26, 2.4);
	}
	public void display1(String i) {
		System.out.println(i);
	}
	public void display2(int a ,int b ,double c) {
		//System.out.println(a,b,c); //a,b,c arguments will be used for operation
		System.out.println(a);
	}
}
