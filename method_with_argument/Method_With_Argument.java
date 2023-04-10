package method_with_argument;

public class Method_With_Argument {
	
	public static void main(String[] args) {
		test1(24);
		test2('@');
		test3(2.3,true);
		Method_With_Argument object = new Method_With_Argument();
		object.display1("vikram");
		object.display2(24, 'V', 2.4, "Vikki");
	}
	public static void test1(int i) {
		System.out.println(i);
	}
	public static void test2(char k) {
		System.out.println(k);
	}
	public static void test3(double m, boolean v) {
		//System.out.println(m,v);		//it did not work
		System.out.println(m);
		System.out.println(v);
	}
	public void display1(String i) {
		System.out.println(i);
	}
	public void display2(int a,char b ,double c,String d) {
		//System.out.println(a,b,c,d);	//it did not work
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
