package variables;

public class Employee {
	
	public static String company = "Wipro";
	public static int salary = 26_000;
	public String depertment;
	public int years;
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.depertment = "IT Department";
		employee1.years = 8;
		employee2.depertment = "Civil Department";
		employee2.years = 6;
		
		System.out.println("Both Employees are Working in Same Company is : "+ company);
		System.out.println("Both Employees Salary is same : "+ salary);
		
		System.out.println("Employee Department is : "+employee1.depertment);
		System.out.println("Employee Years of Experience is : "+employee1.years);
		System.out.println("Employee Department is : "+employee2.depertment);
		System.out.println("Employee Years of Experience is : "+employee2.years);
	}
}
