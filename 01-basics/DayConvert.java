import java.util.Scanner;
class DayConvert1 
{
	
	public static void main (String[] args) 
	{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number of days : ");
			int days = Integer.valueOf(scanner.nextLine());
			int hours = days*24;
			int mins = hours*60;
			int sec = mins*60;
			System.out.println("Total hours in "+days+" days");
			System.out.println(hours);
			System.out.println("Total minutes in "+days+" days");
			System.out.println(mins);
			System.out.println("Total seconds in "+days+" days");
			System.out.println(sec);
	}
}

