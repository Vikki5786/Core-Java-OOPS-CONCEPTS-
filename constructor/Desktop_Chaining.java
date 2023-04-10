package constructor;

public class Desktop_Chaining {
	public Desktop_Chaining() {
		this("ACER");
		System.out.println("Desktop_Chaining Constructor Without Argument : ");
	}
	public Desktop_Chaining(String companyName) {
		this(56870);
		System.out.println("Desktop_Chaining Constructor With String Argument : "+companyName);
	}
	public Desktop_Chaining(int price) {
		System.out.println("Desktop_Chaining Constructor With int Argument : ");
	}
	public static void main(String[] args) {
		Desktop_Chaining chaining = new Desktop_Chaining();
	}
}
