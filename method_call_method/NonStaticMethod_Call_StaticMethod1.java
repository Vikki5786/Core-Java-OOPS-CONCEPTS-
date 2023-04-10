package method_call_method;

public class NonStaticMethod_Call_StaticMethod1 {
	
	public static void main(String[] args) {
		System.out.println("NonStaticMethod_Call_StaticMethod directly because single copy nature");
		NonStaticMethod_Call_StaticMethod1 object = new NonStaticMethod_Call_StaticMethod1();
		object.java();
		object.sql();
	}
	public static void reactJs() {
		System.out.println("Learning ReactJs");
	}
	public static void webTechnology() {
		System.out.println("Preparing Exam for WebTechnology");
	}
	public void java() {
		System.out.println("Practise Core Java");
		reactJs();
	}
	public void sql() {
		System.out.println("Watch Sql Vedios again");
		webTechnology();
	}
}
