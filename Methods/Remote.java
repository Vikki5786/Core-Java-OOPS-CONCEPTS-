class Remote
{
	public void display()
	{
		System.out.println("Display a Screen");
	}
	public void brightness()
	{
		System.out.println("Inc Screen / Dec Screen");
	}
	public static void main(String[] args)
	{
		System.out.println("Start Main.....");
		System.out.println("=============");
		Remote obj = new Remote();
		obj.display();
		obj.brightness();
		System.out.println("=============");
		System.out.println("End Main");
	}
}