package pack1;
public class Fly extends LivingOrganism
{
	String color;
	public Fly(String c,String n)
	{
		super(n);
		color=c;
	}
	public void show()
	{
		super.show();
		System.out.println("COLOURS:"+color);
	}
}
