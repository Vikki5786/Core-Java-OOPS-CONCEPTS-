package method_call_method;

public class NonStaticMethod_Call_NonStaticMethod {
	
	public static void main(String[] args) {
		NonStaticMethod_Call_NonStaticMethod object = new NonStaticMethod_Call_NonStaticMethod();
		object.human();
	}
	public static void temple() {
		System.out.println("Different Temples & Different People...");
	}
	public void human() {
		System.out.println("1st Non static method..");
		System.out.println("Humans are Different Types");
		politics();
	}
	public void politics() {
		System.out.println("2nd Non static method..");
		System.out.println("In Politics Are They Devils ?");
	}
}
