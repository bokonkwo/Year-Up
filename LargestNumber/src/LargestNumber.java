
public class LargestNumber {

	public static void main(String[] args) 
	{
		int[] array = new int[] {12, 34, 56};
		FindLargestNumberUsingWhileloop(array);
		LargestNumberUsingForLoops(array);
	}

	public static void FindLargestNumberUsingWhileloop(int [] numbers)
	{
		if (numbers !=null)
		{
			if (numbers.length > 0)
			{
				int i = 1;
				int largestNumber = numbers[0];

				while (i < numbers.length)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}

					i++;
				}

				System.out.println("Largest number using while loop " + largestNumber);			
			}
		}
	}
	public static void LargestNumberUsingForLoops(int[]numbers)
	{
		if (numbers != null) {
			if (numbers.length > 0)
			{
				int i;
				int largestnumber = numbers[0];
				for (i = 1; i < numbers.length; i++)
				{
					if (largestnumber < numbers[i])
					{
						largestnumber = numbers[i];
					}
				}
				System.out.println("Largest number using for loop " + largestnumber);
			}
		}
	}
}
