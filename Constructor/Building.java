class Building 
{
	public Building(int pillers,int floors)
	{
		this(6000,"Freiends Boys Hostel");
		System.out.println("Constructor with Argument");
		System.out.println("No of Pillers : "+pillers+ " and No of Floors : "+floors);
	}
	public Building()
	{
		System.out.println("Constructor without Building");
	}
	public Building(int cost,String name)
	{
		this();
		System.out.println("Building Name : "+name + "Building Rent is : "+cost);
	}
	public static void main(String[] args) 
	{
		Building building = new Building(10,4);
	}
}
