import java.io.*;
class Ass51
{
	static int ba,he,le,r;
	public static void main(String st[])throws IOException
	{
		try{
			input();
		   }
		catch(NegativeValueException nae)
		{System.out.println(nae);}
		Triangle t=new Triangle(ba,he);
		Square s=new Square(le);
		Circle c=new Circle(r);
		S2D s2;
		S3D s3;
	
		System.out.println("\n \n TRIANGLE:");
		s2=t;
		System.out.println("AREA OF TRIANGLE:"+ s2.area());
		s3=t;
		System.out.println("VOLUME OF TRIANGLE:"+ s3.volume());

		System.out.println("\n \n SQUARE:");
		s2=s;
		System.out.println("AREA OF SQUARE:"+ s2.area());
		s3=s;
		System.out.println("VOLUME OF SQUARE:"+ s3.volume());

		System.out.println("\n \n CIRCLE:");		
		s2=c;
		System.out.println("AREA OF CIRCLE:"+ s2.area());
		s3=c;
		System.out.println("VOLUME OF CIRCLE:"+ s3.volume());
	}
		static void input() throws IOException,NegativeValueException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE VALUE OF BASE:");
			ba=Integer.parseInt(br.readLine());
			System.out.println("ENTER THE VALUE OF HEIGHT:");
			he=Integer.parseInt(br.readLine());
			System.out.println("ENTER THE VALUE OF LENGTH:");
			le=Integer.parseInt(br.readLine());
			System.out.println("ENTER THE VALUE OF RADIUS:");
			r=Integer.parseInt(br.readLine());
			if(ba<0 || he<0 || le<0 || r<0)
			{
				throw new NegativeValueException();
			}
		}

}

class Circle implements S2D,S3D
{
	int r;
	Circle(int rad)
	{
		r=rad;
	}
	
	public float area()
	{
		return pi*r*r; 
	}
	public float volume()
	{
		return 4*pi*r*r*r/3;
	}
}

class Square implements S2D,S3D
{
	int l;
	Square(int le)
	{
		l=le;
	}
	public float area()
	{
		return l*l;
	}
	public float volume()
	{
		return l*l*l;
	}
}

class Triangle implements S2D,S3D
{
	int h,b;
	Triangle(int ba,int he)
	{
		b=ba;
		h=he;
	}
	public float area()
	{
		return (float)0.5*b*h;	
	}
	
	public float volume()
	{
		return (float)0.5*b*h*h/3; 
	}
}

interface S2D
{
	public float pi=3.14f;
	float area();
}

interface S3D
{	
	 float volume();
}

class NegativeValueException extends Exception
{
	public String toString()
	{
		return "NegativeValue cant  be accepted";
		
	}
}

