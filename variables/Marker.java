package variables;

public class Marker {
	/*Static Variable & Non-Static Variable */
	public static int height = 10;
	public String color;
	public static void main(String[] args) {
		System.out.println("Marker height is : "+height); 
		Marker marker1 = new Marker();
		Marker marker2 = new Marker();
		Marker marker3 = new Marker();
		marker1.color = "BLACK";
		marker2.color = "RED";
		marker3.color = "GREEN";
		System.out.println("Color is : "+marker1.color);
		System.out.println("Color is : "+marker2.color);
		System.out.println("Color is : "+marker3.color);
	}
}
