class UploadMovies 
{
	public static void hotstar()
	{
		System.out.println("Upload Movies in Hotstar");
		netflix();
		UploadMovies uploadMovies = new UploadMovies();
		uploadMovies.amazonPrime();
		uploadMovies.aha();
	}
	public static void netflix()
	{
		System.out.println("Upload Movies in Netflix");
	}
	public void amazonPrime()
	{
		System.out.println("Upload Movies in AmazonPrime");
	}
	public void aha()
	{
		System.out.println("Upload Movies in Aha");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start......");
		hotstar();
	}
}
