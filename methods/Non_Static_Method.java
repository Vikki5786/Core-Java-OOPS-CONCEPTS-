package methods;

public class Non_Static_Method {
	public void write() {
		System.out.println("Write on Board..");
	}
	public void eligibleVote() {
		System.out.println("Am i eligible for Vote");
	}
	public static void main(String[] args) {
		Non_Static_Method object = new Non_Static_Method();
		object.write();
		object.eligibleVote();
	}
}
