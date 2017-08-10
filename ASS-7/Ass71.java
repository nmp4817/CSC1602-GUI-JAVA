class Protection
{
	int n=1;
	private int npri=2;
	public int npub=3;
	protected int npro=4;

	public Protection()
	{
		System.out.println("\n Base class Constructor ");
		System.out.println("\n n = "+n);
		System.out.println("\n npri = "+npri);
		System.out.println("\n npub = "+npub);
		System.out.println("\n npro = "+npro);
	}
}


class Derived extends Protection
{
	Derived()
	{
		System.out.println("\n Derived class Construction ");

		System.out.println("\n n = "+n);
		//System.out.println("\n npri = "+npri);
		System.out.println("\n Can not access private member of Base class ");
		System.out.println("\n npub = "+npub);
		System.out.println("\n npro = "+npro);
	}
}


class SamePackage
{

	SamePackage()
	{
		Protection p = new Protection();

		System.out.println("\n Same Package non inherited class ");

		System.out.println("\n n = "+p.n);
		//System.out.println("\n npri = "+p.npri);
		System.out.println("\n Can not access private member of Base class ");
	
		System.out.println("\n npub = "+p.npub);
		System.out.println("\n npro = "+p.npro);

	}
}


public class Ass71
{
public static void main(String args[])
{
	Protection p = new Protection();
	Derived d = new Derived();
	SamePackage sp = new SamePackage();
}

}
