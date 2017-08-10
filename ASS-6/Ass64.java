import java.lang.*;
import java.io.*;

class Throw
{
	
	synchronized int dice(String s)
	{
		
			int n=(int)(6*Math.random()+1);
			System.out.println(s+" THREW:: "+(n+1));
			return n+1;
	}
}

class Player implements Runnable
{
	int score=0;
	static int m=0;
	String s;
	Throw thr;
	Thread t;
	Player(String s,Throw th)
	{
		t=new Thread(this);
		this.s=s;
		thr=th;
		t.start();
	}
	public void run()
	{
		while(score!=50 && m!=1)
		{
			
				int n=thr.dice(s);
				score=score+n;
				System.out.println(s+" SCORE:"+score+"\n");
								
				if(score==50)
				{
					m=1;
					System.out.println("\n CONGRATS! "+s+" WIN THE GAME!!!");	/* System.exit(0) */
				}

				if(score>50)
				{
					System.out.println("NOT NEEDED!!");
					score=score-n;
					System.out.println(s+" SCORE:"+score+"\n");
				}
				else if(score==9 || score==25 || score==39 || score==41)
				{
					System.out.println("WOW! YOU JUMP THROUGH LADDER!");
					score=score+5;
					System.out.println("SCORE OF "+s+" :"+score+"\n");
				}
				else if(score==10 || score==19 || score==26 || score==36 || score==43 || score==49)
				{
					System.out.println("SORRY! YOU DOWN THROUGH SNAKE!");
					score=score-8;
					System.out.println("SCORE OF "+s+" :"+score+"\n");
				}
				
				try{Thread.sleep(500);}
				catch(Exception e){}

		}
	}
}

class Ass64
{
	public static void main(String[] st)throws IOException
	{
		System.out.println("\n\t\t LETS THE GAME BEGIN!!! \t");
		System.out.println("\n HOW MANY PALYERS?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		Throw th=new Throw();
		Player p[]=new Player[i];
		String s[]=new String[i];
		for(int j=0;j<i;j++)
		{
			System.out.println("ENTER YOUR NAME PLAYER "+(j+1)+":");
			s[j]=br.readLine();
		}
		for(int j=0;j<i;j++)
		{
			p[j]=new Player(s[j],th);
		}
	}
}