class Ass62
{
	public static void main(String st[])
	{
		Window w1=new Window("Deposites");
		Window w2=new Window("Withdrawls");
		Account a1=new Account(w1,1000,1);
		Account a2=new Account(w2,50000,2);
	}

}

class Account implements Runnable
{
	Window w1,w2;
	Thread th;
	int bal;
	int turn;				
	int de =(int)(Math.random()*10000);	
	int wi =(int)(Math.random()*10000);
	Account(Window w,int b,int t)
	{
		turn=t;
		bal=b;
		if(t==1)
		{
			w1=w;
		}
		if(t==2)
		{
			w2=w;
		}
		turn=t;
		th=new Thread(this);
		th.start();	
	}

	public void run()
 	{
	
			if(turn==1)
			{
				w1.deposite(de,bal,1);
				try{th.sleep(1000);}catch(Exception e){}
			}
		
			if(turn==2)
			{
				w2.withdrawl(wi,bal,2);
				try{th.sleep(1000);}catch(Exception e){}
			}			
	}			
}


class Window
{
	String s;		

	Window(String wnm)
	{
		s=wnm;
	}
	
	synchronized void deposite(int n,int bal,int i)
	{
		System.out.println("INITIALBalance is in account"+i+": "+bal);
		System.out.println("Deposite at window "+s+"in account"+i+" : "+n);
		bal=bal+n;
		System.out.println("Balance is in account"+i+": "+bal);
	}

	synchronized void withdrawl(int n,int bal,int i)
	{
		System.out.println("INITIALBalance is in account"+i+": "+bal);
		if(n>(bal-1000))
		{System.out.println("Withdrawl cant be done!");}
		else
		{System.out.println("Withdrawl at window "+s+" in account"+i+" : "+n);
 		 bal=bal-n;
		 System.out.println("Balance is in account"+i+": "+bal);
		}
	}
}
