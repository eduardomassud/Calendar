import java.util.Scanner;

public class DayOfWeek 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter year: ");
		int i = keyboard.nextInt();
		System.out.print("Enter the month (1-12): ");
		int m = keyboard.nextInt();
		if (m==1){
			m=13;
			i -=1;}
		else if (m==2){
			m = 14;
			i -=1;}
		int j = i/100;
		int k = i % 100;
		System.out.print("Enter the day of the month (1-31): ");
		int q = keyboard.nextInt();
		int h = (q + ((26*(m+1))/10) + (k) + (k/4) + (j/4) + (5*j))%7;
		if (h==0)
			System.out.print("Saturday");
		if (h==1)
			System.out.print("Sunday");
		if (h==2)
			System.out.print("Monday");
		if (h==3)
			System.out.print("Tuesday");
		if (h==4)
			System.out.print("Wednesday");
		if (h==5)
			System.out.print("Thursday");
		if (h==6)
			System.out.print("Friday");		
	}
}
