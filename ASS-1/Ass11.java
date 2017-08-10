import java.lang.*;
import java.util.*;

public class Ass11
{
	public static void main(String[] st)
	{
		Marks m;
		m=new Marks(10,20);
		int b=Integer.parseInt(st[0]);
		int c=Integer.parseInt(st[0]);
		m=new Marks(b,c);
	}
}

class Marks
{
	int m1,m2;
	Marks(int ma1,int ma2)
	{
		m1=ma1;
		m2=ma2;
		System.out.println("SUM:"+(m1+m2));
	}
}