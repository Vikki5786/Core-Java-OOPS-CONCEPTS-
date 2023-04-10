class Employee 
{
	public static void main(String[] args) 
	{
		System.out.println("Employee will call work");
		work();
	}
	public static void work()
	{
		earn();
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		obj1.enter();
		obj2.enter();
	}
	public static void earn()
	{
		System.out.println("Employee Starts to Earn Money");
	}
	public void enter()
	{
		System.out.println("Employee Enter Office at 9:00 am");
	}
}
