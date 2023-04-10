abstract class QuestionPaper
{
	abstract public void question1();
}
class Answersheet1 extends QuestionPaper
{
	public void question1()
	{
		System.out.println("ans 1 a/c to your understanding");
	}
}
class Answersheet2 extends QuestionPaper
{
	public void question1()
	{
		System.out.println("ans 2 a/c to your understaanding");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		Answersheet1 ans1 = new Answersheet1();
		ans1.question1();
		Answersheet2 ans2 = new Answersheet2();
		ans2.question1();
	}
}
