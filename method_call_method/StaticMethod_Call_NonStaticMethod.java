package method_call_method;

public class StaticMethod_Call_NonStaticMethod {
	
	public static void main(String[] args) {
		study();
	}
	public static void study() {
		System.out.println("Static method Will Call Non Static Method to create an Object");
		System.out.println("Study Well for Exams..");
		StaticMethod_Call_NonStaticMethod object = new StaticMethod_Call_NonStaticMethod();
		object.prepare();
	}
	public void prepare() {
		System.out.println("Prepare for Exams..");
	}
}
