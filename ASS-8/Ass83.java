/*3. Write a Java Program to find the total number of occurrences of a substring in the given string array.
Also display the positions of each occurrence in every string of an array. The program should also display the total occurrence for substring in each string of an array.
*/

class Ass83
{
	public static void main(String st[])
	{
		String s="WHAT ARE YOU DOING? WHAT IS YOUR FATHER DOING?";
		String ss="AT";
		String vss="";
		int count=0;
		int ls=s.length();
		int lss=ss.length();
		for(int i=0;i<ls;i++)
		{
			if(i+lss<=ls-lss)
			{
				vss=s.substring(i,i+lss);
				if(vss.equals(ss))
				{
					System.out.println("SubString Found at Position :"+i);
					count++;
				}
			}
		}
		System.out.println("TOTAL OCCURENCE:"+count);
	}
}