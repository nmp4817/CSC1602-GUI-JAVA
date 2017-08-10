import java.io.*;
public class Ass22
{
	public static void main(String st[])throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("X CORDINATE OF NO. 1:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Y CORDINATE OF NO. 1:");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Z CORDINATE OF NO. 1:");
		int c=Integer.parseInt(br.readLine());
		System.out.println("X CORDINATE OF NO. 2:");
		int d=Integer.parseInt(br.readLine());
		System.out.println("Y CORDINATE OF NO. 2:");
		int e=Integer.parseInt(br.readLine());
		System.out.println("Z CORDINATE OF NO. 2:");
		int f=Integer.parseInt(br.readLine());
		Vector vc1=new Vector(a,b,c,1);
		Vector vc2=new Vector(d,e,f,2);
		vc1.add(vc2);
		vc1.sub(vc2);
		vc1.dot(vc2);
		vc1.vec(vc2);
	}

}

class Vector
{
	int a,b,c,g,h,i;
	Vector(int x,int y,int z,int w)
	{
		a=x;
		b=y;
		c=z;
		System.out.println("NO "+w+":"+a+"i+"+b+"j+"+c+"k");
	}
	void add(Vector v)
	{
		g=a+v.a;
		h=b+v.b;
		i=c+v.c;
		result("ADDITITON");
	}
	
	void sub(Vector v)
	{
		g=a-v.a;
		h=b-v.b;
		i=c-v.c;
		result("SUBTRACTION");
	}
	void dot(Vector v)
	{
		g=a*v.a;
		h=b*v.b;
		i=c*v.c;
		result("SCALLER MULTIPLICATION");
	}
	void vec(Vector v)
	{
		g=(b*v.c)-(c*v.b);
		h=(c*v.a)-(a*v.c);
		i=(a*v.b)-(b*v.a);
		result("VECTOR MULTIPLICATION");
	}
	void result(String s)
	{
		if(s.equals("SCALLER MULTIPLICATION"))
		{
			System.out.println(s+"ANSWER:"+(g+h+i));
		}
		else
		{
			System.out.println(s + " ANSWER:" + " ("+g+")i" + " + ("+h+")j" +"+ ("+i+")k");
		}
	}
}