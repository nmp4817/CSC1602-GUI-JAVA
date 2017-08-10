import java.lang.*;
import java.util.*;

public class Ass12
{
	public static void main(String[] st)
	{
		fact();			
	}

	static void fact()
	{
		long f=1,i=20;
		for(i=20;i>=1;i--)
		{f=f*i;}	
		System.out.println("ANSWER:"+f);
	}
}