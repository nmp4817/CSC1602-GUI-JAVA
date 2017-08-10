class Ass61
{
	public static void main(String st[])
	{
		Stack st1=new Stack();
		Stack st2=new Stack();
		Process p1=new Process(st1,1);
		Process p2=new Process(st2,2);
	}

}

class Process implements Runnable
{
	Stack st1,st2;
	Thread th;
	int turn;
	int pt=1;				//process turn(push or popmicmi)
	int fc =(int)(Math.random()*100);		//for counter
	Process(Stack s,int t)
	{
		turn=t;
		if(t==1)
		{
			st1=s;
		}
		if(t==2)
		{
			st2=s;
		}
		turn=t;
		th=new Thread(this);
		th.start();	
	}

	public void run()
 	{
		for(int i=0;i<fc;i++)
		{
			if(turn==1)
			{
				if(pt==1)
				{
					st1.push(i,turn);
					try{th.sleep(1000);}catch(Exception e){}
					pt=2;
				}
				if(pt==2)
				{
					st1.pop(turn);
					try{th.sleep(1000);}catch(Exception e){}
					pt=1;
				}
			}
		
			if(turn==2)
			{
				if(pt==1)
				{
					st2.push(i,turn);
					try{th.sleep(1000);}catch(Exception e){}
					pt=2;
				}
				if(pt==2)
				{
					st2.pop(turn);
					try{th.sleep(1000);}catch(Exception e){}
					pt=1;
				}
			}			
		}			
	}
}

class Stack
{
	int stk[];		//array for stack
	int sp=0,pn=0;		//pn=poped number

	Stack()
	{
		stk=new int[10];
	}
	
	synchronized void push(int n,int t)
	{
		if(sp>10)
		{System.out.println("PUSH: OVER-FLOW OCCUR");}
		else
		{stk[sp++]=n;System.out.println("PUSH IN STACK"+t+":"+n);}
	}

	synchronized void pop(int t)
	{
		if(sp<0)
		{System.out.println("POP: UNDER-FLOW OCCUR");}
		else
		{pn=stk[--sp];System.out.println("POP FROM STACK"+t+":"+pn);}
	}
}
