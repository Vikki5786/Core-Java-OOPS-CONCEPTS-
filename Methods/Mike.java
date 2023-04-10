class Mike 
{
	public void soundIncrease()
	{
		System.out.println("To Make Noise Increase Volume");
	}
	public void soundDecrease()
	{
		System.out.println("To Make Noise Decrease Volume");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start Main......");
		System.out.println("=============================");
		Mike obj = new Mike();
		obj.soundIncrease();
		obj.soundDecrease();
		System.out.println("=============================");
		System.out.println("End Main.......");
	}
}
