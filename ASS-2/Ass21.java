import java.io.*;
public class Ass21
{
	public static void main(String st[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER REAL PART OF NO. 1:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("ENTER IMAGINARY PART OF NO. 1:");
		int b=Integer.parseInt(br.readLine());
		System.out.println("ENTER REAL PART OF NO. 2:");
		int c=Integer.parseInt(br.readLine());
		System.out.println("ENTER IMAGINARY PART OF NO. 2:");
		int d=Integer.parseInt(br.readLine());
		
		Complex cm1=new Complex(a,b,1);
		Complex cm2=new Complex(c,d,2);
		cm1.add(cm2);
		cm1.sub(cm2);
		cm1.mul(cm2);
		cm1.div(cm2);
	}
}

class Complex
{
	int a,b,e,f;
	Complex(int x,int y,int z)
	{
		a=x;
		b=y;
		System.out.println("NO "+z+":"+a+"+"+b+"i");	
	}
	
	void add(Complex c)
	{
		e=a+c.a;
		f=b+c.b;
		result("ADDITITON");
	}

	void sub(Complex c)
	{
		e=a-c.a;
		f=b-c.b;
		result("SUBTRACTION");
	}
	void mul(Complex c)
	{
		e=((a*c.a) - (b*c.b));
		f=((a*c.b)+(c.a*b)); 
		result("MULTIPLICTION");
	}
	
	void div(Complex c)
	{
		e=((a*c.a) + (b*c.b))/((c.a*c.a)+(c.b*c.b));
		f=((c.a*b) - (a*c.b))/((c.a*c.a)+(c.b*c.b));
		result("DIVISION");
	}
	void result(String s)
	{
		System.out.println(s + " ANSWER:" + " ("+e+")" + " + ("+f+")i");
	}
}