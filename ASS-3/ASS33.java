class Livingorganism
{
	String na;
	Livingorganism(String name)
	{
		na=name;
	}
	public void show()
	{
		System.out.println("\n name: " + na);
	}
}
class Earth extends Livingorganism
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
class fly extends Livingorganism
{
	String color;
	public fly(String c,String n)
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
class water extends Livingorganism
{
	int size;
	public water(int c,String n)
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

class Ass33
{
	public static void main(String[] s)
	{
		Earth m = new Earth(2,"man");
		fly f=new fly("multicolor","peacock");
		water w=new water(7,"shark");
		m.show();		
		f.show();
		w.show();
	}
}


