package constructor;

public class Chair {
	public Chair() {
		System.out.println("Chair Constructor Without Argument");
	}
	public Chair(int chairLegs) {
		this();
		System.out.println("Chair Constructor With Argument : "+chairLegs);
	}
	public static void main(String[] args) {
		Chair chair = new Chair(4);
	}
}
