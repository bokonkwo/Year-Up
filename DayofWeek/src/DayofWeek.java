
import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the day of the week:");
		Scanner sc = new Scanner(System.in);
		String DayofWeek = sc.nextLine();
		EvaluateDayofWeek(DayofWeek);
	}

	public static void EvaluateDayofWeek(String DayofWeek)
	{
		if (DayofWeek != null)
		{
			if (!DayofWeek.isEmpty())
			{
				if (DayofWeek.equalsIgnoreCase("Monday") ||
					DayofWeek.equalsIgnoreCase("Tuesday") ||
					DayofWeek.equalsIgnoreCase("Wednesday") ||
					DayofWeek.equalsIgnoreCase("Thursday") ||
					DayofWeek.equalsIgnoreCase("Friday"))
				{
					System.out.println(DayofWeek + " is a weekday!");
				}
				else if (DayofWeek.equalsIgnoreCase("Saturday")||
						 DayofWeek.equalsIgnoreCase("Sunday"))
						{
							System.out.println(DayofWeek + " is a weekend day!");
						}
				else
				{
					System.out.println( DayofWeek + " is not a valid day!!");
				}
			}
			else
			{
				System.out.println("Day of week is an empty string!!");
			}
		}
		else
		{
			System.out.println("You have given me a null string!!");
		}
	}
	
}
		
		
		

