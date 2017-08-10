package pack1;
public class Earth extends LivingOrganism
{
	int legs;
	public Earth(int h,String n)
	{
		super(n);
		legs=h;
	} 
	public void show()
	{
		super.show();
		System.out.println("legs:"+legs);
	}

}