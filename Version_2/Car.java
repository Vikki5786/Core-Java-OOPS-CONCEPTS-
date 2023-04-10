class Car 
{
	public static String brand = "HERO";
	public String series;
	public String color;
	public int speed;

	public void intCar(String a,String b,int c)
	{
		series = a;
		color = b;
		speed = c;
	}
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		Car car2 = new Car();
		car1.intCar("A4","PINK",240);
		car2.intCar("Q4","BLACK",190);
	}
}
