package method_call_method;

public class StaticMethod_Call_StaticMethod {
	
	public static void main(String[] args) {
		System.out.println("Static method will call Static method Directly......");
		fan();
	}
	public static void fan() {
		System.out.println("Fan has Three Wings..");
		speed();
	}
	public static void speed() {
		System.out.println("Fan Speed will Increase Step by Step..");
		
	}
}
