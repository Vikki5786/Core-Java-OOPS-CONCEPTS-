class Car 
{
	public static String brand = "AUDI";
	public String series;
	public String color;
	public int speed;
	public Car(String a,String b,int c)
	{
		series = a;
		color = b;
		speed = c;
	}
	public static void main(String[] args) 
	{
		Car car1 = new Car("A4","RED",240);
		Car car2 = new Car("Q7","BLACK",190);
	}
}
