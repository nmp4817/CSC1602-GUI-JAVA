class OtherPackage
{

	int n=1;
	private int npri=2;
	public int npub=3;
	protected int npro=4;

	OtherPackage()
	{

		//Protection p=new Protection();
	
		System.out.println("\n Non derived class from other package ");
		
		//System.out.println("\n n = "n);
		System.out.println("\n Can not access default member of Base class ");
	
		//System.out.println("\n npri = "+npri);
		System.out.println("\n Can not access private member of Base class ");
	
		System.out.println("\n npub = "+npub);	
		
		//System.out.println("\n npro = "+npro);
		System.out.println("\n Can not access protected member of Base class ");

	}
}


class Protection2 extends Protection
{

	Protection2()
	{

		System.out.println("\n Derived class but from other package ");

		//System.out.println("\n n = "+n);
		System.out.println("\n Can not access default member of Base class ");


		//System.out.println("\n npri = "+npri);
		System.out.println("\n Can not access private member of Base class ");
		
		System.out.println("\n npub = "+npub);
		System.out.println("\n npro = "+npro);

	}

}

public class Ass72
{
	public static void main(String args[])
	{
		Protection2 p = new Protection2();
		OtherPackage op = new OtherPackage();
	}
}