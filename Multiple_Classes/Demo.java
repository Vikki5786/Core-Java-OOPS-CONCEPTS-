class Sample
{
	public static void test()
	{
		System.out.println("Test Score");
	}
	public void result()
	{
		System.out.println("Display result");
	}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		Sample.test();
		Sample sample = new Sample();
		sample.result();
		System.out.println("Main Ends");
	}
}
