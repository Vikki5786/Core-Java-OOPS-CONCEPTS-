package object_Casting;

public class Peter extends SpiderMan{
	public void superPower() {
		System.out.println("Peter Study and Research the SuperPower");
	}
	public static void main(String[] args) {
		SpiderMan spiderman = (SpiderMan)new Peter();
		spiderman.superPower();
	}
}
