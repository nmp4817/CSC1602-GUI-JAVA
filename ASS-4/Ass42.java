package Pack;
import pack1.*;
import java.io.*;
class Ass42
{
	public static void main(String st[])
	throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE VALUE OF BASE:");
		int ba=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE VALUE OF HEIGHT:");
		int he=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE VALUE OF LENGTH:");
		int le=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE VALUE OF RADIUS:");
		int r=Integer.parseInt(br.readLine());
		
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

}

