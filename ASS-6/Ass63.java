class Ass63
{
	public static void main(String  st[])
	{
		CRegion cr=new CRegion("Critical Region");
		Process p1=new Process(cr,"producer",1);
		Process p2=new Process(cr,"consumer",2);
	}
}
class CRegion
{
	String s;
	CRegion(String s)
	{this.s=s;}

	synchronized void use(String st)
	{
		System.out.println("Process "+st+" is in "+s);
	}
	synchronized void asleep(String st)
	{
		System.out.println("Process "+st+" is in sleep mode ");
		try{wait();}
		catch(Exception e){}
		System.out.println("Process "+st+" is woken up \n");
	}
	synchronized void wakeup()
	{
		notifyAll();
	}

}

class Process implements Runnable
{
	int turn;
	static int count=0;
	String pn;
	CRegion cr;
	Thread th;
	Process(CRegion cr,String s,int t)
	{
		this.cr=cr;
		pn=s;
		turn=t;
		th=new Thread(this);
		th.start();
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			if(i==9)
			{
				System.exit(0);
			}
			if(turn==1)
			{
				if(count==4)
				{cr.asleep(pn);}
				if(count==1)
				{cr.wakeup();}
				cr.use(pn);
				count++;
				try{th.sleep(1000);}catch(Exception e){}
			}
			if(turn==2)
			{
				if(count==4)
				{cr.wakeup();}
				if(count==0)
				{cr.asleep(pn);}
				cr.use(pn);
				count--;
				try{th.sleep(1000);}catch(Exception e){}
			}
		}
	}
}