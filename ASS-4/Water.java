package pack1;
public class Water extends LivingOrganism
{
	int size;
	public Water(int c,String n)
	{
		super(n);
		size=c;
	}
	public void show()
	{
		super.show();
		System.out.println("size in feet: "+size);
	}
}