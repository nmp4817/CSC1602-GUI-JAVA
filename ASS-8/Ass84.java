/*4. Write a Java Program to find the number of days between two dates.*/

import java.util.Calendar;

public class Ass84 
{    
	public static void main(String[] args)
	{
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2006, 12, 30);
		cal2.set(2007, 5, 3);
		long milis1 = cal1.getTimeInMillis();
		long milis2 = cal2.getTimeInMillis();
long diff = milis2 - milis1;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println("In days: " + diffDays + " days.");
	}
}