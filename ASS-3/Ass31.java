import java.io.*;

public class Ass31
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

		System.out.println("ENTER TIME 2:(HR,MIN,SEC)");
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

class Hour
{
	int hh,h;
	Hour(int hr)
	{
		hh=hr;
		h=hh;
	}
	
	void getHou(int hr)
	{
		h=h-hr;
	}
}

class Minute extends Hour
{
	int mm,m;
	Minute(int hr,int mi)
	{
		super(hr);
		mm=mi;
		m=mm;
	}

	void getMin(int mi)
	{
		if(mi>m)
		{
			if(h==0 && m==0)
			{
				h=23;
				m=60-mi;
			}
			else if(h==0 && m!=0)
			{
				h=23;
				m=m+60-mi;
			}
			else if(m==0 && h!=0)
			{
				h=h-1;
				m=60-mi;
			}
			else
			{
				h=h-1;
				m=m+60-mi;
			}
		}
		else
		{
			m=m-mi;
		}
	}		
}

class Second extends Minute
{
	int ss,s;
	Second(int hr,int mi,int se)
	{
		super(hr,mi);
		ss=se;
	}
	
	void elapsed(Second os)
	{
		if(ss<os.ss)
		{
			if(mm==0 && hh==0)
			{
				m=59;
				h=23;
				s=ss+60-os.ss;
			}
			else if(mm==0 && hh!=0)
			{
				m=59;
				h=hh-1;
				s=ss+60-os.ss;
			}
			else
			{
				m=mm-1;
				s=ss+60-os.ss;
			}
		}
		else
		{
			s=ss-os.ss;
		}
		getMin(os.mm);
		getHou(os.hh);
	}
}