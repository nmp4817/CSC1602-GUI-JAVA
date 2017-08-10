import java.lang.*;

public class Ass14
{
	
	public static void main(String[] st)
	{
		Fibonacci fb=new Fibonacci();
		fb.getFibo();
	}
}

class Fibonacci
{
	void getFibo()
	{	int i;
		long m[]=new long[50];
		for(i=0;i<=49;i++)
		{
			if(i==0 || i==1)
			{
				m[i]=i;
				System.out.println(""+m[i]);
			}
			else
			{
				m[i]=m[i-1]+m[i-2];
				System.out.println(""+m[i]);
			}
		}
	}
}