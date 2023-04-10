class Laptop 
{
	public Laptop(int price)
	{
		System.out.println("Laptop cost is " + price + " /Rs...");
	}
	public Laptop(String name)
	{
		System.out.println("Laptop is "+ name + " Company!!..");
	}
	public Laptop(double discount)
	{
		System.out.println("We Use Different Types Ex: "+discount+ "Purpose");
	}
	public static void main(String[] args) 
	{
		Laptop laptop1 = new Laptop("ACER");
		Laptop laptop2 = new Laptop(59000);
		Laptop laptop3 = new Laptop(15000);
	}
}
