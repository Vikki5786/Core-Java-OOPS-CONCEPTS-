package hierarticalInheritance;

public class O extends M{

	public void greetings() {
		System.out.println("O-Sub Class in :Good Noon");
	}
	public static void main(String[] args) {
		N n = new N();
		O o = new O();
		n.view();
		n.report();
		System.out.println("==========================================");
		o.greetings();
		o.report();
	}
}
