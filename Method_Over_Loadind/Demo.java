class Demo 
{
	//1.x
	//2.file->exit
	//3.alt +f4
	public void test(int i,String j,boolean k)
	{
		System.out.println("test method will operate int,String,boolean arguments");
		System.out.println("i :" +i);
		System.out.println("j :" +j);
		System.out.println("k :" +k);
	}
	public void test(boolean z,int i,int k)
	{
		System.out.println("test method will operate boolean, int ,int arguments");
		System.out.println("z :"+z);
		System.out.println("i :"+i);
		System.out.println("k :"+k);
	}
	public void test(boolean z)
	{
		
		System.out.println("test method will operate boolean arguments");
		System.out.println("z :"+z);
	}
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		demo.test(12,"hello",true);
		demo.test(false,24,04);
		demo.test(true);
	}
}
