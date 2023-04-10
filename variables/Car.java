package variables;

public class Car {
	
	public static String brand = "Royal";
	public String color ;
	public int speed ;
	public String series ;
	
	public static void main(String[] args) {
		System.out.println("Both Cars Brand is Same : " + brand);
		Car car1 = new Car();
		Car car2 = new Car();
		car1.color = "RED";
		car1.speed = 125;
		car1.series = "AP04";
		car2.color = "BLACK";
		car2.speed = 190;
		car2.series = "AP09";
		System.out.println("Car color is : "+car1.color);
		System.out.println("Car color is : "+car1.speed);
		System.out.println("Car color is : "+car1.series);
		System.out.println("Car color is : "+car2.color);
		System.out.println("Car color is : "+car2.speed);
		System.out.println("Car color is : "+car2.series);
	}
}
