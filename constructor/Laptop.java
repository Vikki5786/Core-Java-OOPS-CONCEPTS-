package constructor;

public class Laptop {
	public Laptop(int price) {
		System.out.println("Laptop cost is : " + price);
	}
	public Laptop(int discount,int weight,int originalPrice) {
		System.out.println("Discount : "+discount+" "+"weight : "+weight+" "+"OriginalPrice : "+originalPrice);
	}
	public Laptop(String name) {
	System.out.println("Name : "+name);
	}
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop(59000);
		Laptop laptop2 = new Laptop(45000);
		Laptop laptop3 = new Laptop("ACER");
		Laptop laptop4 = new Laptop("DELL");
		Laptop laptop5 = new Laptop(12000,4,48908);
		Laptop laptop6 = new Laptop(13080,14,78994);
	}
}
