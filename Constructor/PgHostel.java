class PgHostel 
{
	public PgHostel()
	{
		//this(6000);
		System.out.println("PG Hostel is in KPHB");
	}
	public PgHostel(int cost)
	{
		this();
		System.out.println("PG Hostel Rent is "+ cost +" in KPHB");
	}
	public static void main(String[] args) 
	{
		PgHostel pghostel = new PgHostel(6000);
	}
}
