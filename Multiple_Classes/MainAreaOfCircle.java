class Circle
{
	public static double pi = 3.14;
	public int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public void getArea()
	{
		double area = pi * radius*radius;
		System.out.println("Area of circle is :"+area);
	}
}
class Drawing
{
	public static void info()
	{
		Circle circle = new Circle(5);
		circle.getArea();
	}
}
class MainAreaOfCircle 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start!... 7799536420 ");
		Drawing.info();
		System.out.println("Main Ends!...");
	}
}
