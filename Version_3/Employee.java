class Employee 
{
	public static String comany = "NGK";
	public String dept;
	public static int salary = 24000;
	public int yop;

	public Employee(String a,int b)
	{
		dept = a;
		yop = b;
	}
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("ADMIT",4);
		Employee emp2 = new Employee("HR",2);
	}
}
