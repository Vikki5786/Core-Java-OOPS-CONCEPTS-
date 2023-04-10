package method_call_method;

public class NonStaticMethod_Call_StaticMethod {
	
	public static void main(String[] args) {
		System.out.println("Non static method will call static method directly NonStaticMethod_Call_StaticMethod directly because single copy nature");
		NonStaticMethod_Call_StaticMethod object = new NonStaticMethod_Call_StaticMethod();
		object.work();
	}
	public void work() {
		System.out.println("If you want get Top Rank Work Hard..");
		earn();
	}
	public static void earn() {
		System.out.println("Earn Money..");
	}
}
