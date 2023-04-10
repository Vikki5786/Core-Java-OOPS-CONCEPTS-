package method_with_return_type;

public class Method_With_Return_Type {
	public static int info() {
		return 1200;
	}
//	public static double display() {
//	return 24.64;
//	}
	public static void main(String[] args) {
		System.out.println(info());
//		System.out.println(display());
		
		if(info() > 1000) {
			System.out.println("Greater then or equal to 1000 ");
		}else {
			System.out.println("Less then 1000  ");
		}
		//info()/2;
		int k =info();
	}
}
