package constructor;

public class Student {
	public Student(int marks) {
		System.out.println("Student Constructor With Argument");
		System.out.println("Marks : "+marks);
	}
	public Student() {
		this(89);
		System.out.println("Student Constructor Without Argument");
	}
	public static void main(String[] args) {
		Student object = new Student();
	}
}
