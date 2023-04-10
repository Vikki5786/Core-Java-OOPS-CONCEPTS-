package method_with_return_type;

public class Method_With_Return_Type1 {
	public boolean display() {
		/* perform operation */
		return true;
	}
//	public void display1() {
//		/* void with return type */
//		return;
//	}
	public static void main(String[] args) {
		Method_With_Return_Type1 object = new Method_With_Return_Type1();
//		while(object.display() == true) {
//			/* loop operation */
//		}
		System.out.println(object.display()); 
		boolean z = object.display();
		//object.display() + "Hello";
	}
}
