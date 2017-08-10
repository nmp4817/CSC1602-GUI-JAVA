package pack1;
class Hour
{
	public int hh,h;
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
	public int mm,m;
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

public class Second extends Minute
{
	public int ss,s;
	public Second(int hr,int mi,int se)
	{
		super(hr,mi);
		ss=se;
	}
	
	public void elapsed(Second os)
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