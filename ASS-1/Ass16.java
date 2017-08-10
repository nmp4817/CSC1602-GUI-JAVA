public class Ass16
{
	public static void main(String[] st)
	{
		Mrandom mr=new Mrandom();
		mr.get();
	}
} 

class Mrandom
{
	void get()
	{
		int co=1;
		while(co<6)
		{
			int n=(int)(100 * Math.random());
			
			if(n>=65 && n<=68)
			{
				System.out.print((char)n);
				co++;
			}
		}
	}
}