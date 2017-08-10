import java.lang.*;

public class Ass13
{
	public static void main(String[] st)
	{
		Prime p=new Prime();
		p.getPrime();
	}
}

class Prime
{
	void getPrime()
	{
		int j,k=2,a,co=0;
		while(co<=20)
		{
			j=k;
			for(a=j-1;a>1;a--)
			{
				if((j%a)==0)	
				{j++;}
			}
			if(j>k)
			{k++;}
		
			else
			{
				System.out.println(""+k);
				co++;
				k++;
			}
		}
	}
}