abstract class RamNotes
{
	/* topic 1 to topic 14 is completed */
	abstract public void topic15();
	abstract public void topic16();
}
abstract class AliNotes extends RamNotes
{
	/* topic 1 to topic 14 is completed */
	public void topic15()
	{
		System.out.println("topic15 is completed");
	}
}
class JamesNotes extends AliNotes
{
	/* topic 1 to topic 15 is completed */
	public void topic16()
	{
		System.out.println("topic16 is completed");
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		JamesNotes jn = new JamesNotes();
		jn.topic15();
		jn.topic16();
	}
}
