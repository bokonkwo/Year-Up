import java.util.Scanner;

public class ChineseYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int inputYear = sc.nextInt();
		EvaluateChineseYear(inputYear);
		
	}

	private static void EvaluateChineseYear(int inputYear)
	{
		int yearDifference = inputYear - 1990;
		int remainder = yearDifference % 12;
		
		switch(remainder)
		{
		case 0:
			System.out.println(inputYear + " is the year of rat.");
			break;
		case 1:
			System.out.println(inputYear + " is the year of ox.");
			break;
		case 2:
			System.out.println(inputYear + " is the year of tiger");
			break;
		case 3:
			System.out.println(inputYear + " is the year of rabbit.");
			break;
		case 4:
			System.out.println(inputYear + " is the year of dragon.");
			break;
		case 5:
			System.out.println(inputYear + " is the year of snake.");
			break;
		case 6:
			System.out.println(inputYear + " is the year of horse.");
			break;
		case 7:
			System.out.println(inputYear + " is the year of sheep.");
			break;
		case 8:
			System.out.println(inputYear + " is the year of monkey.");
			break;
		case 9:
			System.out.println(inputYear + " is the year of rooster.");
			break;
		case 10:
			System.out.println(inputYear + " is the year of dog.");
			break;
		case 11:
			System.out.println(inputYear + " is the year of pig.");
			break;
			default:
				System.out.println("I cannot figure out Chinese Year for" + inputYear);
				break;
		}
	}
}
