package variables_2ndMethod;

public class Car {
	
	public static String brand = "Royal";
	public String color;
	public String dept;
	public int speed;
	
	public void carDetails(String color,String dept,int speed) {
		this.color = color;
		this.dept = dept;
		this.speed = speed;
	}
	
	public String getCarDetails() {
		return "color: "+color+", dept: "+dept+", speed: "+speed;
				}
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		car1.carDetails("RED", "HR", 195);
		car2.carDetails("BLUE", "IT", 125);
		car1.brand="tata";
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car1.getCarDetails());		
	}
}
