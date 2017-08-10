package Pack;
import pack1.*;
import java.io.*;

public class Ass41
{
	public static void main(String[] st)
	throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("TIME SHOULD BE IN THE FORMAT OF 24HOURS:");
		System.out.println("ENTER TIME 1:(HR,MIN,SEC)");
		int hr=Integer.parseInt(br.readLine());
		int mi=Integer.parseInt(br.readLine());
		int se=Integer.parseInt(br.readLine());
		Second os1=new Second(hr,mi,se);

		System.out.println("ENTER TIME 1:(HR,MIN,SEC)");
		hr=Integer.parseInt(br.readLine());
		mi=Integer.parseInt(br.readLine());
		se=Integer.parseInt(br.readLine());
		Second os2=new Second(hr,mi,se);

		if(os2.hh>os1.hh)
		{
			os2.elapsed(os1);
			System.out.println("TIME ELAPSED:"+os2.h+":"+os2.m+":"+os2.s);
		}
		else
		{
			os1.elapsed(os2);
			System.out.println("TIME ELAPSED:"+os1.h+":"+os1.m+":"+os1.s);
		}
		
		
	}
}