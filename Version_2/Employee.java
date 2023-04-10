class Employee 
{
	public static String company = "WIPRO";
	public String dept;
	public static int salary = 24000;
	public int yop;

	public void intEmp(String a,int b)
	{
		dept = a;
		yop = b;
	}
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.intEmp("USER",4);
		emp2.intEmp("HR",2);
	}
}
