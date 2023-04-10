package constructor;

public class Constructor {
	public Constructor() {
		System.out.println("Execute Constructor class Constructor");
	}
	public Constructor(int i,int j,int k) {
		System.out.println(i + j - (k * i));// -56 + 17 = -39
	}
	public static void main(String[] args) {
		Constructor constructor = new Constructor(8,9,7);
		Constructor constructor1 = new Constructor();
		Constructor constructor2 = new Constructor();
		Constructor constructor3 = new Constructor();
	}
}
