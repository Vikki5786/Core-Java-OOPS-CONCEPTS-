package multiLevelInheritance;

public class E extends D{

	public void show() {
		System.out.println("Show Report Card");
//		info();
//		result();
	}
	public static void main(String[] args) {
		E e = new E();
		e.show();
		e.info();
		e.result();
	}
}
