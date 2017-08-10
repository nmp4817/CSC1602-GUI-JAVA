import java.lang.*;

public class Ass15
{
	public static void main(String[] st)
	{
		Recur r=new Recur();
		long d=r.fact(50);
		System.out.println("ANSWER:"+d);	
	}
}

class Recur
{
	
	
	longn fact(int i)
	{
		if(i==1)
		{return 1;}
		else
		{return fact(i-1)*(i);}
		
	}
}
